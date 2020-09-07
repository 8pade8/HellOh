package ru.trueproggers.helloh.ui.fragments

import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_enter_code.*
import ru.trueproggers.helloh.R

class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {
    override fun onStart() {
        super.onStart()
        register_input_code.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val string = register_input_code.text.toString()
                if (string.length == 6) {
                    verifiCode()
                }
            }

            override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

        })
    }

    fun verifiCode() {
        Toast.makeText(activity, "Ok", Toast.LENGTH_SHORT).show()
    }
}