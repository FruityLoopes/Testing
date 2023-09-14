package com.example.testing

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val n = Nums()
        val actual = n.Plus()
        val expected = 15
        assertEquals(expected, actual)
    }
    @Test
    fun minus_isCorrect() {
        val n = Nums()
        val actual = n.Minus()
        val expected = 3
        assertEquals(expected, actual)
    }
    @Test
    fun div_isCorrect() {
        val n = Nums()
        val actual = n.Div()
        val expected = 2
        assertEquals(expected, actual)
    }
    @Test
    fun times_isCorrect() {
        val n = Nums()
        val actual = n.Times()
        val expected = 40
        assertEquals(expected, actual)
    }
    @Test
    fun sq_isCorrect() {
        val n = Nums()
        val actual = n.Sq()
        val expected = 64
        assertEquals(expected, actual)
    }
}