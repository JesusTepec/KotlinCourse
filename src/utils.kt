import java.time.ZoneId
import java.util.*

private fun getYear(date: Date) =
        date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().year

fun getYearsDiff(date: Date): Int {
    val dateNow = Date()
    return getYear(dateNow) - getYear(date)
}