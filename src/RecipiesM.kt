var recetas:MutableList<String> = mutableListOf<String>()

fun main(arg:Array<String>){
    println(":: Bienvenido a Recipe Maker ::")
    menuPrin()
}

fun menuPrin(){

    do{
        println("""
            Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
         """.trimIndent())

        println("Seleccione:")

        val res: String? = readLine()

        when(res){
            "1" -> hacerReceta()
            "2" -> verRecetas()
            "3" -> println("¡Adios humano!")
            else -> println("Opccion no valida")
        }
    }while (!res.equals("3"))

}

fun hacerReceta(){

    val ingredientes: List<String> = listOf("Leche","Harina","Huevos","Agua","Aceite")
    var ingres : String = ""

    do{
        println("Seleccione uno por uno los ingredientes segun el indice")

        for((index,ingre) in ingredientes.withIndex()){
            println("$index: $ingre")
        }

        println("10. Grabar receta")

        val ingreIndex: String? = readLine()

        when(ingreIndex){
            "0" -> ingres += "Leche,"
            "1" -> ingres += "Harina,"
            "2" -> ingres += "Huevos,"
            "3" -> ingres += "Agua,"
            "4" -> ingres += "Aceite,"
            "10" -> recetas.add(ingres)
        }
    }while (!ingreIndex.equals("10"))

}

fun verRecetas(){

    do{
        println("Recetas")

        for((inde,rece) in recetas.withIndex()){
            println("""
                Receta $inde:
                $rece
            """.trimIndent())
        }

        println("""
            1 para regresar
        """.trimIndent())

        val espera = readLine()

        when(espera){
            "1" -> println("Regresando..")
            else -> println("Opccion no valida")
        }

    }while (!espera.equals("1"))

}
