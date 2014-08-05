package mib_desk

object main {

    def main( args: Array[String] ): Unit = {
        for (ln <- io.Source.stdin.getLines()) {
            println(ln);
        }
    }

}