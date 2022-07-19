package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.quizapp.databinding.FragmentCBinding


class FragmentC : Fragment() {

    private lateinit var binding: FragmentCBinding
    private val viewModel: ViewModelFragmentB by viewModels()
    private val args: FragmentCArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val puntaje:Int = args.puntaje
        if(puntaje>7){
            binding.imgResultado.setImageResource(R.drawable.trofeo)
            binding.msgResultado.text = "Felicitaciones"
            binding.msgUser.text = Constants.username
            binding.tvScore.text = "Tu Resultado es "+"${puntaje}"+"de"+"${Constants.cantPreg}"
        }else{
            binding.imgResultado.setImageResource(R.drawable.trofeo_blanco)
            binding.msgResultado.text = "Ups... casi"
            binding.msgUser.text = Constants.username
            binding.tvScore.text = "Tu Resultado es "+"${puntaje}"+"de"+"${Constants.cantPreg}"
        }
        binding.btnRetry.setOnClickListener{
            restartGame()
        }
        binding.btnSalir.setOnClickListener { pantallaPrincipal() }
        super.onViewCreated(view, savedInstanceState)
    }
    /*
        * Sale del juego a la pantallaprincipal Frag c -> Frag a
        */
    private fun pantallaPrincipal() {
        //activity?.finish() -> sale de una actividad
        viewModel.reinitializeData()
        Constants.username =""
        view?.let { Navigation.findNavController(it).navigate(R.id.action_fragmentC_to_fragmentA) }
    }

    private fun restartGame() {
        viewModel.reinitializeData()
        view?.let { Navigation.findNavController(it).navigate(R.id.action_fragmentC_to_fragmentB) }
    }
}