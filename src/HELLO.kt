import kotlin.system.exitProcess

fun main(){
   promise()
    division()
    add()
    about()


}
fun promise(){
    var name="Hello promise"
     println(name)
}


fun division(){
var num1 =25
var num2 =4
var modulus =num1%num2
println(modulus)
}
fun add(){
    var num1=10
    var num2=20
    var num3=30
    var num4=40
    var sum=num1+num2+num3+num4
    println(sum)
}
fun about() {
    var myself =("am smart")
    println(myself)
}