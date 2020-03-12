package com.example.willamette_thesis

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColor
import com.example.willamette_thesis.R.color.*
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_settings.*
import kotlinx.android.synthetic.main.activity_car.*
import kotlinx.android.synthetic.main.activity_waste.*

class SettingsActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    //add the tag
    val TAG: String = "ECO-FR3ndly"

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        nature_button.setOnClickListener {

            textView8.setTextColor(natureSettings_text)
            textView9.setTextColor(natureSettings_text)

            transportation_text.setTextColor(natureCar_text)
            textView.setTextColor(natureCar_text)
            miles_text.setTextColor(natureCar_text)
            car_text.setTextColor(natureCar_text)
            bus_text.setTextColor(natureCar_text)
            plane_text.setTextColor(natureCar_text)
            walk_text.setTextColor(natureCar_text)

            textView3.setTextColor(natureWaste_text)
            textView4.setTextColor(natureWaste_text)
            plastic_text.setTextColor(natureWaste_text)
            recycle_text.setTextColor(natureWaste_text)
            trash_text.setTextColor(natureWaste_text)
        }

        original_button.setOnClickListener {
            textView8.setTextColor(originalSettings_text)
            textView9.setTextColor(originalSettings_text)

            transportation_text.setTextColor(originalCar_text)
            textView.setTextColor(originalCar_text)
            miles_text.setTextColor(originalCar_text)
            car_text.setTextColor(originalCar_text)
            bus_text.setTextColor(originalCar_text)
            plane_text.setTextColor(originalCar_text)
            walk_text.setTextColor(originalCar_text)

            textView3.setTextColor(colorPrimary)
            textView4.setTextColor(colorPrimary)
            plastic_text.setTextColor(colorPrimary)
            recycle_text.setTextColor(colorPrimary)
            trash_text.setTextColor(colorPrimary)
        }

    }
}

