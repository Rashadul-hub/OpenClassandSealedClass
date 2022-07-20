package com.example.openclassandsealedclass

sealed class Employee

data class Manager (
    val name: String ,
    val age : Int,
    val teams : List<String>

    ): Employee()

class SeniorDev(
    val name: String,
    val age: Int,
    val peojects : Int
):Employee()
