package com.colosoft.sessionfragments.ui.flash

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.colosoft.sessionfragments.R

class FlashFragment : Fragment() {

    companion object {
        fun newInstance() = FlashFragment()
    }

    private lateinit var viewModel: FlashViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_flash, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FlashViewModel::class.java)
        // TODO: Use the ViewModel
    }

}