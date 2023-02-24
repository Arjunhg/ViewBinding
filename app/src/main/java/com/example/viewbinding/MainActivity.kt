package com.example.viewbinding

/* It automatically makes a binding class for all .xml files and it contains direct reference to all vies that have id's in .xml
* View Binding replaces findViewById
* We initialize view binding using gradle */

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding // Class made by view binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        binding  = ActivityMainBinding.inflate(layoutInflater) // Initializing the binding, always remember this code. Inflate is a method

       // setContentView(R.layout.activity_main) no need of this now

        setContentView(binding.root)

        /* binding.newTextView.setOnClickListener { // Using this we can use binding to write code

        } */

        binding.button.setOnClickListener {
            if(binding.checkBox.isChecked){
                //Open a New Screen using intents
            }else{
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED) // Changing the colour of checkbox
                Toast.makeText(this, "Please accept the T&C", Toast.LENGTH_SHORT).show()
            }
        }
    }
}