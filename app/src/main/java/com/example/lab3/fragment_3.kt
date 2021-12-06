package com.example.lab3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab3.databinding.Fragment3Binding

class fragment_3 : Fragment() {
    private lateinit var binding: Fragment3Binding
    private var index = 2
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment3Binding.inflate(inflater, container, false)
        nextBtnClick()
        prevBtnClick()

        val view: View = binding.root
        return view
    }

    private fun nextBtnClick(){
        binding.next3.setOnClickListener {
            val switchFragment = requireActivity() as SwitchFragment
            mainfragment.action = binding.action.text.toString()
            switchFragment.nextFragment(index)
        }
    }

    private fun prevBtnClick(){
        binding.back3.setOnClickListener {
            val switchFragment = requireActivity() as SwitchFragment
            switchFragment.prevFragment(index)
        }
    }
}