package com.sameershelar.imagesearchapp.data

import com.sameershelar.imagesearchapp.api.UnsplashAPI
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashAPI: UnsplashAPI) {
}