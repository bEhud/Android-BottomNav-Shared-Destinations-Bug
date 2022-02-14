package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class HomeFragment : Fragment(R.layout.fragment_layout_template) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.fragment_name).apply {
            text = "home"
            setOnClickListener { findNavController().navigate(R.id.action_homeFragment_to_profileFragment) }
        }
    }
}