package com.zalo.recyclerviewexamplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.zalo.recyclerviewexamplo.adapter.SuperHeroAdapter
import com.zalo.recyclerviewexamplo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()


    }
    private fun initRecyclerView() {

        binding.recyclerSuperHero.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperHero.adapter =
            SuperHeroAdapter(SuperHeroProvider.superHeroList) { onItemSelected(it) }
        // las funciones lamdas no van dentro de parentecis
        //que seria lo mismo que {superhero -> onItemSelected(superhero)}
    }

    fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this, superHero.realName, Toast.LENGTH_SHORT).show()
    }
}
/*
  -----------------------------------------------------------------------------------------------

    //funcion initRecyclerView() con un Divider para dividir los elementos en pantalla
    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerSuperHero.layoutManager = manager
        binding.recyclerSuperHero.adapter =
            SuperHeroAdapter(SuperHeroProvider.superHeroList) { onItemSelected(it) }
        // las funciones lamdas no van dentro de parentecis
        //que seria lo mismo que {superhero -> onItemSelected(superhero)}
        binding.recyclerSuperHero.addItemDecoration(decoration)

    }
*/
    /*
    -----------------------------------------------------------------------------------------------

    GRID

    //funcion initRecyclerView() con un Divider para dividir los elementos en pantalla
    private fun initRecyclerView() {
        /*Para hacer el grid solo hace falta cambiar el LinearLayoutManager por un GridLayoutManager
        * y pasarle como parametro el contexto (this) y tambien la cantitdad de item por fila (en este caso 2)
        * mientras mas item por fila sean se van a ver recortados ya que esta vista no fue diseñado para un grid */
        val manager = GridLayoutManager(this,2)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerSuperHero.layoutManager = manager
        binding.recyclerSuperHero.adapter =
            SuperHeroAdapter(SuperHeroProvider.superHeroList) { onItemSelected(it) }
        // las funciones lamdas no van dentro de parentecis
        //que seria lo mismo que {superhero -> onItemSelected(superhero)}
        binding.recyclerSuperHero.addItemDecoration(decoration)

    }
*/

/*
-----------------------------------------------------------------------------------------------


     Main con funcion lamda para hacer lo mismo pero mas personalizado
       private lateinit var binding: ActivityMainBinding

       override fun onCreate(savedInstanceState: Bundle?) {
           super.onCreate(savedInstanceState)
           binding = ActivityMainBinding.inflate(layoutInflater)
           setContentView(binding.root)
           initRecyclerView()


       }

       private fun initRecyclerView() {

           binding.recyclerSuperHero.layoutManager = LinearLayoutManager(this)
           binding.recyclerSuperHero.adapter =
               SuperHeroAdapter(SuperHeroProvider.superHeroList) { onItemSelected(it) }
           // las funciones lamdas no van dentro de parentecis
           //que seria lo mismo que {superhero -> onItemSelected(superhero)}
       }

       fun onItemSelected(superHero: SuperHero) {
           Toast.makeText(this, superHero.realName, Toast.LENGTH_SHORT).show()
       }

   */


    /*
    -----------------------------------------------------------------------------------------------
    MAIN para findViewById

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }


    private fun initRecyclerView() {

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superheroList)
}
     */
/*
-----------------------------------------------------------------------------------------------
    main pviewBinding sin funciones lamdas

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()


    }

    private fun initRecyclerView() {

        binding.recyclerSuperHero.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
            }
    *
    * */


