package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{

        val employeeList : ArrayList<Employee> = ArrayList()

    }

    data class Employee(val name:String,val id :String,val department :String,val emailID :String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        save.setOnClickListener {
            if (emp_dep.text.toString().isNotEmpty()&&emp_id.text.toString().isNotEmpty()&&emp_email.text.toString().isNotEmpty()
                &&emp_name.text.toString().isNotEmpty()){

                val employee = Employee(emp_name.text.toString(),emp_id.text.toString(),emp_dep.text.toString(),emp_email.text.toString())
                employeeList.add(employee)


                startActivity(Intent(this,DisplayActivity::class.java))



            }else {
                Toast.makeText(this,"Enter all fields ",Toast.LENGTH_SHORT).show()
            }

        }

    }
}
