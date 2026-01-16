package com.example.newsfeedapp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp

@Composable
fun NewsScreen(viewModel: NewsViewModel) {
    LaunchedEffect(Unit)  { viewModel.getData()
    }
    RecyclerView(news=viewModel.articles)
}
