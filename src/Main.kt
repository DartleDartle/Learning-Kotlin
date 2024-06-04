fun main() {
    greet("John" )
    greet("Carol", 15)
    greet("Alex", 27)

    print(double(5))
}

// You cannot declare the type only if is a single expression

fun double(n: Int) = n * 2

/* fun double(x: Int) : Int {
    return x * 2
} */

fun greet(name: String, age: Int = -1){

    println("Hello $name")

    if (age == -1){

        println("$name please provide your age\n")
        return
    }

    if (age >= 18){
        println("$name $age - You are an adult\n")
    } else {
        println("$name You are a minor\n")
    }
}


