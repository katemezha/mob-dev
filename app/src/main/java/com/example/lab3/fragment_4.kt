package com.example.lab3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab3.databinding.Fragment4Binding

class fragment_4 : Fragment() {
    private lateinit var binding: Fragment4Binding
    private var index = 3
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment4Binding.inflate(inflater, container, false)
        binding.result.text = mainfragment.firstVal.toString() +
                " " + mainfragment.action +
                " " + mainfragment.secondVal.toString() +
                " = " + mainfragment.result().toString()
        prevBtnClick()

        val view: View = binding.root
        return view
    }

    private fun prevBtnClick(){
        binding.back4.setOnClickListener {
            val switchFragment = requireActivity() as SwitchFragment
            switchFragment.prevFragment(index)
        }
    }
}