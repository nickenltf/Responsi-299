package com.example.responsi_299

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(
            Model(
                "Cookies",
                "Cookies adalah kue kering.",
                R.drawable.cookies
            )
        )
        list.add(
            Model(
                "Cupcake",
                "Cupcake adalah kue kecil yang manis dan disukai anak anak.",
                R.drawable.cupcake
            )
        )
        list.add(
            Model(
                "Fruits Cake",
                "Fruits Cake adalah kue tart yang menggunakan buah buahan untuk toppingnya.",
                R.drawable.fruits
            )
        )
        list.add(
            Model(
                "Kiwi Cupcake",
                "Kiwi Cupcake adalah kue yang menggunakan cup dan diatasnya terdapat buah kiwi.",
                R.drawable.kiwicupcake
            )
        )
        list.add(
            Model(
                "Macaroons",
                "Macaroons adalah semacam kue kering tumpuk yang manis",
                R.drawable.macaroons
            )
        )
        list.add(
            Model(
                "Rainbow Cake",
                "Rainbow Cake adalah kue yang berwarna warni seperti pelangi",
                R.drawable.rainbow
            )
        )
        list.add(
            Model(
                "RedVelvet Cake",
                "RedVelvet Cake adalah kue yang berwarna merah",
                R.drawable.redvelvet
            )
        )
        list.add(
            Model(
                "Strawberry Chocolate Cake",
                "Strawberry Chocolate Cake adalah kue yang terbuat dari coklat ditambah strawberry diatasnya",
                R.drawable.strawberry
            )
        )
        list.add(
            Model(
                "Tiramisu Cake",
                "Tiramisu Cake adalah kue dengan rasa tiramisu",
                R.drawable.tiramisu
            )
        )
        list.add(
            Model(
                "Unicorn Cake",
                "Unicorn Cake adalah kue dengan bentuk unicorn",
                R.drawable.unicorn
            )
        )

        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0) {
                Toast.makeText(this@MainActivity1, "Anda Memilih Cookies", Toast.LENGTH_LONG).show()
            }
            if (position == 1) {
                Toast.makeText(this@MainActivity1, "Anda Memilih Cupcake", Toast.LENGTH_LONG).show()
            }
            if (position == 2) {
                Toast.makeText(this@MainActivity1, "Anda Memilih Fruits Cake", Toast.LENGTH_LONG).show()
            }
        }
    }
}