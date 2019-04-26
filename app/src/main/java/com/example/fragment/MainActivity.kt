package com.example.fragment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Move to 'B' Activity
        buttonActivity.setOnClickListener {
            startActivity(Intent(this@MainActivity, Main2Activity::class.java))

        }

        // TODO Move to 'A' Fragment
        buttonFragmentA.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, FragmentA())
                .commit()

        }
        // TODO Move to 'B' Fragment
        buttonFragmentB.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, FragmentB())
                .commit()

        }

    }
}