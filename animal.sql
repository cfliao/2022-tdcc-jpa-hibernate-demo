CREATE DATABASE  IF NOT EXISTS `animal` /*!40100 DEFAULT CHARACTER SET latin1 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `animal`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: animal
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `air_animal_join`
--

DROP TABLE IF EXISTS `air_animal_join`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `air_animal_join` (
  `id` int NOT NULL,
  `wing_span` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `air_animal_join`
--

LOCK TABLES `air_animal_join` WRITE;
/*!40000 ALTER TABLE `air_animal_join` DISABLE KEYS */;
INSERT INTO `air_animal_join` VALUES (1,10),(2,100);
/*!40000 ALTER TABLE `air_animal_join` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `animal_air_concrete`
--

DROP TABLE IF EXISTS `animal_air_concrete`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `animal_air_concrete` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `wing_span` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animal_air_concrete`
--

LOCK TABLES `animal_air_concrete` WRITE;
/*!40000 ALTER TABLE `animal_air_concrete` DISABLE KEYS */;
INSERT INTO `animal_air_concrete` VALUES (7,'bird',10),(8,'eagle',100);
/*!40000 ALTER TABLE `animal_air_concrete` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `animal_join`
--

DROP TABLE IF EXISTS `animal_join`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `animal_join` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animal_join`
--

LOCK TABLES `animal_join` WRITE;
/*!40000 ALTER TABLE `animal_join` DISABLE KEYS */;
INSERT INTO `animal_join` VALUES (1,'bird'),(2,'eagle'),(3,'dog'),(4,'cat'),(5,'human');
/*!40000 ALTER TABLE `animal_join` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `animal_land_concrete`
--

DROP TABLE IF EXISTS `animal_land_concrete`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `animal_land_concrete` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `leg_cnt` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animal_land_concrete`
--

LOCK TABLES `animal_land_concrete` WRITE;
/*!40000 ALTER TABLE `animal_land_concrete` DISABLE KEYS */;
INSERT INTO `animal_land_concrete` VALUES (4,'dog',4),(5,'cat',4),(6,'human',2);
/*!40000 ALTER TABLE `animal_land_concrete` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `animal_single`
--

DROP TABLE IF EXISTS `animal_single`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `animal_single` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `leg_cnt` int DEFAULT NULL,
  `wing_span` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animal_single`
--

LOCK TABLES `animal_single` WRITE;
/*!40000 ALTER TABLE `animal_single` DISABLE KEYS */;
INSERT INTO `animal_single` VALUES (4,'L','dog',4,NULL),(5,'L','cat',4,NULL),(6,'L','human',2,NULL),(7,'A','bird',NULL,10),(8,'A','eagle',NULL,100);
/*!40000 ALTER TABLE `animal_single` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `land_animal_join`
--

DROP TABLE IF EXISTS `land_animal_join`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `land_animal_join` (
  `id` int NOT NULL,
  `leg_cnt` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `land_animal_join`
--

LOCK TABLES `land_animal_join` WRITE;
/*!40000 ALTER TABLE `land_animal_join` DISABLE KEYS */;
INSERT INTO `land_animal_join` VALUES (3,4),(4,4),(5,2);
/*!40000 ALTER TABLE `land_animal_join` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-08 19:45:59
