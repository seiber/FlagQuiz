package com.example.flagquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*



    class MainActivity : AppCompatActivity()
    {

        companion object
        {
            private var instance : MainActivity? = null
            public fun getInstance() : MainActivity
            {
                return instance!!
            }
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            instance = this
            var Quiz= Quiz(duration = 5,noFlags = 224)
            Quiz.start()

        }
    }


