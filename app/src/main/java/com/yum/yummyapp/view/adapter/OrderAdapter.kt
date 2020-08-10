package com.yum.yummyapp.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yum.yummyapp.R
import com.yum.yummyapp.model.Order

class OrderAdapter(val orderListener: OrderListener): RecyclerView.Adapter<OrderAdapter.ViewHolder>() {

    var listOrder = ArrayList<Order>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_order,parent,false))

    override fun getItemCount(): Int = listOrder.size

    override fun onBindViewHolder(holder: OrderAdapter.ViewHolder, position: Int) {
        val order = listOrder[position] as Order

        holder.tvNameClient.text = order.nameclient
        holder.tvDetailOrder.text = order.orderDetail
        holder.tvAmountOrder.text = order.order_amount


        holder.itemView.setOnClickListener {
            orderListener.onOrderClicked(order,position)
        }
    }

    fun updateData(data: List<Order>){
        listOrder.clear()
        listOrder.addAll(data)
        notifyDataSetChanged()
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvNameClient = itemView.findViewById<TextView>(R.id.tvNameClientOrder)
        val tvDetailOrder = itemView.findViewById<TextView>(R.id.tvItemDetailOrder)
        val tvAmountOrder = itemView.findViewById<TextView>(R.id.tvNumberOrder)
    }


}