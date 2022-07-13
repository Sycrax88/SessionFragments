package com.colosoft.sessionfragments.ui.batman

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.colosoft.sessionfragments.R

class BatmanFragment : Fragment() {

    companion object {
        fun newInstance() = BatmanFragment()
    }

    private lateinit var viewModel: BatmanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_batman, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BatmanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}