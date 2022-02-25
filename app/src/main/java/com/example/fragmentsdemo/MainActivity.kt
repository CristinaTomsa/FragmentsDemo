package com.example.fragmentsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstFragment = supportFragmentManager.beginTransaction().add(R.id.container, FirstFragment()).addToBackStack("first fragment").commit()
        Log.i(TAG, "activity onCreate")

        val button = findViewById<Button>(R.id.btn_change)

        button.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.container,SecondFragment()).commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "activity onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "activity onRestart")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "activity onDestroy")
    }

   companion object{
       const val TAG = "tag"
   }
}