
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

        var opcion: String

        if (param != null) {
            while (param > 0) {

                if (param.equals(1)) {
                    println("1. Pastel de chocolate\n" +
                            "2. Hamburguesas con carne\n" +
                            "3.Volver al menu\n" +
                            "--> ")
                    opcion = readLine().toString()

                    if (opcion.equals("3"))
                        menu()
                     else continue

                } else if (param.equals(2)) {
                    println("--> MIS RECETAS..\n" +
                            "3. Volver al menu\n" +
                            "--> ")
                    opcion = readLine().toString()

                    if (opcion.equals("3"))
                        menu()
                     else continue
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

        fun main() {
        menu()
    }


