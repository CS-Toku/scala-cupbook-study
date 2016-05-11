
def outer(x: Int) = {
  def inner(y: Int) =
    y + 1

  inner(x)
}

val add_1 = (x: Int) => x + 1

val someNumbers = List(-11, -10, -5, 0, 5, 10)
println(someNumbers.filter((x: Int) => x > 0))
println(someNumbers.filter(x => x > 0))
println(someNumbers.filter(_ > 0))
val add_pair = (_: Int) + (_: Int)
someNumbers.filter(_ > 0).foreach(println _)
val add_2 = add_pair(2, _: Int)
val add_pair_copy = add_pair _

var more = 1
val addMore = (_: Int) + more
println(addMore(2))
more = 2
println(addMore(2))

def echo(args: String*) = 
  args foreach println

echo("one", "two")
val arr = Array("What's", "up", "doc?")
echo(arr: _*)

def speed(distance: Float = 1, time: Float = 1) = distance / time
println(speed(time=10, distance=100))
