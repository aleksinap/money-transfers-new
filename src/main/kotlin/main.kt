fun main() {
    val typeOfCard = "Maestro"
    val monthTransfers = 46799000
    val transfer = 350000
    val commission = getCommission(typeOfCard, monthTransfers, transfer)
    println(commission)
}