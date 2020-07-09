package model

abstract class AbstractProduct (var name: String, var description: String, var sku: Int ) {

    override fun toString(): String {
        return "\nName: $name \nDescription: $description\nSKU: $sku"
    }

}
