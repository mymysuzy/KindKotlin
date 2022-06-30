package org.techtown.calc

class Person2 {
    var name: String? = null
    var age: Int? = null
    lateinit var address: String

    constructor(name: String?){
        this.name = name
        println("name을 가진 생성자 호출")
    }
}