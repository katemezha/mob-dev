package com.example.lab3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab3.databinding.Fragment2Binding
import com.example.lab3.databinding.Fragment1Binding

class  fragment2 : Fragment() {
    private lateinit var binding: Fragment2Binding
    private var index = 1
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment2Binding.inflate(inflater, container, false)
        nextBtnClick()
        prevBtnClick()

        val view: View = binding.root
        return view
    }

    private fun nextBtnClick() {
        binding.next2.setOnClickListener {
            val switchFragment = requireActivity() as SwitchFragment
            try {
                mainfragment.secondVal = binding.value2.text.toString().toDouble()
            }
            catch (e: Exception) {
                mainfragment.secondVal = null
            }
            switchFragment.nextFragment(index)
        }
    }

    private fun prevBtnClick(){
        binding.back.setOnClickListener {
            val switchFragment = requireActivity() as SwitchFragment
            switchFragment.prevFragment(index)
        }
    }
}