
fun menu() {
        try {
            println("Selecciona la opcion deseada\n" +
                    "1. Hacer una receta\n" +
                    "2. Ver mis recetas\n" +
                    "3. Salir\n" +
                    "--> ")
            val param: Int? = readLine()?.toInt()
            opciones(param)

        } catch (e: Exception) {
            println("--> No se permiten espacios ni letras..!!")
            menu()
        }
    }

    fun opciones(param: Int?) {

        var opcion: Int
        var ingredients: Int?

        if (param != null) {

        var lista: List<String?> = listOf(null)
            while (param > 0) {

                if (param.equals(1)) {

                    try {
                        makeRecipe()
                        ingredients = readLine()?.toInt()

                        if (ingredients != null) {

                                if (ingredients in 1..8) {
                                    println("var ingredients: $ingredients")
                                    println(message = "Lista: " + lista.plus(ingredients))
                                    opciones(1)
                                }else{
                                    menu()
                                }
                            }
                    }catch (e: Exception){
                        println("No se permiten espacios ni letras")
                        println(makeRecipe())
                    }
                }
                else if (param.equals(2)) {
                    println("--> Mis Recetas..!!!\n")
                    //viewRecipe(lista)
                }
                else {
                    println("--> USTED HA SALIDO DEL MENU..")
                    break
                }
                break
            }
        } else{
            println("--> USTED HA SALIDO DEL MENU..")
        }
    }
fun makeRecipe(): ArrayList<String>{
        println("Selecciona por categoria el ingrediente que buscas")
        val ingredients = arrayListOf<String>("1. Agua","2. Leche","3. Carne",
            "4. Verduras", "5. Frutas", "6. Cereal", "7. Huevos", "8. Aceites","9. Salir")
        for(i in ingredients) {
            println(i)
        }
     return ingredients
    }


fun viewRecipe(lista: List<String>): List<String> {
    for ((index,i) in lista.withIndex()){
        println(i)
    }
    return lista

}


        fun main() {
        menu()
    }


