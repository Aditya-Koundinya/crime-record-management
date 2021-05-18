-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 24, 2021 at 08:21 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` varchar(20) NOT NULL,
  `password` varchar(45) NOT NULL,
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `password`, `name`) VALUES
('ad-006', 'adi123', 'aditya'),
('ad-017', 'bhu123', 'bhuvan');

-- --------------------------------------------------------

--
-- Table structure for table `court`
--

CREATE TABLE `court` (
  `id_court` varchar(20) NOT NULL,
  `password` varchar(45) NOT NULL,
  `id_prisoner` varchar(20) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `last_hearing_date` varchar(20) DEFAULT NULL,
  `next_hearing_date` varchar(20) DEFAULT NULL,
  `sentence` varchar(100) DEFAULT NULL,
  `status` varchar(20) DEFAULT 'Pending',
  `id_victim` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `court`
--

INSERT INTO `court` (`id_court`, `password`, `id_prisoner`, `name`, `last_hearing_date`, `next_hearing_date`, `sentence`, `status`, `id_victim`) VALUES
('1', '123', 'pr-7865', 'abhi', '2000-05-10', '2004-05-24', 'asmdsdf', 'comple', '123'),
('1', '123', 'pr-7866', 'abhi', '2000-02-10', '2000-04-10', NULL, 'Pending', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `crime`
--

CREATE TABLE `crime` (
  `id_crime` varchar(20) NOT NULL,
  `crime_type` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `crime`
--

INSERT INTO `crime` (`id_crime`, `crime_type`) VALUES
('cr-1028', 'personal crime'),
('cr-1029', 'property crime'),
('cr-1030', 'satutory crime'),
('cr-1031', 'financial crime'),
('cr-1032', 'inchoate crime'),
('cr-1033', 'traffic offence');

-- --------------------------------------------------------

--
-- Table structure for table `fir`
--

CREATE TABLE `fir` (
  `id_FIR` int(11) NOT NULL,
  `FIR_desc` varchar(100) DEFAULT NULL,
  `FIR_date` date DEFAULT NULL,
  `id_police` varchar(45) DEFAULT NULL,
  `id_crime` varchar(45) DEFAULT NULL,
  `id_victim` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fir`
--

INSERT INTO `fir` (`id_FIR`, `FIR_desc`, `FIR_date`, `id_police`, `id_crime`, `id_victim`) VALUES
(123, '123', '2000-02-12', 'po-5824', 'cr-1028', '123'),
(1234, 'qertert', '2000-05-04', 'po-5827', 'cr-1033', '11234');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id_login` varchar(20) DEFAULT NULL,
  `time` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id_login`, `time`) VALUES
('1', '2021-01-22 11:47:03'),
('1', '2021-01-22 11:48:26'),
('1', '2021-01-22 11:49:42'),
('1', '2021-01-22 11:50:33'),
('1', '2021-01-22 11:55:26'),
('1', '2021-01-22 11:56:58'),
('1', '2021-01-22 11:58:59'),
('1', '2021-01-22 12:00:07'),
('1', '2021-01-22 12:04:24'),
('1', '2021-01-22 12:05:31'),
('po-5827', '2021-01-22 12:24:06'),
('po-5827', '2021-01-22 12:27:28'),
('po-5827', '2021-01-22 12:29:20'),
('po-5827', '2021-01-22 12:31:11'),
('po-5827', '2021-01-22 12:31:32'),
('po-5827', '2021-01-22 12:32:54'),
('po-5827', '2021-01-22 12:34:16'),
('123', '2021-01-22 13:46:27'),
('123', '2021-01-22 17:55:10'),
('po-5827', '2021-01-22 17:55:46'),
('po-5827', '2021-01-22 18:25:47'),
('123', '2021-01-22 18:27:29'),
('1', '2021-01-22 18:28:01');

-- --------------------------------------------------------

--
-- Table structure for table `police`
--

