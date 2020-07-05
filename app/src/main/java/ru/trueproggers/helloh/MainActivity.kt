package ru.trueproggers.helloh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.trueproggers.helloh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}