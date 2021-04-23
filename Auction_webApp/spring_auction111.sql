-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: spring_auctions
-- ------------------------------------------------------
-- Server version	5.5.5-10.3.22-MariaDB

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
-- Table structure for table `auction_list`
--

DROP TABLE IF EXISTS `auction_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `auction_list` (
  `id` bigint(20) NOT NULL,
  `auction_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `auction_text` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `date` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `map_link` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auction_list`
--

LOCK TABLES `auction_list` WRITE;
/*!40000 ALTER TABLE `auction_list` DISABLE KEYS */;
INSERT INTO `auction_list` VALUES (1,'О проведении аукциона по продаже земельных участков 26 декабря 2020','Аукцион состоится 26 декабря 2020 года в 10.00 по адресу: г. Минск, ул. Чкалова, 5.','26.12.2020','<script type=\"text/javascript\" charset=\"utf-8\" async src=\"https://api-maps.yandex.ru/services/constructor/1.0/js/?um=mymaps%3Aj7BF6SmMLrYkSIIjKb4LUmFXxSNye1PF&amp;width=800&amp;height=480&amp;lang=ru_RU&amp;scroll=true\"></script>'),(2,'О проведении аукциона по продаже земельных участков 12 января 2021','Аукцион состоится 12 января 2021 года в 10.00 по адресу: г. Минск, ул. Чкалова, 5.','12.01.2021','<script type=\"text/javascript\" charset=\"utf-8\" async src=\"https://api-maps.yandex.ru/services/constructor/1.0/js/?um=mymaps%3AK9IQZQI_8BCeCVuGsZRl9bvfZ4AKuKhc&amp;width=800&amp;height=480&amp;lang=ru_RU&amp;scroll=true\"></script>');
/*!40000 ALTER TABLE `auction_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `free_ponts`
--

DROP TABLE IF EXISTS `free_ponts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `free_ponts` (
  `id` bigint(20) NOT NULL,
  `area` double NOT NULL,
  `communications` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id_location` bigint(20) DEFAULT NULL,
  `registration_authority` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `adress` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `free_ponts`
--

