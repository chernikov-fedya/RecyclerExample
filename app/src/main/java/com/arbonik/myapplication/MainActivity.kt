package com.arbonik.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lm = LinearLayoutManager(baseContext)
        recycler.layoutManager = lm

        var ea = ExerciseAdapter()
        ea.exercises = mutableListOf(
            Exercise("Первое упражнение", "Очень классное", R.drawable.ic_launcher_background),
            Exercise("второе упражнение", "не очеьн классное", R.drawable.ic_assistant_black_24dp),
            Exercise("третье упражнение", "норм", R.drawable.ic_launcher_foreground),
            Exercise("Четвертоне упражнение", "не норм", R.drawable.ic_assistant_black_24dp),
            Exercise("Первое упражнение", "Очень классное", R.drawable.ic_launcher_background),
            Exercise("второе упражнение", "не очеьн классное", R.drawable.ic_assistant_black_24dp),
            Exercise("третье упражнение", "норм", R.drawable.ic_launcher_foreground),
            Exercise("Четвертоне упражнение", "не норм", R.drawable.ic_assistant_black_24dp),
            Exercise("Первое упражнение", "Очень классное", R.drawable.ic_launcher_background),
            Exercise("второе упражнение", "не очеьн классное", R.drawable.ic_assistant_black_24dp),
            Exercise("третье упражнение", "норм", R.drawable.ic_launcher_foreground),
            Exercise("Четвертоне упражнение", "не норм", R.drawable.ic_assistant_black_24dp),
            Exercise("Первое упражнение", "Очень классное", R.drawable.ic_launcher_background),
            Exercise("второе упражнение", "не очеьн классное", R.drawable.ic_assistant_black_24dp),
            Exercise("третье упражнение", "норм", R.drawable.ic_launcher_foreground),
            Exercise("Четвертоне упражнение", "не норм", R.drawable.ic_assistant_black_24dp)
        )

        recycler.adapter = ea
    }
}

