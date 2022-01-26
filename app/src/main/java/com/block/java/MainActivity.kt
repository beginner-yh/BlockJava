package com.block.java

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.block.java.base.EqualsAndEqualsSign
import com.block.java.base.EqualsAndHashCode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test = EqualsAndHashCode()
        test.equals()
    }
}