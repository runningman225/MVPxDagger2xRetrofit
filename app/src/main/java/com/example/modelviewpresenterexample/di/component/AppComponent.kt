package com.example.modelviewpresenterexample.di.component

import android.app.Activity
import com.example.modelviewpresenterexample.di.module.AppModule
import com.example.modelviewpresenterexample.di.module.NetModule
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetModule::class])
interface AppComponent{
    fun inject(activity: Activity)
    fun retrofit(): Retrofit
}