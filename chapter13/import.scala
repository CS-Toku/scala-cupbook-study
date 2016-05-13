
// java.utilのregexを利用
import java.util.regex

// java.utilのメンバ全て
import java.util._

// regexをrという名前で利用
import java.util.{regex => r}

// regex以外全て
import java.util.{regex => _, _}


package bobsrockets{
  package navigation {
    private[bobsrockerts] class Navigator {
      protected[navigatioin] def useStarChart(){}
      class LegOfJourney{
        private[Navigator] val distance = 100
      }
      private[this] var speed = 200
    }
  }
  package launch {
    import navigation._
    object Vehicle {
      private[launch] val guide = new Navigator
    }
  }
}
