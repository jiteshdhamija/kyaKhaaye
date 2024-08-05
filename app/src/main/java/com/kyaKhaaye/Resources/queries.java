package com.kyaKhaaye.Resources;

public class queries {
    public static final String DIST_CUISINE_STRING = "select distinct cuisine from food;";
    public static final String DIST_COURSE_STRING = "select distinct course from food;";
    public static final String DIST_REGION_STRING = "select distinct region from food;";
    public final static String queries = "insert into food (id,dish,cuisine,beverage,hot,veg,course,region) values (1,'biryani','hyedrabadi',FALSE,TRUE,FALSE,'maincourse','Indian'),(2,'Aampapad','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(3,'Aappam','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(4,'Ada','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(5,'Anarsa','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(6,'Ariselu','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(7,'Bananachips','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(8,'Basundi','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(9,'Batatavada','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(10,'Bhaji','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(11,'Bhajia','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(12,'Bakarwadi','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(13,'Bhelpuri','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(14,'Bhoonja','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(15,'Bikaneribhujia','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(16,'Bonda','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(17,'Boondi','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(18,'AndaBhurji','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(19,'Bhurji-Paneer','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(20,'Chaat','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(21,'Cutlet','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(22,'Chakli','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(23,'ChanaJorGaram','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(24,'Chapati','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(25,'Chivda','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(26,'Cholebhature','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(27,'CholeKulche','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(28,'Dabeli','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(29,'Daldhokli','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(30,'Dahipuri','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(31,'Dahivada','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(32,'DahibaraAludam','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(33,'Dhokla','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(34,'Dosa','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(35,'Flattenedrice','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(36,'Gajarkahalwa','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(37,'Gajarkibarfi','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(38,'Ganthiya','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(39,'Gavvalu','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(40,'Ghever','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(41,'Ghugni','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(42,'Gujhia','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(43,'Gulabjamun','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(44,'Halva','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(45,'Idli','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(46,'Indian-mix','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(47,'Indianomelette','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(48,'Jalebi','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(49,'Jhalmuri','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(50,'Kachori','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(51,'Kalathappam','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(52,'Katiroll','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(53,'Kebab','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(54,'Kesari','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(55,'Khakhra','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(56,'Khaman','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(57,'Khandvi','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(58,'Kinnathappam','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(59,'Kosambari','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(60,'Laddoo','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(61,'Lukhmi','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(62,'Maddurvada','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(63,'MakkaPoha','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(64,'Malapua','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(65,'Mangalorebajji','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(66,'Masalapuri','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(67,'MirchiBajji','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(68,'Modak','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(69,'Momo','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(70,'Murukku','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(71,'Mysorepak','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(72,'MisalPav','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(73,'Namakpara','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(74,'Namkeen','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(75,'Neyyappam','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(76,'Pakora','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(77,'Pakwan','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(78,'Palappam','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(79,'Paneertikka','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(80,'Panipuri','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(81,'PapadamorPapad','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(82,'Paprichaat','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(83,'Paratha','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(84,'Parotta','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(85,'PavBhaji','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(86,'Piyaju','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(87,'Pohe','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(88,'Ponganalu','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(89,'Poornalu','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(90,'Pootharekulu','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(91,'Potatochips','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(92,'Puffedrice','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(93,'Puffs','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(94,'Punugulu','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(95,'PuranPoli','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(96,'Puri','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(97,'Puribhaji','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(98,'Ravaladdu','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(99,'Rosomelette','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(100,'Sabudanapapad','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(101,'Sabudanakhichri','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(102,'Sabudanavada','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(103,'Sakinalu','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(104,'Samosa','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(105,'Sandige','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(106,'Sandwich','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(107,'SarvaPindi','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(108,'Sevmamra','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(109,'Shankarpali','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(110,'Shrikhand','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(111,'Tele-bhaja','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(112,'ThaliPeeth','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(113,'Upma','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(114,'Vadapav','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(115,'Vadai','indian',FALSE,FALSE,TRUE,'snacks','Indian'),(116,'Machher Jhol','east indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(117,'Pork jarpaa jurpie','east indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(118,'Chak-Hao Kheer','east indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(119,'Galho','east indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(120,'Achari baingan','east indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(121,'Aloo gobi','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(122,'Aloo tikki','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(123,'Aloo tuk','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(124,'Aloo matar','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(125,'Aloo kulcha','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(126,'Aloo methi','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(127,'Aloo shimla mirch','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(128,'Amriti with rabdi','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(129,'Talit Macchi','north indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(130,'Baati','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(131,'Bhatura','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(132,'Bhindi masala','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(133,'Butter chicken','north indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(134,'Chaat','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(135,'Chana masala','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(136,'Chapati','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(137,'Chicken razala','north indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(138,'Chicken Tikka','north indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(139,'Chicken Tikka masala','north indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(140,'Chole bhature','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(141,'Daal baati churma','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(142,'Daal puri','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(143,'Dal makhani (kali dal)','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(144,'Dal fara','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(145,'Dal','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(146,'Dal fry with tadka','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(147,'Dum aloo','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(148,'Poha','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(149,'Fara','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(150,'phirni','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(151,'Aloo Phalliyaan','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(152,'Gajar Pak[2]','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(153,'Gajar matar aloo','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(154,'Gobhi matar','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(155,'Imarti','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(156,'Hari mutter ka nimona (green peas daal)','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(157,'Jalebi','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(158,'Jaleba','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(159,'Kachori','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(160,'Kadai paneer','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(161,'Kadhi pakoda','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(162,'Karela bharta','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(163,'Katha meetha petha / kaddu halwa','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(164,'Kheer','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(165,'Khichdi','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(166,'Kadhi and Khichdi','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(167,'Kofta','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(168,'Kulfi falooda','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(169,'Laapsi','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(170,'Lauki ke kofte','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(171,'Lauki ki bhaaji','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(172,'Litti chokha','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(173,'Makhaan ka kheer','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(174,'Makki ki roti, sarson ka saag','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(175,'Mathura ke pede','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(176,'Methi saag, chaulai saag','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(177,'Millet Lapsi','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(178,'Missi roti','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(179,'Mixed vegetable','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(180,'Moong dal ki Lapsi','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(181,'Murgh musallam','north indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(182,'Mushroom do pyaza (Kanda Khumb)','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(183,'Mushroom matar (Matar Khumb)','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(184,'Naan','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(185,'Navrattan korma','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(186,'Pakhala','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(187,'Palak paneer','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(188,'Paneer butter masala','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(189,'Paneer tikka masala','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(190,'Pani puri','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(191,'Panjeeri','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(192,'Papad','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(193,'Paratha','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(194,'Pattor','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(195,'Pinni','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(196,'Rajma chaval','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(197,'Rajma','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(198,'Ramatori bhaaji','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(199,'Lobiya','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(200,'Samosa','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(201,'Samose','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(202,'Sattu ki roti','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(203,'Rajwadi Chhena/Paneer[4]','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(204,'Shahi tukra','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(205,'Singhada Lapsi','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(206,'Sooji halwa (Suji Lapsi)','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(207,'Sweet pethas / kesar petha / pista petha','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(208,'Vegetable jalfrezi','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(209,'Tandoori Chicken','north indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(210,'Tamatar Chaat','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(211,'Tandoori Fish Tikka','north indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(212,'ananas menaskai','north indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(213,'Attu','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(214,'Aval kesari','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(215,'Avial','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(216,'Baida roti','south indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(217,'Halwa','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(218,'Bhajji','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(219,'Biryani','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(220,'Bisi bele bath (Karnataka)','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(221,'Bonda','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(222,'Chettinadu Chicken','south indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(223,'Chicken 65','south indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(224,'Currivepillai sadam (Tamil Nadu)','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(225,'Dibba rotti','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(226,'Dosa','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(227,'Double ka meetha','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(228,'Ennai kathirikkai','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(229,'Goli bajje','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(230,'Hyderabadi biryani','south indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(231,'Idiyappam','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(232,'Idli','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(233,'Indian omelette','south indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(234,'Kaara kozhambu (Tamil Nadu)','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(235,'Kanji','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(236,'Keerai koottu (Tamil Nadu)','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(237,'Keerai masiyal','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(238,'Keerai poriyal','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(239,'Keerai sadam (Tamil Nadu)','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(240,'Kerala Beef Fry','south indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(241,'Kodubale','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(242,'kolhapuri akkha masoor Dal','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(243,'Koottu','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(244,'Kori rotti','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(245,'Kos kootu','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(246,'Koshambri','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(247,'Kothamali sadam','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(248,'Kuzhakkattai','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(249,'Kuzhambu','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(250,'Masala Dosa','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(251,'Nandu omelette','south indian',FALSE,TRUE,FALSE,'maincourse','Indian'),(252,'Obbattu (holige, bobbattu, pooran-poli)','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(253,'Olan (dish)','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(254,'Pachadi','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(255,'Paniyaram, Paddu, Gunthapangnalu','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(256,'Papadum','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(257,'Paravannam','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(258,'Parotta','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(259,'Paruppu sadam','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(260,'Payasam','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(261,'Pesarattu','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(262,'Pongal','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(263,'Poriyal','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(264,'Puli sadam, Puliogre, Puliohara','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(265,'Puttu','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(266,'Ragi mudhe, Kali','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(267,'Rasam','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(268,'Sajjige','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(269,'Sakkara pongal','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(270,'Sambar','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(271,'Sandige (Karnataka),Vattral','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(272,'Sevai','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(273,'Sponge dosa','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(274,'Thattai','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(275,'Thayir sadam, mosaranna, perugannam','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(276,'Theeyal','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(277,'Thengai sadam','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(278,'Uttapam Tamil Nadu','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(279,'Vada','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(280,'Varuval','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(281,'Wheat upma, Uppittu','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(282,'Yelumicham sadam, chitranna','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(283,'Amti','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(284,'Bajri no rotlo','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(285,'Batata Saung','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(286,'Barfi','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(287,'Basundi','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(288,'Bhakri','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(289,'Bombil fry','gujrati',FALSE,TRUE,FALSE,'maincourse','Indian'),(290,'Chevdo','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(291,'Cholafali','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(292,'Chorafali','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(293,'Daal Dhokli','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(294,'Dabeli','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(295,'Dahi vada','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(296,'Dalithoy','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(297,'Dhokla','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(298,'Doodhpak','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(299,'Dudhi no halwo','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(300,'dudhi muthiya','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(301,'Dum aaloo','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(302,'Gajar halwo','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(303,'Gatta curry','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(304,'Ghari (sweet from Surat)','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(305,'Ghooghra','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(306,'Gud papdi (Gol papdi)','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(307,'Gulab jamun','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(308,'Halvasan','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(309,'Handwo (steamed dish)','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(310,'Gur','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(311,'Jeera Aloo','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(312,'Juvar no rotlo','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(313,'Kansar','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(314,'Karanji','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(315,'Keri no ras','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(316,'Khakhra','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(317,'Khandvi','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(318,'Kombdi vade','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(319,'Kopra paak','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(320,'Koshimbir','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(321,'Kolim / Jawla','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(322,'Laddu','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(323,'Locha','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(324,'Malpua','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(325,'Methi na Gota','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(326,'Modak','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(327,'Mohanthal','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(328,'Chakri (chakali)','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(329,'Muthiya','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(330,'Naralachi vadi / Khobryachi vadi / Coconut vadi','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(331,'Oondees','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(332,'Panipuri','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(333,'Patra','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(334,'Pav Bhaji','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(335,'Penda','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(336,'Pooran-poli','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(337,'Poori','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(338,'Puri Bhaji','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(339,'Rasya muthia','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(340,'Sabudana Khichadi','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(341,'Saath','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(342,'Sev khamani','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(343,'Sev tameta','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(344,'Shakarpara','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(345,'Namakpara','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(346,'Shankarpali','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(347,'Shiro','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(348,'Shrikhand','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(349,'Sohan papdi','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(350,'Soonvali','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(351,'Sukhdi','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(352,'Surnoli','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(353,'Sutarfeni','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(354,'Thalipeeth','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(355,'Thepla','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(356,'Undhiyu','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(357,'Upmaa','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(358,'Vada pav','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(359,'Veg Kolhapuri','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(360,'Vindaloo','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(361,'Ghebar or Ghevar','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(362,'Lilva Kachori','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(363,'Maghaz','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(364,'Mag Dhokli','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(365,'Khichu','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(366,'Farsi Puri','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(367,'Khaman','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(368,'Turiya Patra Vatana sabji','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(369,'Mohan thaal','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(370,'Churma Ladoo','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(371,'Zunka or Pitla','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(372,'Cheera Doi','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(373,'Daab chingri','gujrati',FALSE,TRUE,FALSE,'maincourse','Indian'),(374,'Dhup Pitha','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(375,'Gheela Pitha','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(376,'Hurum','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(377,'Khar','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(378,'Kumol Sawul','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(379,'Loskora (Coconut Laddu)','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(380,'Luchi (food)|Luchi','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(381,'Malpua/Malpoa','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(382,'Momo','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(383,'Muri Naaru','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(384,'Pani Tenga','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(385,'Sunga Pitha','gujrati',FALSE,TRUE,TRUE,'maincourse','Indian'),(386,'Alu Pitika','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(387,'Masor tenga','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(388,'Bengena Pitika','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(389,'Bilahi Maas','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(390,'Black rice','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(391,'Bora Sawul','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(392,'Brown Rice','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(393,'Chhenagaja','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(394,'Chhenapoda','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(395,'Chingri malai curry','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(396,'Goja','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(397,'Hando Guri','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(398,'Haq Maas','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(399,'Horioh Maas','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(400,'Ilish or Chingri Bhape','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(401,'Kabiraji','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(402,'Kharoli','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(403,'Khorisa','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(404,'Koldil Chicken','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(405,'Koldil Duck','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(406,'Konir Dom','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(407,'Lai Haq Maas','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(408,'Litti','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(409,'Maasor Tenga','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(410,'Machher Jhol','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(411,'Masor Koni','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(412,'Masor Petu','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(413,'Mishti Chholar Dal','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(414,'Mishti Doi','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(415,'Ou tenga Maas','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(416,'Bhaji','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(417,'Pani Pitha','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(418,'Pantua','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(419,'Payokh','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(420,'Peda','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(421,'Prawn malai curry','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(422,'Red Rice','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(423,'Rice','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(424,'Rasagola/Roshogolla','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(425,'Shondesh','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(426,'Shukto','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(427,'Sunga Pork','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(428,'Tenga Doi','south indian',FALSE,TRUE,TRUE,'maincourse','Indian'),(429,'Til Pitha','south indian',FALSE,TRUE,TRUE,'maincourse','Indian');";

}
