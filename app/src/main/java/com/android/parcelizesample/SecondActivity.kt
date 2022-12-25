package com.android.parcelizesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.parcelizesample.databinding.ActivityMainBinding
import com.android.parcelizesample.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookDataList = intent?.getParcelableArrayListExtra<BookData>("bookDataList")
        val bookData = intent?.getParcelableExtra<BookData>("bookData")

        println(bookDataList)
        println(bookData)
    }
}