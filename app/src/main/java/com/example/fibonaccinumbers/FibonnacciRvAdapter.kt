package com.example.fibonaccinumbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView

import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class FibonnacciRvAdapter (var fibList: List<BigInteger>):RecyclerView.Adapter<FibonnacciRvAdapter.FibonacciViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciViewHolder {
var itemView = LayoutInflater.from(parent.context).inflate(R.layout.fib_list_item,parent,false)
        return FibonacciViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FibonacciViewHolder, position: Int) {
        var currentNum =fibList.get(position)
holder.tvNumber.text =currentNum.toString()
    }

    override fun getItemCount(): Int {
        return fibList.size

    }
    class FibonacciViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
    }
}



