package ru.trueproggers.helloh.ui.fragments

import android.view.Menu
import android.view.MenuInflater
import ru.trueproggers.helloh.R
import ru.trueproggers.helloh.R.menu.settings_action_menu

class SettingsFragment : BaseFragment(R.layout.fragment_settings) {

    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(settings_action_menu, menu)
    }
}