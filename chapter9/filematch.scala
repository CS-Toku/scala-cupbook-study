
object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  def filesMatching(matcher: (String) => Boolean) =
    for (
      file <- filesHere
      if matcher(file.getName)
    ) yield file

  def filesEnding(query: String)=
    filesMatching(_.endsWith(query))
  def filesContaining(query: String)=
    filesMatching(_.contains(query))
  def filesRegex(query: String)=
    filesMatching(_.matches(query))
}

def containsNeg(nums: List[Int]) = nums.exists(_ < 0)
def containsOdd(nums: List[Int]) = nums.exists(_ % 2 == 1)

def curriedSum(x: Int)(y: Int) = x + y
def first(x: Int) = (y: Int) => x + y
val second = first(1)
println(second(2))
val onePlus = curriedSum(1)_

var assertionsEnabled = false
def myAssert(predicate: () => Boolean) = 
  if (assertionsEnabled && !predicate()) throw new AssertionError

def myNameAssert(predicate: => Boolean) = 
  if (assertionsEnabled && !predicate) throw new AssertionError

myNameAssert(1 / 0 == 0)
