-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : jeu. 02 déc. 2021 à 15:41
-- Version du serveur :  5.7.31
-- Version de PHP : 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `abstractcharacter`
--

-- --------------------------------------------------------

--
-- Structure de la table `abstractcharacter`
--

DROP TABLE IF EXISTS `abstractcharacter`;
CREATE TABLE IF NOT EXISTS `abstractcharacter` (
    `id` int(25) NOT NULL AUTO_INCREMENT,
    `type` varchar(255) NOT NULL,
    `name` varchar(255) NOT NULL,
    `life` int(25) NOT NULL,
    `forceLvl` int(25) NOT NULL,
    `intelligence` int(25) NOT NULL,
    `attackItem` int(25) NOT NULL,
    `defenseItem` int(25) NOT NULL,
    PRIMARY KEY (`id`),
    KEY `attackItem` (`attackItem`),
    KEY `defenseItem` (`defenseItem`)
    ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `abstractcharacter`
--

INSERT INTO `abstractcharacter` (`id`, `type`, `name`, `life`, `forceLvl`, `intelligence`, `attackItem`, `defenseItem`) VALUES
                                                                                                                            (1, 'Warrior', 'Raiponce', 20, 6, 3, 1, 1),
                                                                                                                            (2, 'Warrior', 'Rambo', 10, 10, 3, 2, 2);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `abstractcharacter`
--
ALTER TABLE `abstractcharacter`
    ADD CONSTRAINT `abstractcharacter_ibfk_1` FOREIGN KEY (`attackItem`) REFERENCES `attackitem` (`id`),
  ADD CONSTRAINT `abstractcharacter_ibfk_2` FOREIGN KEY (`defenseItem`) REFERENCES `defenseitem` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
