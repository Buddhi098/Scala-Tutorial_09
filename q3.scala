class Account(initialBalance: Double , id:Int) {
  var balance = initialBalance
  var accountId = id
  
  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Account$accountId : Deposited $amount. New balance: $balance")
    } else {
      println("Invalid deposit amount.")
    }
  }
  
  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Account$accountId : Withdrew $amount. New balance: $balance")
    } else {
      println("Invalid withdrawal amount or insufficient balance.")
    }
  }
  
  def transfer(amount: Double, targetAccount: Account): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      targetAccount.deposit(amount)
      println(s"Account$accountId :Transferred $amount to target account. New balance: $balance")
    } else {
      println("Invalid transfer amount or insufficient balance.")
    }
  }
  
  def getBalance: Double = balance
}

object q3 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0 , 1)
    val account2 = new Account(500.0 , 2)
    
    account1.deposit(200.0)
    account1.withdraw(150.0)
    account1.transfer(300.0, account2)
    
    println(s"Account 1 balance: ${account1.getBalance}")
    println(s"Account 2 balance: ${account2.getBalance}")
  }
}
