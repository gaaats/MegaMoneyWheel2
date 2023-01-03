package com.skgames.trafficriderp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.skgames.trafficriderp.databinding.FragmentGaaamerBinding


class GaaamerFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaamerBinding = FragmentGaaamerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val drawable = ContextCompat.getDrawable(requireActivity(), R.drawable.lolglgogo)
            val drawable1 = ContextCompat.getDrawable(requireActivity(), R.drawable.crooovn)

            val drawableList = listOf(drawable, drawable1).shuffled()

            binding.imgMainEnemeefrgyhyhyhyyh.setImageDrawable(drawableList.random())

            binding.root.background.alpha = 230

            kiiiiiiiiiiii()
            gthyjujuj = false
            binding.btnPressgtgtghhy.setOnClickListener {
                if (hhhhhhhhh == 99) {
                    findNavController().navigate(R.id.action_gaaamerFragment_to_ressstartttFragment)
                    hhhhhhhhh = 1
                }
                binding.progBbbb.progress = hhhhhhhhh
                hhhhhhhhh += 1
            }

            binding.btnClooooooosa.setOnClickListener {
                gttttttttttt()
            }


        } catch (e: Exception) {
            uuuuuuuuuuuu()
        }

        super.onViewCreated(view, savedInstanceState)
    }


    private var hhhhhhhhh = 1
    private var gthyjujuj = true

    private var fragmentGaaamerBinding: FragmentGaaamerBinding? = null
    private val binding
        get() = fragmentGaaamerBinding ?: throw RuntimeException("FragmentGaaamerBinding = null")



    private fun uuuuuuuuuuuu() {
        Toast.makeText(
            requireContext(),
            "I have some error, try again",
            Toast.LENGTH_SHORT
        ).show()
    }


    private fun kiiiiiiiiiiii() {
        binding.progBbbb.progress = hhhhhhhhh
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    private fun gttttttttttt() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Current data will not be save")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    override fun onDestroy() {
        fragmentGaaamerBinding = null
        super.onDestroy()
    }


}