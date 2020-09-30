package com.example.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingsample.module.DBFragment
import com.example.databindingsample.recycler_view_module.RVBindingFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction().replace(R.id.container, DBFragment()).commit()
        supportFragmentManager.beginTransaction().replace(R.id.container, RVBindingFragment()).commit()
    }
}