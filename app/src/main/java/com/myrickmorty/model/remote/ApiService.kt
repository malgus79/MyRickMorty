package com.myrickmorty.model.remote

import com.myrickmorty.core.Constants
import com.myrickmorty.model.data.ResponseRickMorty
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getAllCharacters(
        @Query("page") page: Int

    ): Response<ResponseRickMorty>
}