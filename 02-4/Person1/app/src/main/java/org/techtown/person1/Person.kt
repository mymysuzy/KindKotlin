package org.techtown.person1

open class Person(val name: String?) {
    var age: Int? = null
    var address: String? = null

    constructor(name: String?, age: Int?, address: String?) : this(name) {
        println("Person의 생성자에서 실행됨.")

        this.age = age
        this.address = address
    }
}