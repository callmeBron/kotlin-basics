package callmebron.kotlinseries.kotlinbasics

// Basics of an application
/// gives our program an entry point of the program.
/// pressing the play button will run the gradle which will run the application.
// Scope
/// scope of what needs to be run. Scope refers to the start and end of the '{' '}' braces

fun main() {

    printingBasics()
    variables()
    numbers()
    booleans()
}

private fun printingBasics() {
    // PRINTING VALUES ------
    /// this 'println' function prints whatever is in its '( )' brackets to the console
    println("Hello world!")

    /// we can also print out variables
    val nameVal = "Swizzle"
    println("Hello $nameVal")
}

private fun variables() {
    // MUTABLE AND IMMUTABLE VALUES ------
    // **val** variables are immutable references. Once we assign a value it becomes a read only object.
    // if you try to mutate it later on it will result in a compile time error ❌
    // **var** variables are mutable references which allow reassignment. We can change the value that is set at anytime within the app lifecycle. It is a read and write object.

    val name = "callmeBron" // usually values which arent expected to change
    var age = 32 // usually values which are expected to change over time
    println("Hello $name, your age is currently: $age")
    age = 33 // birthday occurred for example
    println("Hello $name, your age is currently: $age")
}

private fun numbers() {
    // We can also change the data types by explicitly defining the type we want
    // by Default Kotlin will infer the types based on the information given and its own set of rules

    val idNumber = 361221213948232
    val houseNumberInference = 9 // this by default is inferred as an Int
    val houseNumberExplicit: Byte = 9 // we can change the type by explicitly stating it 'name: Type'

    println("Int: $houseNumberInference") // the default
    println("Long: $idNumber") // used for much larger numbers which need more storage space
    println("Byte: $houseNumberExplicit") // used for small values between -128 and 127. It is most efficient as it takes the least storage
}

private fun booleans() {
    // Boolean values
    val trueVal: Boolean = true
    val falseVal: Boolean = false
    val nullableVal: Boolean? = null

// the 'and' operator
    println(trueVal && falseVal)

// the 'or' operator
    println(trueVal || falseVal)

// the 'negation' operator
    println(!trueVal)
}