package com.example.layoutskotlin

import android.app.Activity
import android.os.Bundle

class GridLayoutActivity : Activity() {
    /**
     * Called when the activity is first created.
     */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.grid_layout)
    }
}