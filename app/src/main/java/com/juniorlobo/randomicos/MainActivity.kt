package com.juniorlobo.randomicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttom_random.setOnClickListener(this)
        text_number.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.buttom_random || v?.id == R.id.text_number){

        } else {

        }
    }
}
