class Solution {
	fun solution(my_string: String, index_list: IntArray): String {
		var answer: String = ""
		
		var sb = StringBuilder()

		for (i in index_list) {
			sb.append(my_string[i])
		}
		
		return sb.toString()
	}
}