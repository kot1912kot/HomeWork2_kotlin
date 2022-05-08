fun main() {
    var itemPrice = 11_000
    var meloman = true

    val discount = if (itemPrice <= 1_000) 0 else if (itemPrice >= 1_001 && itemPrice <= 10_000) 100
                    else itemPrice / 100 * 5

    val discountMeloman = if (meloman === true && itemPrice <= 1_000) itemPrice / 100
        else if (meloman === true && itemPrice >= 1_001) (itemPrice - discount) / 100
        else 0

    var totalDiscount = discount + discountMeloman
    var totalSum = itemPrice - totalDiscount
    println("""Сумма покупки - $itemPrice
Общая скидка составила - $totalDiscount
Сумма покупки после применения всех скидок - $totalSum
""".trimIndent())
}