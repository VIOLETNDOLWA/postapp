package com.example.postapp.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.postapp.R

class MainActivity : AppCompatActivity() {
    lateinit var PostViewModel: PostViewModel
    Lateinit var  PostViewModelFactory: PostViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val PostRepository = PostRepository()
        PostViewModelFactory = PostViewModelFactory(PostRepository)
        PostViewModel =
                ViewModelProvider(owner:this, PostViewModelFactory).get(PostViewModel:: class.java)

        PostViewModel.getPost()

        PostViewModel.PostViewModelFactory{PostList->
            Toast.makeText(baseContext,"")

        })
    }
}
