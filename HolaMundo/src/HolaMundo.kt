import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Hola Mundo")
   /* println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)*/

    //var n = 3

   /* val parrafo = """
        ** Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent congue velit in convallis vestibulum. 
        ** Aenean id euismod tellus, et venenatis felis. Fusce vel placerat leo, ac viverra quam. Aliquam at 
        ** tincidunt ligula, sed faucibus ligula. Aliquam molestie orci eu nisi convallis imperdiet. 
        ** Curabitur blandit congue lacus, quis viverra orci rhoncus suscipit. 
        ** Donec aliquet lorem id lorem ornare lobortis. Vivamus eu ante et tellus sodales pellentesque. 
        ** Ut nisi dui, lobortis vel augue sed, 
        ** gravida fermentum turpis.""".trimMargin()

        println(parrafo.trimMargin("** "))*/

   /* val oneToHundred:IntRange = 1..5
    for(i in oneToHundred){
        println(i)
    }

    //val aToC = 'A'..'C'
    for (letra in 'A'..'C'){
        println(letra)
    }

    val numero = 2
    if (numero.equals(2) ){
        println("Sí son iguales")
    }else{
        println("No, no son iguales")
    }

    //when = switch

    when(numero){
        in 1..5 -> println("Si está entre 1 y 5")
        in 1..3 -> println("Si está entre 1 y 3")
        !in 5..10 -> println("No está entre 5 y 1") //Negación
        else -> println("No está en alguno de los anteriores")
    }

    var i = 1
    // while contadores
    while (i < 1){
        println("mensaje: $i")
        i++
    }

    i = 1
    do{
        println("mensaje dowhile: $i")
        i++
    }while (i <= 1 )*/

   /* var daysOfWeek =
        listOf<String>("Domingo","Lunes","Martes","Miercoles","Jueves","Sabado")
    for ((index,day) in daysOfWeek.withIndex()){
        if (index.equals(2)){
            print("Index: $index Day: $day")
        }
       // println("Indice: $index Days: $day")
    }*/

    /*daysOfWeek.forEach{
        println("Index: ${daysOfWeek.indexOf(it)} $it")
    }*/

    //break
  /*  for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) break
            println("j: $j")
        }
    }

    //continue
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) {
                continue
            }
            println("j: $j")
            }

        }
    }*/

    //BREAK + LABEL

    /*terminarTodoCiclo@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) break@terminarTodoCiclo
                println("k: $k")
            }
        }
    }

    escaparJ@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) continue@escaparJ
                println("k: $k")
            }
        }
    }*/

    // MAMEJO DE EXCEPCION Y OPERADOR ELVIS

   /* try {
        var compute: String?
        compute = null
        var longitud: Int = compute!!.length // -> !! PARA MANEJR LA EXEPCION
    }catch (e: NullPointerException){
        println("No aceptamos valores nulos")
    }*/

    // llamada segura
   /* var compute: String?
    compute = null
    var longitud: Int? = compute?.length // -> !! PARA MANEJR LA EXEPCION
    println("longuitud: $longitud")

    //operador ELVIS
    var teclado: String = "a"
    val longitudTeclado: Int = teclado?.length ?: 0
    println("longuitudTeclado: $longitudTeclado")

    val listWithNulls: List<Int?> = listOf(7,null,null,4)
    println("Lista con Null: ${listWithNulls}")

    val listWithOutNulls: List<Int?> = listWithNulls.filterNotNull()
    println(listWithOutNulls)

    // Array
    val countries:Array<String> = arrayOf("India","Mexico","Colombia","Argentina","Chile","Peru")
    val days:Array<String> = arrayOf("Lunes","Martes","Miercoles")

    //promedio de los numeros
   /* val numbers = intArrayOf(6,6,23,9,2,3,2)
    var suma = 0
    for(num in numbers){
       suma += num
    }

    val average = suma / numbers.size
    println("Promedio: $average")*/

    var arrayObject = arrayOf(1,2,3,4)
    //var intPrimitive: IntArray = arrayObject.toIntArray()

    var suma = arrayObject.sum()
    println("La suma del array es: $suma")

    //Asignar un elemento al array
    arrayObject = arrayObject.plus(5)
    suma = arrayObject.sum()
    println("La suma del array es: $suma")

    //Recorrer el array
    for(num in arrayObject){
        println("El array nuevo es: $num")
    }

    arrayObject = arrayObject.reversedArray()
    for(num in arrayObject){
        println("Array Invertido: $num")
    }

    arrayObject.reverse()
    for(num in arrayObject){
        println("Array Reverse: $num")
    }*/

    /*var x = 5
    println("X es igual a 5? ${x==5}")

    var mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es","fue")}, x es igual a: $x")

    println("Raiz cuadrada de: ${sqrt(4.0)}")

    val numbers = intArrayOf(6,6,23,9,2,3,2)
    println("El promedio de los numeros es: ${averageNumber(numbers,2)}")
    println("${evaluate('+',2)}")*/

    //lambdas
    var saludo:()->Unit = {println("Hola Mundo")}
    saludo()

    val suma = {a: Int, b: Int, c: Int -> a+b+c}
    //val result = suma(3,4,5)
    println(suma(3,4,5))
    println({a: Int, b: Int, c: Int -> a+b+c}(7,8,9))

    val calculateNumber = {n: Int ->
        when(n){
            in 1..3 -> println("Tu numero está entre 1 y 3")
            in 4..7 -> println("Tu numero está entre 4 y 7")
            in 8..10 -> println("Tu numero está entre 8 y 10")
        }
    }

    println(calculateNumber(6))

}

fun evaluate(character: Char = '=', number: Int = 2): String{
    return "${number} es ${character}"
}

fun averageNumber(numbers: IntArray, n: Int): Int {
  //val numbers = intArrayOf(6,6,23,9,2,3,2)
  var suma = 0
  for(num in numbers){
     suma += num
  }
    return (suma / numbers.size)+n
}


