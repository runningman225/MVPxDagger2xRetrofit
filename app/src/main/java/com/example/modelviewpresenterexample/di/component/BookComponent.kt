package com.example.modelviewpresenterexample.di.component

import com.example.modelviewpresenterexample.di.module.BookModule
import com.example.modelviewpresenterexample.scope.UserScope
import com.example.modelviewpresenterexample.view.MainActivity
import dagger.Component


@UserScope
@Component(dependencies = [AppComponent::class], modules = [BookModule::class])
interface BookComponent{
    fun inject(targetActivity: MainActivity)
}