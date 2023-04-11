package com.example.redbluefragments_randomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.setFragmentResultListener(RANDOM_NUMBER_GENERATED, this) {
            requestKey, bundle ->

                supportFragmentManager.beginTransaction()
                    .add(R.id.fragmentContainerView2, BlueFragment.newInstance())
                    .addToBackStack("BLUE")
                    .commit()

        }


    }
}