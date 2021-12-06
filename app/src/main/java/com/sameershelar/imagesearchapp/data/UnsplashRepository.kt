package com.sameershelar.imagesearchapp.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.sameershelar.imagesearchapp.api.UnsplashAPI
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashAPI: UnsplashAPI) {

    fun getSearchResult(query: String) = Pager(
        PagingConfig(
            pageSize = 20,
            maxSize = 100,
            enablePlaceholders = false
        ),
        pagingSourceFactory = { UnsplashPagingSource(unsplashAPI, query) }
    ).liveData
}