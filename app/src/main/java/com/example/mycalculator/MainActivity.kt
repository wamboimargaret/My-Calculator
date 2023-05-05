package com.example.mycalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tvCalculator:TextView
    lateinit var btnAdd: Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply: Button
    lateinit var btnModules: Button
    lateinit var tilFirstNumber:TextInputLayout
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var etFirstNumber: TextInputEditText
    lateinit var etSecondNumber: TextInputEditText
    lateinit var tvResult: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()



    }

    override fun onResume() {
        super.onResume()
        btnAdd.setOnClickListener {
            addition()
        }
        btnSubtract.setOnClickListener {
            subtraction()
        }
        btnMultiply.setOnClickListener {
            multiplication()
        }
        btnModules.setOnClickListener {
            division()
        }
    }
    fun castViews(){
        tvCalculator = findViewById(R.id.tvCalculator)
        tilFirstNumber= findViewById(R.id.tilFirstNumber)
        tilSecondNumber = findViewById(R.id.tilSecondNumber)
        etFirstNumber=findViewById(R.id.etFirstNumber)
        etSecondNumber=findViewById(R.id.etSecondNumber)
        btnAdd=findViewById(R.id.btAdd)
        btnSubtract=findViewById(R.id.btSubtract)
        btnModules=findViewById(R.id.btModules)
        btnMultiply=findViewById(R.id.btMultiply)
        tvResult=findViewById(R.id.tvResult)
    }
    fun addition(){
        val firstNumber=etFirstNumber.text.toString().toDouble()
        val secondNumber=etSecondNumber.text.toString().toDouble()
        val answer = firstNumber+secondNumber
        tvResult.text=answer.toString()

    }
    fun subtraction(){
        val firstNumber=etFirstNumber.text.toString().toDouble()
        val secondNumber=etSecondNumber.text.toString().toDouble()
        val answer=firstNumber-secondNumber
        tvResult.text=answer.toString()
    }

    fun multiplication(){
        val firstNumber=etFirstNumber.text.toString().toDouble()
        val secondNumber=etSecondNumber.text.toString().toDouble()
        val answer=firstNumber * secondNumber
        tvResult.text=answer.toString()
    }
    fun division(){
        val firstNumber=etFirstNumber.text.toString().toDouble()
        val secondNumber=etSecondNumber.text.toString().toDouble()
        val answer=firstNumber % secondNumber
        tvResult.text=answer.toString()
    }
}
