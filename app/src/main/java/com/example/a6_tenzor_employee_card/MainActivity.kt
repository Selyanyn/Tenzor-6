package com.example.a6_tenzor_employee_card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val employeeCard = hashMapOf<String, String>(
            "name" to "Степан Хардович",
            "job" to "Страдатель III разряда",
            "achievements" to "Отсидел 7 пар в субботу без обедов",
            "contacts" to "bedolaga@bruh.com",
            "birthday" to "13.04.1999",
            "experience" to "джва года",
        )
        val isActive = true

        findViewById<TextView>(R.id.name).text = employeeCard["name"]
        findViewById<TextView>(R.id.job).text = employeeCard["job"]
        findViewById<TextView>(R.id.achievements).text = employeeCard["achievements"]
        findViewById<TextView>(R.id.contacts).text = employeeCard["contacts"]
        findViewById<TextView>(R.id.birthdate).text = employeeCard["birthday"]
        findViewById<TextView>(R.id.experience).text = employeeCard["experience"]
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        checkBox.isChecked = isActive
        checkBox.isEnabled = false
    }
}