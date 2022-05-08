fun main() {
    var likes = 10121
    var result = if (likes % 100 === 11) "людям"
    else if (likes % 10 === 1) "человеку"
    else  "людям"

    println("Понравилось: $likes $result")
}