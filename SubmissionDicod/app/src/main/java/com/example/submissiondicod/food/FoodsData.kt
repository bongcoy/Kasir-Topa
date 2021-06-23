package com.example.submissiondicod.food

import com.example.submissiondicod.R

object FoodsData {
    private val foodNames = arrayOf(
            "Zuppa Ayam Jamur",
            "Zuppa Coklat",
            "Thumb Toe",
            "Tuna Pastry",
            "Burger Pastry",
            "Churroz",
            "Nasgor Babat",
            "Risoles Kingkong",
            "Maccaroni Sehat",
            "Maccaroni Box"
    )
    private val foodCategories = arrayOf(
            "Zuppa Soup",
            "Zuppa Soup",
            "Pastry",
            "Pastry",
            "Pastry",
            "Roti & Donat",
            "Nasi",
            "Olahan Kentang",
            "Pasta",
            "Pasta"
    )
    private val foodPrices = arrayOf(
            "Rp25.000",
            "Rp25.000",
            "Rp20.000",
            "Rp20.000",
            "Rp20.000",
            "Rp15.000",
            "Rp15.000",
            "Rp20.000",
            "Rp18.000",
            "Rp18.000"
    )
    private val foodStocks = arrayOf(
            5,
            2,
            3,
            7,
            10,
            2,
            1,
            0,
            1,
            1
    )
    private val foodMaterials = arrayOf(
            "Pastry : 10\n" +
                    "Sup : 5\n" +
                    "Ayam : 6\n" +
                    "Jamur : 5",
            "Pastry : 10\n" +
                    "Coklat : 2\n" +
                    "Pisang : 2",
            "Pastry : 10\n" +
                    "Sosis : 5\n" +
                    "Sasus Keju : 3",
            "Pastry : 10\n" +
                    "Tuna : 7",
            "Pastry : 10\n" +
                    "Patty : 10\n" +
                    "Selada : 12\n" +
                    "Keju : 14",
            "Adonan Churroz : 2",
            "Nasi : 3\n" +
                    "Telur : 1\n" +
                    "Babat : 2",
            "Adonan Risoles : 0\n" +
                    "Isi Risoles : 2",
            "Maccaroni : 5\n" +
                    "Telur : 1\n" +
                    "Sosis : 5\n" +
                    "Sayuran : 4",
            "Maccaroni : 5\n" +
                    "Telur : 1\n" +
                    "SOsis : 5"
    )
    private val foodDesc = arrayOf(
            "Menu pertama yang dikenal masyarakat saat café Top a Soup dibuka. Kombinasi antara renyahnya pastry, cream soup, daging ayam dan jamur yang gurih dan nikmat",
            "Varian terbaru dari kategori zuppa. Berisi susu coklat yang menggantikan cream soup dan berisi pisang sebagai 'lauk' nya.",
            "Sosis sapi yang dipanggang bersama balutan pastry renyah berlapis. Disajikan bersama saus keju yang gurih dan ringan.",
            "Pastry yang dilipat dan berisi daging tuna cincang dan telur orak arik dengan bumbu khas Top a Soup.",
            "Burger dengan roti yang diganti dengan pastry yang renyah dan berlapis. Terdapat 3 varian : Egg Burger, Cheesy Burger, dan Super Pastry Burger.",
            "'Donat' asal Spanyol. Mempunyai aroma butter (mentega) yang kuat, dikombinasikan dengan gula halus dan kayu manis secukupnya. Renyah di luar, lembut di dalam.",
            "Nasi goreng yang berisikan daging babat yang berasal dari lambung sapi. Tipe nasi goreng yang lebih manis daripada gurih. Makanan khas Semarang.",
            "Risoles yang berukuran besar, cukup dinikmati oleh 2 orang. Renyah di luar dan juicy di dalam karena berisi daging ayam, kentang lembut, wortel, dan keju mozarella.",
            "Varian baru dari menu maccaroni box. Berisi sayuran, telur mata sapi dan sosis sapi yang semua bahannya direbus.",
            "Sebuah kotak yang berisi makaroni yang direbus dengan saus keju. Disajikan bersama telur orak arik dan sosis sapi."
    )
    private val foodsImage = intArrayOf(
            R.drawable.zuppa,
            R.drawable.zuppa_coklat,
            R.drawable.thumb_toe,
            R.drawable.tuna_pastry,
            R.drawable.burger_pastry,
            R.drawable.churroz,
            R.drawable.nasgor_babat,
            R.drawable.risoles_kingkong,
            R.drawable.maccaroni_sehat,
            R.drawable.maccaroni_box
    )
    val listData : ArrayList<Food> get() {
        val list = arrayListOf<Food>()
        for (position in foodNames.indices){
            val food = Food()
            food.name = foodNames[position]
            food.category = foodCategories[position]
            food.price = foodPrices[position]
            food.stock = foodStocks[position]
            food.material = foodMaterials[position]
            food.desc = foodDesc[position]
            food.photo = foodsImage[position]
            list.add(food)
        }
        return list
    }
}