package sk.sandeep.mealsappcompose.model.repository

import sk.sandeep.mealsappcompose.model.MealsResponse

class MealsRepository {
    fun getMeals(): MealsResponse = MealsResponse(arrayListOf())
}