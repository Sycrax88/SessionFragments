package com.colosoft.sessionfragments.ui.wonderwoman

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.colosoft.sessionfragments.R

class WonderWomanFragment : Fragment() {

    companion object {
        fun newInstance() = WonderWomanFragment()
    }

    private lateinit var viewModel: WonderWomanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_wonder_woman, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WonderWomanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}