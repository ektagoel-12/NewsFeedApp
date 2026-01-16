package com.example.newsfeedapp

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsfeedapp.model.Article
import com.example.newsfeedapp.model.Constant
import com.example.newsfeedapp.model.RetrofitInstance
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {

    private val newsApi = RetrofitInstance.newsApi

    var articles by mutableStateOf<List<Article>>(emptyList())
        private set

    fun getData() {
        viewModelScope.launch {
            val response = newsApi.getNews(apiKey = Constant.apiKey)
            if (response.isSuccessful) {
                articles = response.body()?.articles ?: emptyList()
            } else {
                Log.e("API_ERROR", response.message())
            }
        }
    }
}

