package com.yum.yummyapp.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.firebase.firestore.FirebaseFirestore
import com.yum.yummyapp.R
import com.yum.yummyapp.model.Menu
import com.yum.yummyapp.model.Order
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setActionBar(findViewById(R.id.toolbarMain))
        configNav()

     /*  val jsonArr = JSONArray("[\n" +
               "            {\n" +
               "                 'date' : 1564830000,\n" +
               "                'client' : 'Gabriela Barrezueta',\n" +
               "                'first' : 'Sopa de Lentejas',\n" +
               "                 'first_amount': 1,\n" +
               "                'option_1' : 'Seco de pollo',\n" +
               "                'option1_amount' : 1,\n" +
               "                'option_2' : '',\n" +
               "                'option2_amount' : 0,\n" +
               "                 'order_detail' : '1.- Sopa de Lentejas\n+ 1.- Seco de pollo\n+ 1.- Jugo de Naranja',\n"+
               "                 'juice' : 'Jugo de Naranja',\n" +
               "                'juice_amount' : 1 \n" +
               "            }\n" +
               "           ]")

       val jsonArr2 = JSONArray("[\n" +
               "            {\n" +
               "                 'date' : 1564830000,\n" +
               "                'first_option' : 'Sopa de Lentejas',\n" +
               "                'option_1' : 'Seco de pollo',\n" +
               "                 'option_2' : 'Lomito Saltado',\n" +
               "                'juice' : 'Jugo de Naranja' \n" +
               "            }\n" +
               "           ]")

       val firebaseFirestore = FirebaseFirestore.getInstance()

       for(i in 0 until jsonArr.length()){
           val aux = jsonArr.get(i) as JSONObject
           var order = Order()
           order.Nameclient = aux.getString("client")
           val cal = Calendar.getInstance()
           cal.timeInMillis = aux.getLong("date")*1000
           order.fecha = cal.time
           order.first = aux.getString("first")
           order.first_amount = aux.getInt("first_amount")
           order.option_1 = aux.getString("option_1")
           order.option1_amount = aux.getInt("option1_amount")
           order.option_2 = aux.getString("option_2")
           order.juice = aux.getString("juice")
           order.juice_amount = aux.getInt("juice_amount")
           order.orderDetail = aux.getString("order_detail")

           firebaseFirestore.collection("orders").document().set(order)
       }

       for(i in 0 until jsonArr2.length()){
           val aux = jsonArr2.get(i) as JSONObject
           var menu = Menu()
           menu.first = aux.getString("first_option")
           val cal = Calendar.getInstance()
           cal.timeInMillis = aux.getLong("date")*1000
           menu.date = cal.time
           menu.opcion_1 = aux.getString("option_1")
           menu.opcion_2 = aux.getString("option_2")
           menu.juice = aux.getString("juice")

           firebaseFirestore.collection("menu").document().set(menu)
       }*/
    }

    fun configNav(){
       NavigationUI.setupWithNavController(bnvMain, Navigation.findNavController(this,R.id.fragContent))
    }
}