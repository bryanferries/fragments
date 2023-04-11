package com.example.redbluefragments_randomnumber

import androidx.lifecycle.ViewModel

class RandomNumberViewModel: ViewModel() {
    var randomNumber = 0

    private var countA = 0
    private var countB = 0

    fun addCountA() {
        countA++
    }

    fun getCountA(): Int {
        return countA
    }

    fun addCountB() {
        countB++
    }

    fun getCountB(): Int {
        return countB
    }
}