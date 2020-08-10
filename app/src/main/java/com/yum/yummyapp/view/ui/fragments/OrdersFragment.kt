package com.yum.yummyapp.view.ui.fragments

import android.os.Bundle
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.yum.yummyapp.R
import com.yum.yummyapp.model.Order
import com.yum.yummyapp.view.adapter.OrderAdapter
import com.yum.yummyapp.view.adapter.OrderListener
import com.yum.yummyapp.viewmodel.OrderViewModel
import kotlinx.android.synthetic.main.fragment_orders.*


class OrdersFragment : Fragment(), OrderListener {

    private lateinit var orderAdapter: OrderAdapter
    private lateinit var viewModel: OrderViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
         return inflater.inflate(R.layout.fragment_orders, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(OrderViewModel::class.java)
        viewModel.refresh()

        orderAdapter = OrderAdapter(this)
        rvOrder.apply {
            layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL,false)
            adapter = orderAdapter
        }
        observerViewModel()

        imbAddOrder.setOnClickListener {
          val fragmentManager = getFragmentManager()
           val fragmentTransaction = fragmentManager?.beginTransaction()
           fragmentTransaction!!.replace(R.id.fragContent,AddOrderFragment())
           fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
           fragmentTransaction.addToBackStack(null)
           fragmentTransaction.commit()

        }

    }

    fun observerViewModel(){
        viewModel.listOrder.observe(this, Observer<List<Order>>{
            order -> orderAdapter.updateData(order)

            //Progress Bar
            viewModel.isLoading.observe(this, Observer<Boolean>{
                if (it!=null){
                    rlBaseOrder.visibility = View.INVISIBLE
                }
            })
        })
    }


}