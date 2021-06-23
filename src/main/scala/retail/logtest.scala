package retail

import org.apache.log4j.Logger
import org.apache.logging.log4j.LogManager


object logtest {
  def main(args: Array[String]): Unit = {
    val logger:Logger = Logger.getLogger("testlog")
    logger.info("please print a log")
  }
}