CREATE TABLE `police` (
  `id_police` varchar(20) NOT NULL,
  `password` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `mob_no` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `police`
--

INSERT INTO `police` (`id_police`, `password`, `name`, `address`, `gender`, `mob_no`) VALUES
('1234', 'asdfa', '4567', 'sdfasd', '123412', 'sadfasf'),
('po-5824', 'police5824', 'hooper', 'NY', 'M', '7930148526'),
('po-5825', 'police5825', 'jim', 'NY', 'M', '7256813490'),
('po-5826', 'police5826', 'jill', 'nevada', 'F', '8632541079'),
('po-5827', 'police5827', 'hotch', 'nevada', 'M', '8652310479'),
('po-5828', 'police5828', 'gedion', 'nevada', 'M', '8654103297'),
('po-5829', 'police5829', 'jenifer', 'minisoda', 'F', '7563218049'),
('po-5830', 'police5830', 'kenny', 'minisoda', 'F', '7569840123'),
('po-5831', 'police5831', 'peter', 'ohio', 'M', '8963254107'),
('po-5832', 'police5832', 'gracia', 'ohio', 'F', '8974521036'),
('po-5833', 'police5833', 'rick', 'DC', 'M', '1405236987'),
('po-5834', 'police5834', 'spencer', 'NY', 'M', '7935864012'),
('po-5835', 'police5835', 'sansa', 'NY', 'F', '7298563410');

-- --------------------------------------------------------

--
-- Table structure for table `prisoner`
--

CREATE TABLE `prisoner` (
  `id_prisoner` varchar(20) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `mob_no` varchar(20) DEFAULT NULL,
  `id_crime` varchar(45) DEFAULT NULL,
  `id_police` varchar(45) DEFAULT NULL,
  `id_fir` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prisoner`
--

INSERT INTO `prisoner` (`id_prisoner`, `name`, `gender`, `mob_no`, `id_crime`, `id_police`, `id_fir`) VALUES
('pr-7865', 'peralta', 'M', '123654', 'cr-1029', 'po-5827', 123),
('pr-7866', 'jake', 'M', '789365214', 'cr-1031', 'po-5827', NULL),
('pr-7867', 'amy', 'F', '789385214', 'cr-1033', 'po-5827', NULL),
('pr-7868', 'jhonny', 'M', '789741254', 'cr-1028', 'po-5828', NULL),
('pr-7869', 'ben', 'M', '785987254', 'cr-1030', 'po-5828', NULL),
('pr-7870', 'kenny', 'F', '785258634', 'cr-1033', 'po-5828', NULL),
('pr-7871', 'penny', 'F', '785741234', 'cr-1031', 'po-5829', NULL),
('pr-7872', 'bernie', 'F', '785747412', 'cr-1028', 'po-5829', NULL),
('pr-7873', 'bert', 'M', '785747531', 'cr-1032', 'po-5829', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `victim`
--

CREATE TABLE `victim` (
  `id_victim` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `mob_no` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `victim`
--

INSERT INTO `victim` (`id_victim`, `password`, `name`, `address`, `gender`, `mob_no`) VALUES
('11234', '256', 'adfgsdfg', 'dfgaEQ', 'dhjdghj', '4758'),
('123', '123', '123', '123', '123', '123'),
('1234', '1234', 'dfgfdj', 'sfgcx', 'bfgh', '1234'),
('1234', '2345', 'fdkj', 'kglgiu', 'luio', '3456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`,`password`);

--
-- Indexes for table `court`
--
ALTER TABLE `court`
  ADD PRIMARY KEY (`id_court`,`password`,`id_prisoner`) USING BTREE,
  ADD KEY `id_prisoner` (`id_prisoner`),
  ADD KEY `id_victim` (`id_victim`);

--
-- Indexes for table `crime`
--
ALTER TABLE `crime`
  ADD PRIMARY KEY (`id_crime`);

--
-- Indexes for table `fir`
--
ALTER TABLE `fir`
  ADD PRIMARY KEY (`id_FIR`),
  ADD KEY `id_police` (`id_police`),
  ADD KEY `id_user` (`id_victim`),
  ADD KEY `id_crime` (`id_crime`);

--
-- Indexes for table `police`
--
ALTER TABLE `police`
  ADD PRIMARY KEY (`id_police`,`password`);

--
-- Indexes for table `prisoner`
--
ALTER TABLE `prisoner`
  ADD PRIMARY KEY (`id_prisoner`) USING BTREE,
  ADD KEY `id_crime` (`id_crime`),
  ADD KEY `id_police` (`id_police`),
  ADD KEY `id_fir` (`id_fir`);

--
-- Indexes for table `victim`
--
ALTER TABLE `victim`
  ADD PRIMARY KEY (`id_victim`,`password`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `court`
--
ALTER TABLE `court`
  ADD CONSTRAINT `court_ibfk_1` FOREIGN KEY (`id_prisoner`) REFERENCES `prisoner` (`id_prisoner`) ON DELETE CASCADE,
  ADD CONSTRAINT `court_ibfk_2` FOREIGN KEY (`id_victim`) REFERENCES `victim` (`id_victim`);

--
-- Constraints for table `fir`
--
ALTER TABLE `fir`
  ADD CONSTRAINT `fir_ibfk_1` FOREIGN KEY (`id_police`) REFERENCES `police` (`id_police`) ON DELETE CASCADE,
  ADD CONSTRAINT `fir_ibfk_2` FOREIGN KEY (`id_crime`) REFERENCES `crime` (`id_crime`) ON DELETE CASCADE,
  ADD CONSTRAINT `fir_ibfk_3` FOREIGN KEY (`id_victim`) REFERENCES `victim` (`id_victim`) ON DELETE CASCADE;

--
-- Constraints for table `prisoner`
--
ALTER TABLE `prisoner`
  ADD CONSTRAINT `prisoner_ibfk_3` FOREIGN KEY (`id_crime`) REFERENCES `crime` (`id_crime`) ON DELETE CASCADE,
  ADD CONSTRAINT `prisoner_ibfk_4` FOREIGN KEY (`id_police`) REFERENCES `police` (`id_police`) ON DELETE CASCADE,
  ADD CONSTRAINT `prisoner_ibfk_5` FOREIGN KEY (`id_fir`) REFERENCES `fir` (`id_FIR`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
