-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 26, 2019 at 10:14 AM
-- Server version: 5.7.19
-- PHP Version: 5.6.31

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
  `isbn` varchar(40) NOT NULL,
  `author` varchar(100) NOT NULL,
  `category` varchar(50) NOT NULL,
  `description` varchar(100) NOT NULL,
  `noOfCopies` varchar(20) NOT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`bookId`, `name`, `isbn`, `author`, `category`, `description`, `noOfCopies`) VALUES
('1111', 'Java', '', 'James', 'Technology', 'Programming', '220'),
('1112', 'PHP', '', 'Winker', 'Technology', 'Programming', '100'),
('1113', 'Steve Jobs', '', 'Mark Antony', 'History', 'Life of Steve Jobs', '50'),
('1115', 'Angular', '434564', 'google', 'Technology', 'Programing', '200'),
('1116', 'Laravel', '4567876', 'Winson', 'Technology', 'Programming', '40');

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
('1115', 'Java', '2019-05-15', '2019-06-20', 'Sajeeth'),
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
  `type` varchar(255) NOT NULL,
  `grade` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  PRIMARY KEY (`memberId`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`memberId`, `name`, `doa`, `gender`, `email`, `phoneNo`, `type`, `grade`, `address`) VALUES
('1', 'Sajeeth', '2018-10-12', 'Male', 'sajeeth95@gmail.com', '0754545325', 'Teacher', '12', 'Maruthamunai'),
('1112', 'Safnaj', '2019-05-15', 'Male', 'safnaj96@live.com', '0777974207', '', '', ''),
('1113', 'Aflaj', '2018-05-12', 'Male', 'ajlak@yahoo.com', '0778767543', '', '', ''),
('1114', 'Shara', '2018-08-14', 'Female', 'shara@gmail.com', '0779742076', '', '', ''),
('1115', 'Perera', '2019-05-15', 'Male', 'perarahc@gmail.com', '0713443213', 'Student', '10', 'Ampara'),
('1116', 'Hanan', '2018-04-12', 'Male', 'hanan@live.com', '0756765675', 'Student', '11', 'Maruthamunai');

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
('safnaj', 'safnaj123'),
('sajeeth', '1234');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
