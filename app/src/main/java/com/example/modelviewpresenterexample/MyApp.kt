package com.example.modelviewpresenterexample

import android.app.Application
import com.example.modelviewpresenterexample.di.component.AppComponent
import com.example.modelviewpresenterexample.di.component.BookComponent
import com.example.modelviewpresenterexample.di.component.DaggerAppComponent
import com.example.modelviewpresenterexample.di.component.DaggerBookComponent
import com.example.modelviewpresenterexample.di.module.AppModule
import com.example.modelviewpresenterexample.di.module.BookModule
import com.example.modelviewpresenterexample.di.module.NetModule

class MyApp: Application(){
    lateinit var mAppComponent: AppComponent
    lateinit var mBookComponent: BookComponent


    override fun onCreate() {
        super.onCreate()
        mAppComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .netModule(NetModule(Constant.BASE_URL))
            .build()
        mBookComponent = DaggerBookComponent.builder()
            .appComponent(mAppComponent)
            .bookModule(BookModule())
            .build()
    }
    fun getAppComponent(): AppComponent {
        return mAppComponent
    }
    fun getBookComponent(): BookComponent {
        return mBookComponent
    }
}