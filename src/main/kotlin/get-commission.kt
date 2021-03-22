fun getCommission(
    typeOfCard: String = "Vk Pay",
    monthTransfers: Int = 0,
    transfer: Int) : Int {
    val commission: Int = when(typeOfCard){
        "Мир", "Visa" -> if(transfer*0.0075 > 3500.0) (transfer*0.0075).toInt() else 3500
        "MasterCard", "Maestro" -> if(monthTransfers <= 7500000) 0 else (transfer*0.006 + 2000).toInt()
        else -> 0
    }
    return commission
}