private fun calculate(numbersList: List<Int>): Int {
    val numbers: MutableList<Int> = mutableListOf()

    for(i in numbersList)
        if(numbersList.indexOf(i)%2==0)
            numbers.add(i)
    return sum(numbers) / numbers.size
}

private fun sum(numbers: List<Int>): Int{
    var sum=0
    for(i in numbers)
        sum+=i
    return sum
}
