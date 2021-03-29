-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: lab_management
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `12a`
--

DROP TABLE IF EXISTS `12a`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `12a` (
  `Class` int(6) DEFAULT NULL,
  `Section` varchar(2) DEFAULT NULL,
  `Rollno` int(4) DEFAULT NULL,
  `Name` varchar(40) DEFAULT NULL,
  `Attendance` varchar(10) DEFAULT NULL,
  `DOB` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `12a`
--

LOCK TABLES `12a` WRITE;
/*!40000 ALTER TABLE `12a` DISABLE KEYS */;
INSERT INTO `12a` VALUES (12,'A',1,'Akash Pandey','Present','2003-04-19'),(12,'A',2,'Akash Tiwari','present','2002-02-07'),(12,'A',3,'Amisha Yadav','Present','2003-04-19'),(12,'A',4,'Aniket Sinha','Present','2003-04-19'),(12,'A',5,'Anish Singh','Present','2003-04-19'),(12,'A',6,'Anjali Shukla','Present','2003-04-19'),(12,'A',7,'Ankit Yadav','Present','2003-04-19'),(12,'A',8,'Ankita Pandey','Present','2003-04-19'),(12,'A',9,'Ansh Tiwari','Present','2003-04-19'),(12,'A',10,'Anshul Rajwade','Present','2003-04-19'),(12,'A',11,'Astha Pathak','Present','2003-04-19'),(12,'A',12,'Ayush Singh','Present','2003-04-19'),(12,'A',13,'Ayushi Tiwari','Present','2003-04-19'),(12,'A',14,'Bhumika Agarwal','Present','2003-04-19'),(12,'A',15,'Danish Soni','Present','2003-04-19'),(12,'A',16,'Deepak Gupta','Present','2003-04-19'),(12,'A',17,'Divya Tiwari','Present','2003-04-19'),(12,'A',18,'Divyansh Sinha','Present','2003-04-19'),(12,'A',19,'Divyanshi Shukla','Present','2003-04-19'),(12,'A',20,'Divyanshu Jaiswal','Present','2003-04-19'),(12,'A',21,'Harish Singh','Present','2003-04-19'),(12,'A',22,'Harsh Singh','Present','2003-04-19'),(12,'A',23,'Harshita Tiwari','Present','2003-04-19'),(12,'A',24,'Ishan Choudhary','Present','2003-04-19'),(12,'A',25,'Ishita Agarwal','Present','2003-04-19'),(12,'A',26,'Kajal Singh','Present','2003-04-19'),(12,'A',27,'Kanishk Gupta','Present','2003-04-19'),(12,'A',28,'Kashish Gupta','Present','2003-04-19'),(12,'A',29,'Kavya Tiwari','Present','2003-04-19'),(12,'A',30,'Megha Soni','Present','2003-04-19'),(12,'A',31,'Nilesh Singh','Present','2003-04-19'),(12,'A',32,'Nishank Choubey','Present','2003-04-19'),(12,'A',33,'Nitesh Dubey','Present','2003-04-19'),(12,'A',34,'Prakash Shukla','Present','2003-04-19'),(12,'A',35,'Pranay Rai','Present','2003-04-19'),(12,'A',36,'Prashant Singh','Present','2003-04-19'),(12,'A',37,'Pratap Soni','Present','2003-04-19'),(12,'A',38,'Rishab Soni','Present','2003-04-19'),(12,'A',39,'Vivek Singh','Present','2003-04-19');
/*!40000 ALTER TABLE `12a` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `6d`
--

DROP TABLE IF EXISTS `6d`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `6d` (
  `Class` int(6) DEFAULT NULL,
  `Section` varchar(2) DEFAULT NULL,
  `Rollno` int(4) DEFAULT NULL,
  `Name` varchar(40) DEFAULT NULL,
  `Attendance` varchar(10) DEFAULT NULL,
  `DOB` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `6d`
--

LOCK TABLES `6d` WRITE;
/*!40000 ALTER TABLE `6d` DISABLE KEYS */;
INSERT INTO `6d` VALUES (6,'D',1,'Aaditya Yadav','present','2009-01-30'),(6,'D',2,'Aayush Chaturvedi','present','2008-01-31'),(6,'D',3,'Akash','present','2008-01-31');
/*!40000 ALTER TABLE `6d` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `7g`
--

DROP TABLE IF EXISTS `7g`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `7g` (
  `Class` int(6) DEFAULT NULL,
  `Section` varchar(2) DEFAULT NULL,
  `Rollno` int(4) DEFAULT NULL,
  `Name` varchar(40) DEFAULT NULL,
  `Attendance` varchar(10) DEFAULT NULL,
  `DOB` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `7g`
--

LOCK TABLES `7g` WRITE;
/*!40000 ALTER TABLE `7g` DISABLE KEYS */;
INSERT INTO `7g` VALUES (7,'G',1,'Abhishek','present','2010-01-28');
/*!40000 ALTER TABLE `7g` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_id`
--

DROP TABLE IF EXISTS `admin_id`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_id` (
  `Name` varchar(40) DEFAULT NULL,
  `UserID` varchar(40) DEFAULT NULL,
  `Password` varchar(15) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Security_word` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_id`
--

LOCK TABLES `admin_id` WRITE;
/*!40000 ALTER TABLE `admin_id` DISABLE KEYS */;
INSERT INTO `admin_id` VALUES ('Akash Tiwari','Ak47','Xsw23edc','Male','hacker'),('Aayush Chaturvedi','AC123','123','Male','abc'),('Akash Tiwari','Ak56','abcde','Male','hello');
/*!40000 ALTER TABLE `admin_id` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `available_computers`
--

DROP TABLE IF EXISTS `available_computers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `available_computers` (
  `Computer` varchar(15) NOT NULL,
  `mouse` varchar(20) DEFAULT NULL,
  `keyboard` varchar(20) DEFAULT NULL,
  `monitor` varchar(20) DEFAULT NULL,
  `cpu` varchar(20) DEFAULT NULL,
  `switch` varchar(20) DEFAULT NULL,
  `software` varchar(20) DEFAULT NULL,
  `Sno` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `available_computers`
--

LOCK TABLES `available_computers` WRITE;
/*!40000 ALTER TABLE `available_computers` DISABLE KEYS */;
INSERT INTO `available_computers` VALUES ('comp_1','OK','OK','OK','OK','OK','OK',1),('comp_2','OK','OK','OK','OK','OK','OK',2),('comp_3','OK','OK','OK','OK','OK','OK',3),('comp_4','OK','OK','OK','NOT WORKING','OK','OK',4),('comp_5','OK','OK','OK','OK','OK','OK',5),('comp_6','OK','OK','OK','OK','OK','OK',6),('comp_7','OK','OK','OK','OK','OK','OK',7),('comp_8','OK','OK','OK','OK','OK','OK',8),('comp_9','OK','OK','OK','OK','NOT WORKING','OK',9),('comp_10','OK','OK','OK','OK','OK','OK',10),('comp_11','OK','OK','OK','OK','OK','OK',11),('comp_12','OK','OK','OK','OK','OK','OK',12),('comp_13','OK','OK','OK','OK','OK','OK',13),('comp_14','OK','OK','OK','OK','OK','OK',14),('comp_15','OK','OK','OK','OK','OK','OK',15),('comp_16','OK','OK','OK','OK','OK','OK',16),('comp_17','OK','OK','OK','OK','OK','OK',17),('comp_18','OK','OK','OK','OK','OK','OK',18),('comp_19','OK','OK','OK','OK','OK','OK',19),('comp_20','OK','OK','OK','OK','OK','OK',20),('comp_21','OK','OK','OK','OK','OK','OK',21),('comp_22','OK','OK','OK','OK','OK','OK',22),('comp_23','OK','OK','OK','OK','OK','OK',23),('comp_24','OK','OK','OK','OK','OK','OK',24),('comp_25','OK','OK','OK','OK','OK','OK',25),('comp_26','OK','OK','OK','OK','OK','OK',26),('comp_27','OK','OK','OK','OK','OK','OK',27),('comp_28','OK','OK','OK','OK','OK','OK',28),('comp_29','OK','NOT WORKING','OK','OK','OK','OK',29),('comp_30','OK','OK','OK','OK','OK','OK',30),('comp_31','OK','OK','OK','OK','OK','OK',31),('comp_32','OK','OK','OK','OK','OK','OK',32),('comp_33','OK','OK','OK','OK','OK','OK',33),('comp_34','OK','OK','OK','OK','OK','OK',34),('comp_35','OK','OK','OK','OK','OK','OK',35),('comp_36','OK','OK','OK','OK','OK','OK',36),('comp_37','OK','OK','OK','OK','OK','OK',37),('comp_38','OK','OK','OK','OK','OK','OK',38),('comp_39','OK','OK','OK','OK','OK','OK',39),('comp_40','OK','OK','OK','OK','OK','OK',40),('comp_41','OK','OK','OK','OK','OK','OK',41),('comp_42','OK','OK','OK','OK','OK','OK',42),('comp_43','OK','OK','OK','OK','OK','OK',43),('comp_44','OK','OK','OK','OK','OK','OK',44),('comp_45','OK','OK','OK','OK','OK','OK',45),('comp_46','OK','OK','OK','NOT WORKING','OK','OK',46),('comp_47','OK','OK','OK','OK','OK','OK',47),('comp_48','OK','OK','OK','OK','OK','OK',48),('comp_49','OK','OK','OK','OK','OK','OK',49),('comp_50','OK','OK','OK','OK','OK','OK',50),('comp_51','OK','OK','OK','OK','OK','OK',51),('comp_52','OK','OK','OK','OK','OK','OK',52),('comp_53','OK','OK','OK','OK','OK','OK',53),('comp_54','OK','OK','OK','OK','OK','OK',54),('comp_55','OK','OK','OK','OK','OK','OK',55),('comp_56','OK','OK','OK','OK','OK','OK',56),('comp_57','OK','OK','OK','OK','OK','OK',57),('comp_58','OK','NOT WORKING','NOT WORKING','OK','OK','OK',58),('comp_59','OK','OK','OK','OK','OK','OK',59),('comp_60','OK','OK','OK','OK','OK','OK',60);
/*!40000 ALTER TABLE `available_computers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comboaddtableandsection`
--

DROP TABLE IF EXISTS `comboaddtableandsection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comboaddtableandsection` (
  `t_name` int(10) DEFAULT NULL,
  `section` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comboaddtableandsection`
--

LOCK TABLES `comboaddtableandsection` WRITE;
/*!40000 ALTER TABLE `comboaddtableandsection` DISABLE KEYS */;
/*!40000 ALTER TABLE `comboaddtableandsection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `computer_allocation`
--

DROP TABLE IF EXISTS `computer_allocation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `computer_allocation` (
  `Class` int(6) DEFAULT NULL,
  `Section` varchar(2) DEFAULT NULL,
  `Rollno` int(4) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Attendance` varchar(10) DEFAULT NULL,
  `DOB` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `computer_allocation`
--

LOCK TABLES `computer_allocation` WRITE;
/*!40000 ALTER TABLE `computer_allocation` DISABLE KEYS */;
/*!40000 ALTER TABLE `computer_allocation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_info`
--

DROP TABLE IF EXISTS `login_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login_info` (
  `Name` varchar(40) DEFAULT NULL,
  `UserID` varchar(40) DEFAULT NULL,
  `Password` varchar(15) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Security_word` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_info`
--

LOCK TABLES `login_info` WRITE;
/*!40000 ALTER TABLE `login_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `login_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stu_report`
--

DROP TABLE IF EXISTS `stu_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stu_report` (
  `Class` int(4) DEFAULT NULL,
  `Section` varchar(2) DEFAULT NULL,
  `Rollno` int(3) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Comp` varchar(10) DEFAULT NULL,
  `Date_and_time` datetime DEFAULT NULL,
  `Admin` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_report`
--

LOCK TABLES `stu_report` WRITE;
/*!40000 ALTER TABLE `stu_report` DISABLE KEYS */;
INSERT INTO `stu_report` VALUES (12,'A',1,'Akash Pandey','comp_1','2020-01-14 14:17:23','Akash Tiwari'),(12,'A',2,'Akash Tiwari','comp_2','2020-01-14 14:17:23','Akash Tiwari'),(12,'A',4,'Aniket Sinha','comp_3','2020-01-14 14:17:23','Akash Tiwari'),(12,'A',6,'Anjali Shukla','comp_5','2020-01-14 14:17:23','Akash Tiwari'),(12,'A',7,'Ankit Yadav','comp_6','2020-01-14 14:17:23','Akash Tiwari'),(12,'A',8,'Ankita Pandey','comp_7','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',9,'Ansh Tiwari','comp_8','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',10,'Anshul Rajwade','comp_10','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',11,'Astha Pathak','comp_11','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',12,'Ayush Singh','comp_12','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',13,'Ayushi Tiwari','comp_13','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',14,'Bhumika Agarwal','comp_14','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',15,'Danish Soni','comp_15','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',16,'Deepak Gupta','comp_16','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',17,'Divya Tiwari','comp_17','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',18,'Divyansh Sinha','comp_18','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',19,'Divyanshi Shukla','comp_19','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',20,'Divyanshu Jaiswal','comp_20','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',21,'Harish Singh','comp_21','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',22,'Harsh Singh','comp_22','2020-01-14 14:17:24','Akash Tiwari'),(12,'A',23,'Harshita Tiwari','comp_23','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',24,'Ishan Choudhary','comp_24','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',25,'Ishita Agarwal','comp_25','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',26,'Kajal Singh','comp_26','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',27,'Kanishk Gupta','comp_27','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',28,'Kashish Gupta','comp_28','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',29,'Kavya Tiwari','comp_30','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',30,'Megha Soni','comp_31','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',31,'Nilesh Singh','comp_32','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',32,'Nishank Choubey','comp_33','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',33,'Nitesh Dubey','comp_34','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',34,'Prakash Shukla','comp_35','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',35,'Pranay Rai','comp_36','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',36,'Prashant Singh','comp_37','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',37,'Pratap Soni','comp_38','2020-01-14 14:17:25','Akash Tiwari'),(12,'A',38,'Rishab Soni','comp_39','2020-01-14 14:17:26','Akash Tiwari'),(12,'A',39,'Vivek Singh','comp_40','2020-01-14 14:17:26','Akash Tiwari');
/*!40000 ALTER TABLE `stu_report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `temp`
--

DROP TABLE IF EXISTS `temp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `temp` (
  `Rollno` int(8) DEFAULT NULL,
  `Name` varchar(30) DEFAULT NULL,
  `Comp_name` varchar(20) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `class` int(3) DEFAULT NULL,
  `section` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `temp`
--

LOCK TABLES `temp` WRITE;
/*!40000 ALTER TABLE `temp` DISABLE KEYS */;
/*!40000 ALTER TABLE `temp` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-18 20:26:05
