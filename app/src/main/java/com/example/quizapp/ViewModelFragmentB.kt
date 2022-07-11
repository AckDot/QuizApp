package com.example.quizapp

import androidx.lifecycle.ViewModel

class ViewModelFragmentB : ViewModel() {
    //valor para controlar las preguntas respondidas
    private var _puntaje = 0
    val puntaje: Int
        get() = _puntaje

//ayuda a iterar en la pregunta actual de manera privada
    private var _idPregAct = 0
    val idPregAct: Int
        get() = _idPregAct

    // List de preguntas usadas en el juego
    private var PregList = Constants.getQuestions()
    // objeto pregunta actual
    private lateinit var _preguntaact: Question
    val pregAct: Question
        get() = _preguntaact

    /*
      * Updates currentWord and currentScrambledWord with the next word.
      */
    fun sigPreg() {
        //_idPregAct funciona empezando en 0
         _preguntaact = PregList[idPregAct]
        _idPregAct++
    }

    /*
    * Re-iniciar el quiz
    */
    fun reinitializeData() {
        _puntaje = 0
        _idPregAct = 0
        _preguntaact = PregList[idPregAct]
    }

    /*
    * Aumenta el puntaje de preguntas bien respondidas
    */
    fun aumentarPuntaje() {
        _puntaje++
    }

    /*
    * Devuelve verdad si la opcion que eligio es correcta
    */
    fun opcionCorrecta(optionJugador: String): Boolean {
        if (optionJugador.equals(_preguntaact.correctAnswer)) {
            aumentarPuntaje()
            return true
        }
        return false
    }
}