package com.roja.heroesapp.models


data class Publisher(val id : Int, val name : String, val description : String, val image : String){
    companion object{
        val publishers = mutableListOf<Publisher>(
            Publisher(1, "Superman", "El Hombre de Acero, conocido como Superman, es uno de los superhéroes más icónicos del universo DC. ", "https://static.wikia.nocookie.net/superman/images/4/4d/Superman_Moderno.png/revision/latest?cb=20150126220714&path-prefix=es"),
            Publisher(2, "Spiderman", "Peter Parker, un joven con habilidades arácnidas, lucha contra el crimen en Nueva York con agilidad, fuerza sobrehumana y un sentido arácnido que le advierte del peligro. Su traje rojo y azul y sus habilidades de trepar paredes lo convierten en un héroe urbano icónico", "https://upload.wikimedia.org/wikipedia/en/2/21/Web_of_Spider-Man_Vol_1_129-1.png"),

            Publisher(3, "Batman", "Batman, el Caballero Oscuro, es un vigilante enmascarado que protege la ciudad de Gotham.  ", "https://free-3dtextureshd.com/wp-content/uploads/2024/06/16_Comics_Wallpaper_1080x1920px.jpg.webp"),
            Publisher(4, "Capitan America", "Steve Rogers, un soldado mejorado con el suero del súper soldado, es el líder valiente de los Vengadores. Con su escudo indestructible y habilidades excepcionales en combate, lucha por la justicia y la libertad. ", "https://static01.nyt.com/images/2018/07/04/books/04coates2/04coates2-superJumbo.jpg?quality=75&auto=webp"),

            Publisher(5, "Mujer Maravilla", "Diana Prince, alias Mujer Maravilla, es una guerrera amazona con habilidades sobrehumanas. Dotada de fuerza, velocidad y agilidad excepcionales, junto con habilidades de combate y un arsenal de armas mágicas como el lazo de la verdad y los brazaletes indestructibles, lucha por la justicia y la igualdad en el mundo. ", "https://www.akiracomics.com/imagenes/porreferencia?identidad=73c932c0-94ad-42e2-ac1e-9d9fd963956f&referencia=&ancho=&alto="),
            Publisher(6, "IronMan", "Tony Stark, un genio y multimillonario, utiliza una armadura tecnológica avanzada para combatir el crimen y proteger el mundo. Con su inteligencia y recursos, Iron Man combina habilidades de combate con tecnología de punta en su icónico traje rojo y dorado.", "https://static.wikia.nocookie.net/ironman/images/c/c6/STL097606.jpg/revision/latest?cb=20191117212158"),

            Publisher(7, "Flash", "Barry Allen, conocido como Flash, es el hombre más rápido del mundo. Con la capacidad de moverse a velocidades sobrehumanas, manipular el tiempo y viajar entre dimensiones, utiliza su velocidad para combatir el crimen y proteger Central City. Su traje rojo, equipado con un símbolo de rayo, es emblemático de su increíble poder.", "https://static.wikia.nocookie.net/batman/images/6/6c/The_Flash.jpg/revision/latest?cb=20170402141709&path-prefix=es"),
            Publisher(8, "Thor", "Thor, el dios del trueno, empuña el martillo Mjolnir para controlar el rayo y proteger los Nueve Reinos. Con fuerza sobrehumana y habilidades divinas, combate el mal y defiende Asgard y la Tierra.", "https://i0.wp.com/codigoespagueti.com/wp-content/uploads/2020/04/thor2.jpg?w=640&ssl=1"),

            Publisher(9, "Linterna Verde", "Hal Jordan, un miembro de los Green Lantern Corps, usa un anillo que le otorga poderes basados en la voluntad y la imaginación. Protege el universo como un vigilante intergaláctico.", "https://hispacomic.com/wp-content/uploads/2023/05/Linterna-Verde-Portada-e1684818838245.webp"),
            Publisher(10, "Hulk", "Bruce Banner, al transformarse en Hulk, obtiene fuerza y resistencia sobrehumanas. Su furia le da un poder casi imparable, convirtiéndolo en uno de los héroes más fuertes del universo.", "https://static.wikia.nocookie.net/mavericuniverse/images/3/3e/Incredible-hulk-20060221015639117.jpg/revision/latest?cb=20130712033651"),

            Publisher(11, "Aquaman", "Rey de Atlantis con control sobre el agua y habilidades acuáticas. Defiende los océanos y la tierra de amenazas submarinas.", "https://i.etsystatic.com/16559376/r/il/5e9fbc/3972613256/il_794xN.3972613256_4fld.jpg"),



            )
    }
}
