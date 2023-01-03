package com.skgames.trafficriderp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.skgames.trafficriderp.databinding.FragmentInitiaaalinBinding

class InitiaaalinFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentInitiaaalinBinding = FragmentInitiaaalinBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun hyhhyhyhy() {
        Toast.makeText(
            requireContext(),
            "I have error, try again",
            Toast.LENGTH_SHORT
        ).show()
        requireActivity().onBackPressed()
    }


    override fun onDestroy() {
        fragmentInitiaaalinBinding = null
        super.onDestroy()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.btnPlayGameeeeeeeeeeee.setOnClickListener {
                findNavController().navigate(R.id.action_initiaaalinFragment_to_gaaamerFragment)
            }
            binding.btnImgQuestiongtgtgtgt.setOnClickListener {
                findNavController().navigate(R.id.action_initiaaalinFragment_to_teeextyFragment)
            }

        } catch (e: Exception) {
            hyhhyhyhy()
        }

        super.onViewCreated(view, savedInstanceState)
    }


    private var fragmentInitiaaalinBinding: FragmentInitiaaalinBinding? = null
    private val binding
        get() = fragmentInitiaaalinBinding ?: throw RuntimeException("FragmentInitiaaalinBinding = null")





}