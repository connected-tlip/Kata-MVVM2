package com.connectedlab.example

import android.databinding.ObservableField
import android.util.Log
import android.widget.SeekBar



class SignupViewModel(val service: SignupService) {
    val inputText = ObservableField<String>()

    fun signup() {
        Log.d("KataMVVM", "click")
//        service.signup(...)
    }
}