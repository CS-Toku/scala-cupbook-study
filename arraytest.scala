val greetString = new Array[String](3)
greetString(0) = "a"
greetString(1) = "b"
greetString(2) = "c"

for (i <- 0 to 2)
    println(greetString(i))

val g2String = Array.apply("a","b","c")
0 to 2 foreach(x => println(greetString(x)))
    
