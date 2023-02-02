package com.example.moviemvvm.hilt

import com.example.moviemvvm.remote.MovieInterface
import com.example.moviemvvm.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

@InstallIn
@Module
object HiltModules {

    @Provides
    fun provideRetrofitInterface():MovieInterface{

        return Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(
            GsonConverterFactory.create()
        ).build().create(MovieInterface::class.java)

    }

}