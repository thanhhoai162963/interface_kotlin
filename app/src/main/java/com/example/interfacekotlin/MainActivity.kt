package com.example.interfacekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
interface Action2{
    var a:String
    fun eat()
    fun sleep()
    fun play(){
        println("!23")
    }
}
interface Action{
    var a:String
    fun eat()
    fun sleep()
    fun play(){
        println("!23")
    }
}
class Dog: Action{
    override var a: String = "123"

    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }
}
class Cat{}