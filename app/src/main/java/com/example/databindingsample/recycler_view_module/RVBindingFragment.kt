package com.example.databindingsample.recycler_view_module

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.load.model.DataUrlLoader
import com.example.databindingsample.R
import com.example.databindingsample.databinding.FragmentRVBindingBinding
import kotlinx.android.synthetic.main.fragment_r_v_binding.view.*

class RVBindingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentRVBindingBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_r_v_binding, container,false)

        binding.root.recycler_view.layoutManager = LinearLayoutManager(context)
        binding.root.recycler_view.adapter = RVAdapter(context!!, fetchList())

        return view
    }

    private fun fetchList(): ArrayList<RVModel> {
        val list = arrayListOf<RVModel>()

        for (i in 0 until 10) {
            val model = RVModel("Title $i", "9${i}7${i}39${i+1}84", "https://androidwave.com/wp-content/uploads/2019/01/profile_pic.jpg")
            list.add(model)
        }
        return list
    }
}