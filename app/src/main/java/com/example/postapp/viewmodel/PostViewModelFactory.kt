package com.example.postapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PostViewModelFactory(val PostRepoitory: PostRepository) :ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(PostViewModel::class.java)) {
            return PostViewModel(PostRepository) as
        }
        throw IllegalArgumentException("Unknown viewmodel class")
    }
}