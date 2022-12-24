package blackjack.infra.io

class BlackjackInputReader {
    fun readPlayerNames(): List<String> =
        readln().split(",").map { it.trim() }
}