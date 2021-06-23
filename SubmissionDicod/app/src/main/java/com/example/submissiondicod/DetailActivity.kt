package com.example.submissiondicod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    private lateinit var ivPhotoReceived : ImageView
    private lateinit var tvNameReceived : TextView
    private lateinit var tvCategoryReceived : TextView
    private lateinit var tvPriceReceived : TextView
    private lateinit var tvFoodStock : TextView
    private lateinit var tvFoodMaterials : TextView
    private lateinit var tvFoodDesc : TextView

    private var title : String = "Detail Menu"

    companion object {
        const val EXTRA_PHOTO ="extra_name"
        const val EXTRA_NAME ="extra_name"
        const val EXTRA_CATEGORY ="extra_category"
        const val EXTRA_PRICE ="extra_price"
        const val EXTRA_STOCK ="extra_stock"
        const val EXTRA_MATERIALS ="extra_materials"
        const val EXTRA_DESC ="extra_desc"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBarTitle(title)

        ivPhotoReceived = findViewById(R.id.iv_item_photo_detail)
        tvNameReceived = findViewById(R.id.tv_detail_item_name)
        tvCategoryReceived = findViewById(R.id.tv_item_category)
        tvPriceReceived = findViewById(R.id.tv_item_price)
        tvFoodStock = findViewById(R.id.tv_item_stock)
        tvFoodMaterials = findViewById(R.id.tv_item_material)
        tvFoodDesc = findViewById(R.id.tv_item_desc)

        val foodPhoto = intent.getIntExtra(EXTRA_PHOTO,0)
        val foodName = intent.getStringExtra(EXTRA_NAME)
        val foodCategory = intent.getStringExtra(EXTRA_CATEGORY)
        val foodPrice = intent.getStringExtra(EXTRA_PRICE)
        val foodStock = intent.getIntExtra(EXTRA_PRICE,0)
        val foodMaterials = intent.getStringExtra(EXTRA_MATERIALS)
        val foodDesc = intent.getStringExtra(EXTRA_DESC)

        val categoryText = "Kategori : $foodCategory"
        val priceText = "Harga jual : $foodPrice"
        val stockText = "Stok : $foodStock"

        ivPhotoReceived.setImageResource(foodPhoto)
        tvNameReceived.text = foodName
        tvCategoryReceived.text = categoryText
        tvPriceReceived.text = priceText
        tvFoodStock.text = stockText
        tvFoodMaterials.text = foodMaterials
        tvFoodDesc.text = foodDesc
    }

    private fun setActionBarTitle(title : String) {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = title
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}