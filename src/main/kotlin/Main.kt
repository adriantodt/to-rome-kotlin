import kotlin.reflect.KProperty

fun main() {
    println(toRome(1984))
}

fun toRome(input: Int) = buildString {
    var current = input
    for((factor, str) in lookup) while (current >= factor) {
        append(str)
        current -= factor
    }
}

private val lookup = listOf(
    1000 to "M", 900 to "CM", 500 to "D", 400 to "CD", 100 to "C", 50 to "L",
    10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I"
)
