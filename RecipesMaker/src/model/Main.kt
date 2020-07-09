package model

fun main(args: Array<String>){

    var category = Category()
    var numero: Int = 0
    var opcion: String = ""

    for (c in category.getCategoryList()){
        println(c)
     }

    numero = readLine()!!.toInt()

    for ((index,c) in category.getCategoryList().withIndex()){
        if (index+1 == numero)
            opcion = c
    }

     println(opcion)

    var ingredient = Ingredients(opcion)
    //println("${ingredient}")
    for (i in ingredient.getIngredient()){
        println(i)
    }
}