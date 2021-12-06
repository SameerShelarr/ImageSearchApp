package com.sameershelar.imagesearchapp.api

import com.sameershelar.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)