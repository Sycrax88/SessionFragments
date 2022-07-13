package com.colosoft.sessionfragments.ui.dynamic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.colosoft.sessionfragments.R
import com.colosoft.sessionfragments.ui.batman.BatmanFragment
import com.colosoft.sessionfragments.ui.flash.FlashFragment
import com.colosoft.sessionfragments.ui.superman.SupermanFragment
import com.colosoft.sessionfragments.ui.wonderwoman.WonderWomanFragment

class DynamicActivity : AppCompatActivity() {

    val pila = "head"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)



        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val batmanFragment = BatmanFragment()
        fragmentTransaction.add(R.id.container, batmanFragment).commit()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_overflow, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        when(item.itemId){
            R.id.menu_batman ->{
                val batmanFragment = BatmanFragment()
                fragmentTransaction.replace(R.id.container, batmanFragment).addToBackStack(pila).commit()
            }
            R.id.menu_superman ->{
                val supermanFragment = SupermanFragment()
                fragmentTransaction.replace(R.id.container, supermanFragment).addToBackStack(pila).commit()
            }
            R.id.menu_flash ->
            {
                val flashFragment = FlashFragment()
                fragmentTransaction.replace(R.id.container, flashFragment).addToBackStack(pila).commit()
            }
            else ->{
                val wonderWomanFragment = WonderWomanFragment()
                fragmentTransaction.replace(R.id.container, wonderWomanFragment).addToBackStack(pila).commit()
            }

        }
        return true
    }
}