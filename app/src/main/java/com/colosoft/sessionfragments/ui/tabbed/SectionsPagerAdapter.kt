package com.colosoft.sessionfragments.ui.tabbed

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.colosoft.sessionfragments.R
import com.colosoft.sessionfragments.ui.batman.BatmanFragment
import com.colosoft.sessionfragments.ui.flash.FlashFragment
import com.colosoft.sessionfragments.ui.superman.SupermanFragment
import com.colosoft.sessionfragments.ui.wonderwoman.WonderWomanFragment

private val TAB_TITLES = arrayOf(
    R.string.batman_name,
    R.string.flash_name,
    R.string.superman_name,
    R.string.wonderwoman_name
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> BatmanFragment()
            1 -> FlashFragment()
            2 -> SupermanFragment()
            else -> WonderWomanFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 4
    }
}