package com.example.quizapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.findFragment
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.databinding.FragmentCBinding


class FragmentB : Fragment() {

private lateinit var binding: ActivityMainBinding
private var listpreg:ArrayList<Question>? = null
private var score = 0
private var prAct:Question = listpreg!![0]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view?.isVerticalScrollBarEnabled

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val listaPreg = Constants.getQuestions()

        Log.i("Questions Size", "${listaPreg.size}")//para verificar la cantidad de preguntas
        val currentposition = 1
        val question: Question? = listaPreg[currentposition - 1]
        val BarraPrg = view?.findViewById<ProgressBar>(R.id.progressBar)
        BarraPrg?.progress = currentposition
        view?.findViewById<TextView>(R.id.tvpreg)?.text = question!!.question // seccion de la pregunta
        //seccion de la imagen
        view?.findViewById<ImageView>(R.id.iv_img)?.setImageResource(question.image)
        //seccion de las opciones
        view?.findViewById<TextView>(R.id.tvprogr)?.text = "$currentposition "+ "/" +BarraPrg?.max
        val btn = view?.findViewById<Button>(R.id.btnStart)
        view?.findViewById<Button>(R.id.btnStart)

        super.onViewCreated(view, savedInstanceState)
    }
    fun nuevapregunta(){

    }
    fun cambiarpregunta(){

    }
    fun irAVtnFin(){

    }

    fun sortearPreguntas(ques :Question):Array<Int>{
        val arrOpciones = arrayOfNulls<String>(4)
        arrOpciones[0] = ques.optionOne
        arrOpciones[1] = ques.optionTwo
        arrOpciones[2] = ques.optionTwo
        arrOpciones[3] = ques.optionThree
        var nAO =  arrayOfNulls<String>(4)

    }

}