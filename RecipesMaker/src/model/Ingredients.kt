package model

class Ingredients(opcion: String): Category() {

    private var category: String = "Agua"
    private var ingredientList = arrayListOf<String>("Lista vacia")

    init {
        category=opcion
     }


  fun getIngredient(): ArrayList<String> {

        when {
            this.category.equals("1. Frutas") -> ingredientList = arrayListOf<String>("1. Fresas","2. Bananas","3. Uvas","4. Manzana","5. Naranja","6. Pera","7. Cereza","8. Volver")
            this.category.equals("2. Cereales") -> ingredientList = arrayListOf<String>("1. Avena","2. Trigo","3. Arroz","4. Maiz","5. Volver")
            this.category.equals("3. Lacteos") -> ingredientList = arrayListOf<String>("1. Leche","2. Yogurt","3. Queso","4. Helado","5. Volver")
            this.category.equals("4. Verduras") -> ingredientList = arrayListOf<String>("1. Cebolla","2. Tomate","3. Pimiento","4. Lechuga","6. Zanahoria","7. Pepino","8. Volver")
            this.category.equals("5. Carnes") -> ingredientList = arrayListOf<String>("1. Pollo","2. Carne Res","3. Cerdo","4. Costillas","5. Volver")
            this.category.equals("6. Mariscos") -> ingredientList = arrayListOf<String>("1. Pescado","2. Camaron","3. Pulpo","4. Ostras","5. Volver")
            this.category.equals("7. Salir") ->  ingredientList = arrayListOf("USTED A SALIDO DEL MENU DE OPCIONES...!!")
        }

        return  ingredientList
    }

    fun getSelection(){

    }


}