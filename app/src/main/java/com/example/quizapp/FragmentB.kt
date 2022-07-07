package com.example.quizapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentB : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val param3 = Constants.getQuestions()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val listaPreg = Constants.getQuestions()
        Log.i("Questions Size", "${listaPreg.size}")//para verificar la cantidad de preguntas

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

}