package com.example.littlelemoncompose

import androidx.annotation.DrawableRes

object ProductsWarehouse {
    val productsList = mutableListOf(
        ProductItem(
            1,
            "Greek Salad",
            12.99,
            "Food",
            R.drawable.greeksalad,
            "The famous greek salad of crispy lettuce, peppers, olives, our Chicago."
        ),
        ProductItem(
            2,
            "Lemon Desert",
            8.99,
            "Dessert",
            R.drawable.lemondessert,
            "Traditional homemade Italian Lemon Ricotta Cake."
        ),
        ProductItem(
            3,
            "Bruschetta",
            4.99,
            "Food",
            R.drawable.bruschetta,
            "Our Bruschetta is made from grilled bread that has been smeared with garlic and seasoned with salt and olive oil."
        ),
        ProductItem(
            4,
            "Grilled Fish",
            19.99,
            "Food",
            R.drawable.grilledfish,
            "Fish marinated in fresh orange and lemon juice. Grilled with orange and lemon wedges."
        ),
        ProductItem(
            5,
            "Pasta",
            8.99,
            "Food",
            R.drawable.pasta,
            "Penne with fried aubergines, cherry tomatoes, tomato sauce, fresh chilli, garlic, basil & salted ricotta cheese."
        ),
        ProductItem(
            6,
            "Lasagne",
            7.99,
            "Food",
            R.drawable.lasagne,
            "Oven-baked layers of pasta stuffed with Bolognese sauce, béchamel sauce, ham, Parmesan & mozzarella cheese ."
        ),
        ProductItem(
            7,
            "Black tea",
            3.00,
            "Drinks",
            R.drawable.black_tea,
            "Strong flavour, zesty black tea "
        ),
        ProductItem(
            8,
            "Green tea",
            3.00,
            "Drinks",
            R.drawable.green_tea,
            "Its flavor profile can range from grass-like and toasted (pan fired) to vegetal, sweet and seaweed-like (steamed)."
        ),
        ProductItem(
            9,
            "Espresso",
            5.00,
            "Drinks",
            R.drawable.espresso,
            "Concentrated form of coffee served in small, strong shot"
        ),
        ProductItem(
            10,
            "Cappuccino",
            8.00,
            "Drinks",
            R.drawable.cappuccino,
            "The perfect balance of espresso, steamed milk and foam."
        ),
        ProductItem(
            11,
            "Latte",
            8.00,
            "Drinks",
            R.drawable.latte,
            "Milk coffee made up of two shots of espresso, steamed milk and a final, thin layer of frothed milk on top."
        ),
        ProductItem(
            12,
            "Mocha",
            10.00,
            "Drinks",
            R.drawable.mocha,
            "Chocolate-flavoured warm beverage."
        ),
        ProductItem(
            13,
            "Boeuf bourguignon",
            15.00,
            "Food",
            R.drawable.boeuf_bourguignon,
            " French beef stew braised in red wine, red Burgundy, and beef stock, flavored with carrots, onions, garlic, and a bouquet garni, and garnished with pearl onions, mushrooms, and bacon."
        ),
        ProductItem(
            14,
            "Bouillabaisse",
            20.00,
            "Food",
            R.drawable.bouillabaisse,
            "Mediterranean fish stew made with a variety of fish and seafood, cooked in saffron flavored broth."
        ),
        ProductItem(
            15,
            "Onion soup",
            12.00,
            "Food",
            R.drawable.onion_soup,
            "French soup made with caramelized onions and beef stock or broth."
        ),
        ProductItem(
            16,
            "Salmon en papillote",
            25.00,
            "Food",
            R.drawable.salmon_en_papillote,
            "Salmon wrapped in a packet of parchment."
        ),
        ProductItem(
            17,
            "Quiche Lorraine",
            17.00,
            "Dessert",
            R.drawable.quiche_lorraine,
            "French tart with a filling made of cream, eggs, and bacon or ham, in an open pastry case."
        ),
        ProductItem(
            18,
            "Custard tart",
            14.00,
            "Dessert",
            R.drawable.custard_tart,
            "Baked pastry consisting of an outer pastry crust filled with egg custard."
        ),
        ProductItem(
            19,
            "Croissant",
            7.00,
            "Dessert",
            R.drawable.croissant,
            "Buttery, crescent-shaped French pastry."
        )
    )

    fun getProduct(id: Int) = productsList.firstOrNull { it.id == id }
}

