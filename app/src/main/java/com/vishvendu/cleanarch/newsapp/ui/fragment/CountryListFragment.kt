package com.vishvendu.cleanarch.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.vishvendu.cleanarch.newsapp.MyNewsApplication
import com.vishvendu.cleanarch.newsapp.data.model.countrylist.CountryListItem
import com.vishvendu.cleanarch.newsapp.databinding.FragmentCountryListBinding
import com.vishvendu.cleanarch.newsapp.di.component.DaggerFragmentComponent
import com.vishvendu.cleanarch.newsapp.di.module.FragmentModule
import com.vishvendu.cleanarch.newsapp.ui.activity.NewsForCountryActivity
import com.vishvendu.cleanarch.newsapp.ui.adapter.CountryListAdapter
import com.vishvendu.cleanarch.newsapp.ui.viewmodel.CountryListViewModel
import com.vishvendu.cleanarch.newsapp.utils.Status
import kotlinx.coroutines.launch
import javax.inject.Inject

class CountryListFragment : Fragment() {

    companion object{
        fun newInstance(): CountryListFragment {
            return CountryListFragment()
        }
    }

    private var _binding : FragmentCountryListBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var adapter: CountryListAdapter

    @Inject
    lateinit var countryListViewModel : CountryListViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies()
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =  FragmentCountryListBinding.inflate(inflater ,container,false)
        val view = binding.root
        setupUI()
        setupObserver()
        return view
    }

    private fun setupUI() {
        val recyclerView = _binding?.recyclerView
        recyclerView?.layoutManager = LinearLayoutManager(activity)
        recyclerView?.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,0
            )
        )
        recyclerView?.adapter = adapter
        adapter.itemClickListener = { data ->
           startActivity(NewsForCountryActivity.getStartIntent(requireContext(), data.code))
        }
    }

    private fun renderList(articleList: List<CountryListItem>) {
        adapter.addData(articleList)
        adapter.notifyDataSetChanged()
    }

    private fun setupObserver() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                countryListViewModel.countryList.collect{
                    when(it.status){
                        Status.SUCCESS ->{
                            binding.progressBar.visibility = View.GONE
                            it.data?.let { newsList -> renderList(newsList) }
                            binding.recyclerView.visibility = View.VISIBLE
                        }
                        Status.LOADING -> {
                            binding.progressBar.visibility = View.VISIBLE
                            binding.recyclerView.visibility = View.GONE
                        }
                        Status.ERROR -> {
                            binding.progressBar.visibility = View.GONE
                            Toast.makeText(activity, it.message, Toast.LENGTH_LONG)
                                .show()
                        }

                    }
                }
            }
        }
    }

    private fun injectDependencies(){
       DaggerFragmentComponent
           .builder()
           .applicationComponent((requireContext().applicationContext as MyNewsApplication).applicationComponent)
           .fragmentModule(FragmentModule(this))
           .build()
           .inject(this)
    }


}
