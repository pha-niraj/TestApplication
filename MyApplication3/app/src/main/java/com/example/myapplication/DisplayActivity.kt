package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dispaly.*
import java.lang.StringBuilder

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dispaly)


        val stringBuilder = StringBuilder()

        for (employee in MainActivity.employeeList){
            stringBuilder.append("\n").append(employee.name).append("\n")
                .append(employee.id).append("\n")
                .append(employee.department).append("\n")
                .append(employee.emailID).append("\n")
        }

        display.text = stringBuilder.toString()
    }
}
