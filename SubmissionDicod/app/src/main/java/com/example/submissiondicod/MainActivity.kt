package com.example.submissiondicod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.submissiondicod.food.Food
import com.example.submissiondicod.food.FoodsData
import com.example.submissiondicod.food.ListFoodAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvFoods : RecyclerView
    private var list : ArrayList<Food> = arrayListOf()
    private var title : String = "Kasir Top a Soup"

    private fun setActionBarTitle(title : String) {
        supportActionBar?.title = title
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        menuAbout(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvFoods = findViewById(R.id.rv_menu)
        rvFoods.setHasFixedSize(true)

        list.addAll(FoodsData.listData)
        showRecyclerList()
    }

    private fun showSelectedFood(food : Food){
        Toast.makeText(this,food.name+" clicked !",Toast.LENGTH_SHORT).show()
    }

    private fun moveToDetail(food : Food){
        val moveIntent = Intent(this,DetailActivity::class.java)
        moveIntent.putExtra(DetailActivity.EXTRA_NAME, food.name)
        moveIntent.putExtra(DetailActivity.EXTRA_CATEGORY, food.category)
        moveIntent.putExtra(DetailActivity.EXTRA_PRICE, food.price)
        moveIntent.putExtra(DetailActivity.EXTRA_PHOTO, food.photo)
        moveIntent.putExtra(DetailActivity.EXTRA_STOCK, food.stock)
        moveIntent.putExtra(DetailActivity.EXTRA_MATERIALS, food.material)
        moveIntent.putExtra(DetailActivity.EXTRA_DESC, food.desc)
        startActivity(moveIntent)
    }

    private fun menuAbout(idMenu : Int){
        when (idMenu){
            R.id.action_about -> {
                val intentAbout = Intent(this,AboutActivity::class.java)
                startActivity(intentAbout)
            }
        }
    }

    private fun showRecyclerList(){
        val listFoodAdapter = ListFoodAdapter(list)

        rvFoods.layoutManager = LinearLayoutManager(this)
        rvFoods.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback{
                    override fun onItemClicked(item : Food) {
                        showSelectedFood(item)
                        moveToDetail(item)
                    }
                }
        )
    }
}