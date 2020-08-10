package com.yum.yummyapp.network

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.yum.yummyapp.model.Order

const val  MENU_COLLECTION_NAME = "menu"
const val  ORDER_COLLECTION_NAME = "orders"

class FirestoreService {
    val firestoreService = FirebaseFirestore.getInstance()
    val setting = FirebaseFirestoreSettings.Builder().setPersistenceEnabled(true).build()

    init {
        firestoreService.firestoreSettings = setting
    }

    fun getOrder(callback: Callback<List<Order>>){
        firestoreService.collection(ORDER_COLLECTION_NAME)
            .get()
            .addOnSuccessListener { result ->
                for (doc in result){
                    var list = result.toObjects(Order::class.java)
                    callback.onSucess(list)
                    break
                }
            }
    }
}