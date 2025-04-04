fun main(){
    test(
        name = "when ipv4 address have a four different numbers in the range, should return true",
        result = isIPVersion4Valid("192.168.1.1"),
        correctResult = true
    )

    test(
        name = "when ipv4 address have the same number in the range between 0 and 255, should return true",
        result = isIPVersion4Valid("255.255.255.255"),
        correctResult = true
    )

    test(
        name = "when ipv4 address have a wrong number count less than four, should return false",
        result = isIPVersion4Valid("192.168.1"),
        correctResult = false
    )

    test(
        name = "when ipv4 address have a wrong segment count more than four, should return false",
        result = isIPVersion4Valid("192.168.1.1.1"),
        correctResult = false
    )

    test(
        name = "when ipv4 address have a non numeric numbers, should return false",
        result = isIPVersion4Valid("192.168.one.1"),
        correctResult = false
    )

    test(
        name = "when ipv4 address have out of range numbers(more than 255), should return false",
        result = isIPVersion4Valid("292.999.1.1"),
        correctResult = false
    )

    test(
        name = "when ipv4 address have out of range numbers(less than 0), should return false",
        result = isIPVersion4Valid("-1.192.1.1"),
        correctResult = false
    )

    test(
        name = "when ipv4 address have leading zeros, should return false",
        result = isIPVersion4Valid("01.1.1.1"),
        correctResult = false
    )

    test(
        name = "when ipv4 address have extra characters except(.), should return false",
        result = isIPVersion4Valid("192.168.1.1!"),
        correctResult = false
    )

    test(
        name = "when ipv4 address have extra spaces, should return false",
        result = isIPVersion4Valid("192.168.1.1 "),
        correctResult = false
    )

    test(
        name = "when ipv4 address not have four numbers between them three dots, should return false",
        result = isIPVersion4Valid("..12"),
        correctResult = false
    )

    test(
        name = "when ipv4 address missing numbers, should return false",
        result = isIPVersion4Valid("..1.1"),
        correctResult = false
    )

    test(
        name = "when ipv4 address is empty, should return false",
        result = isIPVersion4Valid(""),
        correctResult = false
    )
}


fun test(name: String, result: Boolean, correctResult: Boolean){
    if(result == correctResult){
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}