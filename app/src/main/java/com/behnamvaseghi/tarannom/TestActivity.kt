package com.behnamvaseghi.tarannom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.behnamvaseghi.tarannom.databinding.ActivityMainBinding
import com.behnamvaseghi.tarannom.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name=intent.getStringExtra("name")
        val age=intent.getIntExtra("age1",0)
        val motahel=intent.getBooleanExtra("tahol",false)


        binding.btnNextt.setOnClickListener {
            Toast.makeText(this, age.toString(), Toast.LENGTH_SHORT).show()
        }




    }
}