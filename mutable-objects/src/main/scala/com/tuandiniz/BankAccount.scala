package com.tuandiniz

class BankAccount(initialBalance: Int = 0):
  private var bal: Int = initialBalance
  
  def balance: Int = bal

  def deposit(amount: Int): Unit =
    require(amount > 0)
    
    bal += amount
    
  def withdraw(amount: Int): Boolean =
    if amount > bal then false
    else 
      bal -= amount
      true
