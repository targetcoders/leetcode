package leetcode.easy

class Problem9 {
    fun isPalindrome(x: Int): Boolean {
        if (x == 0) return true
        if (x < 0) return false

        var cnt = 0
        var n: Int = x
        while (n != 0) {
            cnt += 1
            n /= 10
        }

        n = x;
        val arr = IntArray(cnt)
        for (i in 0..<cnt) {
            arr[cnt - 1 - i] = n % 10
            n /= 10
        }

        for (i in 0..<cnt) {
            if (arr[i] != arr[cnt - 1 - i]) return false
        }

        return true
    }
}