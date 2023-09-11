package com.curso.android.app.practica.proyecto

import android.widget.EditText
import androidx.lifecycle.ViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainActivityUnitTest {
   private lateinit var mainActivity: MainActivity MainActivityUnitTest
           /*@get: Rule
           val instantTaskRule = InstantTaskExecutorRule()
            private val dispatcher = StandarTestDispatcher()*/

            @Before
            fun setup(){
               MainActivity = MainActivityUnitTest()
            }

            @Test
            fun mainActivity_CheckInitialValue()= runTest {
                val value = EditText.t1.value?
                assertEquals("",value)
            }

}