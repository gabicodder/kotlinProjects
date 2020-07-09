package model

class Ingredients(var opcion: String) {

    private var category: String = "Agua"

    init {
        this.category = opcion
    }


    fun getIngredient(): ArrayList<String> {
     var ingredientList = arrayListOf<String>("Lista vacia")

        when {
            this.category.equals("1. Frutas") -> ingredientList = arrayListOf<String>("Fresas","Bananas","Uvas","Manzana","Naranja","Pera","Cereza")
            this.category.equals("2. Cereales") -> ingredientList = arrayListOf<String>("Avena","Trigo","Arroz","Maiz")
            this.category.equals("3. Lacteos") -> ingredientList = arrayListOf<String>("Leche","Yogurt","Queso","Helado")
            this.category.equals("4. Verduras") -> ingredientList = arrayListOf<String>("Cebolla","Tomate","Pimiento","Lechuga","Zanahoria","Pepino")
            this.category.equals("5. Carnes") -> ingredientList = arrayListOf<String>("Pollo","Carne Res","Cerdo","Costillas")
            this.category.equals("6. Mariscos") -> ingredientList = arrayListOf<String>("Pescado","Camaron","Pulpo","Ostras")
        }

        return  ingredientList
    }


}