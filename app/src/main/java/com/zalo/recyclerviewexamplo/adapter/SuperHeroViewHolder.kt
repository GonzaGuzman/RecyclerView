package com.zalo.recyclerviewexamplo.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zalo.recyclerviewexamplo.SuperHero
import com.zalo.recyclerviewexamplo.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero, onClickListener: (SuperHero) -> Unit) {
        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)
        //las funciones lamdas se pasan entre corchetes
        itemView.setOnClickListener { onClickListener(superHeroModel) }

    }

}

/*
NOTA para poder usar las imagenes de interner primero hay que pedir permiso para eso hacer:
app
    manifest
        android.Manifest.xml
        y agregar depues de package="com.exmaple.nomdelproyecto">
        <uses-permission android:name="android.permission.INTERNET"/>
 */

    /*
    -----------------------------------------------------------------------------------------------
    viewHolder con findViewById

  val superHero = view.findViewById<TextView>(I.id.tvSuperHero)
  val realName = view.findViewById<TextView>(I.id.tvRealName)
  val publisher = view.findViewById<TextView>(I.id.tvPublisher)
  val photo = view.findViewById<ImageView>(I.id.ivSuperHero)

   fun render(superHeroModel: SuperHero){
   superHero.text = superHeroModel.superhero
   realName.text= superHeroModel.realName
   publisher.text= superHeroModel.publisher
   Glider.with(photo.context).load(superHeroModel.photo).into(photo)

  * */

/*
-----------------------------------------------------------------------------------------------
viewHolder con viewBindig

val binding = ItemSuperHeroBinding.bind(view)

fun render = (superHeroModel: SuperHero){
binding.tvSuperHeroName.text = superheroModel.superhero
binding.tvRealName.text = superHeroModel.realName
binding.tvPublisher.text = superHeroModel.publisher
Glide.with(binding.ivSuperHero.context).load(superHeromodel.photo).into(binding.ivSuperHero)


 */

/*funcion render que al clickear muestra un texto
*
* */

/*
viewBinding con funcion clik en imagen y en item


    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero, onClickListener:(SuperHero)-> Unit) {
        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)

    //esto hace que al hacer click en la imagen muestre el texto seleccionado en este caso RealName

     binding.ivSuperHero.setOnClickListener {
            Toast.makeText(
                binding.ivSuperHero.context,
                superHeroModel.realName,
                Toast.LENGTH_SHORT
            ).show()
        }

 //este itemView se convierte en clickeable y en cualquier lugar del resto del item (que no sea la iamgen
 //porque eso ya esta definido en la accion anterior)escribe el texto seleccionado en este caso superhero

        itemView.setOnClickListener{Toast.makeText(
            binding.ivSuperHero.context,
            superHeroModel.superhero,
            Toast.LENGTH_SHORT
        ).show()
        }

 */
