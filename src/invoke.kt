fun main() {
    name ()
    modulus ()
    var add =addition(5,6,7,8)
    println(add)
    interestingFacts()
    }
fun name(){
    var name = "Hello Kate"
    println(name)
}
fun modulus(){
    var a=25
    var b=5
    var modulus=(a%b)
    println(modulus)
}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var add =num1+num2+num3+num4
    println(add)
    return add
}
fun interestingFacts (){
    var interestingFacts=("i enjoy night walks")
            println(interestingFacts)
}