
val two = List(2)
val oneTwo = 1 :: two
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " ware not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")
