package com.baz.simaht.base

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.baz.simaht.R

abstract class BaseActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navNotiltle()
        setContentView(setLayout())
        init(savedInstanceState)
    }



    @LayoutRes
    abstract fun setLayout():Int
    abstract fun init(savedInstanceState: Bundle?)



    fun navNotiltle(){
        //No se mostrara la barra de notificaciones en titulo
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        //Inflar el layout
        setContentView(R.layout.activity_login)
    }


}