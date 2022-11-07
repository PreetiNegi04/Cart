package com.preeti.vegcart.datasources

import com.preeti.vegcart.R
import com.preeti.vegcart.models.Product

class ProductSource {

    fun get(): List<Product> {
        return listOf(
            Product("Capsicum", 50, R.drawable.product1),
            Product("Strawberry", 350, R.drawable.product2),
            Product("Peas", 95, R.drawable.product3),
            Product("Cabbage", 75, R.drawable.product4),
            Product("Tomato", 50, R.drawable.product5),
            Product("Broccoli", 120, R.drawable.product6),
            Product("Carrots", 50, R.drawable.product7),
            Product("Vegetable Juice", 130, R.drawable.product8),
            Product("Onion", 50, R.drawable.product9),
            Product("Apple", 80, R.drawable.product10),
            Product("Garlic", 40, R.drawable.product11),
            Product("Red chilli", 60, R.drawable.product12),
        )
    }
}