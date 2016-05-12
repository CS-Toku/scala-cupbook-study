
println(42.toString)
println(42.hashCode)
println(42 equals 42)
println(42.abs)

def isEqual(x: Int, y: Int) = x == y
def isEqualObj(x: Any, y: Any) = x == y

println(isEqual(421, 421))
println(isEqualObj(421, 421))

val x = new String("abc")
val y = new String("abc")

println(x == y)
println(x eq y)
println(x ne y)
