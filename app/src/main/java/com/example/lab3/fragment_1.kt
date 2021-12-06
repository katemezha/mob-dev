package com.example.lab3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab3.databinding.Fragment1Binding

class fragment_1 : Fragment() {
    private lateinit var binding: Fragment1Binding
    private var index = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment1Binding.inflate(inflater, container, false)
        nextBtnClick()

        val view: View = binding.root
        return view
    }

    private fun nextBtnClick() {
        binding.next.setOnClickListener {
            val switchFragment = requireActivity() as SwitchFragment
            try {
                mainfragment.firstVal = binding.value1.text.toString().toDouble()
            }
            catch (e: Exception) {
                mainfragment.secondVal = null
            }
            switchFragment.nextFragment(index)
        }
    }
}