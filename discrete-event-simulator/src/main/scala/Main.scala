import org.stairwaybook.simulation.CircuitSimulation

class Header(val text: String) extends AnyVal:
  override def toString = s"<$text>"

@main def hello(): Unit =
  object MySimulation extends CircuitSimulation:
    override def InverterDelay: Int = 1
    override def AndGateDelay: Int = 3
    override def OrGateDelay: Int = 5

  import MySimulation.*
  val input1, input2, sum, carry = new Wire
  probe("sum", sum)
  probe("carry", carry)
  halfAdder(input1, input2, sum, carry)
  input1 setSignal true
  run()
  input2 setSignal true
  run()

  val head: Header = Header("Value")
  println(head)