package model

fun main(args: Array<String>){

    var ingredient = Ingredients()
    var numero: Int = 0
    var opcion: String = ""

    for (i in ingredient.getCategoryList()){
        println(i)
     }

    numero = readLine()!!.toInt()
    for ((index,c) in ingredient.getCategoryList().withIndex()){
        if (index+1 == numero)
            opcion=c
    }

    println(opcion)

    for (j in ingredient.getIngredient(opcion)){
            println(j)
    }



    //println("${ingredient}")
    /*for (i in ingredient.getIngredient()){
        println(i)
    }*/
}