LOCK TABLES `free_ponts` WRITE;
/*!40000 ALTER TABLE `free_ponts` DISABLE KEYS */;
INSERT INTO `free_ponts` VALUES (1,0.1453,'Газ, Водопровод, Электричество',3,'Демидовичский сельский совет','д.Гриньково'),(2,0.1545,'Газ, Электричество',7,'Боровской сельский совет','д.Пеняка'),(3,0.1221,'Электричество',12,'Путчинский сельский совет','д.Падеричи'),(4,0.1432,'Электричество',16,'Станьковский сельский совет','д.Большая');
/*!40000 ALTER TABLE `free_ponts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location` (
  `id` bigint(20) NOT NULL,
  `Region` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `district` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `locality` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `country` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,'Минская область','Дзержинский район','д.Мошница',NULL),(2,'Минская область','Дзержинский район','д.Поусье',NULL),(3,'Минская область','Дзержинский район','д.Гриньково',NULL),(4,'Минская область','Дзержинский район','д.Богушово',NULL),(5,'Минская область','Дзержинский район','д.Чики',NULL),(6,'Минская область','Дзержинский район','д.Вишневка',NULL),(7,'Минская область','Дзержинский район','д.Пеняка',NULL),(8,'Минская область','Дзержинский район','д.Старая Рудница',NULL),(9,'Минская область','Дзержинский район','аг.Волма',NULL),(10,'Минская область','Дзержинский район','д.Волмечка',NULL),(11,'Минская область','Дзержинский район','д.Гарутишки',NULL),(12,'Минская область','Дзержинский район','д.Падеричи',NULL),(13,'Минская область','Дзержинский район','д.Перетятки',NULL),(14,'Минская область','Дзержинский район','д.Садовщина',NULL),(15,'Минская область','Дзержинский район','д.Тюхаи',NULL),(16,'Минская область','Дзержинский район','д.Большая ',NULL),(17,'Минская область','Дзержинский район','д.Глуховщина',NULL),(18,'Минская область','Дзержинский район','д.Коски',NULL);
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL,
  `anons` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `data` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `full_text` varchar(1000) COLLATE utf8mb4_unicode_ci NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (1,'Сегодня состоялся аукцион по продаже земельных участков с не завершенными строительством незаконсервированными жилыми домами в Минском и Дзержинском районах','30.10.2020','Участок № 275 в д. Дроздово Боровлянского сельсовета насчитывает 14,9 сотки. Готовность жилого дома составляет 12%. Фундамент строения — железобетонный общей площадью 36 кв.м. Имеется возможность подключения к дому электричества и газа. Начальная цена на участок составила 82 134,71 руб., в том числе дома — 2 134,71. Купить участок на аукционе пожелали 28 человек. Лот продан с молотка за 343.097 руб., или 130.634 долл. США по курсу Нацбанка на день проведения аукциона.','На участок с недостроем в Дроздово подали 28 заявок. Он продан с молотка за $ 130 тыс. Результаты аукциона'),(2,'Сегодня на аукцион по продаже участков в частную собственность граждан РБ выставляли 17 лотов.','29.09.2020','Сегодня на аукцион по продаже участков в частную собственность граждан РБ выставляли 17 лотов. Торги прошли по 14. На один лот было подано одно заявление, еще на один — заявок не поступило. Один участок прямо у воды в Острошицком Городке на ул. Озерной снят с торгов.','На участок в Мацках подали 15 заявок, цена на него в ходе торгов возросла в 12 раз. Чем привлекли другие лоты на аукционе 25 сентября');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person_auc_list`
--

DROP TABLE IF EXISTS `person_auc_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person_auc_list` (
  `id` bigint(20) NOT NULL,
  `id_ponts` bigint(20) DEFAULT NULL,
  `adress` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `date` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fio` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `passport` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `telephone` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person_auc_list`
--

LOCK TABLES `person_auc_list` WRITE;
/*!40000 ALTER TABLE `person_auc_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `person_auc_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person_free_pont`
--

DROP TABLE IF EXISTS `person_free_pont`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person_free_pont` (
  `id` bigint(20) NOT NULL,
  `date` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fio` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id_ponts` bigint(20) DEFAULT NULL,
  `tel_number` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person_free_pont`
--

LOCK TABLES `person_free_pont` WRITE;
/*!40000 ALTER TABLE `person_free_pont` DISABLE KEYS */;
/*!40000 ALTER TABLE `person_free_pont` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ponts`
--

DROP TABLE IF EXISTS `ponts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ponts` (
  `id` bigint(20) NOT NULL,
  `adress` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `area` double NOT NULL,
  `cad_number` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `communications` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `costs` double NOT NULL,
  `deposit` double NOT NULL,
  `id_auction` bigint(20) DEFAULT NULL,
  `id_location` bigint(20) DEFAULT NULL,
  `initial_cost` double NOT NULL,
  `pont_number` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ponts`
--

LOCK TABLES `ponts` WRITE;
/*!40000 ALTER TABLE `ponts` DISABLE KEYS */;
INSERT INTO `ponts` VALUES (1,'д.Мошница',0.1512,'6954400330333221','газ',5000,1200,2,1,60,13),(2,'д.Поусье',0.1601,'6695440024253421','вода, Электричество',6000,1000,2,2,120,14),(3,'д.Богушово',0.1434,'6954400335637821','Электричество, Водопровод',6500,570,2,4,100,15),(4,'д.Чики',0.1312,'6954400333484092','Газ,Электриечство',4500,780,2,5,60,16),(5,'д.Вишневка',0.1454,'6954400334938823','Электричество',6000,340,2,6,80,17),(6,'д.Старая Рудница',0.1234,'6954400331399427','Электричество',6700,560,2,8,70,18),(7,'аг.Волма Площадь',0.1345,'6954400331347281','Электричество, газ',10997,1300,2,9,160,19),(8,'д.Волмечка',0.1432,'6954400330099310','Электричество, газ',4500,650,1,10,60,4),(9,'д.Гарутишки',0.129,'6954400330398403','Электричество, Водопровод',4600,780,1,11,80,5),(10,'д.Перетятки',0.1501,'6954400330390873','Электричество, Водопровод',5433,540,1,13,140,6),(11,'д.Садовщина',0.1456,'6954400330344321','Электричество, газ',4555,340,1,14,340,7),(12,'д.Тюхаи',0.1367,'6954400330344563','Электричество, Водопровод',5666,780,1,15,200,8),(13,'д.Глуховщина',0.1389,'6954400338769221','Электричество, газ',2300,900,1,17,230,9),(14,'д.Коски',0.1223,'6954400330344561','Электричество, газ',4300,1900,1,18,230,10);
/*!40000 ALTER TABLE `ponts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'spring_auctions'
--

--
-- Dumping routines for database 'spring_auctions'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-15 21:20:38
