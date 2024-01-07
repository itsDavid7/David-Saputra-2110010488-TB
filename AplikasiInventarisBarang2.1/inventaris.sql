-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Jan 2024 pada 03.34
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventaris`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_barang`
--

CREATE TABLE `tb_barang` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jenis_barang` varchar(50) NOT NULL,
  `ukuran` varchar(10) NOT NULL,
  `stok` int(20) NOT NULL,
  `Harga` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_barang`
--

INSERT INTO `tb_barang` (`id_barang`, `nama_barang`, `jenis_barang`, `ukuran`, `stok`, `Harga`) VALUES
(1, 'Laptop Asus', 'Elektronik', 'Sedang', 25, 11500000),
(221, 'mouse', 'Elektronik', 'Kecil', 100, 35000),
(991, 'Lemari 2 PINTU', 'furniture', 'besar', 50, 750000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `kd_kirim` int(20) NOT NULL,
  `kd_barang` int(20) NOT NULL,
  `jenis` varchar(30) NOT NULL,
  `stok` int(20) NOT NULL,
  `harga` int(30) NOT NULL,
  `lokasi` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`kd_kirim`, `kd_barang`, `jenis`, `stok`, `harga`, `lokasi`) VALUES
(1, 991, 'elektronik', 45, 750000, 'Gudang a'),
(2, 992, 'furniture', 20, 750000, 'Gudang b'),
(3, 9163, 'Elektronik', 60, 600000, 'Gudang A');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`username`, `password`) VALUES
('ADMIN', 'ADMIN'),
('DAVID', 'adgadadd'),
('STAFF', 'STAFF');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indeks untuk tabel `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`kd_kirim`);

--
-- Indeks untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_barang`
--
ALTER TABLE `tb_barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=131232;

--
-- AUTO_INCREMENT untuk tabel `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  MODIFY `kd_kirim` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
