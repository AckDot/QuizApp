package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.fragment.app.viewModels

import androidx.navigation.fragment.findNavController
import com.example.quizapp.databinding.FragmentBBinding



class FragmentB : Fragment() {

private lateinit var binding: FragmentBBinding
private val viewModel: ViewModelFragmentB by viewModels()
private var opcionelegida =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view?.isVerticalScrollBarEnabled
        binding = FragmentBBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       llenarFrag()
        binding.resp1.setOnClickListener {
            opcionelegida= binding.resp1.text as String }
        binding.resp2.setOnClickListener { opcionelegida= binding.resp2.text as String }
        binding.resp3.setOnClickListener { opcionelegida= binding.resp3.text as String }
        binding.resp4.setOnClickListener { opcionelegida= binding.resp4.text as String }
        binding.submitbtn.setOnClickListener{ onSubmit()  }

    }

    //reinicia las preguntas

    private fun obtenerPreg(): Question {
        viewModel.sigPreg() //damos su primer valor a la preg actual luego
        // aumentamos el valor de la posicion de la pregunta
        val act = viewModel.pregAct
        //obtenemos el valor
        return act
    }
    // lower camel case ,,, upper camel case
    // Linter ,
    //mezclar opciones del array
    private fun mezclarOpcionesPregAct(): Array<String> {
        val ArrOpciones = arrayOf(viewModel.pregAct.optionOne ,
            viewModel.pregAct.optionTwo ,
            viewModel.pregAct.optionThree,
            viewModel.pregAct.optionFour
        )
        ArrOpciones.shuffle() //mezclamos las opciones de la pregunta actual
        return ArrOpciones
    }

    private fun llenarFrag(){
        val pregact = obtenerPreg()
        var posAct = viewModel.idPregAct
        vistaDefaultOpciones()
        binding.tvpreg.text = pregact.question
        binding.ivImg.setImageResource(pregact.image)
        binding.progressBar.progress = viewModel.idPregAct
        binding.tvpreg.text = "$posAct"+"/"+Constants.cantPreg
        val opciones = mezclarOpcionesPregAct()
        binding.resp1.text = opciones[0]
        binding.resp2.text =  opciones[1]
        binding.resp3.text =  opciones[2]
        binding.resp4.text =  opciones[3]
    }

    private fun vistaDefaultOpciones(){
        val opciones = ArrayList<TextView>()
        opciones.add(binding.resp1)
        opciones.add(binding.resp2)
        opciones.add(binding.resp3)
        opciones.add(binding.resp4)
        for(opcion in opciones){
            opcion.setTextColor(Color.parseColor("#7A8090"))
            opcion.typeface = Typeface.DEFAULT
        }
    }

    private fun onSubmit(){
        if(viewModel.idPregAct < Constants.cantPreg){
            if (viewModel.opcionCorrecta(opcionelegida)) {
                viewModel.aumentarPuntaje()
            }
            llenarFrag()
        }else{
            val action = FragmentBDirections.actionFragmentBToFragmentC(viewModel.puntaje)
            findNavController().navigate(action)

//            intent.putExtra("puntaje", viewModel.puntaje)

        }
    }




}