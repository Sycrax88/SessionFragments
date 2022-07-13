package com.colosoft.sessionfragments.ui.dynamicnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.colosoft.sessionfragments.R
import com.colosoft.sessionfragments.databinding.ActivityDynamicNavigationBinding
import com.colosoft.sessionfragments.ui.batman.BatmanFragment
import com.colosoft.sessionfragments.ui.flash.FlashFragment
import com.colosoft.sessionfragments.ui.superman.SupermanFragment
import com.colosoft.sessionfragments.ui.wonderwoman.WonderWomanFragment

class DynamicNavigationActivity : AppCompatActivity() {

    private lateinit var  dynamicNavigationBinding: ActivityDynamicNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dynamicNavigationBinding = ActivityDynamicNavigationBinding.inflate(layoutInflater)
        val view = dynamicNavigationBinding.root
        setContentView(view)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_overflow, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_batman -> Navigation.findNavController(this, R.id.fragmentContainerView).navigate(R.id.batmanFragment)
            R.id.menu_superman -> Navigation.findNavController(this, R.id.fragmentContainerView).navigate(R.id.supermanFragment)
            R.id.menu_flash -> Navigation.findNavController(this, R.id.fragmentContainerView).navigate(R.id.flashFragment)
            else -> Navigation.findNavController(this, R.id.fragmentContainerView).navigate(R.id.wonderWomanFragment)

        }
        return true
    }
}