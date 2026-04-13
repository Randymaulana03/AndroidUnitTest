package com.example.androidunittest

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {

    private val calculator = Calculator()

    /*
     Test Case 1:
     Menguji fungsi add() dengan input 8 + 2
     Expected result: 10
     Tujuan: Memastikan fungsi penjumlahan berjalan dengan benar
    */
    @Test
    fun testAddition() {
        assertEquals(10, calculator.add(8, 2))
    }

    /*
     Test Case 2:
     Menguji fungsi subtract() dengan input 10 - 7
     Expected result: 3
     Tujuan: Memastikan fungsi pengurangan berjalan dengan benar
    */
    @Test
    fun testSubtraction() {
        assertEquals(3, calculator.subtract(10, 7))
    }
}