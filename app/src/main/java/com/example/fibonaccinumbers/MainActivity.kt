package com.example.fibonaccinumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonaccinumbers.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

            val fibNums = generateFibonacci(100)
            val fibAdapter = FibonnacciRvAdapter(fibNums)
            binding.rvFibonacci.layoutManager = LinearLayoutManager(this,)
            binding.rvFibonacci.adapter= fibAdapter



        }


    }

fun generateFibonacci(n: Int): List<BigInteger> {
    val fibList = mutableListOf<BigInteger>(BigInteger.ZERO, BigInteger.ONE)
    while (fibList.size < n) {
        val next = fibList[fibList.lastIndex] + fibList[fibList.lastIndex - 1]
        fibList.add(next)
    }
    return fibList.take(100)
}


