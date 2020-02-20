package com.example.recyclerviewdragdropandswipe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_integer_view.view.*

class IntegerListAdapter(var integerList : List<Int>) : RecyclerView.Adapter<IntegerListAdapter.IntegerListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntegerListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_integer_view, parent, false)
        return IntegerListViewHolder(view)
    }

    override fun getItemCount(): Int = integerList.size

    override fun onBindViewHolder(holder: IntegerListViewHolder, position: Int) = holder.bindDataToView(position)

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    inner class IntegerListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindDataToView(position: Int){
            itemView.textView_integer.text = integerList[position].toString()
        }
    }
}