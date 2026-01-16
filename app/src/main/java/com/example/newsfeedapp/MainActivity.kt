package com.example.newsfeedapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsfeedapp.model.News
import com.example.newsfeedapp.ui.theme.NewsFeedAppTheme
import com.example.newsfeedapp.view.NewsScreen
import com.example.newsfeedapp.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {
    private val viewModel : HomeViewModel by viewModels {
        HomeViewModel.Factory
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsFeedAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        Text(
                            text = "NEWS NOW",
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            color = Color.Red,
                            fontSize = 25.sp
                        )

                        NewsScreen(viewModel)
                    }
                }
            }
        }

    }
}

@Composable
fun NewsCard(news: News){
    Surface(color= MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal= 8.dp)) {
        Column(modifier =  Modifier
            .padding(24.dp)
            .fillMaxWidth()) {

            Row {
                Column (
                    modifier = Modifier.weight(1f)
                ){
                    Text(text= news.title)
                    Text(text= news.date, style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight= FontWeight.Thin
                    ))
                }

                OutlinedButton(onClick = { /*TODO:*/  }) {
                    Text(text= "Show more",
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }
        }
    }
}

@Composable
fun RecyclerView(news: List<News>){
    LazyColumn(modifier =  Modifier.padding(vertical = 4.dp)) {
        items(news){
            item-> NewsCard(news=item)
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    NewsFeedAppTheme {
//        NewsScreen(viewModel)
//    }
//}
