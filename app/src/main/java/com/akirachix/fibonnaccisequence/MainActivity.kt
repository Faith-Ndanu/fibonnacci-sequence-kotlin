package com.akirachix.fibonnaccisequence

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.akirachix.fibonnaccisequence.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val numbers = fibonnacci(100)
        binding.rvNumbers.layoutManager=GridLayoutManager(this,4)
        val num=NumbersRecycler(numbers)
        binding.rvNumbers.adapter=num

    }
    fun fibonnacci(nums:Int):List<Int>{
        val numbers= mutableListOf(0,1)
        while (numbers.size<nums){
            numbers.add(numbers[numbers.lastIndex] + numbers[numbers.lastIndex-1])
        }
        return numbers
    }
}

















