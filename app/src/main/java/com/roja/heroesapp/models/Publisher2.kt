package com.roja.heroesapp.models

data class Publisher2(val id: Int, val name: String, val description: String, val image: String) {
    companion object {
        val publishers2 = mutableListOf<Publisher2>(
            Publisher2(1, "Deadpool", "Mercenario con un factor de curación extremadamente rápido y habilidades de combate excepcionales. Conocido por su humor irreverente.", "https://m.media-amazon.com/images/I/81bXuzhIVqS.jpg"),
            Publisher2(2, "IronMan", "Tony Stark utiliza una armadura tecnológica avanzada para combatir el crimen y proteger el mundo.", "https://static.wikia.nocookie.net/ironman/images/c/c6/STL097606.jpg/revision/latest?cb=20191117212158"),
            Publisher2(3, "Spiderman", "Peter Parker, un joven con habilidades arácnidas, lucha contra el crimen en Nueva York con agilidad, fuerza sobrehumana y un sentido arácnido que le advierte del peligro.", "https://upload.wikimedia.org/wikipedia/en/2/21/Web_of_Spider-Man_Vol_1_129-1.png"),
            Publisher2(4, "Batman", "Batman, el Caballero Oscuro, es un vigilante enmascarado que protege la ciudad de Gotham.", "https://free-3dtextureshd.com/wp-content/uploads/2024/06/16_Comics_Wallpaper_1080x1920px.jpg.webp"),
            Publisher2(5, "Capitán América", "Steve Rogers, un soldado mejorado con el suero del súper soldado, es el líder valiente de los Vengadores.", "https://static01.nyt.com/images/2018/07/04/books/04coates2/04coates2-superJumbo.jpg?quality=75&auto=webp"),
            Publisher2(6, "Mujer Maravilla", "Diana Prince, alias Mujer Maravilla, es una guerrera amazona con habilidades sobrehumanas.", "https://www.akiracomics.com/imagenes/porreferencia?identidad=73c932c0-94ad-42e2-ac1e-9d9fd963956f&referencia=&ancho=&alto="),
        )
    }
}

