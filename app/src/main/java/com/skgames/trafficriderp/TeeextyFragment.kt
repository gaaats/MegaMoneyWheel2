package com.skgames.trafficriderp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.skgames.trafficriderp.databinding.FragmentTeeextyBinding
import com.skgames.trafficriderp.fragggam.AdapterPager

class TeeextyFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentTeeextyBinding = FragmentTeeextyBinding.inflate(inflater, container, false)
        return teeextyBinding.root
    }

    private var fragmentTeeextyBinding: FragmentTeeextyBinding? = null
    private val teeextyBinding get() = fragmentTeeextyBinding ?: throw RuntimeException("FragmentTeeextyBinding = null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            teeextyBinding.btnImgExit.setOnClickListener {
                gtjjgtjitg()
            }

            val hyhyhyhy = generateImgForPager()
            val adapter = AdapterPager(hyhyhyhy)
            teeextyBinding.pager.adapter = adapter
            teeextyBinding.circleIndicatorPhotoGalery.setViewPager(teeextyBinding.pager)


        } catch (e: Exception) {
            snackBarError()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun generateImgForPager(): List<Int> {
        return listOf(
            R.drawable.j1,
            R.drawable.j2,
            R.drawable.j3,
            R.drawable.j4,
            R.drawable.j5,
            R.drawable.j6,
            )
    }

    private fun gtjjgtjitg() {
        initAlertDialogForExit()
    }


    private fun snackBarError() {
        hykhykhyk()
        requireActivity().onBackPressed()
    }

    private fun hykhykhyk() {
        Toast.makeText(
            requireContext(),
            "Error 5555, try again",
            Toast.LENGTH_SHORT
        ).show()
    }

    private fun initAlertDialogForExit() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Are you definitely want to log out, the current data will not be saved?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().onBackPressed()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }


}