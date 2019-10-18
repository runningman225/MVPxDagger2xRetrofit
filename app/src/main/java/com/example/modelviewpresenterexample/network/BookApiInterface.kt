package com.example.modelviewpresenterexample.network

import com.example.modelviewpresenterexample.Constant
import com.example.modelviewpresenterexample.model.BookResponse
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookApiInterface {
    @GET("volumes")
    fun getBooks(@Query(Constant.QUERY_PARAM) query: String): Deferred<BookResponse>
}
