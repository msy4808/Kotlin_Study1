package com.moon.kotlinstudy1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button);
        val input_CM = findViewById<EditText>(R.id.cm_Input);
        val input_KG = findViewById<EditText>(R.id.kg_Input);
        val view_BMI = findViewById<TextView>(R.id.bmi_View);


        btn.setOnClickListener {
            val cm = input_CM.text.toString().toDouble()
            val kg = input_KG.text.toString().toDouble()
            val bmi = kg / Math.pow(cm / 100,2.0)
            view_BMI.text = "키 : ${cm}, 체중 : ${kg}, BMI : ${bmi}"

        }
    }
}