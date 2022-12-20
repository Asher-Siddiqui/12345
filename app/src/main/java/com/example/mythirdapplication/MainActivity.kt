package com.example.mythirdapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,"OnCreate invoked",Toast.LENGTH_LONG).show()
        Log.d("lifecycle","onCreate invoked")
    }
    override fun onStart() {
        Toast.makeText(applicationContext,"OnStart invoked",Toast.LENGTH_LONG).show()
        super.onStart()
        Log.d("lifecycle", "onStart invoked")
    }
    override fun onResume() {
        Toast.makeText(applicationContext,"OnResume invoked",Toast.LENGTH_LONG).show()
        super.onResume()
        Log.d("lifecycle", "onResume invoked")
    }
    override fun onPause() {
        Toast.makeText(applicationContext,"OnPause invoked",Toast.LENGTH_LONG).show()
        super.onPause()
        Log.d("lifecycle", "onPause invoked")
    }

    override fun onStop() {
        Toast.makeText(applicationContext,"OnStop invoked",Toast.LENGTH_LONG).show()
        super.onStop()
        Log.d("lifecycle", "onStop invoked")
    }
    override fun onRestart() {
        Toast.makeText(applicationContext,"OnRestart invoked",Toast.LENGTH_LONG).show()
        super.onRestart()
        Log.d("lifecycle", "onRestart invoked")
    }
    override fun onDestroy() {
        Toast.makeText(applicationContext,"OnDestroy invoked",Toast.LENGTH_LONG).show()
        super.onDestroy()
        Log.d("lifecycle", "onDestroy invoked")
    }

}