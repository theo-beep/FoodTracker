package com.theolinnaidoo.foodtracker.network.api

import com.theolinnaidoo.foodtracker.network.models.SearchRecipeResponse
import retrofit2.http.GET

interface SpoonacularApi {

    @GET("recipes")
    suspend fun getRecipe() : List<SearchRecipeResponse>

}