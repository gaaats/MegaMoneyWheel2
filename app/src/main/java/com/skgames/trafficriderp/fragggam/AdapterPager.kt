package com.skgames.trafficriderp.fragggam

import android.view.LayoutInflater
import android.view.View
import com.skgames.trafficriderp.R
import com.skgames.trafficriderp.databinding.PagereeeeeeeeeeeBinding
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class AdapterPager (val yjjuujjuuj: List<Int>): RecyclerView.Adapter<AdapterPager.VievPagerHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VievPagerHolder {
        LayoutInflater.from(parent.context).inflate(R.layout.pagereeeeeeeeeee, parent, false).also {
            return VievPagerHolder(it)
        }
    }

    override fun onBindViewHolder(holder: VievPagerHolder, position: Int) {
        holder.pagereeeeeeeeeeeBinding.imageViev.setImageResource(yjjuujjuuj[position])
    }

    override fun getItemCount(): Int {
        return yjjuujjuuj.size
    }

    inner class VievPagerHolder (view: View): RecyclerView.ViewHolder(view){
        val pagereeeeeeeeeeeBinding = PagereeeeeeeeeeeBinding.bind(view)
    }
}