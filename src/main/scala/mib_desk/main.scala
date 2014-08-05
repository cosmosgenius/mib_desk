package mib_desk

object Main {
  def main( args: Array[String] ): Unit = {
    println("Welcome to MIB Registration Desk");
    for ( ln <- io.Source.stdin.getLines() ) {
      println( ln );
    }
  }
}