package com.connectedlab.example

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SignupViewModelTest {
    lateinit var sut: SignupViewModel
    lateinit var service: SignupService

    @Before
    fun setup() {
        sut = SignupViewModel(service)
    }

    @Test
    fun signup_makesServiceCallToSignUpToMailingList() {

    }

}