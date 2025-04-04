fun main() {
    val testResult = isIPVersion4Valid("01.1.1.1")
    println("Test Result: $testResult")
}

fun isIPVersion4Valid(address: String): Boolean {
    val parts = address.split(".") // [ "1", "2", "3", "4" ]

    if (parts.size != 4) return false

    for (part in parts) {
        if (part.isNotEmpty() && part.all { it.isDigit() }) {
            if (part != "0" && part.startsWith("0")) return false

            val number = part.toInt()
            if (number < 0 || number > 255) return false
        } else {
            return false
        }
    }
    return true
}