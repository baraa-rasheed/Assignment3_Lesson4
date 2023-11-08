package com.example.assignment3_lesston4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var androidVersionEditText: EditText
    private lateinit var codeNameEditText: EditText
    private lateinit var tableLayout: TableLayout
    private lateinit var addButton: Button

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        androidVersionEditText = findViewById(R.id.androidVersionEditText)
        codeNameEditText = findViewById(R.id.codeNameEditText)
        tableLayout = findViewById(R.id.tableLayout)
        addButton = findViewById(R.id.addButton)

        addButton.setOnClickListener {
            val androidVersion = androidVersionEditText.text.toString()
            val codeName = codeNameEditText.text.toString()

            if (androidVersion.isNotEmpty() && codeName.isNotEmpty()) {
                val tableRow = TableRow(this)

                val textView = TextView(this)
                textView.text = androidVersion
                textView.textSize = 18F

                val textView2 = TextView(this)
                textView2.text = codeName
                textView2.textSize = 18F

                tableRow.addView(textView)
                tableRow.addView(textView2)

                tableLayout.addView(tableRow)

                androidVersionEditText.text = null
                codeNameEditText.text = null
            }
        }
    }
}