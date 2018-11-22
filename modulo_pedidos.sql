-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-11-2018 a las 16:39:09
-- Versión del servidor: 10.1.37-MariaDB
-- Versión de PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `modulo_pedidos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coodinador_compras`
--

CREATE TABLE `coodinador_compras` (
  `COD_CORD_COMPRAS` int(11) NOT NULL,
  `COD_PERSONAL` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_orden_pedido`
--

CREATE TABLE `detalle_orden_pedido` (
  `COD_DETALLE_ORDEN` char(8) NOT NULL,
  `COD_PRODUCTO` char(8) NOT NULL,
  `COD_ORDEN_PEDIDO` int(11) NOT NULL,
  `CANTIDAD` int(11) NOT NULL,
  `PRECIO` float NOT NULL,
  `IMPORTE_PARCIAL` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden_de_compra`
--

CREATE TABLE `orden_de_compra` (
  `COD_ORDEN_COMPRA` int(11) NOT NULL,
  `COD_CORD_COMPRAS` int(11) NOT NULL,
  `COD_ORDEN_PEDIDO` int(11) NOT NULL,
  `COD_ESTADO` varchar(20) NOT NULL,
  `N°_ORDEN` int(11) NOT NULL,
  `FECHA_REGISTRO` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden_de_pedido`
--

CREATE TABLE `orden_de_pedido` (
  `COD_ORDEN_PEDIDO` int(11) NOT NULL,
  `FECHA_REGISTRO` date NOT NULL,
  `ESTADO` varchar(20) NOT NULL,
  `IMPORTE_TOTAL` float NOT NULL,
  `TIEMPO_ENTREGA` time NOT NULL,
  `FORMA_PAGO` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `coodinador_compras`
--
ALTER TABLE `coodinador_compras`
  ADD PRIMARY KEY (`COD_CORD_COMPRAS`),
  ADD KEY `COD_PERSONAL` (`COD_PERSONAL`);

--
-- Indices de la tabla `detalle_orden_pedido`
--
ALTER TABLE `detalle_orden_pedido`
  ADD PRIMARY KEY (`COD_DETALLE_ORDEN`),
  ADD KEY `COD_ORDEN_PEDIDO` (`COD_ORDEN_PEDIDO`);

--
-- Indices de la tabla `orden_de_compra`
--
ALTER TABLE `orden_de_compra`
  ADD PRIMARY KEY (`COD_ORDEN_COMPRA`),
  ADD KEY `COD_ORDEN_PEDIDO` (`COD_ORDEN_PEDIDO`),
  ADD KEY `COD_ESTADO` (`COD_ESTADO`),
  ADD KEY `COD_CORD_COMPRAS` (`COD_CORD_COMPRAS`);

--
-- Indices de la tabla `orden_de_pedido`
--
ALTER TABLE `orden_de_pedido`
  ADD PRIMARY KEY (`COD_ORDEN_PEDIDO`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_orden_pedido`
--
ALTER TABLE `detalle_orden_pedido`
  ADD CONSTRAINT `detalle_orden_pedido_ibfk_1` FOREIGN KEY (`COD_ORDEN_PEDIDO`) REFERENCES `orden_de_pedido` (`COD_ORDEN_PEDIDO`);

--
-- Filtros para la tabla `orden_de_compra`
--
ALTER TABLE `orden_de_compra`
  ADD CONSTRAINT `orden_de_compra_ibfk_1` FOREIGN KEY (`COD_ORDEN_PEDIDO`) REFERENCES `orden_de_pedido` (`COD_ORDEN_PEDIDO`),
  ADD CONSTRAINT `orden_de_compra_ibfk_3` FOREIGN KEY (`COD_CORD_COMPRAS`) REFERENCES `coodinador_compras` (`COD_CORD_COMPRAS`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
