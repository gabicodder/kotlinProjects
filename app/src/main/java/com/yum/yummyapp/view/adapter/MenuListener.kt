package com.yum.yummyapp.view.adapter

import com.yum.yummyapp.model.Menu

interface MenuListener {

    fun onMenuClicked(menu: Menu, position: Int){}
}