package com.example.myapplication


import java.io.PrintStream
import java.util.Scanner
import java.util.*

fun main (args : Array<String>)
{
  val x  = 0

   when(x){
      0 ->{
         print("X eğer 0 ise bu blok çalışır")
      }
      1->{
         print("X eğer 1 ise bu blok çalışır")
      }
      else ->{
         print("X için geçersiz bir tanımlama")
      }
   }
}
