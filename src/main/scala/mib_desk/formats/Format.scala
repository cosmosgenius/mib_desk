package mib_desk.formats

abstract class Format( var formatType: String ) {
	Format.addFormat(formatType);
}

object Format {
  var formats = Array[String]("");  
  def addFormat(format:String) = {
    println(format);
    formats :+ format
    for (x <- formats){
      println(x);
    }
    
  }
}