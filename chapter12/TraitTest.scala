
trait Philosophical {
  def philosophize() {
    println("I consume memory, therefore I am!")
  }
}

class Animal
trait HasLegs
class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "green"
}

val frog = new Frog
frog.philosophize()
val phil: Philosophical = frog
phil.philosophize()


