-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 06, 2020 at 09:09 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `busmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `bus_details`
--

CREATE TABLE `bus_details` (
  `id` int(20) NOT NULL,
  `bus_no` varchar(30) NOT NULL,
  `bus_type` varchar(30) NOT NULL,
  `min_charge` double NOT NULL,
  `seat_no` int(20) NOT NULL,
  `depot` varchar(30) NOT NULL,
  `child_fare` int(20) NOT NULL,
  `adult_fare` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus_details`
--

INSERT INTO `bus_details` (`id`, `bus_no`, `bus_type`, `min_charge`, `seat_no`, `depot`, `child_fare`, `adult_fare`) VALUES
(1, 'MH 09 EA 4325', 'Normal', 1000, 30, 'Gargoti', 50, 80),
(2, 'MH 09 CA 3116', 'Normal', 1000, 30, 'Gargoti', 70, 90),
(3, 'MH 09 BA 8539', 'Ac', 10000, 40, 'Gargoti', 250, 380);

-- --------------------------------------------------------

--
-- Table structure for table `bus_stop`
--

CREATE TABLE `bus_stop` (
  `id` int(20) NOT NULL,
  `route_no` varchar(20) NOT NULL,
  `stop_no` int(20) NOT NULL,
  `stop_name` varchar(30) NOT NULL,
  `fare_stage` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus_stop`
--

INSERT INTO `bus_stop` (`id`, `route_no`, `stop_no`, `stop_name`, `fare_stage`) VALUES
(1, 'NH 4', 10, 'Mudal', 'Yes'),
(2, 'AH 1', 5, 'Kolhapur', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `dob` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `designatio` varchar(30) NOT NULL,
  `mob` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `name`, `dob`, `address`, `designatio`, `mob`, `gender`) VALUES
(1, 'rajan', '1998-05-10', 'Donwade', 'Driver', '9923067058', 'Male'),
(2, 'sapna', '2000-03-09', 'Gargoti', 'Conductor', '9168717058', 'Female'),
(3, 'rupali ', '1999-03-10', 'kolhapur', 'Conductor', '9923063913', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `route_info`
--

CREATE TABLE `route_info` (
  `id` int(11) NOT NULL,
  `route_no` varchar(30) DEFAULT NULL,
  `no_of_stop` int(11) DEFAULT NULL,
  `fare_stage` float DEFAULT NULL,
  `start` varchar(30) DEFAULT NULL,
  `stop` varchar(30) DEFAULT NULL,
  `start_time` varchar(30) DEFAULT NULL,
  `stop_time` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `route_info`
--

INSERT INTO `route_info` (`id`, `route_no`, `no_of_stop`, `fare_stage`, `start`, `stop`, `start_time`, `stop_time`) VALUES
(1, 'NH 4', 10, 10, 'Gargoti', 'Kolhapur', '6.00 AM', '7.30 AM'),
(2, 'NH 3', 5, 10, 'Gargoti', 'Kolhapur', '8.00 AM', '9.30 AM'),
(3, 'NH 4', 15, 20, 'Gargoti', 'Kolhapur', '7.00 PM', '5.00 AM'),
(4, 'AH 1', 10, 10, 'Gargoti', 'Kadgaon', '10.00 AM', '11.15 AM'),
(5, 'NH 4', 10, 10, 'Gargoti', 'Pune', '10.00 PM', '4.00 AM');

-- --------------------------------------------------------

--
-- Table structure for table `schedual`
--

CREATE TABLE `schedual` (
  `id` int(20) NOT NULL,
  `emp_name` varchar(30) NOT NULL,
  `bus_no` varchar(30) NOT NULL,
  `date` varchar(30) NOT NULL,
  `route_no` varchar(30) NOT NULL,
  `amount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schedual`
--

INSERT INTO `schedual` (`id`, `emp_name`, `bus_no`, `date`, `route_no`, `amount`) VALUES
(1, 'rajan', 'MH 09 CA 3116', '2020-03-19', 'NH 4', 20000),
(2, 'sapna', 'MH 09 CA 3116', '2020-03-19', 'NH 4', 30000);

-- --------------------------------------------------------

--
-- Table structure for table `trip_info`
--

CREATE TABLE `trip_info` (
  `id` int(20) NOT NULL,
  `route_no` varchar(30) NOT NULL,
  `bus_no` varchar(30) NOT NULL,
  `start_time` varchar(30) NOT NULL,
  `stop_time` varchar(30) NOT NULL,
  `amount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trip_info`
--

INSERT INTO `trip_info` (`id`, `route_no`, `bus_no`, `start_time`, `stop_time`, `amount`) VALUES
(1, 'NH 4', 'MH 09 EA 4325', '10.00 AM', '12.00 PM', 3000),
(2, 'NH 3', 'MH 09 BA 8539', '10.00 AM', '12.00 AM', 5000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bus_details`
--
ALTER TABLE `bus_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bus_stop`
--
ALTER TABLE `bus_stop`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `route_info`
--
ALTER TABLE `route_info`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `schedual`
--
ALTER TABLE `schedual`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `trip_info`
--
ALTER TABLE `trip_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bus_details`
--
ALTER TABLE `bus_details`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `bus_stop`
--
ALTER TABLE `bus_stop`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `route_info`
--
ALTER TABLE `route_info`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `schedual`
--
ALTER TABLE `schedual`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `trip_info`
--
ALTER TABLE `trip_info`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
