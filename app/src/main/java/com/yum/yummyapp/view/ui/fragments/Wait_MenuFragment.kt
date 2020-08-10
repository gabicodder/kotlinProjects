package com.yum.yummyapp.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yum.yummyapp.R
import com.yum.yummyapp.view.adapter.MenuAdapter


class Wait_MenuFragment : Fragment()  {

    private lateinit var menuAdapter: MenuAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_wait__menu, container, false)
    }


}