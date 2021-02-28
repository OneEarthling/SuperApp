package com.example.superapp.general

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.superapp.MainActivity
import com.example.superapp.R
import com.example.superapp.databinding.FragmentGeneralBinding

class GeneralFragment: Fragment(R.layout.fragment_general), GeneralContractInterface.View {
    private lateinit var presenter: GeneralContractInterface.Presenter
    private var fragmentGeneralBinding: FragmentGeneralBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentGeneralBinding.bind(view)
        fragmentGeneralBinding = binding
        presenter.attach(this)
        binding.textViewButton.setOnClickListener {
            presenter.onTextViewButtonCkicked()
        }

        activity?.actionBar?.setDisplayHomeAsUpEnabled(false)
        activity?.actionBar?.setHomeButtonEnabled(false)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = GeneralPresenter()
    }

    override fun onDestroyView() {
        fragmentGeneralBinding = null
        super.onDestroyView()
    }

    override fun onTextViewButtonCkicked() {
        (activity as MainActivity).openTextViewScreen()
    }


}