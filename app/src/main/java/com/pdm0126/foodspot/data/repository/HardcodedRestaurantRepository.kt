package com.pdm0126.foodspot.data.repository
import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant

class HardcodedRestaurantRepository : RestaurantRepository {
    private val sampleRestaurants = listOf(
        Restaurant(
            id = 1,
            name = "Pizza Hut",
            description = "Las mejores pizzas",
            imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781",
            rating = 4.6,
            categories = listOf("Comida Italiana"),
            menu = listOf(
                Dish(1, "Pizza Margarita", "Mozzarella, albahaca y tomate fresco", "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"),
                Dish(11, "Pizza Pepperoni", "Pepperoni crujiente y extra queso", "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?q=80&w=800"),
                Dish(12, "Pizza Familiar", "Relleno de jamón y queso ", "https://images.unsplash.com/photo-1628840042765-356cda07504e?q=80&w=800")
            )
        ),
        Restaurant(
            id = 5,
            name = "Bella Pasta",
            description = "Pasta fresca",
            imageUrl = "https://images.unsplash.com/photo-1473093226795-af9932fe5856?q=80&w=1000",
            rating = 4.4,
            categories = listOf("Comida Italiana"),
            menu = listOf(
                Dish(101, "Fettuccine Alfredo", "Crema suave y queso parmesano", "https://images.unsplash.com/photo-1645112481338-3561ec909192?q=80&w=800"),
                Dish(13, "Espagueti Carbonara", "Panceta, huevo y pimienta negra", "https://images.unsplash.com/photo-1612459284970-e8f027596582?q=80&w=800"),
                Dish(14, "Raviolis de Espinaca", "Rellenos de ricota y espinaca fresca", "https://images.unsplash.com/photo-1551183053-bf91a1d81141?q=80&w=800")
            )
        ),
        Restaurant(
            id = 6,
            name = "Italia en casa",
            description = "Sabor auténtico de Italia",
            imageUrl = "https://images.unsplash.com/photo-1595854341625-f33ee10dbf94?q=80&w=1000",
            rating = 4.8,
            categories = listOf("Comida Italiana"),
            menu = listOf(
                Dish(102, "Lasagna Clásica", "Capas de pasta con carne y bechamel", "https://images.unsplash.com/photo-1551183053-bf91a1d81141?q=80&w=800"),
                Dish(15, "Gnocchi al Pesto", "Pasta de papa con salsa de albahaca", "https://images.unsplash.com/photo-1591130901020-ef93581c468c?q=80&w=800"),
                Dish(16, "Bruschetta de Tomate", "Pan tostado con tomate, ajo y aceite", "https://images.unsplash.com/photo-1572656631137-7935297eff55?q=80&w=800")
            )
        ),

        Restaurant(
            id = 2,
            name = "Burger Place",
            description = "Hamburguesas con ingredientes premium",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?q=80&w=1000",
            rating = 4.5,
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(4, "Clásica con Queso", "Carne de res, queso cheddar, lechuga y tomate", "https://images.unsplash.com/photo-1550547660-d9450f859349?q=80&w=800"),
                Dish(17, "Bacon BBQ Burger", "Tocineta, aros de cebolla y salsa BBQ", "https://images.unsplash.com/photo-1594212699903-ec8a3eca50f5?q=80&w=800"),
                Dish(18, "Papas Gajo", "Papas sazonadas con especias", "https://images.unsplash.com/photo-1630384060421-cb20d0e0649d?q=80&w=800")
            )
        ),
        Restaurant(
            id = 7,
            name = "Pollo Loco",
            description = "El mejor pollo",
            imageUrl = "https://images.unsplash.com/photo-1626082927389-6cd097cdc6ec?q=80&w=1000",
            rating = 4.2,
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(103, "Pollo Asado Familiar", "Pollo marinado a la leña con guarnición", "https://images.unsplash.com/photo-1598103442097-8b74394b95c6?q=80&w=800"),
                Dish(19, "Alitas Picantes", "Alitas bañadas en salsa búfalo", "https://images.unsplash.com/photo-1611210452331-50e8f964be7b?q=80&w=800"),
                Dish(20, "Consomé de Pollo", "Sopa tradicional con verduras", "https://images.unsplash.com/photo-1603105037880-880cd4edfb0d?q=80&w=800")
            )
        ),
        Restaurant(
            id = 8,
            name = "Tacos Mexico",
            description = "Tacos al pastor y más",
            imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?q=80&w=1000",
            rating = 4.7,
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(104, "Orden de Tacos al Pastor", "5 tacos con piña, cebolla y cilantro", "https://images.unsplash.com/photo-1593560708920-61dd98c46a4e?q=80&w=800"),
                Dish(21, "Quesadilla Gigante", "Tortilla de harina con queso fundido", "https://images.unsplash.com/photo-1599974579688-8dbdd335c77f?q=80&w=800"),
                Dish(22, "Nachos Supremos", "Totopos con frijoles, queso y jalapeños", "https://images.unsplash.com/photo-1513456852971-30c0b8199d4d?q=80&w=800")
            )
        ),

        Restaurant(
            id = 3,
            name = "Sushi Placec",
            description = "Rollos tradicionales y fusión asiática",
            imageUrl = "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?q=80&w=1000",
            rating = 4.9,
            categories = listOf("Comida Asiática"),
            menu = listOf(
                Dish(7, "California Roll", "Cangrejo, aguacate y pepino", "https://images.unsplash.com/photo-1583623025817-d180a2221d0a?q=80&w=800"),
                Dish(23, "Nigiri de Salmón", "Láminas de salmón fresco sobre arroz", "https://images.unsplash.com/photo-1553621042-f6e147245754?q=80&w=800"),
                Dish(24, "Sopa Miso", "Sopa tradicional japonesa de soya", "https://images.unsplash.com/photo-1547592166-23ac45744acd?q=80&w=800")
            )
        ),
        Restaurant(
            id = 9,
            name = "China Place",
            description = "Comida rápida china",
            imageUrl = "https://images.unsplash.com/photo-1512058564366-18510be2db19?q=80&w=1000",
            rating = 4.3,
            categories = listOf("Comida Asiática"),
            menu = listOf(
                Dish(105, "Pad Thai de Pollo", "Fideos de arroz con cacahuetes y brotes", "https://images.unsplash.com/photo-1559339352-11d035aa65de?q=80&w=800"),
                Dish(25, "Arroz Frito Especial", "Arroz con verduras, huevo y camarones", "https://images.unsplash.com/photo-1512058564366-18510be2db19?q=80&w=800"),
                Dish(26, "Spring Rolls", "Rollitos primavera de vegetales (3 piezas)", "https://images.unsplash.com/photo-1544025162-d76694265947?q=80&w=800")
            )
        ),
        Restaurant(
            id = 10,
            name = "China work",
            description = "Sopa tradicional vietnamita",
            imageUrl = "https://images.unsplash.com/photo-1582878826629-29b7ad1cdc43?q=80&w=1000",
            rating = 4.5,
            categories = listOf("Comida Asiática"),
            menu = listOf(
                Dish(106, "Pho Bo", "Sopa de fideos con carne de res y hierbas frescas", "https://images.unsplash.com/photo-1582878826629-29b7ad1cdc43?q=80&w=1000"),
                Dish(27, "Banh Mi", "Sándwich vietnamita con paté y carnes", "https://images.unsplash.com/photo-1536417132477-d740fc99dc3b?q=80&w=800"),
                Dish(28, "Té Verde Helado", "Bebida refrescante de la casa", "https://images.unsplash.com/photo-1556679343-c7306c1976bc?q=80&w=800")
            )
        ),

        Restaurant(
            id = 11,
            name = "Sweet Place",
            description = "Los mejores postres y pasteles",
            imageUrl = "https://images.unsplash.com/photo-1563729784474-d77dbb933a9e?q=80&w=1000",
            rating = 4.8,
            categories = listOf("Postres y Café"),
            menu = listOf(
                Dish(29, "Cheesecake de Fresa", "Pastel de queso cremoso con mermelada", "https://images.unsplash.com/photo-1533134242443-d4fd215305ad?q=80&w=800"),
                Dish(30, "Brownie con Helado", "Brownie tibio con una bola de vainilla", "https://images.unsplash.com/photo-1564355808539-22fda35bed7e?q=80&w=800"),
                Dish(31, "Pie de Limón", "Base crujiente con merengue suizo", "https://images.unsplash.com/photo-1519915028121-7d3463d20b13?q=80&w=800")
            )
        ),
        Restaurant(
            id = 12,
            name = "Coffee Place",
            description = "Café de especialidad y panadería",
            imageUrl = "https://images.unsplash.com/photo-1495474472287-4d71bcdd2085?q=80&w=1000",
            rating = 4.6,
            categories = listOf("Postres y Café"),
            menu = listOf(
                Dish(32, "Cappuccino Italiano", "Café espresso con leche espumosa", "https://images.unsplash.com/photo-1534778101976-62847782c213?q=80&w=800"),
                Dish(33, "Croissant de Mantequilla", "Pan hojaldrado artesanal", "https://images.unsplash.com/photo-1555507036-ab1f4038808a?q=80&w=800"),
                Dish(34, "Frappé de Caramelo", "Bebida de café granizada", "https://images.unsplash.com/photo-1572490122747-3968b75cc699?q=80&w=800")
            )
        )
    )

    override fun getRestaurants(): List<Restaurant> = sampleRestaurants

    override fun getRestaurantById(id: Int): Restaurant? {
        return sampleRestaurants.find { it.id == id }
    }
}