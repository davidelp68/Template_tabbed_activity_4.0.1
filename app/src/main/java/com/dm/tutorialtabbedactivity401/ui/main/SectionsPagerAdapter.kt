package com.dm.tutorialtabbedactivity401.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dm.tutorialtabbedactivity401.R

private val TAB_TITLES = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2
)

/**
 * Un [FragmentPagerAdapter] che restituisce un frammento corrispondente a una
 * delle sezioni / schede / pagine.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem viene chiamato per istanziare il frammento per la pagina data.
        // Restituisce un PlaceholderFragment (definito come una classe interna statica di seguito).
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Mostra 2 pagine totali.
        return 2
    }
}