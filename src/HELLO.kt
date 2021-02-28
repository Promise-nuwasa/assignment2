fun main() {
    name()
    var mod =modulus(25,2)
    println(mod)
    var sum =addition(10,20,30,40)
    println(sum)
    about()
}
fun name(){
    var name = ("Hello Promise")
    println(name)
}
fun modulus(x:Int,y:Int):Int{
    var mod =x%y
    return (mod)
}
fun addition(a:Int,b:Int,c:Int,d:Int):Int{
    var sum = a+b+c+d
    return (sum)
}
fun about(){
    var about =("am smart")
    println(about)
}
