package com.example.modelviewpresenterexample

import android.util.Log
import com.example.modelviewpresenterexample.MainContract.*
import com.example.modelviewpresenterexample.model.BookResponse
import com.example.modelviewpresenterexample.model.Item
import com.example.modelviewpresenterexample.network.BookApiInterface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(): MainPresenter {

    @Inject
    lateinit var mBookApiInterface: BookApiInterface

    private var mainView: MainView? = null
    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main )
    private var stringResult = "Book not found.."

    fun onAttachView(mainView: MainView) {
        this.mainView = mainView
    }

    override fun onButtonClick(query: String) {
        mainView?.showProgress()
        fetchBook(query)
    }

    override fun onDestroy() {
        mainView = null
    }

    fun onFinished(string: String, bookList: List<Item>) {
        mainView?.let {
            it.setText(string)
            it.hideProgress()
            it.setBookList(bookList)
        }
    }

    private fun fetchBook(query: String){
        coroutineScope.launch {
            val getBooksDeffered = mBookApiInterface.getBooks(query)
            try {
                val result: BookResponse = getBooksDeffered.await()
                val items = result.items
                val authors: String? = items?.let { it[0].volumeInfo?.authors.toString() }
                val title: String? = items?.let { it[0].volumeInfo?.title }
                stringResult = "$title\n$authors"
                Log.i("FetchBook", stringResult)
                onFinished(stringResult, items!!)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

}
