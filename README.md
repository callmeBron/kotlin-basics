# kotlin-basics
A basic kotlin mobile app | rock paper scissors! [🪨 vs.📃 vs.✂]

**The basics of the application**

Our application has to know of a few concepts within the scope of its lifetime:
- What our choice was
- What the computers choices is
- Then who is the winner

so essentially we need to store our player choice, store the computer choice and then have a comparison between the the choices and who won.

**Concepts Covered**

- Storing information using variables
- Different data types ( string, integer, boolean… etc)
- How to get user input and how to display results

# Overview: Basics of Kotlin Programming Language

> The basic types of any programming language are variables, data types , if and when statements, conditionals and control flow.
> 
- **Variables**
    - Are a way for us to store data inside our program temporarily while the program is alive. It can be thought of as a container or a storage box where we can save data to be used later on in the program within the same lifetime.
    - They can be a multitude of data types, from primitive to complex types
    - When creating a variable we are asking the device for a space in memory. the amount of space depends on the type of data we have chosen to represent.
    - We can assign, call and reassign the value during the lifetime of the app (when the app is up and running)
    - variables have names which should be descriptive enough to explain the data it holds..
    
    ```kotlin
    // we declare a variable using 'val' keyword
    // name it with 'userAge'
    // assign the value '= 12'
    val userAge = 12 
    ```
    
    - You can either use the **val** or **var** keyword to construct variables in kotlin
    
    ```kotlin
    // immutable - cannot be changed once declared
    val userName1: string = "John"
    
    // mutable - can be changed after being declared
    var userName2: string = "Melissa"
    ```
    
- **Data types**
    
   >  All types are objects in the sense we can call member functions and properties on any variable. Some types have special internal representation, like numbers which can be represented as primitive values at runtime, but to a user look like ordinary classes
    > 
    - Numbers
        - There are a set of built in types which represent numbers. The different types are there for use to build a super performant app depending on the scenario and the type that takes up the least about of data.
    - Booleans
        - Booleans are a data type which represent an object that has two typical states true and false.
        - If you want you can say it has three states if you include the nullable value we can assign it. However conventionally we do not really work with nullable booleans.
 
- **Number types**
    
   >  Kotlin can infer types and depending on the length of the number it will then intern read the variable as the specific or relevant type.
   > 
    
    - **Byte**
        - Takes up 8 bits of space, this has a min value of -128 and a max value of 127 (with the inclusion of 0).
        - In a scenario where we are certain that the only available data that will be store are numbers within the range, we can definitely take advantage of this data type as it will use the least amount of space achieving great efficiency.
    
    ```kotlin
    val ageByte: Byte = 1
    ```
    
    - **Short**
        - Takes up 16 bits of space on the ram component. and allows for a range between -32768 and max of 32767
    
    ```kotlin
    val ageShort: Short = 12
    ```
    
    - **Integers**
        - They are whole numbers and take up around 32 bits of space of Ram. And is usually the default implementation, since the hardware is quite powerful there isnt a huge need to always be considering the space being used ( i use this sentence lightly because it depends of course) but in general an integer would be okay to use. with minus 2 billion to max 2 billion
    
    ```kotlin
    val ageInt: Int = 103
    ```
    
    - **Long**
        - This takes up the most bits coming in hot with 64 bits. and goes up to crazy amount of digits, over a trillion for sure. We could efficiently store phones numbers or id numbers for example.
    
    ```kotlin
    val ageLong: Long = 10300
    val ageLong2 = 23L
    ```
    
- **Val vs. Var**
    - **val** variables are immutable references. Once we assign a value it becomes a read only object.
        - if you try to mutate it later on it will result in a compile time error
    - **var** variables are mutable references which allow reassignment. We can change the value that is set at anytime within the app lifecycle. It is a read and write object.
- **Floats & Doubles**
    
   >  Both types specify different types which handle decimal numbers.
    > 
    - **Floats**
        - Allow for storage of 32 bits of data.
        - **Shorthand:** 2.17840372**f**
    - **Doubles**
        - Allow for storage of 64 bits of data
        - The default usages provided by Kotlin
- **Unsigned Integers**
    
    > Unsigned is when we take a range that a number type and removing the negative values from it. **For example** we previously saw Byte being a range of **-128 to 127,** however an unsigned Byte would then just be **0 to 256**
    > 
    > 
    > **Allows us to go bigger in one range being positive only**
    > 
    - **Byte [ 0 - 256 ]**
    
    ```kotlin
    val byte: UByte = 256
    ```
    
    - **Short [ 0 - 65535]**
    
    ```kotlin
    val short: UShort = 65535
    ```
    
    - **Integer [0 - 2^32-1]**
    
    ```kotlin
    val int: UInt = 2000
    ```
    
    - **Long [0 - 2^64-1]**
    
    ```kotlin
    val long: ULong = 2000
    ```
    
- **Booleans**
    
   >   Booleans are a data type which represent an object that has two typical states [**TRUE || FALSE**]. There is a third State that it can be which is null or nothing but usually we do use it for the two values of true or false.
    > 
    **Built in logic operations:** 
    
    It has the ability to have disjunction, conjunction and negation operations..
    
    ```kotlin
    // Boolean values
    val trueVal: Boolean = true
    val falseVal: Boolean = false
    val nullableVal: Boolean? = null
    
    // the 'and' operator. If both values are true print true
    println(trueVal && falseVal) // false
    
    // the 'or' operator. If one value is true print true
    println(trueVal || falseVal) // true
    
    // the 'negation' operator. Inverts or negates the value true -> will be false
    println(!trueVal) // false
    ```
