import java.util.*


class Persona(edad: Int = 0) {

    var edad: Int? = edad
        get() {
            field = fechaNacimiento?.let {
                getYearsDiff(it)
            }
            return field
        }
        private set

    var fechaNacimiento: Date? = null


}