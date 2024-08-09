-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 05, 2024 at 09:38 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

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
-- Table structure for table `tbl_barang`
--

CREATE TABLE `tbl_barang` (
  `kode_barang` varchar(8) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `spesifikasi` varchar(30) NOT NULL,
  `kategori` varchar(20) NOT NULL,
  `jumlah_brg` int(7) NOT NULL,
  `kondisi` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_barang`
--

INSERT INTO `tbl_barang` (`kode_barang`, `nama_barang`, `spesifikasi`, `kategori`, `jumlah_brg`, `kondisi`) VALUES
('BR001', 'Bantex Magazine File', 'A4 7 cm Cobalt Blue [4010-11]', 'Stationaries', 32, 'Baru'),
('BR003', 'Joyko White Board Eraser', 'WE-1 (Magnet)', 'Electronik', 13, 'Baru'),
('BR005', 'Microdot Letter Tray Elevated 2 susun', '[M-602]', 'Stationaries', 20, 'Baru'),
('BR006', 'Sinar Dunia ', 'F4 70 gsm Blue', 'Paper', 1, 'Baru'),
('BR007', 'Coral Glossy Paper', 'A4 120 gsm', 'Paper', 60, 'Baru'),
('BR008', 'Wet Mop Cotton ', '400gr (refill)', 'Household', 14, 'Baru'),
('BR009', 'Basic Serbet ', 'Motif Kotak-kotak', 'Household', 32, 'Baru'),
('BR010', 'Arcrylic Standing Bingkai', '12x6.5cm', 'Office Furniture', 13, 'Baru'),
('BR012', 'Tom&Jerry Label Polos ', '[No.120] isi 10', 'Stationaries', 31, 'Baru'),
('BR013', 'Namas Karton Buffalo ', 'A4 Red isi 100', 'Paper', 4, 'Baru'),
('BR014', 'Amano Kartu Absensi ', 'Polos putih isi 100', 'Equipment', 55, 'Baru'),
('BR015', 'Vixal pembersih Lantai Botol', '780 ml', 'Household', 2, 'Baru'),
('BR016', 'Diamant Paper Plotter', 'A0 84, 1x150cm', 'Paper', 29, 'Baru'),
('BR017', 'Garda Amplop ', 'Coklat A5', 'Stationaries', 3, 'Baru'),
('BR018', 'Casio EZ Label Tape ', '9mm - Black/Blue [XR-9BU1]', 'Stationaries', 27, 'Baru');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_keluarbarang`
--

CREATE TABLE `tbl_keluarbarang` (
  `kode_keluar` varchar(10) NOT NULL,
  `kode_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `tgl_keluar` varchar(15) NOT NULL,
  `penerima` varchar(20) NOT NULL,
  `jumlah_keluar` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_keluarbarang`
--

INSERT INTO `tbl_keluarbarang` (`kode_keluar`, `kode_barang`, `nama_barang`, `tgl_keluar`, `penerima`, `jumlah_keluar`) VALUES
('BRK001', 'BR001', 'Bantex Magazine File', '2024-08-04', 'Mr.Bean', '43'),
('BRK002', 'BR003', 'Joyko White Board Eraser', '2024-08-04', 'Ahmad Dani', '22'),
('BRK003', 'BR005', 'Microdot Letter Tray Elevated 2 susun', '2024-08-04', 'Keluarga Cemara', '5'),
('BRK004', 'BR006', 'Sinar Dunia ', '2024-08-04', 'PT.Sunshine', '29'),
('BRK005', 'BR018', 'Casio EZ Label Tape ', '2024-08-04', 'Bowo', '23'),
('BRK006', 'BR015', 'Vixal pembersih Lantai Botol', '2024-08-04', 'Agustian', '10'),
('BRK007', 'BR007', 'Coral Glossy Paper', '2024-08-04', 'Microsft', '10'),
('BRK008', 'BR008', 'Wet Mop Cotton ', '2024-08-04', 'APPIP', '11'),
('BRK009', 'BR009', 'Basic Serbet ', '2024-08-04', 'Ujang', '33'),
('BRK010', 'BR010', 'Arcrylic Standing Bingkai', '2024-08-04', 'Dermawan', '65'),
('BRK011', 'BR012', 'Tom&Jerry Label Polos ', '2024-08-04', 'Tomo', '19'),
('BRK012', 'BR013', 'Namas Karton Buffalo ', '2024-08-04', 'Ridwan', '41'),
('BRK013', 'BR014', 'Amano Kartu Absensi ', '2024-08-04', 'Amina', '5'),
('BRK014', 'BR016', 'Diamant Paper Plotter', '2024-08-04', 'Alfi', '49'),
('BRK015', 'BR017', 'Garda Amplop ', '2024-08-04', 'Falpi', '11');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_masukbarang`
--

CREATE TABLE `tbl_masukbarang` (
  `id_masukbarang` varchar(11) NOT NULL,
  `kode_barang` varchar(8) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `tgl_masuk` varchar(10) NOT NULL,
  `jumlah_masuk` int(5) NOT NULL,
  `kode_supplier` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_masukbarang`
--

INSERT INTO `tbl_masukbarang` (`id_masukbarang`, `kode_barang`, `nama_barang`, `tgl_masuk`, `jumlah_masuk`, `kode_supplier`) VALUES
('BMSK001', 'BR001', 'Bantex Magazine File', '2024-08-04', 75, 'SP001'),
('BMSK002', 'BR003', 'Joyko White Board Eraser', '2024-08-04', 35, 'SP002'),
('BMSK003', 'BR005', 'Microdot Letter Tray Elevated 2 susun', '2024-08-04', 25, 'SP003'),
('BMSK004', 'BR006', 'Sinar Dunia ', '2024-08-04', 30, 'SP004'),
('BMSK005', 'BR018', 'Casio EZ Label Tape ', '2024-08-04', 50, 'SP005'),
('BMSK006', 'BR015', 'Vixal pembersih Lantai Botol', '2024-08-04', 12, 'SP006'),
('BMSK007', 'BR007', 'Coral Glossy Paper', '2024-08-04', 70, 'SP007'),
('BMSK008', 'BR008', 'Wet Mop Cotton ', '2024-08-04', 25, 'SP008'),
('BMSK009', 'BR009', 'Basic Serbet ', '2024-08-04', 65, 'SP009'),
('BMSK010', 'BR010', 'Arcrylic Standing Bingkai', '2024-08-04', 78, 'SP010'),
('BMSK011', 'BR012', 'Tom&Jerry Label Polos ', '2024-08-04', 50, 'SP011'),
('BMSK012', 'BR013', 'Namas Karton Buffalo ', '2024-08-04', 45, 'SP012'),
('BMSK013', 'BR014', 'Amano Kartu Absensi ', '2024-08-04', 60, 'SP013'),
('BMSK014', 'BR016', 'Diamant Paper Plotter', '2024-08-04', 78, 'SP014'),
('BMSK015', 'BR017', 'Garda Amplop ', '2024-08-04', 14, 'SP015');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_stok`
--

CREATE TABLE `tbl_stok` (
  `kode_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jml_barangmasuk` int(7) NOT NULL,
  `jml_barangkeluar` int(7) NOT NULL,
  `total_barang` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_stok`
--

INSERT INTO `tbl_stok` (`kode_barang`, `nama_barang`, `jml_barangmasuk`, `jml_barangkeluar`, `total_barang`) VALUES
('BR001', 'Bantex Magazine File', 75, 43, 75),
('BR003', 'Joyko White Board Eraser', 35, 22, 35),
('BR005', 'Microdot Letter Tray Elevated 2 susun', 25, 5, 25),
('BR006', 'Sinar Dunia ', 30, 29, 30),
('BR007', 'Coral Glossy Paper', 70, 10, 70),
('BR008', 'Wet Mop Cotton ', 25, 11, 25),
('BR009', 'Basic Serbet ', 65, 33, 65),
('BR010', 'Arcrylic Standing Bingkai', 78, 65, 78),
('BR012', 'Tom&Jerry Label Polos ', 50, 19, 50),
('BR013', 'Namas Karton Buffalo ', 45, 41, 45),
('BR014', 'Amano Kartu Absensi ', 60, 5, 60),
('BR015', 'Vixal pembersih Lantai Botol', 12, 10, 12),
('BR016', 'Diamant Paper Plotter', 78, 49, 78),
('BR017', 'Garda Amplop ', 14, 11, 14),
('BR018', 'Casio EZ Label Tape ', 50, 23, 50);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_supplier`
--

CREATE TABLE `tbl_supplier` (
  `kode_supplier` varchar(10) NOT NULL,
  `nama_supplier` varchar(20) NOT NULL,
  `alamat_supplier` varchar(20) NOT NULL,
  `telp_supplier` varchar(20) NOT NULL,
  `kota_supplier` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_supplier`
--

INSERT INTO `tbl_supplier` (`kode_supplier`, `nama_supplier`, `alamat_supplier`, `telp_supplier`, `kota_supplier`) VALUES
('SP001', 'PT.Bino Mitra Sejati', 'Jl.Olympic Raya  ', '085221048515', 'Bogor'),
('SP002', 'PT.Joyko', 'Jl.Jakarta Makmur', '0812456783', 'Jakarta'),
('SP003', 'PT. Microdot ', 'Jl.Sukarasa', '081536784987', 'Bekasi'),
('SP004', 'PT. Sinar Dunia', 'Jl.GajahMada', '0812456738', 'Surabaya'),
('SP005', 'PT.Casio Indonesia', 'Jl.Ujung Jalan', '0812578439', 'Jakarta'),
('SP006', 'PT.Unilever', 'Jl.Soekarno Hatta', '0123645737823', 'Bandunf'),
('SP007', 'PT.Coral', 'Jl.Bukit Niaga', '0842356789', 'Balikpapan'),
('SP008', 'PT.Wet Cotton', 'Jl.Asia Afrika', '0812564787346', 'Bandung'),
('SP009', 'PT.Basic', 'JL.Ujung Pandang', '0897623426656', 'Malang'),
('SP010', 'PT.Arcylic', 'Jl.Semua Sama', '0812562773', 'Makassar'),
('SP011', 'PT.Tojer', 'Jl.Merdeka 2', '08123465755', 'Aceh'),
('SP012', 'PT.Amas', 'Jl.KiriKanan', '0812453589', 'Cimahi'),
('SP013', 'PT.Amano', 'Jl.Wonderful', '08125784747', 'Medan'),
('SP014', 'PT.Diamant ', 'JL.Garda Terdepan', '08123764743', 'IKN'),
('SP015', 'PT.Garda', 'Jl.Garuda Didadaku', '081273754544', 'Bali');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id` varchar(20) NOT NULL,
  `passw` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`id`, `passw`) VALUES
('Admin', 123);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_barang`
--
ALTER TABLE `tbl_barang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `tbl_keluarbarang`
--
ALTER TABLE `tbl_keluarbarang`
  ADD PRIMARY KEY (`kode_keluar`);

--
-- Indexes for table `tbl_masukbarang`
--
ALTER TABLE `tbl_masukbarang`
  ADD PRIMARY KEY (`id_masukbarang`);

--
-- Indexes for table `tbl_stok`
--
ALTER TABLE `tbl_stok`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `tbl_supplier`
--
ALTER TABLE `tbl_supplier`
  ADD PRIMARY KEY (`kode_supplier`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
