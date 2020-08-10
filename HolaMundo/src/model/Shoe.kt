package model

class Shoe(name: String, description: String, sku: Int, var mark: String):
    AbstractProduct(name, description, sku), ICrud { // Clases para Datos - Data Class

    override fun create(): String{
        println("Hola desde Create")
        return "Create Shoe"
    }

    override fun read(): String {
        return "Create Shoe"
    }

    override fun update(): String {
        return "Create Shoe"
    }

    override fun delete(): String {
        return "Create Shoe"
    }

    override fun toString(): String {
        return super.toString() + "SKU: ID: $sku\n Marca: $mark\n Modelo: $model\n Size: $size\nColor: $color\n"
    }



    init {
        println("SKU ID: $sku\n" +
                "Marca: $mark")
     }

    var size: Int = 34 // minimo
    set(value) {
        if (value >= 34)
            field = value
        else
            field = 34
    }
    get() = field

    var color: String = "White" // ok
    var model: String = "Boots" // no se asigne tennis
        set(value) {
            if (value.equals("tennis"))
                field = "Boots"
            else
                field = value
        }
        get() = field
}