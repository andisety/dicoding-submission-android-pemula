package com.andi.hewanmamalia


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var rvAnimal:RecyclerView
    private  var list:ArrayList<Animal> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAnimal=findViewById(R.id.rv_animal)
        list.addAll(AnimalData.listData)
        showRecycleList()

    }

    private fun showRecycleList() {
        rvAnimal.layoutManager = LinearLayoutManager(this)
        val listAdapter = AnimalListAdapter(list, object :OnListener{
            override fun klik(listAnimal: Animal) {
                startActivity(Intent(this@MainActivity,DetailActivity::class.java)
                    .putExtra("name",listAnimal.name)
                    .putExtra("detail",listAnimal.detail)
                    .putExtra("image",listAnimal.photo)
                )
            }
        })
        rvAnimal.adapter=listAdapter
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.detail->{startActivity(Intent(this,AboutActivity::class.java))}
        }
        return super.onOptionsItemSelected(item)
    }
}