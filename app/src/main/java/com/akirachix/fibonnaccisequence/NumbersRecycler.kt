package com.akirachix.fibonnaccisequence

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NumbersRecycler(var numbers :List<Int>):RecyclerView.Adapter<NumbersHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.numbers_list,parent,false)
        return NumbersHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumbersHolder, position: Int) {
        holder.tvNumbers.text=numbers[position].toString()

    }

    override fun getItemCount(): Int {
        return numbers.size

    }
}
class NumbersHolder(itemView: View):ViewHolder(itemView){
    var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)
}













