package ttt

class Board {

    private var board = intArrayOf(0, 0, 0, 0, 1, 0, 0, 0, 0)

    

    override fun toString(): String {
        val repr ="OX"
        return intArrayOf(0, 3, 6)
                .map { i -> "[ %s %s %s]\n".format(repr[board[i]], repr[board[i + 1]], repr[board[i + 2]]) }
                .fold("") { ret, item -> ret+item}
    }


}
