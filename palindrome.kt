private fun isPalindrome(string: String): Boolean {
    val length = string.length
    var i = 0
    for (i in 0..length / 2) {
        if (string[i] != string[length - i - 1])
            return false
    }
    return true
}
