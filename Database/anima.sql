-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2020 at 01:13 PM
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
('IF3201', 85, 83, 78, 75, 70, 65, 55),
('IF3001', 85, 80, 75, 67, 60, 55, 40),
('IF3042', 85, 75, 70, 65, 60, 55, 40),
('IF4201', 0, 0, 0, 0, 0, 0, 0),
('IF3022', 90, 85, 80, 75, 70, 65, 50),
('IF3251', 90, 82, 77, 72, 65, 55, 45);

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
('IF3042', 10, 15, 10, 5, 0, 30, 30),
('IF4201', 0, 0, 0, 0, 0, 0, 0),
('IF3022', 10, 10, 10, 10, 0, 30, 30),
('IF3251', 0, 0, 0, 0, 0, 50, 50);

-- --------------------------------------------------------

--
-- Table structure for table `konversi_na`
--

CREATE TABLE `konversi_na` (
  `nim` int(11) NOT NULL,
  `kode_mk` varchar(8) NOT NULL,
  `na` float NOT NULL,
  `grade` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `konversi_na`
--

INSERT INTO `konversi_na` (`nim`, `kode_mk`, `na`, `grade`) VALUES
('14117138', 'IF3001', 95, 'A'),
('14117137', 'IF3001', 76.8, 'B'),
('14117138', 'IF3022', 83.9, 'B'),
('14117137', 'IF3022', 25, 'E'),
('14117138', 'IF3201', 31, 'E'),
('14117137', 'IF3201', 20, 'E'),
('14117145', 'IF3001', 79.75, 'B');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` int(11) NOT NULL,
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
  `nim` int(11) NOT NULL,
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
('14117137', 'IF3001', 80, 98, 0, 100, 0, 80, 100),
('14117137', 'IF3022', 10, 0, 0, 0, 0, 0, 80),
('14117137', 'IF3201', 50, 0, 0, 0, 0, 50, 0),
('14117138', 'IF3001', 100, 100, 100, 0, 0, 100, 100),
('14117138', 'IF3022', 87, 96, 70, 100, 0, 86, 76),
('14117138', 'IF3201', 10, 0, 0, 0, 0, 100, 0),
('14117145', 'IF3001', 70, 80, 75, 80, 0, 87, 78);

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
