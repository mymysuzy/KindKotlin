package org.techtown.person1

class Student(val alias: String?) : Person(alias) {
    constructor(alias: String?, age: Int?, address: String?) : this(alias) {
        this.age = age
        this.address = address
    }
}