package mib_desk.formats

abstract class Format( var formatType: String ) {
  def save(): Boolean;
}