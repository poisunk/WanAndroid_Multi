package com.ndhzs.module.system.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ndhzs.module.system.bean.Navigation
import com.ndhzs.module.system.databinding.ItemNavigationBinding

/**
 * author : Watermelon02
 * email : 1446157077@qq.com
 * date : 2022/5/31 18:19
 */
class NavigationRecyclerAdapter(private val articles: List<Navigation.Article>): RecyclerView.Adapter<NavigationRecyclerAdapter.ViewHolder>() {
    inner class ViewHolder(val binding:ItemNavigationBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemNavigationBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.itemNavigationText.text = articles[position].title
    }

    override fun getItemCount(): Int {
        return articles.size
    }
}