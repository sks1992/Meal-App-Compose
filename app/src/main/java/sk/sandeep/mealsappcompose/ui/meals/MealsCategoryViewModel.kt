package sk.sandeep.mealsappcompose.ui.meals

import androidx.lifecycle.ViewModel
import sk.sandeep.mealsappcompose.model.MealsRepository

class MealsCategoryViewModel(
    private val repository: MealsRepository = MealsRepository()
) : ViewModel() {
}