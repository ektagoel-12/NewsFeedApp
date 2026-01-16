package com.example.newsfeedapp.view
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import com.example.newsfeedapp.NewsCard
import com.example.newsfeedapp.viewmodel.HomeViewModel

@Composable
fun NewsScreen(viewModel: HomeViewModel) {

    val news by viewModel.news.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadNews()
    }

    LazyColumn(modifier = Modifier.padding(8.dp)) {
        items(news) { item ->
            NewsCard(news = item)
        }
    }
}
