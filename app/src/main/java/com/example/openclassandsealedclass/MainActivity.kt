package com.example.openclassandsealedclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Open & Selead Class

        val manager : Employee = Manager("",8, listOf())
        val seniourDev : Employee = SeniorDev("",5,5)


        //Employee extands to Manager & SeniourDev Class to collect data/variables
        val employee: Employee
        if (employee is Manager){
            employee.age
            employee.name
            employee.teams
        } else if (employee is SeniorDev){
            employee.age
            employee.age
            employee.peojects
        }



    }
}