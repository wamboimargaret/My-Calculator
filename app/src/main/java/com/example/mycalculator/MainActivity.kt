package com.example.mycalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.mycalculator.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btAdd.setOnClickListener {
            addition()
        }
        binding.btSubtract.setOnClickListener {
            subtraction()
        }
        binding.btMultiply.setOnClickListener {
            multiplication()
        }
        binding.btModules.setOnClickListener {
            division()
        }
    }

    fun addition() {
        val firstNumber = binding.etFirstNumber.text.toString().toDouble()
        val secondNumber = binding.etSecondNumber.text.toString().toDouble()
        val answer = firstNumber + secondNumber
        binding.tvResult.text = answer.toString()

    }

    fun subtraction() {
        val firstNumber = binding.etFirstNumber.text.toString().toDouble()
        val secondNumber = binding.etSecondNumber.text.toString().toDouble()
        val answer = firstNumber - secondNumber
        binding.tvResult.text = answer.toString()
    }

    fun multiplication() {
        val firstNumber = binding.etFirstNumber.text.toString().toDouble()
        val secondNumber = binding.etSecondNumber.text.toString().toDouble()
        val answer = firstNumber * secondNumber
        binding.tvResult.text = answer.toString()
    }

    fun division() {
        val firstNumber = binding.etFirstNumber.text.toString().toDouble()
        val secondNumber = binding.etSecondNumber.text.toString().toDouble()
        val answer = firstNumber % secondNumber
        binding.tvResult.text = answer.toString()
    }
}
