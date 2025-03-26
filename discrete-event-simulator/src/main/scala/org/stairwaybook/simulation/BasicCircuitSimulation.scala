package org.stairwaybook.simulation

abstract class BasicCircuitSimulation extends Simulation:
  def InverterDelay: Int
  def AndGateDelay: Int
  def OrGateDelay: Int
  
  class Wire:
    private var sigVal = false
    private var actions = List.empty[Action]
    
