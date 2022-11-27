package com.example.recyclerviewdataclass

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import java.util.zip.Inflater

class MyAdapterClass( val context:Context,val item :ArrayList<MyDataClass>) : RecyclerView.Adapter<MyViewHolder>(){
 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
   val view  = LayoutInflater.from(parent .context).inflate(R.layout.customlayout,parent,false)
  return MyViewHolder(view)

 }

 override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
     val current :MyDataClass= item[position ]
     holder.textView .text  = current.toString()
     holder.textView2 .text = current.toString()


 }

 override fun getItemCount(): Int {
   return item.size
 }
}
 class MyViewHolder(val  itemView: View):RecyclerView.ViewHolder(itemView){

   val textView = itemView.findViewById<TextView>(R.id.tv)
  val textView2 = itemView.findViewById<TextView>(R.id.tv2)




 }