import com.tuandiniz.{BankAccount, MemoKeyed, Thermometer, Time}

@main def hello(): Unit =
  println("Balance tests:")
  val account = BankAccount()
  account.deposit(320)
  println(s"Balance: ${account.balance}")
  account.deposit(100)
  println(s"Balance: ${account.balance}")
  account.withdraw(300)
  println(s"Balance: ${account.balance}")
  println(account.withdraw(300))
  println(s"Balance: ${account.balance}")
  println("------------------------")
  val keyed = MemoKeyed()
  println(s"Random key: ${keyed.computeKey}")
  println(s"Cached key: ${keyed.computeKey}")
  println("------------------------")
  val time = Time()
  println(s"Time: $time")
  time.minute = 23
  time.hour = 11
  println(s"Time: $time")
  println("------------------------")
  val thermo = Thermometer()
  thermo.celsius = 15
  println(s"Temperature: $thermo")
  thermo.fahrenheit = -40
  println(s"Temperature: $thermo")
  thermo.celsius = 100
  println(s"Temperature: $thermo")

