package com.example.modelviewpresenterexample

import com.example.modelviewpresenterexample.model.Item
import com.example.modelviewpresenterexample.model.VolumeInfo

interface MainContract {
    interface MainView {
        fun showProgress()

        fun hideProgress()

        fun setText(string: String)

        fun setBookList(bookList: List<Item>)
    }

    interface MainPresenter {
        fun onButtonClick(query: String)
        fun onDestroy()
    }
}