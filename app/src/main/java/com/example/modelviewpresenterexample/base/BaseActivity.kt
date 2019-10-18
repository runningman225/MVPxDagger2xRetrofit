package com.example.modelviewpresenterexample.base

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.modelviewpresenterexample.BookAdapter
import com.example.modelviewpresenterexample.Constant.BASE_URL
import com.example.modelviewpresenterexample.MainContract
import com.example.modelviewpresenterexample.MyApp
import com.example.modelviewpresenterexample.databinding.ActivityMainBinding
import com.example.modelviewpresenterexample.di.component.AppComponent
import com.example.modelviewpresenterexample.di.component.DaggerAppComponent
import com.example.modelviewpresenterexample.di.module.AppModule
import com.example.modelviewpresenterexample.di.module.NetModule
import com.example.modelviewpresenterexample.model.Item

abstract class BaseActivity: AppCompatActivity(), MainContract.MainView {
    lateinit var binding: ActivityMainBinding

    lateinit var mAppComponent: AppComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun showToast(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }
}