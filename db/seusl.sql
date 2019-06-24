-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 24, 2019 at 01:09 PM
-- Server version: 5.7.19
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `seusl`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
CREATE TABLE IF NOT EXISTS `books` (
  `bookId` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL,
  `category` varchar(50) NOT NULL,
  `description` varchar(100) NOT NULL,
  `noOfCopies` varchar(20) NOT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`bookId`, `name`, `author`, `category`, `description`, `noOfCopies`) VALUES
('1111', 'Java', 'James', 'Technology', 'Programming', '220'),
('1112', 'PHP', 'Winker', 'Technology', 'Programming', '100'),
('1113', 'Steve Jobs', 'Mark Antony', 'History', 'Life of Steve Jobs', '50'),
('1114', 'Laravel', 'Venkat Ram', 'Technology', '', '100');

-- --------------------------------------------------------

--
-- Table structure for table `lend`
--

DROP TABLE IF EXISTS `lend`;
CREATE TABLE IF NOT EXISTS `lend` (
  `memberId` varchar(20) NOT NULL,
  `book` varchar(100) NOT NULL,
  `borrowDate` varchar(50) NOT NULL,
  `returnDate` varchar(50) NOT NULL,
  `lender` varchar(50) NOT NULL,
  PRIMARY KEY (`memberId`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lend`
--

INSERT INTO `lend` (`memberId`, `book`, `borrowDate`, `returnDate`, `lender`) VALUES
('1111', 'Java', '2019-04-02', '2019-05-02', 'Sajteeth');

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
CREATE TABLE IF NOT EXISTS `members` (
  `memberId` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `doa` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phoneNo` varchar(50) NOT NULL,
  PRIMARY KEY (`memberId`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`memberId`, `name`, `doa`, `gender`, `email`, `phoneNo`) VALUES
('1', 'Sajeeth', '2018-10-12', 'Male', 'sajeeth95@gmail.com', '0754545325'),
('1112', 'Safnaj', '2019-05-15', 'Male', 'safnaj96@live.com', '0777974207'),
('1113', 'Aflaj', '2018-05-12', 'Male', 'ajlak@yahoo.com', '0778767543');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`) VALUES
('admin', 'admin123'),
('safnaj', 'safnaj123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
