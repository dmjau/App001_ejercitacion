package com.cursoandroid.appejercitacion001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_receptor.*

class ReceptorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receptor)

        val nombre_en_2 = intent.getStringExtra(EXTRA_KEY_NAME)
        val apellido_en_2 = intent.getStringExtra(EXTRA_KEY_LASTNAME)
        val edad_en_2 = intent.getStringExtra(EXTRA_KEY_AGE)
        txt_out_name.text = nombre_en_2
        txt_out_lastname.text = apellido_en_2
        txt_out_age.text = edad_en_2
    }

    companion object{
        val EXTRA_KEY_NAME = "com.cursoandroid.appejercitacion001.EXTRA_KEY_NAME"
        val EXTRA_KEY_LASTNAME = "com.cursoandroid.appejercitacion001.EXTRA_KEY_LASTNAME"
        val EXTRA_KEY_AGE = "com.cursoandroid.appejercitacion001.EXTRA_KEY_AGE"
    }


}
