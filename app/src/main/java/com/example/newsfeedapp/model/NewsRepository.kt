package com.example.newsfeedapp.model

class NewsRepository {
    suspend fun fetchNewsData(): List<News> {
        return newsList
    }

    private val newsList = listOf(
        News(1, "India launches new AI policy to boost innovation", "15 Jan 2026", "https://picsum.photos/400/200?random=1"),
        News(2, "Stock markets rally as IT sector gains momentum", "14 Jan 2026", "https://picsum.photos/400/200?random=2"),
        News(3, "Bangalore metro expansion reduces travel time", "13 Jan 2026", "https://picsum.photos/400/200?random=3"),
        News(4, "ISRO announces new lunar mission timeline", "12 Jan 2026", "https://picsum.photos/400/200?random=4"),
        News(5, "Startup funding in India shows strong recovery", "11 Jan 2026", "https://picsum.photos/400/200?random=5"),
        News(6, "Electric vehicle adoption rises sharply across Indian cities", "10 Jan 2026", "https://picsum.photos/400/200?random=6"),
        News(7, "Government announces major boost for renewable energy sector", "09 Jan 2026", "https://picsum.photos/400/200?random=7"),
        News(8, "New cybersecurity framework introduced for digital payments", "08 Jan 2026", "https://picsum.photos/400/200?random=8"),
        News(9, "Indian startups lead global SaaS growth in 2025", "07 Jan 2026", "https://picsum.photos/400/200?random=9"),
        News(10, "Space-tech startups attract record investments this year", "06 Jan 2026", "https://picsum.photos/400/200?random=10"),
        News(11, "Major IT firms announce hybrid work as permanent model", "05 Jan 2026", "https://picsum.photos/400/200?random=11"),
        News(12, "Digital education platforms see surge in rural adoption", "04 Jan 2026", "https://picsum.photos/400/200?random=12"),
        News(13, "5G rollout accelerates smart city initiatives nationwide", "03 Jan 2026", "https://picsum.photos/400/200?random=13"),
        News(14, "Healthcare AI tools improve early disease detection", "02 Jan 2026", "https://picsum.photos/400/200?random=14"),
        News(15, "India’s fintech ecosystem expands with new global partnerships", "01 Jan 2026", "https://picsum.photos/400/200?random=15")
    )
}
