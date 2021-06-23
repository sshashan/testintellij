package retail
import org.apache.spark.sql.SparkSession
import com.databricks.dbutils_v1.DBUtilsHolder.dbutils
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.LogManager

import com.typesafe.config.ConfigFactory
object GetDailyProductRevenue extends LogManager{


  def main(args: Array[String]): Unit = {
    val Logger :Logger = LogManager.getLogger
    val config = ConfigFactory.load()
    val props = config.getConfig(args(0))
    val path = props.getString("input.base.dir")
Logger.info("Test Logging")
    println(path)

  }
}
