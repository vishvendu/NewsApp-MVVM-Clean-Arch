package com.vishvendu.cleanarch.newsapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem
import com.vishvendu.cleanarch.newsapp.databinding.CountryListItemsBinding
import com.vishvendu.cleanarch.newsapp.ui.activity.NewsSourceDetailsActivity
import com.vishvendu.cleanarch.newsapp.ui.fragment.NewsForCountryFragment
import com.vishvendu.cleanarch.newsapp.utils.ItemClickListener

class CountryListAdapter(private val context: Context, private val countryList: ArrayList<CountryListItem>) :
    RecyclerView.Adapter<CountryListAdapter.ViewHolder>() {

    lateinit var itemClickListener: ItemClickListener<CountryListItem>

    class ViewHolder(private val binding: CountryListItemsBinding, private val itemClickListener: ItemClickListener<CountryListItem>) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(source: CountryListItem, context: Context) {
            binding.countryItem.text = source.label
            itemView.setOnClickListener {
                itemClickListener(source)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            CountryListItemsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),itemClickListener
        )


    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(countryList[position], context)

    override fun getItemCount(): Int = countryList.size

    fun addData(list: List<CountryListItem>) {
        countryList.addAll(list)
    }


}