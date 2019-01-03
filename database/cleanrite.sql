-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 07, 2014 at 05:35 PM
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cleanrite`
--
CREATE DATABASE `cleanrite` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `cleanrite`;

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE IF NOT EXISTS `bank` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bank_name` varchar(50) NOT NULL,
  `branch_name` varchar(50) NOT NULL,
  `acc_no` varchar(20) NOT NULL,
  `open_bal` double NOT NULL,
  `process` varchar(15) NOT NULL,
  `amt` double NOT NULL,
  `closing_bal` double NOT NULL,
  `date` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `bank`
--

INSERT INTO `bank` (`id`, `bank_name`, `branch_name`, `acc_no`, `open_bal`, `process`, `amt`, `closing_bal`, `date`) VALUES
(1, 'access', 'ibara', '2091826553', 0, 'deposit', 10000, 10000, '07-Jul-2014'),
(3, 'access', 'ibara', '2091826553', 10000, 'withdraw', 1000, 9000, '07-Jul-2014'),
(4, 'ecobank', 'panseke', '2035344526', 0, 'deposit', 50000, 50000, '07-Jul-2014');

-- --------------------------------------------------------

--
-- Table structure for table `bill_record`
--

CREATE TABLE IF NOT EXISTS `bill_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bill_no` varchar(30) NOT NULL,
  `cusid` varchar(30) NOT NULL,
  `main_total` double NOT NULL,
  `discount` double NOT NULL,
  `urgent` double NOT NULL,
  `total` double NOT NULL,
  `advance` double NOT NULL,
  `balance` double NOT NULL,
  `date` varchar(30) NOT NULL,
  `delivery_date` varchar(30) NOT NULL,
  `status` varchar(50) NOT NULL DEFAULT 'Not Ready to Deploy',
  `cancel` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `bill_record`
--

INSERT INTO `bill_record` (`id`, `bill_no`, `cusid`, `main_total`, `discount`, `urgent`, `total`, `advance`, `balance`, `date`, `delivery_date`, `status`, `cancel`) VALUES
(5, '1', 'CLNRITE 03', 4000, 248, 100, 3852, 0, 3852, '04-Jul-2014', '06-Jul-2014', 'Not Ready to Deploy', 0);

-- --------------------------------------------------------

--
-- Table structure for table `cancel_bill`
--

CREATE TABLE IF NOT EXISTS `cancel_bill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bill_no` int(20) NOT NULL,
  `reason` text NOT NULL,
  `total` double NOT NULL,
  `advance` double NOT NULL,
  `balance` double NOT NULL,
  `date` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `cancel_bill`
--

INSERT INTO `cancel_bill` (`id`, `bill_no`, `reason`, `total`, `advance`, `balance`, `date`) VALUES
(1, 4, 'just for testing', 1720, 1600, 100, '06-Jul-2014');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'Washing'),
(2, 'Ironing');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE IF NOT EXISTS `item` (
  `productCat` text NOT NULL,
  `productName` text NOT NULL,
  `productPrice` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`productCat`, `productName`, `productPrice`) VALUES
('Ironing Only', 'blanket', 500),
('Ammendment', 'shirt', 200),
('Washing', 'bedsheet', 400),
('Washing', 'shirt', 200),
('Laundry', 'top', 100);

-- --------------------------------------------------------

--
-- Table structure for table `loginpage`
--

CREATE TABLE IF NOT EXISTS `loginpage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` varchar(255) NOT NULL,
  `FirstName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) DEFAULT NULL,
  `Address` varchar(255) NOT NULL,
  `Phone` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `Usertype` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `loginpage`
--

INSERT INTO `loginpage` (`id`, `userid`, `FirstName`, `LastName`, `Address`, `Phone`, `username`, `password`, `Usertype`) VALUES
(1, '0001', 'tosin', 'tosyn', 'tosyn str', '080284tosin', 'damilola', 'damilola', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `order_record`
--

CREATE TABLE IF NOT EXISTS `order_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cusid` varchar(30) NOT NULL,
  `catid` varchar(30) NOT NULL,
  `service_type` varchar(30) NOT NULL,
  `level` varchar(30) NOT NULL,
  `unit_price` double NOT NULL,
  `qty` int(11) NOT NULL,
  `bill_no` varchar(30) NOT NULL,
  `date` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `order_record`
--

INSERT INTO `order_record` (`id`, `cusid`, `catid`, `service_type`, `level`, `unit_price`, `qty`, `bill_no`, `date`) VALUES
(8, 'CLNRITE 03', 'Laundry', 'top', 'MEDIUM', 100, 2, '1', '04-Jul-2014'),
(7, 'CLNRITE 03', 'Ironing Only', 'blanket', 'LOW', 500, 6, '1', '04-Jul-2014'),
(6, 'CLNRITE 03', 'Washing', 'shirt', 'HIGH', 200, 4, '1', '04-Jul-2014');

-- --------------------------------------------------------

--
-- Table structure for table `update_payment`
--

CREATE TABLE IF NOT EXISTS `update_payment` (
  `id` int(234) NOT NULL AUTO_INCREMENT,
  `bill_no` varchar(10) NOT NULL,
  `amt` double NOT NULL,
  `balance` double NOT NULL,
  `date` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `update_payment`
--

INSERT INTO `update_payment` (`id`, `bill_no`, `amt`, `balance`, `date`) VALUES
(8, '1', 3000, 852, '06-Jul-2014');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `cusid` text NOT NULL,
  `Name` text NOT NULL,
  `Address` text NOT NULL,
  `mobileNo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`cusid`, `Name`, `Address`, `mobileNo`) VALUES
('CLNRITE 02', 'Onasoga Tolu', 'Adatan', '08034490154'),
('CLNRITE 03', 'Olusola', 'adatan line', '08045678345'),
('CLNRITE 04', 'kabira', '12,Araokami street', '09096030696'),
('CLNRITE 05', 'risikat', '10, Isolo road off ite-oba road', '08033297865');

-- --------------------------------------------------------

--
-- Table structure for table `voucher`
--

CREATE TABLE IF NOT EXISTS `voucher` (
  `id` int(22) NOT NULL AUTO_INCREMENT,
  `No` int(22) NOT NULL,
  `date` varchar(50) NOT NULL,
  `job_title` varchar(50) NOT NULL,
  `payee` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `process` varchar(30) NOT NULL,
  `amt` double NOT NULL,
  `means` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `voucher`
--

INSERT INTO `voucher` (`id`, `No`, `date`, `job_title`, `payee`, `description`, `process`, `amt`, `means`) VALUES
(2, 2, '06/07/14', 'Payment', 'damilola', 'on balance of item', 'income', 40000, 'cash'),
(3, 3, '06/07/14', 'worker', 'damilola', 'salary', 'expense', 5000, 'cash');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
