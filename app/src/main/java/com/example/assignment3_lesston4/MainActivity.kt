package com.example.assignment3_lesston4

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users: ArrayList<User> = arrayListOf(
            User("John", "Doe", "johndoe@example.com", "password123"),
            User("Jane", "Smith", "janesmith@example.com", "password123"),
            User("Peter", "Jones", "peterjones@example.com", "password123"),
            User("Mary", "Brown", "marybrown@example.com", "password123"),
            User("David", "Williams", "davidwilliams@example.com", "password123")
        )

        val usernameInput = findViewById<EditText>(R.id.usernameInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val signInButton = findViewById<Button>(R.id.signInButton)
        val signUpButton = findViewById<Button>(R.id.signUpButton)


        signUpButton.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        signInButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            val foundUser = users.find { it.username == username && it.password == password }

            if (foundUser != null) {
                val intent = Intent(this, ShoppingCategoryActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
