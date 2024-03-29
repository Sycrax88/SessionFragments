package com.colosoft.sessionfragments.ui.batman

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.findNavController
import com.colosoft.sessionfragments.R
import com.colosoft.sessionfragments.databinding.FragmentBatmanBinding

class BatmanFragment : Fragment() {

    private lateinit var viewModel: BatmanViewModel
    private lateinit var batmanBinding: FragmentBatmanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        batmanBinding = FragmentBatmanBinding.inflate(inflater, container, false)
        val view = batmanBinding.root

        batmanBinding.batmanImage.setOnClickListener{
            findNavController().navigate(BatmanFragmentDirections.actionBatmanFragmentToFlashFragment())
        }
        return view
    }


}