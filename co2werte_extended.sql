-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 11. Mrz 2025 um 06:47
-- Server-Version: 10.4.32-MariaDB
-- PHP-Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `co2werte`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `co2emission`
--

CREATE TABLE `co2emission` (
  `ID` int(11) NOT NULL,
  `co2Wert` double NOT NULL,
  `datum` datetime(6) DEFAULT NULL,
  `land` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `co2emission`
--

INSERT INTO `co2emission` (`ID`, `co2Wert`, `datum`, `land`) VALUES
(1, 11256, '2025-03-10 00:00:00.000000', 'China'),
(2, 5275, '2025-03-06 00:00:00.000000', 'USA'),
(3, 2622, '2025-03-05 00:00:00.000000', 'Indien'),
(4, 1748, '2025-03-04 00:00:00.000000', 'Russland'),
(5, 1199, '2025-03-03 00:00:00.000000', 'Japan'),
(6, 753, '2025-03-02 00:00:00.000000', 'Deutschland'),
(7, 728, '2025-03-01 00:00:00.000000', 'Iran'),
(8, 695, '2025-02-28 00:00:00.000000', 'Südkorea'),
(9, 680, '2025-02-23 00:00:00.000000', 'Indonesien'),
(10, 625, '2025-02-27 00:00:00.000000', 'Saudi-Arabien'),
(11, 594, '2025-02-26 00:00:00.000000', 'Kanada'),
(12, 550, '2025-01-20 00:00:00.000000', 'Ägypten'),
(13, 520, '2025-02-16 00:00:00.000000', 'Türkei'),
(14, 490, '2025-02-15 00:00:00.000000', 'Australien'),
(15, 480, '2025-02-25 00:00:00.000000', 'Brasilien'),
(16, 460, '2025-01-19 00:00:00.000000', 'Nigeria'),
(17, 410, '2025-02-20 00:00:00.000000', 'Frankreich'),
(18, 375, '2025-02-24 00:00:00.000000', 'Mexiko'),
(19, 375, '2025-02-19 00:00:00.000000', 'Großbritannien'),
(20, 375, '2025-01-18 00:00:00.000000', 'Pakistan'),
(21, 320, '2025-02-18 00:00:00.000000', 'Italien'),
(22, 310, '2025-02-22 00:00:00.000000', 'Südafrika'),
(23, 270, '2025-02-17 00:00:00.000000', 'Spanien'),
(24, 265, '2025-02-21 00:00:00.000000', 'Argentinien'),
(25, 210, '2025-02-14 00:00:00.000000', 'Ukraine'),
(26, 170, '2025-02-04 00:00:00.000000', 'Tschechien'),
(27, 165, '2025-02-13 00:00:00.000000', 'Polen'),
(28, 130, '2025-02-02 00:00:00.000000', 'Rumänien'),
(29, 120, '2025-02-12 00:00:00.000000', 'Niederlande'),
(30, 120, '2025-02-01 00:00:00.000000', 'Griechenland'),
(31, 100, '2025-01-31 00:00:00.000000', 'Portugal'),
(32, 95, '2025-02-11 00:00:00.000000', 'Belgien'),
(33, 90, '2025-02-03 00:00:00.000000', 'Ungarn'),
(34, 85, '2025-01-30 00:00:00.000000', 'Neuseeland'),
(35, 80, '2025-02-10 00:00:00.000000', 'Schweiz'),
(36, 75, '2025-02-05 00:00:00.000000', 'Österreich'),
(37, 65, '2025-01-29 00:00:00.000000', 'Irland'),
(38, 55, '2025-02-09 00:00:00.000000', 'Schweden'),
(39, 55, '2025-01-28 00:00:00.000000', 'Singapur'),
(40, 50, '2025-01-27 00:00:00.000000', 'Thailand'),
(41, 40, '2025-01-26 00:00:00.000000', 'Vietnam'),
(42, 35, '2025-01-25 00:00:00.000000', 'Philippinen'),
(43, 30, '2025-02-08 00:00:00.000000', 'Norwegen'),
(44, 25, '2025-01-24 00:00:00.000000', 'Malaysia'),
(45, 20, '2025-02-07 00:00:00.000000', 'Dänemark'),
(46, 20, '2025-01-23 00:00:00.000000', 'Chile'),
(47, 15, '2025-02-06 00:00:00.000000', 'Finnland'),
(48, 15, '2025-01-22 00:00:00.000000', 'Kolumbien'),
(49, 10, '2025-01-21 00:00:00.000000', 'Peru'),
(50, 422, '2025-02-18 00:00:00.000000', 'Afghanistan'),
(51, 330, '2025-02-20 00:00:00.000000', 'Albanien'),
(52, 109, '2025-02-15 00:00:00.000000', 'Algerien'),
(53, 165, '2025-02-26 00:00:00.000000', 'Andorra'),
(54, 466, '2025-02-10 00:00:00.000000', 'Angola'),
(55, 436, '2025-02-17 00:00:00.000000', 'Antigua und Barbuda'),
(56, 239, '2025-02-12 00:00:00.000000', 'Argentinien'),
(57, 248, '2025-02-13 00:00:00.000000', 'Armenien'),
(58, 323, '2025-03-05 00:00:00.000000', 'Aserbaidschan'),
(59, 213, '2025-03-10 00:00:00.000000', 'Äthiopien'),
(60, 331, '2025-02-11 00:00:00.000000', 'Bahamas'),
(61, 262, '2025-02-09 00:00:00.000000', 'Bahrain'),
(62, 341, '2025-03-03 00:00:00.000000', 'Bangladesch'),
(63, 338, '2025-03-05 00:00:00.000000', 'Barbados'),
(64, 220, '2025-02-24 00:00:00.000000', 'Belarus'),
(65, 379, '2025-02-25 00:00:00.000000', 'Belize'),
(66, 442, '2025-03-06 00:00:00.000000', 'Benin'),
(67, 88, '2025-02-26 00:00:00.000000', 'Bhutan'),
(68, 391, '2025-02-27 00:00:00.000000', 'Bolivien'),
(69, 102, '2025-02-28 00:00:00.000000', 'Bosnien und Herzegowina'),
(70, 180, '2025-02-14 00:00:00.000000', 'Botswana'),
(71, 248, '2025-02-10 00:00:00.000000', 'Brunei'),
(72, 363, '2025-02-26 00:00:00.000000', 'Bulgarien'),
(73, 266, '2025-02-26 00:00:00.000000', 'Burkina Faso'),
(74, 263, '2025-02-10 00:00:00.000000', 'Burundi'),
(75, 249, '2025-02-19 00:00:00.000000', 'Costa Rica'),
(76, 61, '2025-03-09 00:00:00.000000', 'Dänemark'),
(77, 485, '2025-02-14 00:00:00.000000', 'Dominica'),
(78, 94, '2025-03-04 00:00:00.000000', 'Dominikanische Republik'),
(79, 97, '2025-02-10 00:00:00.000000', 'Ecuador'),
(80, 98, '2025-03-07 00:00:00.000000', 'El Salvador'),
(81, 424, '2025-03-09 00:00:00.000000', 'Eritrea'),
(82, 68, '2025-02-15 00:00:00.000000', 'Estland'),
(83, 120, '2025-03-05 00:00:00.000000', 'Eswatini'),
(84, 96, '2025-02-26 00:00:00.000000', 'Fidschi'),
(85, 467, '2025-02-21 00:00:00.000000', 'Finnland'),
(86, 392, '2025-02-18 00:00:00.000000', 'Gabun'),
(87, 59, '2025-02-09 00:00:00.000000', 'Gambia'),
(88, 155, '2025-02-23 00:00:00.000000', 'Georgien'),
(89, 91, '2025-03-08 00:00:00.000000', 'Grenada'),
(90, 196, '2025-02-22 00:00:00.000000', 'Guatemala'),
(91, 89, '2025-02-11 00:00:00.000000', 'Guinea'),
(92, 465, '2025-02-19 00:00:00.000000', 'Guinea-Bissau'),
(93, 327, '2025-03-10 00:00:00.000000', 'Guyana'),
(94, 395, '2025-03-10 00:00:00.000000', 'Haiti'),
(95, 375, '2025-02-16 00:00:00.000000', 'Honduras'),
(96, 474, '2025-02-23 00:00:00.000000', 'Island'),
(97, 148, '2025-02-20 00:00:00.000000', 'Jamaika'),
(98, 346, '2025-03-07 00:00:00.000000', 'Jordanien'),
(99, 412, '2025-02-11 00:00:00.000000', 'Kambodscha'),
(100, 168, '2025-02-21 00:00:00.000000', 'Kap Verde'),
(101, 66, '2025-02-21 00:00:00.000000', 'Kasachstan'),
(102, 152, '2025-02-24 00:00:00.000000', 'Kenia'),
(103, 86, '2025-02-22 00:00:00.000000', 'Kiribati'),
(104, 454, '2025-02-14 00:00:00.000000', 'Kuwait'),
(105, 308, '2025-03-07 00:00:00.000000', 'Kyrgyzstan'),
(106, 177, '2025-02-21 00:00:00.000000', 'Laos'),
(107, 385, '2025-03-02 00:00:00.000000', 'Lesotho'),
(108, 110, '2025-02-11 00:00:00.000000', 'Libanon'),
(109, 473, '2025-02-24 00:00:00.000000', 'Madagaskar'),
(110, 409, '2025-03-07 00:00:00.000000', 'Malawi'),
(111, 76, '2025-02-21 00:00:00.000000', 'Malediven'),
(112, 373, '2025-03-05 00:00:00.000000', 'Mali'),
(113, 322, '2025-03-09 00:00:00.000000', 'Malta'),
(114, 164, '2025-02-20 00:00:00.000000', 'Mauretanien'),
(115, 375, '2025-02-13 00:00:00.000000', 'Mauritius'),
(116, 118, '2025-03-06 00:00:00.000000', 'Moldau'),
(117, 234, '2025-02-23 00:00:00.000000', 'Mongolei'),
(118, 323, '2025-03-04 00:00:00.000000', 'Montenegro'),
(119, 122, '2025-03-10 00:00:00.000000', 'Mosambik'),
(120, 421, '2025-03-03 00:00:00.000000', 'Myanmar'),
(121, 232, '2025-02-21 00:00:00.000000', 'Namibia'),
(122, 263, '2025-02-26 00:00:00.000000', 'Nauru'),
(123, 138, '2025-02-23 00:00:00.000000', 'Nepal'),
(124, 323, '2025-02-21 00:00:00.000000', 'Nicaragua'),
(125, 187, '2025-03-10 00:00:00.000000', 'Niger'),
(126, 78, '2025-02-27 00:00:00.000000', 'Nordmazedonien'),
(127, 446, '2025-02-15 00:00:00.000000', 'Oman'),
(128, 385, '2025-02-28 00:00:00.000000', 'Palau'),
(129, 171, '2025-02-27 00:00:00.000000', 'Panama'),
(130, 82, '2025-02-24 00:00:00.000000', 'Papua-Neuguinea'),
(131, 140, '2025-02-12 00:00:00.000000', 'Paraguay'),
(132, 50, '2025-02-26 00:00:00.000000', 'Peru'),
(133, 174, '2025-02-14 00:00:00.000000', 'Philippinen'),
(134, 414, '2025-02-11 00:00:00.000000', 'Ruanda'),
(135, 315, '2025-02-11 00:00:00.000000', 'Saint Kitts und Nevis'),
(136, 187, '2025-02-27 00:00:00.000000', 'Saint Lucia'),
(137, 429, '2025-02-17 00:00:00.000000', 'Saint Vincent'),
(138, 416, '2025-02-25 00:00:00.000000', 'Samoa'),
(139, 350, '2025-02-10 00:00:00.000000', 'San Marino'),
(140, 434, '2025-02-18 00:00:00.000000', 'São Tomé und Príncipe'),
(141, 170, '2025-02-24 00:00:00.000000', 'Seychellen'),
(142, 268, '2025-03-04 00:00:00.000000', 'Sierra Leone'),
(143, 498, '2025-02-16 00:00:00.000000', 'Singapur'),
(144, 494, '2025-02-23 00:00:00.000000', 'Slowakei'),
(145, 422, '2025-02-17 00:00:00.000000', 'Suriname'),
(146, 465, '2025-02-14 00:00:00.000000', 'Tadschikistan'),
(147, 90, '2025-02-11 00:00:00.000000', 'Tansania'),
(148, 366, '2025-03-01 00:00:00.000000', 'Togo'),
(149, 492, '2025-02-17 00:00:00.000000', 'Tonga'),
(150, 220, '2025-02-23 00:00:00.000000', 'Trinidad und Tobago'),
(151, 369, '2025-03-06 00:00:00.000000', 'Turkmenistan'),
(152, 54, '2025-03-08 00:00:00.000000', 'Tuvalu'),
(153, 60, '2025-03-08 00:00:00.000000', 'Uganda'),
(154, 274, '2025-03-10 00:00:00.000000', 'Uruguay'),
(155, 62, '2025-02-09 00:00:00.000000', 'Usbekistan'),
(156, 248, '2025-02-25 00:00:00.000000', 'Vanuatu'),
(157, 158, '2025-03-09 00:00:00.000000', 'Venezuela'),
(158, 255, '2025-02-22 00:00:00.000000', 'Zypern');