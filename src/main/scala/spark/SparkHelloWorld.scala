package spark

import global.GlobalClass.spark

object SparkHelloWorld {
  def main(args : Array[String]) = {

    println {
      "Spark can even count range! " +
      spark.range(1,1000).count
    }

  }
}
