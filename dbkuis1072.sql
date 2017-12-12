-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 12, 2017 at 03:47 PM
-- Server version: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbkuis1072`
--

-- --------------------------------------------------------

--
-- Table structure for table `cv_1072`
--

CREATE TABLE `cv_1072` (
  `id_cv` bigint(20) NOT NULL,
  `agama` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `jenis_kelamin` varchar(255) DEFAULT NULL,
  `nama` varchar(100) NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tempat_tanggal_lahir` varchar(255) DEFAULT NULL,
  `id_nilai` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cv_1072`
--

INSERT INTO `cv_1072` (`id_cv`, `agama`, `alamat`, `jenis_kelamin`, `nama`, `status`, `tempat_tanggal_lahir`, `id_nilai`) VALUES
(1, 'Islam', 'Bukit Tinggi', 'Perempuan', 'Ulfa Hanum', 'Mahasiswa', 'Bukit Tinggi 09 Desember 1996', 1),
(2, 'Islam', 'Duri', 'Perempuan', 'Isti Nurhalimah', 'Mahasiswa', 'Dumai 20 Juli 1997', 2),
(3, 'Islam', 'Padang Panjang', 'Perempuan', 'Shella Marshelina', 'Mahasiswa', 'Bukit Tinggi 12 Agustus 1997', 3);

-- --------------------------------------------------------

--
-- Table structure for table `nilai_1072`
--

CREATE TABLE `nilai_1072` (
  `id_nilai` bigint(20) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `nilai` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nilai_1072`
--

INSERT INTO `nilai_1072` (`id_nilai`, `nama`, `nilai`) VALUES
(1, 'Ulfa Hanum', 95),
(2, 'Isti Nurhalimah', 90),
(3, 'Shella Marshelina', 90);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1072`
--
ALTER TABLE `cv_1072`
  ADD PRIMARY KEY (`id_cv`),
  ADD UNIQUE KEY `UK_2obaa2jyedxkqgt1etm4uqj24` (`nama`),
  ADD KEY `FKhg0ujcbi3nwry1vklkisrkoew` (`id_nilai`);

--
-- Indexes for table `nilai_1072`
--
ALTER TABLE `nilai_1072`
  ADD PRIMARY KEY (`id_nilai`),
  ADD UNIQUE KEY `UK_b468ybqc3wlylw28uu94td2in` (`nama`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1072`
--
ALTER TABLE `cv_1072`
  MODIFY `id_cv` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `nilai_1072`
--
ALTER TABLE `nilai_1072`
  MODIFY `id_nilai` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `cv_1072`
--
ALTER TABLE `cv_1072`
  ADD CONSTRAINT `FKhg0ujcbi3nwry1vklkisrkoew` FOREIGN KEY (`id_nilai`) REFERENCES `nilai_1072` (`id_nilai`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
