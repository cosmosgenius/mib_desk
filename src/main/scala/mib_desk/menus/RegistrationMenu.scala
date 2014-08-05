package mib_desk.menus

class RegstrationMenu extends Menu("Registration Form") {
  def menu ():Boolean = {
    getValue( "Code Name provided to you?" );
    getValue( "Which Planet?" );
    getValue( "Color of Blood?" );
    getValue( "Number of Antennas?" );
    getValue( "Number of Hands?" );
    getValue( "Number of Legs?" );
    return false;
  }
}