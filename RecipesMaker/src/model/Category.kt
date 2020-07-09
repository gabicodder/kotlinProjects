package model

class Category{

    init {
        println("::-******Lista de Ingredientes*******-::\n" +
                " -> Seleccione un Tipo de Ingrediente\n")
    }

    fun getCategoryList(): ArrayList<String>{
        return arrayListOf("1. Frutas","2. Cereales", "3. Lacteos","4. Verduras","5. Carnes","6. Mariscos")
    }
}