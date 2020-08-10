package com.yum.yummyapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yum.yummyapp.model.Order
import com.yum.yummyapp.network.Callback
import com.yum.yummyapp.network.FirestoreService
import java.lang.Exception

class OrderViewModel: ViewModel() {
    val firestoreService = FirestoreService()
    var listOrder: MutableLiveData<List<Order>> = MutableLiveData()
    var isLoading = MutableLiveData<Boolean>()

    fun refresh(){
        getOrderFromFirebase()
    }

    fun getOrderFromFirebase(){
        firestoreService.getOrder(object: Callback<List<Order>>{
            override fun onSucess(result: List<Order>?) {
                listOrder.postValue(result)
                processFinished()
            }

            override fun onFailed(exception: Exception) {
                processFinished()
            }
        })
    }

    fun processFinished(){
        isLoading.value = true
    }
}