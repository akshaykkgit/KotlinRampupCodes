package classes

sealed class Result {
    val msg:String=""
    data class Success1(val data: String) : Result()
    data class Error1(val message: String) : Result()


}
fun processResult(result: Result) {
    when (result) {
        is Result.Success1 -> println("Success: ${result.data}")
        is Result.Error1 -> println("Error: ${result.message}")
    }
}
fun processRes(r:Result)= when(r){
    is Result.Success1 -> println("Success2: ${r.data}")
    is Result.Error1 -> println("Error: ${r.message}")
}
fun main() {
    processResult(Result.Error1("ERR"))
    processRes(Result.Success1("SS"))
}

