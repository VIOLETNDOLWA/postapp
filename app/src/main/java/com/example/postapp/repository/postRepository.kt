package com.example.postapp.repository

import com.example.Postapp.api.ApiClient
import com.example.postapp.api.ApiInterface
import com.example.Postapp.models.Post
import com.example.postapp.model.Post
import kotlink.coroutines.Dispatchers
import kotlink.coroutines.withContext
import retrofit2.Response

class postRepository {
    suspend  fun getPost():Response<List<Post>>withContext(Dispatcher.10){
        val apiInterface =ApiClient.buildingService(ApiInterface::class.java)
        val response :Response<List<Post>> = apiInterface.getPost()
        return@withContext response
    }
}