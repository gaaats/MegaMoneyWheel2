package com.skgames.trafficriderp

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.skgames.trafficriderp.databinding.FragmentRessstartttBinding
import kotlinx.coroutines.delay
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class RessstartttFragment : Fragment() {


    private var fragmentRessstartttBinding: FragmentRessstartttBinding? = null
    private val ressstartttBinding
        get() = fragmentRessstartttBinding ?: throw RuntimeException("FragmentRessstartttBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentRessstartttBinding = FragmentRessstartttBinding.inflate(inflater, container, false)
        return ressstartttBinding.root
    }



    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentRessstartttBinding = null
        super.onDestroy()
    }

    private fun juujjuju() {
        Toast.makeText(
            requireContext(),
            "Oops something wrong, please try again...",
            Toast.LENGTH_SHORT
        ).show()
        hykkhkykyh()
    }

    private fun hykkhkykyh() {
        requireActivity().onBackPressed()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            gktokgtkgktkgtkgt()

        } catch (e: Exception) {
            juujjuju()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gktokgtkgktkgtkgt() {
        lifecycleScope.launchWhenCreated {
            Toast.makeText(
                requireContext(),
                "Loading next game...",
                Toast.LENGTH_SHORT
            ).show()
            delay(2900)
            hyjhyjhyjjhyjhy()
        }
    }

    private fun hyjhyjhyjjhyjhy() {
        findNavController().navigate(R.id.action_ressstartttFragment_to_gaaamerFragment)
    }
}