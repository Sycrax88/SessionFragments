package com.colosoft.sessionfragments.ui.superman

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.colosoft.sessionfragments.R

class SupermanFragment : Fragment() {

    companion object {
        fun newInstance() = SupermanFragment()
    }

    private lateinit var viewModel: SupermanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_superman, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SupermanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}