import java.text.SimpleDateFormat

fun main() {
    val persona = Persona()
    persona.apply {
        fechaNacimiento = SimpleDateFormat("yyyy-MM-dd").parse("1992-06-10")
    }
    persona.edad?.also {
        it.show("Edad")
    }

}

fun Int.show(tag: String) {
    println("$tag: $this")
}