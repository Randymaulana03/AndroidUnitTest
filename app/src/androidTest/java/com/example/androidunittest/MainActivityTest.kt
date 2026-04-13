package com.example.androidunittest

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    /*
     Test Case 1:
     Menguji apakah tombol dapat diklik dan menghasilkan output
     Expected result: TextView menampilkan "5"
     Tujuan: Memastikan interaksi UI berjalan dengan benar
    */
    @Test
    fun testButtonClick() {
        onView(withId(R.id.btnAdd)).perform(click())
        onView(withId(R.id.resultText)).check(matches(withText("5")))
    }
    /*
     Test Case 2:
     Menguji apakah activity berhasil dijalankan tanpa crash
     Expected result: Activity berjalan tanpa error
     Tujuan: Memastikan lifecycle activity berjalan dengan baik
    */
    @Test
    fun testActivityLaunch() {
        onView(withId(R.id.btnAdd)).check(matches(isDisplayed()))
    }
}