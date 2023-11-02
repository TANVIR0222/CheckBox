package com.example.apicallapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.apicallapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var intent=Intent(this,newpage::class.java)
    
        binding.button.setOnClickListener {
            if (binding.checked.isChecked){
                startActivity(intent)
            }else{
            Toast.makeText(this,"Please accept the T&C " ,Toast.LENGTH_LONG).show()
            }
        }
    }
}