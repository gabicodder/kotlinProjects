package com.yum.yummyapp.view.adapter

import com.yum.yummyapp.model.Order

interface OrderListener {

    fun onOrderClicked(order: Order, position: Int){

    }

}