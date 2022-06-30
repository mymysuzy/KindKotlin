package org.techtown.calc

class Person3(name: String?) {
    var age: Int? = null
    lateinit var address: String

    constructor(name: String?, age: Int?): this(name){
        println("name을 가진 생성자 호출")
        this.age = age
    }
}