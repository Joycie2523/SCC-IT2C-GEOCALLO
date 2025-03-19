-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 07, 2025 at 07:00 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `geocallo`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(11) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone_number` varchar(15) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `email`, `phone_number`, `u_username`, `u_password`, `u_type`, `u_status`) VALUES
(10, 'eme', 'geocallo', 'emerald25@gmail.com', '09382295133', 'jeje112', '12345678', 'user', 'Active'),
(11, 'Camille ', 'Geocallo', 'geocallocamillejoyce72@gmail.com', '09382295133', 'joyce2523', '01252023', 'Admin', 'Active'),
(12, 'Joyce', 'Geocallo', 'geocallo@gmail.com', '09372295133', 'geocallo25', 'geocallo123', 'Admin', 'Active'),
(13, 'Mylene', 'Naay tililing', 'mylene@gmail.com', '09382295133', 'mylene123', 'kapoyaaa', 'user', 'Active'),
(14, 'Rica', 'Patenio', 'patenio@gmail.com', '09382205133', 'patenio00', '12345678', 'Admin', 'Active'),
(15, 'Hello', 'World', 'hello@gmail.com', '09382295133', 'hello123', '12345678', 'user', 'Pending'),
(16, 'dfgdfsg', 'dfsfg', 'fgdsdfg', '65745678578', 'sdfgsf', 'dsfgsdrytrtfgbfh', 'user', 'Pending'),
(17, 'test', 'test', 'test', '45674646456', 'test', 'testtest', 'user', 'Active'),
(18, 'rica', 'patenio', 'rica@gmail.com', '09372295144', 'patenio123', '12345678', 'Admin', 'Active'),
(19, 'amboottt', 'nimooo', 'amboot@gmail.com', '097287653', 'ambot123', 'ambotnimo123', 'Admin', 'Pending'),
(20, 'kapoyaa', 'najudd', 'kapoyaa', '99999999', 'kapoyaa5', '01252023', 'Admin', 'Active'),
(21, 'mm', 'mm', 'ww', '1234567889', 'wwwww', '123456678', 'user', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
