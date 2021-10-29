-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 11 Des 2020 pada 08.16
-- Versi server: 10.4.16-MariaDB
-- Versi PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `harga`
--

CREATE TABLE `harga` (
  `Kode Harga` int(5) NOT NULL,
  `Jenis` varchar(20) NOT NULL,
  `Nominal` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `harga`
--

INSERT INTO `harga` (`Kode Harga`, `Jenis`, `Nominal`) VALUES
(2, 'VVIP', 500000),
(23, 'REGULER', 432200),
(43, 'VIP', 400000),
(643, 'REGULER', 150000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal`
--

CREATE TABLE `jadwal` (
  `Kode Jadwal` int(5) NOT NULL,
  `Asal` varchar(20) NOT NULL,
  `Tujuan` varchar(20) NOT NULL,
  `Tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `jadwal`
--

INSERT INTO `jadwal` (`Kode Jadwal`, `Asal`, `Tujuan`, `Tanggal`) VALUES
(1, 'Bengkulu', 'Padang', '2020-12-06'),
(3, 'Padang', 'Jambi', '2020-12-08'),
(8, 'Jakarta', 'Bengkulu', '2020-12-28'),
(78, 'Jambi', 'Jakarta', '2020-12-08'),
(123, 'Palembang', 'Bengkulu', '2020-12-28');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('Admin', 'admin'),
('afiq', 'afiq');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan`
--

CREATE TABLE `pemesanan` (
  `kode` int(5) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `asal` varchar(20) NOT NULL,
  `tujuan` varchar(15) NOT NULL,
  `tanggal` varchar(15) NOT NULL,
  `pelayanan` varchar(15) NOT NULL,
  `nominal` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `penumpang`
--

CREATE TABLE `penumpang` (
  `kode` int(3) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `identitas` varchar(24) NOT NULL,
  `jenis kelamin` varchar(15) NOT NULL,
  `usia` int(3) NOT NULL,
  `telepon` varchar(15) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `penumpang`
--

INSERT INTO `penumpang` (`kode`, `nama`, `identitas`, `jenis kelamin`, `usia`, `telepon`, `alamat`) VALUES
(1, 'Azvadennys Vasiguhamiaz', '1771022402020002', 'Laki - Laki', 18, '082175831680', 'Jalan Enggang NO 16'),
(2, 'Sutaman', '582352144', 'Laki - Laki', 90, '073651693', 'Jalan Pancoran JAKARTA'),
(12, 'sarah', '23434567', 'Perempuan', 15, '0856423456', 'jala warna warni no11'),
(32, 'Alya Siti', '55555', 'Perempuan', 325, '325322222222', '234f'),
(34, 'alya ', '12355678', 'Perempuan', 16, '0844676543', 'jalan mawar'),
(41, 'Budi', '41515', 'Laki - Laki', 32, '08254862248', 'jalan flamboyan');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `harga`
--
ALTER TABLE `harga`
  ADD PRIMARY KEY (`Kode Harga`),
  ADD UNIQUE KEY `Kode Harga` (`Kode Harga`);

--
-- Indeks untuk tabel `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`Kode Jadwal`),
  ADD UNIQUE KEY `Kode Jadwal` (`Kode Jadwal`);

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`kode`),
  ADD UNIQUE KEY `kode` (`kode`);

--
-- Indeks untuk tabel `penumpang`
--
ALTER TABLE `penumpang`
  ADD PRIMARY KEY (`kode`),
  ADD UNIQUE KEY `kode` (`kode`),
  ADD KEY `kode_2` (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
