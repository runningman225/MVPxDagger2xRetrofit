package com.example.modelviewpresenterexample.di.module

import com.example.modelviewpresenterexample.network.BookApiInterface
import com.example.modelviewpresenterexample.scope.UserScope
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class BookModule{

    @Provides
    @UserScope
    fun provideBookApiInterface(retrofit: Retrofit): BookApiInterface {
        return retrofit.create(BookApiInterface::class.java)
    }
}