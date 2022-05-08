fun main() {
    val amount = 10_0000 //сумма перевода в копейках
    val result = if ((amount / 100 * 0.75) >= 35) amount / 100 * 0.75 else 35 // комиссия которую запратит пользователь в копейках

    println("Total commission: $result")
}