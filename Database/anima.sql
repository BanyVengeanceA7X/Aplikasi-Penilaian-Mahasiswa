-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 06, 2020 at 02:44 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `anima`
--

-- --------------------------------------------------------

--
-- Table structure for table `index_nilai`
--

CREATE TABLE `index_nilai` (
  `kode_mk` varchar(8) DEFAULT NULL,
  `A` int(2) DEFAULT NULL,
  `AB` int(2) DEFAULT NULL,
  `B` int(2) DEFAULT NULL,
  `BC` int(2) DEFAULT NULL,
  `C` int(2) DEFAULT NULL,
  `D` int(2) DEFAULT NULL,
  `E` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `index_nilai`
--

INSERT INTO `index_nilai` (`kode_mk`, `A`, `AB`, `B`, `BC`, `C`, `D`, `E`) VALUES
('IF3201', 85, 0, 78, 0, 70, 65, 55),
('IF3001', 0, 0, 0, 0, 0, 0, 0),
('IF3042', 0, 0, 0, 0, 0, 0, 0),
('IF4201', 0, 0, 0, 0, 0, 0, 0),
('IF3022', 0, 0, 0, 0, 0, 0, 0),
('IF3251', 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `komponen`
--

CREATE TABLE `komponen` (
  `kode_mk` varchar(8) NOT NULL,
  `tugas` int(3) DEFAULT NULL,
  `kuis` int(3) DEFAULT NULL,
  `tubes` int(3) DEFAULT NULL,
  `praktikum` int(3) DEFAULT NULL,
  `tambahan` int(3) DEFAULT NULL,
  `uts` int(3) DEFAULT NULL,
  `uas` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `komponen`
--

INSERT INTO `komponen` (`kode_mk`, `tugas`, `kuis`, `tubes`, `praktikum`, `tambahan`, `uts`, `uas`) VALUES
('IF3201', 10, 10, 10, 10, 0, 30, 30),
('IF3001', 10, 10, 15, 5, 0, 30, 30),
('IF3042', 0, 0, 0, 0, 0, 0, 0),
('IF4201', 0, 0, 0, 0, 0, 0, 0),
('IF3022', 12, 0, 0, 0, 0, 0, 0),
('IF3251', 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `konversi_na`
--

CREATE TABLE `konversi_na` (
  `nim` varchar(10) NOT NULL,
  `kode_mk` varchar(8) NOT NULL,
  `na` float NOT NULL,
  `grade` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `konversi_na`
--

INSERT INTO `konversi_na` (`nim`, `kode_mk`, `na`, `grade`) VALUES
('14117138', 'IF3001', 95, ''),
('14117137', 'IF3001', 1, ''),
('14117138', 'IF3022', 1.2, ''),
('14117137', 'IF3022', 1.2, ''),
('14117138', 'IF3201', 1, ''),
('14117137', 'IF3201', 1, '');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama`) VALUES
('14117137', 'Bagus Budi Setiawan'),
('14117138', 'MMuttaqin'),
('14117145', 'Muhammad Telaga');

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE `matakuliah` (
  `kode_mk` varchar(8) NOT NULL,
  `kode_kls` varchar(4) NOT NULL,
  `ruang` varchar(6) DEFAULT NULL,
  `nama_mk` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `hari` varchar(6) NOT NULL,
  `waktu` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `matakuliah`
--

INSERT INTO `matakuliah` (`kode_mk`, `kode_kls`, `ruang`, `nama_mk`, `sks`, `hari`, `waktu`) VALUES
('IF3001', 'RC', 'GK107', 'Kapita Selekta Informatika', 3, 'Jumat', '09:00:00'),
('IF3022', 'R', 'D307', 'Pervasive Computing', 3, 'Jumat', '13:00:00'),
('IF3042', 'R', 'GK107', 'Data Mining', 3, 'Senin', '09:00:00'),
('IF3201', 'RD', 'GK107', 'Kewirausahaan', 3, 'Rabu', '08:00:00'),
('IF3251', 'RC', 'F008', 'Proyek Perangkat Lunak', 4, 'Selasa', '13:00:00'),
('IF4201', 'RB', 'GK107', 'Socio Informatika dan Etika Profesi', 2, 'Senin', '13:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `nim` varchar(10) NOT NULL,
  `kode_mk` varchar(8) NOT NULL,
  `tugas` float DEFAULT NULL,
  `kuis` float DEFAULT NULL,
  `tubes` float DEFAULT NULL,
  `praktikum` float DEFAULT NULL,
  `tambahan` float DEFAULT NULL,
  `uts` float DEFAULT NULL,
  `uas` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`nim`, `kode_mk`, `tugas`, `kuis`, `tubes`, `praktikum`, `tambahan`, `uts`, `uas`) VALUES
('14117137', 'IF3001', 10, 0, 0, 0, 0, 0, 0),
('14117137', 'IF3022', 10, 0, 0, 0, 0, 0, 0),
('14117137', 'IF3201', 10, 0, 0, 0, 0, 0, 0),
('14117138', 'IF3001', 100, 100, 100, 0, 0, 100, 100),
('14117138', 'IF3022', 10, 0, 0, 0, 0, 0, 0),
('14117138', 'IF3201', 10, 0, 0, 0, 0, 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `index_nilai`
--
ALTER TABLE `index_nilai`
  ADD KEY `kode_mk` (`kode_mk`);

--
-- Indexes for table `komponen`
--
ALTER TABLE `komponen`
  ADD KEY `kode_mk` (`kode_mk`);

--
-- Indexes for table `konversi_na`
--
ALTER TABLE `konversi_na`
  ADD KEY `nim` (`nim`),
  ADD KEY `kode_mk` (`kode_mk`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`kode_mk`);

--
-- Indexes for table `nilai`
--
ALTER TABLE `nilai`
  ADD PRIMARY KEY (`nim`,`kode_mk`),
  ADD KEY `kode_mk` (`kode_mk`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `index_nilai`
--
ALTER TABLE `index_nilai`
  ADD CONSTRAINT `index_nilai_ibfk_1` FOREIGN KEY (`kode_mk`) REFERENCES `matakuliah` (`kode_mk`),
  ADD CONSTRAINT `index_nilai_ibfk_2` FOREIGN KEY (`kode_mk`) REFERENCES `matakuliah` (`kode_mk`);

--
-- Constraints for table `komponen`
--
ALTER TABLE `komponen`
  ADD CONSTRAINT `komponen_ibfk_1` FOREIGN KEY (`kode_mk`) REFERENCES `matakuliah` (`kode_mk`);

--
-- Constraints for table `konversi_na`
--
ALTER TABLE `konversi_na`
  ADD CONSTRAINT `konversi_na_ibfk_1` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`),
  ADD CONSTRAINT `konversi_na_ibfk_2` FOREIGN KEY (`kode_mk`) REFERENCES `matakuliah` (`kode_mk`);

--
-- Constraints for table `nilai`
--
ALTER TABLE `nilai`
  ADD CONSTRAINT `nilai_ibfk_1` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`),
  ADD CONSTRAINT `nilai_ibfk_2` FOREIGN KEY (`kode_mk`) REFERENCES `matakuliah` (`kode_mk`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
