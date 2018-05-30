-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Lun 12 Juin 2017 à 20:25
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `lorann`
--
DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `Map1` ()  NO SQL
SET @mapnb
SELECT map FROM element
WHERE lvl_number = @mapnb

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `element`
--

CREATE TABLE `element` (
  `lvl_number` int NOT NULL,
  `map` varchar(512)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `element`
--

INSERT INTO `element` (`lvl_number`, `map`) VALUES
	(1, '0TTTTTTTTTTTT0TLTTT0Ioooooooooooo0oooooIIoooooooooooo0oooooIIooooooooooooooooo1IIoooo0ooo0oooooooooIIooooIoooICoooooooCI0TTTT0ooo0TTTTTTTTT0ICoooIoooIoooEoooooIIoooo0ooo0TTTTTT0ooIIooooooooooooooooooIIooooooPoooooooooooI0TTTTTTTTTTTTTTTTTT0'),
    (2, '0TTTTDTTTTTTTTTTTTT0IoooooooooooCooI1CoI0TT0oo0TTTTTTTT0o0oIIEoooooooooooooooooI0TTTTTTTTTTTTTT0oo2IIooooooooooooooooooIIo0TTTo0oo0o0oTTTToIIoITTooo00ooooIooIoIIoIooooo00ooIoITTIoIIo0TTTo0oo0oIoIooIoIIoooooooooooooooooPI0TTTTTTTTTTTTTTTTTT0'),
    (3, '0TTDTT0TTTTT0TTT0TT0Iooooo02oooo0ooo0ooIIooooo0ooooooooooooIIooooooo0TTTT0o0TTT0Iooooo0o0TTTT0o0TTT0IoooCoIoIEooooooooCI0TTTTT0o0TTTT0o0TTTIIo1ooo0o0oCoo0o0ooCIIooooo0o0oooo0o0oooIIooooooooooooooooooIIPoooo000oooo3oooooI0TTTT0000TTTTTTTTTT0'),
    (4, '0T0TTTTTTTTTTTTTTTT0IPIDoooooooooooooooIIo0T000T0o00T0T00ooIIooooo0o0o0o0oo3oooIIoooooC010o0CooooooIIooooo0o0C040ooooooIIoooooC0o0o0CooooooIIooooo0o0o0o0ooooooIIoo2ooC0o0o0CooooooIIoo0T0T00TT00T0T0ooIIoooooooEooooooooooI0TTTTTTTTTTTTTTTTTT0'),
    (5, '0TT0TT0TTTTTTTTTTTT0Io2IooIooooo1oo0o0EIIooIooooo000oo0o0oCI00o0o00o0000TTTTTTT0I03oooIoooooooooooo00o0o0o0ToT0T0T0To0T0Io0oo4Io0oIoIoIo0ooIIo0oooIoIooIoIooIooI00o0000T0T0T0T0T0TT0Ioo0oCo0oCo0oCo0oooIIoooo0oCo0oCo0oCoooD0TTTTTTTTTTTTTTTTTT0');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `element`
--
ALTER TABLE `element`
  ADD PRIMARY KEY (`lvl_number`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `element`

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

