package com.cursoandroid.appejercitacion001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendButton (view: View){
        val nombre = txt_name_input.text.toString()
        val apellido = txt_lastname_input.text.toString()
        val edad = txt_age_input.text.toString()
        val intent: Intent = Intent(this, ReceptorActivity::class.java).apply {
            putExtra(ReceptorActivity.EXTRA_KEY_name, nombre)
            putExtra(ReceptorActivity.EXTRA_KEY_lastname, apellido)
            putExtra(ReceptorActivity.EXTRA_KEY_age, edad)
        }
        startActivity(intent)
    }
}
