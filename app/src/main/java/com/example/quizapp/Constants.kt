package com.example.quizapp
object Constants {
    const val username:String = "Hola mundo"
    const val cantPreg:Int = 1
    const val pregcorrectas:String ="son 5 "

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
        val que3 = Question(3,
            "Diferencia entre ViewBiding y Databinding",
            R.drawable.viewbinding_databinding ,
            "ViewBinding se usa para vincular vistas al codigo , DataBinding lo mismo " +
                    "que viewbinding y mucho mas" ,
            "Vbinding vincula solo botones y Dbinding vincula cualquier elemento de la UI" ,
            "Vincula los componentes de la IU en tus diseños con las fuentes de datos de tu app",
            "Viewbinding crea vistas y enlaces con las vistas y databinding envia datos solo a fragmentos",
            "ViewBinding se usa para vincular vistas al codigo , DataBinding lo mismo " +
                    "que viewbinding y mucho mas"
        )
        val que4 = Question(4,
            "Diferencia entre ViewBiding y Databinding",
            R.drawable.viewbinding_databinding ,
            "ViewBinding se usa para vincular vistas al codigo , DataBinding lo mismo " +
                    "que viewbinding y mucho mas" ,
            "Vbinding vincula solo botones y Dbinding vincula cualquier elemento de la UI" ,
            "Vincula los componentes de la IU en tus diseños con las fuentes de datos de tu app",
            "Viewbinding crea vistas y enlaces con las vistas y databinding envia datos solo a fragmentos",
            "ViewBinding se usa para vincular vistas al codigo , DataBinding lo mismo " +
                    "que viewbinding y mucho mas"
        )
        val que5 = Question(5,
            "Que es el liveData",
            R.drawable.viewbinding_databinding ,
            "Se usa para manejar la persistencia de las bases de datos y crea vistas faciles en funcion de estas" ,
            "liveData se refiere al manejo de memoria en Fragmentos e Intents" ,
            "Clase contenedora de datos observable , esta optimizado para lifecycle .Esta optimización garantiza que LiveData solo actualice observadores de componentes de apps que tienen un estado de ciclo de vida activo.",
            "liveData se refiere a contenedores de memoria en Activities y Fragmentos que se enlazan para el lenguaje Kotlin",
            "Clase contenedora de datos observable , esta optimizado para lifecycle .Esta optimización garantiza que LiveData solo actualice observadores de componentes de apps que tienen un estado de ciclo de vida activo."
        )
        val que6 = Question(6,
            "Que es un Bundle",
            R.drawable.viewbinding_databinding ,
            "Es un paquete que tiene como objetivo almacenar informacion, ademas de que puede operar en objetos , y como complemento usa los intents",
            "Herramienta de UI para modelar las vistas de la aplicacion " ,
            "Libreria que se debe descargar de gradle y Maven para que la aplicacion funcione con atributos de seguridad",
            "Paquete de android studio que comunica distintas interfaces",
            "Es un paquete que tiene como objetivo almacenar informacion, ademas de que puede operar en objetos , y como complemento usa los intents"
        )
        val que7 = Question(7,
            "Que es un Intent",
            R.drawable.viewbinding_databinding ,
            "Herramienta que se usa para crear codigo legible en la UI",
            "Es un objeto que se asocia con los archivos de Kotlin , servicios y programacion reactiva",
            "Es un objeto que se asocia con los xml y crea menus",
            "Un intent es un objeto de mensajería que puedes usar para solicitar una acción de otro componente de una app.",
            "Un intent es un objeto de mensajería que puedes usar para solicitar una acción de otro componente de una app."
        )
        val que8 = Question(8,
            "Que es el lifecycle , cuantos tiene un fragmento y para que sirve",
            R.drawable.viewbinding_databinding ,
            "Lifecycle es el ciclo de vida de las BD , los fragmentos tienen 12 , y sirven para controlar la persistencia de informacion en el UI" ,
            "Lifecycle es el ciclo de vida de los IU , los fragmentos tienen 12 , y sirven para controlar la persistencia de informacion en el UI",
            "Lifecycle es el ciclo de vida de los IU , los fragmentos tienen 11 , y sirven para controlar la persistencia de informacion en el UI",
            "Lifecycle es el ciclo de vida de solo los activities , los fragmentos tienen 12 , y no sirven para controlar la persistencia de informacion en el UI",
            "Lifecycle es el ciclo de vida de los IU , los fragmentos tienen 11 , y sirven para controlar la persistencia de informacion en el UI"
        )
        val que9 = Question(9,
            "Que es un Fragmento ? ",
            R.drawable.viewbinding_databinding ,
            "Es inutil sin que el activity le indique como manipular sus recursos y no tiene ciclo de vida",
            "Un fragmento define y administra su propio diseño, tiene el ciclo de vida del activity",
            "Es una parte reutilizable de la IU de tu app.Un fragmento define y administra su propio diseño, tiene su propio ciclo de vida y puede administrar sus propios eventos de entrada.",
            "Es una parte reutilizable de la IU de tu app.Un fragmento necesita de un extra para administrar sus recursos y no tiene autonomia",
          "Es una parte reutilizable de la IU de tu app.Un fragmento define y administra su propio diseño, tiene su propio ciclo de vida y puede administrar sus propios eventos de entrada."
        )

