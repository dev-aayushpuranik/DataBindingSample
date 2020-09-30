package com.example.databindingsample.module

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.databindingsample.R
import com.example.databindingsample.databinding.FragmentDBBinding

class DBFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentDBBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_d_b, container,false)

        val vm = DBViewModel()
        vm.data = "testing"

        binding.viewModel = vm

        return binding.root
    }
}