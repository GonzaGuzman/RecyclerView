package com.zalo.recyclerviewexamplo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zalo.recyclerviewexamplo.R
import com.zalo.recyclerviewexamplo.SuperHero
//onCLickListener:(SuperHero)-> Unit) es una funcion lamda que devuelve una unidad de SuperHero al hacer click
class SuperHeroAdapter (private val superheroList:List<SuperHero>, private val onClickListener:(SuperHero)-> Unit): RecyclerView.Adapter<SuperHeroViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero,parent,false))
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superheroList[position]
        //debe agregarse la funcion al parametro de render para enviarselo al viewHolder
        holder.render(item,onClickListener)

    }

    override fun getItemCount(): Int = superheroList.size


/*
 -----------------------------------------------------------------------------------------------
 ADAPTER SIN MODIFICACIONES LAMBDAS
* class SuperHeroAdapter (private val superheroList:List<SuperHero>): RecyclerView.Adapter<SuperHeroViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero,parent,false))
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superheroList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int = superheroList.size

*
* */
}