/**
 * @author Edward Wong
 */
object FizzBuzz {

  var fizzBuzzRuleList = List[FizzBuzzRule](
    new FizzBuzzRule(3, "Fizz"),
    new FizzBuzzRule(5, "Buzz"),
    new FizzBuzzRule(7, "Wolf")
  )

  def main(args: Array[String]) {
    val messageBuilder = new StringBuilder
    for (i <- 1 to 100) {
      messageBuilder.clear()

      for (rule: FizzBuzzRule <- fizzBuzzRuleList) {
        if (i % rule.divisor() == 0) {
          messageBuilder.append(rule.message())
        }
      }

      if (messageBuilder.isEmpty) {
        println(i)
      } else {
        println(messageBuilder.toString())
      }
    }
  }
}
