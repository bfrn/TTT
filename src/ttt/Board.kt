package ttt

class Board {

    private var board = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
    private val winConditions = arrayOf(intArrayOf(0, 1, 2), intArrayOf(3, 4, 5), intArrayOf(6, 7, 8), intArrayOf(0, 3, 6), intArrayOf(1, 4, 7), intArrayOf(2, 5, 8), intArrayOf(0, 4, 8), intArrayOf(2, 4, 6))

    fun list_moves(): IntArray {
        return board.filter { item ->
            item == 0
        }.toIntArray()
    }

    fun make_move(idx: Int) {
        assert(board[idx] == 1 || idx < 0 || idx > 8 || list_moves().count() < 1)
        board[idx] = 1
    }

    fun three_in_a_row(): Boolean {
        return winConditions
                .map { con ->
                    con.map { item ->
                        board[item]
                    }.sum()
                }.sum() > 0
    }


    override fun toString(): String {
        val repr = "OX"
        return intArrayOf(0, 3, 6)
                .map { i -> "[ %s %s %s]\n".format(repr[board[i]], repr[board[i + 1]], repr[board[i + 2]]) }
                .fold("") { ret, item -> ret + item }
    }


}
