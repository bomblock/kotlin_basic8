package kr.bomblock.kotlin_basic7
//todo null safety - 타입뒤에 물음표를 넣어줘야 null 입력이 가능하다.
fun main() {
    var name: String? = null
    name = "준석"

    name = null

    var name2: String = ""

    name?.let {
        name2 = name

//    if (name != null) {
//        name2 = name
    }
}