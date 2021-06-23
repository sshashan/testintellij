name := "retailDataBricks"

version := "0.1"

scalaVersion := "2.11.0"
libraryDependencies += "com.typesafe" % "config" % "1.3.4"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.5"

// https://mvnrepository.com/artifact/com.databricks/dbutils-api
libraryDependencies += "com.databricks" %% "dbutils-api" % "0.0.4"

// https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.14.1"
