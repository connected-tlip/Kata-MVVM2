package com.connectedlab.example

import rx.Observable
import java.util.concurrent.TimeUnit

class SignupService {

    fun signup(email: String): Observable<Void> {
        if (!email.contains("tlip")) {
            return Observable
                    .timer(1000, TimeUnit.MILLISECONDS)
                    .map { null }
        } else {
            return Observable
                    .timer(1000, TimeUnit.MILLISECONDS)
                    .flatMap {
                        Observable.error<Void>(IllegalArgumentException("Invalid email address!"))
                    }
        }
    }
}