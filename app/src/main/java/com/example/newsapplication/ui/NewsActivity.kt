package com.example.newsapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newsapplication.databinding.ActivityNewsBinding
import com.example.newsapplication.db.ArticleDatabase
import com.example.newsapplication.repository.NewsRepository

class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsBinding
    lateinit var viewModel: NewsViewModel

    private val newsNavHostFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as NavHostFragment
    }
    private val navController by lazy {
        newsNavHostFragment.findNavController()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory)[NewsViewModel::class.java]


        binding.bottomNavigationView.setupWithNavController(navController)
    }
}
