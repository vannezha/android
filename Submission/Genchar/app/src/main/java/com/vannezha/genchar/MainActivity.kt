package com.vannezha.genchar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val pageTitle = "Genshin Character Information"
    private lateinit var rvGenchar: RecyclerView
    private var list: ArrayList<Genchar> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = pageTitle

        rvGenchar = findViewById(R.id.rv_genchar)
        rvGenchar.setHasFixedSize(true)
//
        list.addAll(GencharData.listData)
        showRecyclerCardView()
    }
    private fun showRecyclerCardView() {
        rvGenchar.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewHeroAdapter(list)
        rvGenchar.adapter = cardViewHeroAdapter

        cardViewHeroAdapter.setOnItemClickListener(object : CardViewHeroAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                val moveToDetailActivity = Intent(this@MainActivity, DetailCharacter::class.java)
                moveToDetailActivity.putExtra("EXTRA_NAME", list.get(position).name)
                moveToDetailActivity.putExtra("EXTRA_IMAGE", list.get(position).photo)
                moveToDetailActivity.putExtra("EXTRA_RARITY", list.get(position).rarity)
                moveToDetailActivity.putExtra("EXTRA_VISION", list.get(position).vision)
                moveToDetailActivity.putExtra("EXTRA_DETAIL", list.get(position).description)
                moveToDetailActivity.putExtra("EXTRA_REGION", list.get(position).region)
                moveToDetailActivity.putExtra("EXTRA_CONSTELLATION", list.get(position).constellation)
                moveToDetailActivity.putExtra("EXTRA_BIRTHDAY", list.get(position).birthday)
                moveToDetailActivity.putExtra("EXTRA_TITLE", list.get(position).title)
                startActivity(moveToDetailActivity)
//                Toast.makeText(this@MainActivity,"${list.get(position)}", Toast.LENGTH_SHORT).show()
            }
        })
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when (itemId) {
            R.id.action_about -> {
                val gotoAboutActivity = Intent(this@MainActivity, About::class.java)
                this.startActivity(gotoAboutActivity)
            }
        }
    }
}