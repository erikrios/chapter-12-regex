fun main() {
    val regex = Regex(pattern = "c|d")
    val matched = regex.containsMatchIn(input = "abc")
    println(matched)
}