


fun main() {
    foo(bar = {
        println("Bar as a function 2")
    })
    foo{
        println("Hello")
    }
    foo()
}

fun foo(name: String = "",
        bar: () -> Unit = {}
        ){

    println("Bar Function ")
    bar()
}
