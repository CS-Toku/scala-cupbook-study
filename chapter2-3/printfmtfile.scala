import scala.io.Source

def widthOfLength(s: String): Int = s.length.toString.length

if ( args(0).length > 0 ){
    val lines = Source.fromFile(args(0)).getLines().toList
    val maxlen = lines.map(widthOfLength).reduceLeft((a,b) => a max b)

    lines.foreach(line => {
        val paddingNum = maxlen - widthOfLength(line)
        val padding = " " * paddingNum
        println(padding + line.length + " | " + line)
    })
}
else println("Please input filename")
