package com.example.quizapp
object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(1,
            "En que parte del main se inicia esta palabra y que tipo de dato es: \n" +
                "sabemos que se inicia con \" private lateinit var binding \" ",
            R.drawable.pregunta_binding ,
            "despues de oncreate , tipo main" ,
            "dentro de oncreate tipo BindingActivityMain" ,
            "dentro de la clase , tipo ActivityMainBinding",
            "dentro de la clase , tipo ActivityBindingMain ",
            "dentro de la clase , tipo ActivityMainBinding"
        )
        val que2 = Question(2,
            "Para que se usa el data Binding ?",
            R.drawable.importar_binding ,
            "Se usa para Fragmentos y no para actividades" ,
            "Crea un fragmento , enlaza vistas , etc" ,
            "Vincula los componentes de la IU en tus diseños con las fuentes de datos de tu app",
            "Crea recursos obsoletos en memoria",
            "se usa dentro de muchas clases para la navegacion entre vistas , fragmentos y actividades"
        )
    questionList.add(que1)
        questionList.add(que2)
        return questionList
    }

}