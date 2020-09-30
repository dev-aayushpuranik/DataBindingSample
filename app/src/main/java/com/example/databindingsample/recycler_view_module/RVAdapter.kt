package com.example.databindingsample.recycler_view_module

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingsample.R
import com.example.databindingsample.databinding.CellViewBinding

class RVAdapter(
    private val context: Context,
    private val list: ArrayList<RVModel>
) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    class ViewHolder( val binding: CellViewBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind( model: RVModel) {
            binding.model = model
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: CellViewBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.cell_view, parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = list[position]
        holder.bind(model)
        holder.binding.root.setOnClickListener {
            Toast.makeText(context, model.name, Toast.LENGTH_SHORT).show()
        }
    }
}