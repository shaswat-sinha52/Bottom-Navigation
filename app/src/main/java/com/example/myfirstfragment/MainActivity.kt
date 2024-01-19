package com.example.myfirstfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottom_nav:BottomNavigationView=findViewById(R.id.bottom_navigation)

        openfragment(MyFirstFragment())
         bottom_nav.setOnNavigationItemSelectedListener {
             val id=it.itemId
             when(id){
                 R.id.menu_home ->{
                     openfragment(MyFirstFragment())
                 }

                 R.id.menu_profile ->{
                     openfragment(MySecondFragment())
                 }

                 R.id.menu_cart ->{
                     openfragment(MyThirdFragment())
                 }
             }
             return@setOnNavigationItemSelectedListener true
         }


    }

    private fun openfragment(fragment:Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_view, fragment)
            .commit()
    }
}