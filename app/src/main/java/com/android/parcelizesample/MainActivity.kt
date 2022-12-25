package com.android.parcelizesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.parcelizesample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookDataList = arrayListOf(
            BookData("AAA","1000", "AAA"),
            BookData("BBB","2000", "BBB"),
            BookData("CCC","3000", "CCC")
        )

        val bookData = BookData("DDD", "4000", "DDD")

        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("bookDataList", bookDataList)
                putExtra("bookData", bookData)
            }
            startActivity(intent)
        }
    }
}