        val que10 = Question(10,
            "Para que se usa un intent ?",
            R.drawable.viewbinding_databinding ,
            "El intent se usa para solicitar una accion y para iniciar una actividad con startActivity() , iniciar un servicio con startService() , transmitir una emision con sendBroadcast() o sendOrderedBroadcast()",
            "El intent se usa para llamar permisos en un mensaje en pantalla ",
            "El intent se usa para iniciar una actividad con startActivity() , sin esto ninguna activitidad funciona",
            "El intent se usa para accionar herramientas de testeo",
            "El intent se usa para solicitar una accion y para iniciar una actividad con startActivity() , iniciar un servicio con startService() , transmitir una emision con sendBroadcast() o sendOrderedBroadcast()"
        )
        val que11 = Question(11,
            "Para que se usa los safe args ?",
            R.drawable.viewbinding_databinding ,
            "Se usa para navegar con el navigation",
            "Se usa para pasar datos con una base de datos",
            "Se usa para navegar y pasar datos, ya que garantiza la seguridad de tipo , ayuda a que los intents no fallen",
            "Se usa para que los tipos sean aleatorios y Kotlin se encargue de definirlos",
            "Se usa para navegar y pasar datos, ya que garantiza la seguridad de tipo , ayuda a que los intents no fallen"
        )
        val que12 = Question(12,
            "para que se usa el tools en archivos XML ?",
            R.drawable.viewbinding_databinding ,
            "Se usa para llamar metodos de codigo en la consola",
            "Se usa para crear la interfaz",
            "Se usa para maquetar las vistas en los diseños de la interfaz de la aplicacion",
            "Se usa para añadir herramientas de codigo",
          "Se usa para maquetar las vistas en los diseños de la interfaz de la aplicacion"
        )
        val que13 = Question(13,
            "porque es importante la fase onViewCreated de un fragmento?",
            R.drawable.viewbinding_databinding ,
            "Se usa para maquetar funciones y diseño en los Activities que persistan de mejor forma, porque en el oncreate o el oncreateview los datos que se modifiquen se perderan",
            "Se usa para maquetar funciones y diseño en los Menus que persistan de mejor forma, porque en el oncreate o el oncreateview los datos que se modifiquen se perderan",
           "Se usa para maquetar funciones y diseño en los fragmentos que persistan de mejor forma, porque en el oncreate o el oncreateview los datos que se modifiquen se perderan",
            "Se usa para maquetar funciones y diseño en los Navigation que persistan de mejor forma, porque en el oncreate o el oncreateview los datos que se modifiquen se perderan",
          "Se usa para maquetar funciones y diseño en los fragmentos que persistan de mejor forma, porque en el oncreate o el oncreateview los datos que se modifiquen se perderan"
        )
        val que14 = Question(14,
            "Como se comunica un item de un menu para saber que vista o fragmento iniciara ?",
            R.drawable.viewbinding_databinding ,
            "Primero al crear el menu con el item designamos un id que tenga el mismo id que del layout que nos creamos del menu , asi automaticamente en el archivo kotlin del fragmento o actividad, iniciamos los metodos para iniciar menus , onCreateOptionsMenu y onOptionsItemSelected",
            "Con ayuda del navigation se logra crear lo necesario para que los items del menu funcionen dentro de los fragmentos",
           "El data binding se encarga de hacer la consulta entre los recursos de los fragmentos",
            "El livedata crea lo necesario para que las opciones de los menus funcionen con los fragmentos",
          "Primero al crear el menu con el item designamos un id que tenga el mismo id que del layout que nos creamos del menu , asi automaticamente en el archivo kotlin del fragmento o actividad, iniciamos los metodos para iniciar menus , onCreateOptionsMenu y onOptionsItemSelected"
        )
        val que15 = Question(15,
            "Diferencia entre un Activity y un Fragment",
            R.drawable.viewbinding_databinding ,
            "Los fragmentos pueden existir por sí solos. Los activitys son puntos de entrada para consultar las vistas de nuestras apps que engloban mas recursos que los fragmentos",
            "Los fragmentos no pueden existir por sí solos, sino que deben estar alojados por una actividad u otro fragmento y son puntos de entrada para consultar las vistas de nuestras apps .",
           "Los fragmentos pueden existir por sí solos . Los activitys son puntos de entrada para consultar las vistas de nuestras apps que necesitan de los fragmentos",
            "Los fragmentos no pueden existir por sí solos, sino que deben estar alojados por una actividad u otro fragmento. Los activitys son puntos de entrada para consultar las vistas de nuestras apps que engloban mas recursos que los fragmentos",
          "Los fragmentos no pueden existir por sí solos, sino que deben estar alojados por una actividad u otro fragmento. Los activitys son puntos de entrada para consultar las vistas de nuestras apps que engloban mas recursos que los fragmentos"
        )
    questionList.add(que1)
    questionList.add(que2)
    questionList.add(que3)
    questionList.add(que4)
    questionList.add(que5)
    questionList.add(que6)
    questionList.add(que7)
    questionList.add(que8)
    questionList.add(que9)
    questionList.add(que10)
    questionList.add(que11)
    questionList.add(que12)
    questionList.add(que13)
    questionList.add(que14)
    questionList.add(que15)
    return questionList
    }

}