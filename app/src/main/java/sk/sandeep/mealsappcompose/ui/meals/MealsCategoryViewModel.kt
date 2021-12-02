package sk.sandeep.mealsappcompose.ui.meals

import androidx.lifecycle.ViewModel
import sk.sandeep.mealsappcompose.model.Category
import sk.sandeep.mealsappcompose.model.repository.MealsRepository

class MealsCategoryViewModel(
    private val repository: MealsRepository = MealsRepository()
) : ViewModel() {

    fun getMeals(): List<Category> {
        return repository.getMeals().categories
    }
}