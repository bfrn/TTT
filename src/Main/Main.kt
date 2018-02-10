package Main

import ttt.Board

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val b : Board = Board()
        print(b.toString())
    }
}