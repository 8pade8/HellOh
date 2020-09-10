package ru.trueproggers.helloh.ui.fragments

import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_enter_phone_number.*
import ru.trueproggers.helloh.R
import ru.trueproggers.helloh.utilits.replaceFragment
import ru.trueproggers.helloh.utilits.showToast

class EnterPhoneNumberFragment : Fragment(R.layout.fragment_enter_phone_number) {
    override fun onStart() {
        super.onStart()
        register_btn_next.setOnClickListener { sendCode() }
    }

    private fun sendCode() {
        if (register_input_phone_number.text.toString().isEmpty()) {
            showToast(getString(R.string.register_toast_enter_phone))
        } else
            replaceFragment(EnterCodeFragment())
    }
}