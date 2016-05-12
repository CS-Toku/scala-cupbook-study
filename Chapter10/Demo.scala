
abstract class Element {
  def demo() {
    println("Element' s implementation invoked")
  }
}
class ArrayElement extends Element {
  def demo() {
    println("ArrayElement' s implementation invoked")
  }
}
class LineElement extends Element {
  final def demo() {
    println("LineElement' s implementation invoked")
  }
}
final class UniformElement extends Element

def invokeDemo(e: Element) {
  e.demo()
}

invokeDemo(new ArrayElement)
invokeDemo(new LineElement)
invokeDemo(new UniformElement)
