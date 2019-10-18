package com.example.modelviewpresenterexample.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.modelviewpresenterexample.*
import com.example.modelviewpresenterexample.base.BaseActivity
import com.example.modelviewpresenterexample.model.Item
import javax.inject.Inject


class MainActivity : BaseActivity(){

    @Inject
    lateinit var presenter: MainPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        (application as MyApp).getBookComponent().inject(this)

        presenter.onAttachView(this)
        binding.button.setOnClickListener{
            if(binding.etBookQuery.text.isNotEmpty()){
                hideKeyboard()
                showProgress()
                presenter.onButtonClick(binding.etBookQuery.text.toString())
            } else{
                Toast.makeText(this,"Please enter the book name",Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }
    override fun showProgress() {
        binding.progressBar.visibility = View.VISIBLE
        binding.tvBook.visibility = View.INVISIBLE
    }

    override fun hideProgress() {
        binding.progressBar.visibility = View.GONE
        binding.tvBook.visibility = View.VISIBLE
    }

    override fun setText(string: String) {
        binding.tvBook.text = string
    }

    override fun setBookList(bookList: List<Item>) {
        val adapter = BookAdapter()
        adapter.bookList = bookList
        binding.rvBookList.adapter = adapter
    }
}
