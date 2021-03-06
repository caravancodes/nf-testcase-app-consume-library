package com.frogobox.nutritionframeworkapp.di

import com.frogobox.nutritioncore.method.function.ConsumeNewsApi
import com.frogobox.nutritioncore.method.function.ConsumeTheMealDbApi
import com.frogobox.nutritioncore.method.function.NutritionApi
import com.frogobox.nutritioncore.util.meal.MealUrl
import com.frogobox.nutritioncore.util.news.NewsUrl
import org.koin.dsl.module

/*
 * Created by Faisal Amir on 23/10/2020
 * KickStartProject Source Code
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2020 FrogoBox Inc.      
 * All rights reserved
 *
 */

val repositoryModule = module {

    single {
        ConsumeNewsApi("537d2afe5a594e28b967e1118c7c38d3")
    }

    single {
        ConsumeTheMealDbApi(MealUrl.API_KEY)
    }

    single {
        NutritionApi()
    }

    // Please Add Your Code Under This Line --------------------------------------------------------

}