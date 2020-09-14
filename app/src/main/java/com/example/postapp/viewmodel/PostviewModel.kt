package com.example.postapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelScope
import androidx.lifecycle.viewModelScope
import com.example.postapp.repository.postRepository
import ke.co.Postapp.model.Post
import ke.co.postapp.repository.PostRepository
import kotlinx.coroutines.launch

class PostviewModel(val postRepository: postRepository): ViewModel() {

    var postLiveData = MutableLiveData<List<post>>()
    var PostsFailedLiveData = MutableLiveData<String>()


    fun getPost(){
        viewModelScope.launch {this: CoroutlineScope
            val response = PostRespository.getPost()
            if(response.isSuccessful) {
                PostLiveData.PostValue(response.body())
            }
            else{
                PostFailedLiveData.PostValue(response.errorBody()?.string())
            }

        }
    }
}