package com.example.assignment3_lesston4

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ShoppingCategoryActivity: AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shopping_category)

        val sportsImage = findViewById<ImageView>(R.id.sportsImage)
        val booksImage = findViewById<ImageView>(R.id.booksImage)


        sportsImage.setOnClickListener {
            Toast.makeText(this, "You have chosen the sports category of shopping", Toast.LENGTH_SHORT).show()
        }

        booksImage.setOnClickListener {
            Toast.makeText(this, "You have chosen the Books category of shopping", Toast.LENGTH_SHORT).show()
        }
    }
}
