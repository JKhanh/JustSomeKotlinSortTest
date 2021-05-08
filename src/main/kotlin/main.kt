fun main(args: Array<String>) {
    val studentList = mutableListOf(
        Student("a", 21, "b"),
        Student("rtehdf", 12, "b"),
        Student("werawe", 50, "b"),
        Student("thrt", 19, "b"),
        Student("fas3e", 23, "b"),
        Student("asdf", 21, "b"),
    )
    bai2(studentList)
}

data class Student(val name: String, val age: Int, val school: String)

fun bai2(studentList: MutableList<Student>){
    studentList.sortBy { it.age }
    //Neu khong muon thay doi thu tu cua list cu~ ma tao ra list moi
    val newList = studentList.sortedBy { it.age }
    println(studentList)
    //Sort Giam dan
    studentList.sortByDescending { it.age }
    println(studentList)
}
