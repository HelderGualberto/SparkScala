

//val are immutable variables, that cannot be reatributed a value
val immutableConstant: String = "Hello";
println(immutableConstant);

//This causes an error
//imutableConstant = imutableConstant + "asdf"

//variables of type var are mutable
var mutableVariable: String = "World";

val helloWorld = immutableConstant + mutableVariable;

//Variable types
val numberOne: Int = 1
val bool: Boolean = true
val string: String = "String"



// ----------------------------------------------------------------
// Examples of comparison between expressions

def loop (): Boolean = {
  loop()
  true
}
def notLoop (): Boolean = {
  false
}


//Example of single & evaluation

//This generates a infinite loop, because both expressions are
//evaluated

val result = notLoop() & loop()

//This did not generates a loop, because the left evaluation finished the whole eval
val result2 = notLoop() && loop()

//OBS. The same occurs to operator | ||
