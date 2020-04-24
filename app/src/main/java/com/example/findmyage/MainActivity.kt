package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ctr + space, open the autocomplete help
        /*buFindAge.setOnClickListener {
        }*/

    }

    fun buFindAgeEvent(view: View) {    //Adicionado no evento onClick no XML do button
        // fire when button is clicked
        val yearOfBirth:Int = txtYearOfBirth.text.toString().toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = currentYear - yearOfBirth
        //tvShowAge.text = myAge.toString() ou abaixo
        tvShowAge.text = "Your age is  $myAge years"
    }
}
