package mib_desk.managers

import mib_desk.bean.Alien

object AlienManager {
  var aliens: List[Alien] = List();

  def addAlien( alien: Alien ) = {
    aliens :+ alien;
  }

  def getAll(): List[Alien] = {
    return aliens;
  }
}