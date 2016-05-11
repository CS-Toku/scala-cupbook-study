
var filename = "default.txt"
if (!args.isEmpty)
  filename = args(0)

val filename2 = 
  if (!args.isEmpty) args(0)
  else "default.txt"


def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0){
    val temp = a
    a = b % a
    b = temp
  }
  b
}

def gcd(x: Long, y: Long): Long = 
  if (y == 0) x else gcd(y, x % y)

val filesHere = (new java.io.File(".")).listFiles
for (file <- filesHere)
  println(file)

for (file <- filesHere if file.getName.endsWith(".scala"))
  println(file)

for (
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".scala")
) println(file)

def fileLines(file: java.io.File) = 
  scala.io.Source.fromFile(file).getLines().toList
def grep(pattern: String) = 
  for (
    file <- filesHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    if line.trim.matches(pattern)
  ) println(file + ": " + line.trim)
def grep2(pattern: String) = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file + ": " + trimmed)
grep(".*gcd.*")

for (
  file <- filesHere
  if file.getName.endsWith(".scala")
) yield {
  file
}

def half(n: Int) = 
  if ( n % 2 == 0 )
    n / 2
  else
    throw new RuntimeException("n must be even")

val halftest = 
  try {
    half(1)
  } catch {
    case ex: RuntimeException => {
      println("Catch Exception!!")
      0
    }
  } finally {
    println("finally phase...")
  }

val firstArg = if (args.length > 0) args(0) else ""
firstArg match {
  case "test" => println("test comment.")
  case _ => println("etc param.")
}

def makeRowSeq(row: Int) = 
  for(col <- 1 to 10) yield {
    val prod = (row * col) toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }
def makeRow(row: Int) = makeRowSeq(row) mkString
def multiTable() = {
  val tableSeq = 
    for(row <- 1 to 10)
    yield makeRow(row)
  tableSeq.mkString("\n")
}
println(multiTable())


