package com.arbonik.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater
class Exercise(n : String, disc : String, image : Int) {
    var name : String = n
    var discription : String = disc
    var img : Int = image
}
class ExerciseAdapter() : RecyclerView.Adapter<ExerciseAdapter.Companion.ExerciseHolder>()
{
    var exercises : MutableList<Exercise> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHolder {
        var ret = LayoutInflater.from(parent.context).inflate(R.layout.exercise_view, parent, false)
        return ExerciseHolder(ret)
    }
    override fun getItemCount(): Int = exercises.size
    override fun onBindViewHolder(holder: ExerciseHolder, position: Int) {
        holder.bind(exercises[position])
    }
    companion object {
        class ExerciseHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            var n : TextView = itemView.findViewById(R.id.name_ex)
            var d : TextView = itemView.findViewById(R.id.disc_ex)
            var i : ImageView = itemView.findViewById(R.id.img_ex)

            fun bind(e : Exercise){
                n.setText(e.name)
                d.setText(e.discription)
                i.setImageResource(e.img)
            }
        }
    }
}