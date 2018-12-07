-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-12-2018 a las 07:12:05
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbferreteria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catalogo`
--

CREATE TABLE `catalogo` (
  `NUM_CATALOGO` varchar(4) NOT NULL,
  `COD_PRODUCTO` int(11) NOT NULL,
  `COD_PROVEEDOR` varchar(4) NOT NULL,
  `FECHA_REGISTRO` date NOT NULL,
  `COSTO_UNITARIO` double(8,2) NOT NULL,
  `UNIDAD_MEDIDA` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clase`
--

CREATE TABLE `clase` (
  `COD_CLASE` varchar(20) NOT NULL,
  `NOMBRE_CLASE` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `COD_CLIENTE` int(11) NOT NULL,
  `NOMBRE` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colaborador`
--

CREATE TABLE `colaborador` (
  `COD_COLAB` int(8) NOT NULL,
  `NOMBRE` varchar(20) NOT NULL,
  `APELLIDO_PAT` varchar(20) NOT NULL,
  `APELLIDO_MAT` varchar(20) NOT NULL,
  `EDA` int(3) NOT NULL,
  `DNI` int(10) NOT NULL,
  `E_MAIL` varchar(20) NOT NULL,
  `TELEFONO` int(10) NOT NULL,
  `DIRECCION` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra_credito`
--

CREATE TABLE `compra_credito` (
  `COD_COMPRA_CREDITO` int(11) NOT NULL,
  `COD_ORDEN_A_PAGAR` int(11) NOT NULL,
  `ESTADO` varchar(20) NOT NULL,
  `PRIORIDAD` int(11) NOT NULL,
  `N_CUOTAS` int(11) NOT NULL,
  `IMPORTE_TOTAL` double(8,2) NOT NULL,
  `SALDO` double(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra_factura`
--

CREATE TABLE `compra_factura` (
  `COD_ORDEN_COMPRA` int(11) NOT NULL,
  `COD_FACTURA` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cotizacion`
--

CREATE TABLE `cotizacion` (
  `COD_COTIZACION` varchar(4) NOT NULL,
  `COD_PROVEEDOR` varchar(4) NOT NULL,
  `FECHA_REGISTRO` date NOT NULL,
  `ESTADO` varchar(20) NOT NULL,
  `IMPORTE_TOTAL` double(8,2) NOT NULL,
  `FECHA_LIMITE` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `COD_DEPARTAMENTO` int(11) NOT NULL,
  `NOMBRE` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_cotizacion`
--

CREATE TABLE `detalle_cotizacion` (
  `COD_DET_COTIZACION` int(11) NOT NULL,
  `COD_PRODUCTO` int(11) NOT NULL,
  `COD_COTIZACION` varchar(4) NOT NULL,
  `CANTIDAD` int(11) NOT NULL,
  `PRECIO_UNITARIO` double(8,2) NOT NULL,
  `IMPORTE_PARCIAL` double(8,2) NOT NULL,
  `UNIDAD_MEDIDA` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distrito`
--

CREATE TABLE `distrito` (
  `COD_DISTRITO` int(11) NOT NULL,
  `COD_PROVINCIA` int(11) NOT NULL,
  `NOMBRE` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_cuenta_cobrar`
--

CREATE TABLE `historial_cuenta_cobrar` (
  `COD_HISTORIAL` int(11) NOT NULL,
  `COD_ORDEN_VENTA` int(11) NOT NULL,
  `COD_USUARIO` int(11) NOT NULL,
  `COD_FACTURA` int(11) NOT NULL,
  `FECHA_HISTORIAL` date NOT NULL,
  `OBSERVACION` varchar(80) NOT NULL,
  `AMORTIZACION` double(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_cuenta_pagar`
--

CREATE TABLE `historial_cuenta_pagar` (
  `COD_HISTORIAL` int(11) NOT NULL,
  `COD_ORDEN_COMPRA` int(11) NOT NULL,
  `COD_FACTURA` varchar(20) NOT NULL,
  `COD_USUARIO` int(11) NOT NULL,
  `OBSERVACION` varchar(80) NOT NULL,
  `FECHA_HISTORIAL` date NOT NULL,
  `AMORTIZACION` double(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_servicios`
--

CREATE TABLE `historial_servicios` (
  `COD_HISTORIAL_SERV` int(8) NOT NULL,
  `COD_ORDEN_SERV` int(8) NOT NULL,
  `COD_USUARIO` int(8) NOT NULL,
  `COD_FACTURA` varchar(20) NOT NULL,
  `FECHA_HISTORIAL` date NOT NULL,
  `OBSERVACION` varchar(50) NOT NULL,
  `AMORTIZACION` double(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `kardex`
--

CREATE TABLE `kardex` (
  `COD_REMISION` varchar(25) NOT NULL,
  `NOMBRE_PRODUCTO` varchar(50) NOT NULL,
  `PROCESO` varchar(20) NOT NULL,
  `DETALLE_PROCESO` varchar(25) NOT NULL,
  `FECHA_ENTRADA` date NOT NULL,
  `FECHA_SALIDA` date NOT NULL
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
  `N_ORDEN` int(11) NOT NULL,
  `FECHA_REGISTRO` date NOT NULL,
  `FORMA_PAGO` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden_de_pedido`
--

CREATE TABLE `orden_de_pedido` (
  `COD_ORDEN_PEDIDO` int(11) NOT NULL,
  `COD_ORDEN_REQUERIMIENTO` varchar(4) NOT NULL,
  `FECHA_REGISTRO` date NOT NULL,
  `ESTADO` varchar(20) NOT NULL,
  `IMPORTE_TOTAL` double(8,2) NOT NULL,
  `TIEMPO_ENTREGA` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden_prod_venta`
--

CREATE TABLE `orden_prod_venta` (
  `COD_PROD_VENTA` int(11) NOT NULL,
  `COD_ORDEN_VENTA` int(11) NOT NULL,
  `COD_PRODUCTO` int(11) NOT NULL,
  `CANTIDAD` int(11) NOT NULL,
  `PRECIO` double(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden_requerimiento`
--

CREATE TABLE `orden_requerimiento` (
  `COD_ORDEN_REQUERIMIENTO` varchar(4) NOT NULL,
  `COD_COTIZACION` varchar(4) NOT NULL,
  `FECHA_REGISTRO` date NOT NULL,
  `ESTADO` varchar(20) NOT NULL,
  `OBSERVACIONES` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden_venta`
--

CREATE TABLE `orden_venta` (
  `COD_ORDEN_VENTA` int(11) NOT NULL,
  `COD_VENDEDOR` int(11) NOT NULL,
  `COD_CLIENTE` int(11) NOT NULL,
  `ESTADO` varchar(20) NOT NULL,
  `TOTAL` double(8,2) NOT NULL,
  `FECHA` date NOT NULL,
  `FORMA_PAGO` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `COD_PRODUCTO` int(11) NOT NULL,
  `COD_CLASE` varchar(20) NOT NULL,
  `NOMBRE_PRODUCTO` varchar(50) NOT NULL,
  `PRECIO_VENTA` double(8,2) NOT NULL,
  `PRECIO_COMPRA` double(8,2) NOT NULL,
  `CANTIDAD` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `COD_PROVEEDOR` varchar(4) NOT NULL,
  `NOMBRE` varchar(80) NOT NULL,
  `RUC` varchar(11) NOT NULL,
  `COD_DEPARTAMENTO` int(11) NOT NULL,
  `COD_PROVINCIA` int(11) NOT NULL,
  `COD_DISTRITO` int(11) NOT NULL,
  `CALLE` varchar(80) NOT NULL,
  `NUM_EXTERNO` int(11) NOT NULL,
  `NUM_INTERNO` int(11) NOT NULL,
  `DIRECCION` varchar(100) NOT NULL,
  `TELEFONO` varchar(9) NOT NULL,
  `EMAIL` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincia`
--

CREATE TABLE `provincia` (
  `COD_PROVINCIA` int(11) NOT NULL,
  `COD_DEPARTAMENTO` int(11) NOT NULL,
  `NOMBRE` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `COD_ORDEN_SERV` int(8) NOT NULL,
  `DESCRIPCION` varchar(20) NOT NULL,
  `EMPRESA` varchar(20) NOT NULL,
  `MONTO` double(8,2) NOT NULL,
  `FECHA_PAGO` date NOT NULL,
  `ESTADO` varchar(20) NOT NULL,
  `IMPORTE_TOTAL` double(8,2) NOT NULL,
  `SALDO` double(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `COD_TIPO_USUARIO` int(11) NOT NULL,
  `DESCRIPCION` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `COD_USUARIO` int(12) NOT NULL,
  `COD_COLAB` int(8) NOT NULL,
  `USER` varchar(20) NOT NULL,
  `CLAVE` varchar(20) NOT NULL,
  `COD_TIPO_USUARIO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_credito`
--

CREATE TABLE `venta_credito` (
  `COD_VENTA_CREDITO` int(11) NOT NULL,
  `COD_ORDEN_A_PAGAR` int(11) NOT NULL,
  `ESTADO` varchar(20) NOT NULL,
  `N_CUOTAS` int(11) NOT NULL,
  `PRIORIDAD` int(8) NOT NULL,
  `IMPORTE_TOTAL` double(8,2) NOT NULL,
  `SALDO` double(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_factura`
--

CREATE TABLE `venta_factura` (
  `COD_ORDEN_VENTA` int(11) NOT NULL,
  `COD_FACTURA` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `catalogo`
--
ALTER TABLE `catalogo`
  ADD PRIMARY KEY (`NUM_CATALOGO`),
  ADD KEY `COD_PRODUCTO` (`COD_PRODUCTO`),
  ADD KEY `COD_PROVEEDOR` (`COD_PROVEEDOR`);

--
-- Indices de la tabla `clase`
--
ALTER TABLE `clase`
  ADD PRIMARY KEY (`COD_CLASE`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`COD_CLIENTE`);

--
-- Indices de la tabla `colaborador`
--
ALTER TABLE `colaborador`
  ADD PRIMARY KEY (`COD_COLAB`);

--
-- Indices de la tabla `compra_credito`
--
ALTER TABLE `compra_credito`
  ADD PRIMARY KEY (`COD_COMPRA_CREDITO`),
  ADD KEY `COD_ORDEN_COMPRA` (`COD_ORDEN_A_PAGAR`);

--
-- Indices de la tabla `compra_factura`
--
ALTER TABLE `compra_factura`
  ADD KEY `COD_ORDEN_COMPRA` (`COD_ORDEN_COMPRA`);

--
-- Indices de la tabla `cotizacion`
--
ALTER TABLE `cotizacion`
  ADD PRIMARY KEY (`COD_COTIZACION`),
  ADD KEY `COD_PROVEEDOR` (`COD_PROVEEDOR`);

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`COD_DEPARTAMENTO`);

--
-- Indices de la tabla `detalle_cotizacion`
--
ALTER TABLE `detalle_cotizacion`
  ADD PRIMARY KEY (`COD_DET_COTIZACION`),
  ADD KEY `COD_COTIZACION` (`COD_COTIZACION`),
  ADD KEY `COD_PRODUCTO` (`COD_PRODUCTO`);

--
-- Indices de la tabla `distrito`
--
ALTER TABLE `distrito`
  ADD PRIMARY KEY (`COD_DISTRITO`),
  ADD KEY `COD_PROVINCIA` (`COD_PROVINCIA`);

--
-- Indices de la tabla `historial_cuenta_cobrar`
--
ALTER TABLE `historial_cuenta_cobrar`
  ADD PRIMARY KEY (`COD_HISTORIAL`),
  ADD UNIQUE KEY `COD_FACTURA` (`COD_FACTURA`),
  ADD KEY `COD_USUARIO` (`COD_USUARIO`),
  ADD KEY `COD_ORDEN_VENTA` (`COD_ORDEN_VENTA`);

--
-- Indices de la tabla `historial_cuenta_pagar`
--
ALTER TABLE `historial_cuenta_pagar`
  ADD PRIMARY KEY (`COD_HISTORIAL`),
  ADD UNIQUE KEY `COD_FACTURA` (`COD_FACTURA`),
  ADD KEY `COD_USUARIO` (`COD_USUARIO`),
  ADD KEY `COD_ORDEN_COMPRA` (`COD_ORDEN_COMPRA`);

--
-- Indices de la tabla `historial_servicios`
--
ALTER TABLE `historial_servicios`
  ADD PRIMARY KEY (`COD_HISTORIAL_SERV`),
  ADD KEY `COD_ORDEN_SERV` (`COD_ORDEN_SERV`),
  ADD KEY `COD_USUARIO` (`COD_USUARIO`);

--
-- Indices de la tabla `kardex`
--
ALTER TABLE `kardex`
  ADD PRIMARY KEY (`COD_REMISION`),
  ADD KEY `NOMBRE_PRODUCTO` (`NOMBRE_PRODUCTO`);

--
-- Indices de la tabla `orden_de_compra`
--
ALTER TABLE `orden_de_compra`
  ADD PRIMARY KEY (`COD_ORDEN_COMPRA`),
  ADD KEY `COD_CORD_COMPRAS` (`COD_CORD_COMPRAS`),
  ADD KEY `COD_ORDEN_PEDIDO` (`COD_ORDEN_PEDIDO`);

--
-- Indices de la tabla `orden_de_pedido`
--
ALTER TABLE `orden_de_pedido`
  ADD PRIMARY KEY (`COD_ORDEN_PEDIDO`),
  ADD KEY `COD_ORDEN_REQUERIMIENTO` (`COD_ORDEN_REQUERIMIENTO`);

--
-- Indices de la tabla `orden_prod_venta`
--
ALTER TABLE `orden_prod_venta`
  ADD PRIMARY KEY (`COD_PROD_VENTA`),
  ADD KEY `COD_PRODUCTO` (`COD_PRODUCTO`),
  ADD KEY `COD_ORDEN_VENTA` (`COD_ORDEN_VENTA`);

--
-- Indices de la tabla `orden_requerimiento`
--
ALTER TABLE `orden_requerimiento`
  ADD PRIMARY KEY (`COD_ORDEN_REQUERIMIENTO`),
  ADD KEY `COD_COTIZACION` (`COD_COTIZACION`);

--
-- Indices de la tabla `orden_venta`
--
ALTER TABLE `orden_venta`
  ADD PRIMARY KEY (`COD_ORDEN_VENTA`),
  ADD KEY `COD_VENDEDOR` (`COD_VENDEDOR`),
  ADD KEY `COD_CLIENTE` (`COD_CLIENTE`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`COD_PRODUCTO`),
  ADD UNIQUE KEY `NOMBRE_PRODUCTO` (`NOMBRE_PRODUCTO`),
  ADD KEY `COD_CLASE` (`COD_CLASE`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`COD_PROVEEDOR`),
  ADD KEY `COD_DEPARTAMENTO` (`COD_DEPARTAMENTO`),
  ADD KEY `COD_PROVINCIA` (`COD_PROVINCIA`),
  ADD KEY `COD_DISTRITO` (`COD_DISTRITO`);

--
-- Indices de la tabla `provincia`
--
ALTER TABLE `provincia`
  ADD PRIMARY KEY (`COD_PROVINCIA`),
  ADD KEY `COD_DEPARTAMENTO` (`COD_DEPARTAMENTO`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`COD_ORDEN_SERV`);

--
-- Indices de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`COD_TIPO_USUARIO`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`COD_USUARIO`),
  ADD UNIQUE KEY `USER` (`USER`),
  ADD KEY `COD_TIPO_USUARIO` (`COD_TIPO_USUARIO`),
  ADD KEY `COD_COLAB` (`COD_COLAB`);

--
-- Indices de la tabla `venta_credito`
--
ALTER TABLE `venta_credito`
  ADD PRIMARY KEY (`COD_VENTA_CREDITO`),
  ADD KEY `COD_ORDEN_A_PAGAR` (`COD_ORDEN_A_PAGAR`);

--
-- Indices de la tabla `venta_factura`
--
ALTER TABLE `venta_factura`
  ADD KEY `COD_ORDEN_VENTA` (`COD_ORDEN_VENTA`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `catalogo`
--
ALTER TABLE `catalogo`
  ADD CONSTRAINT `catalogo_ibfk_2` FOREIGN KEY (`COD_PROVEEDOR`) REFERENCES `proveedor` (`COD_PROVEEDOR`);

--
-- Filtros para la tabla `compra_credito`
--
ALTER TABLE `compra_credito`
  ADD CONSTRAINT `compra_credito_ibfk_1` FOREIGN KEY (`COD_ORDEN_A_PAGAR`) REFERENCES `orden_de_compra` (`COD_ORDEN_COMPRA`);

--
-- Filtros para la tabla `compra_factura`
--
ALTER TABLE `compra_factura`
  ADD CONSTRAINT `compra_factura_ibfk_1` FOREIGN KEY (`COD_ORDEN_COMPRA`) REFERENCES `orden_de_compra` (`COD_ORDEN_COMPRA`);

--
-- Filtros para la tabla `cotizacion`
--
ALTER TABLE `cotizacion`
  ADD CONSTRAINT `cotizacion_ibfk_1` FOREIGN KEY (`COD_PROVEEDOR`) REFERENCES `proveedor` (`COD_PROVEEDOR`);

--
-- Filtros para la tabla `detalle_cotizacion`
--
ALTER TABLE `detalle_cotizacion`
  ADD CONSTRAINT `detalle_cotizacion_ibfk_1` FOREIGN KEY (`COD_COTIZACION`) REFERENCES `cotizacion` (`COD_COTIZACION`),
  ADD CONSTRAINT `detalle_cotizacion_ibfk_2` FOREIGN KEY (`COD_PRODUCTO`) REFERENCES `producto` (`COD_PRODUCTO`);

--
-- Filtros para la tabla `distrito`
--
ALTER TABLE `distrito`
  ADD CONSTRAINT `distrito_ibfk_1` FOREIGN KEY (`COD_PROVINCIA`) REFERENCES `provincia` (`COD_PROVINCIA`);

--
-- Filtros para la tabla `historial_cuenta_cobrar`
--
ALTER TABLE `historial_cuenta_cobrar`
  ADD CONSTRAINT `historial_cuenta_cobrar_ibfk_1` FOREIGN KEY (`COD_USUARIO`) REFERENCES `usuario` (`COD_USUARIO`),
  ADD CONSTRAINT `historial_cuenta_cobrar_ibfk_2` FOREIGN KEY (`COD_ORDEN_VENTA`) REFERENCES `venta_credito` (`COD_VENTA_CREDITO`);

--
-- Filtros para la tabla `historial_cuenta_pagar`
--
ALTER TABLE `historial_cuenta_pagar`
  ADD CONSTRAINT `historial_cuenta_pagar_ibfk_1` FOREIGN KEY (`COD_USUARIO`) REFERENCES `usuario` (`COD_USUARIO`),
  ADD CONSTRAINT `historial_cuenta_pagar_ibfk_2` FOREIGN KEY (`COD_ORDEN_COMPRA`) REFERENCES `compra_credito` (`COD_COMPRA_CREDITO`);

--
-- Filtros para la tabla `historial_servicios`
--
ALTER TABLE `historial_servicios`
  ADD CONSTRAINT `historial_servicios_ibfk_1` FOREIGN KEY (`COD_USUARIO`) REFERENCES `usuario` (`COD_USUARIO`),
  ADD CONSTRAINT `historial_servicios_ibfk_2` FOREIGN KEY (`COD_ORDEN_SERV`) REFERENCES `servicios` (`COD_ORDEN_SERV`);

--
-- Filtros para la tabla `kardex`
--
ALTER TABLE `kardex`
  ADD CONSTRAINT `kardex_ibfk_1` FOREIGN KEY (`NOMBRE_PRODUCTO`) REFERENCES `producto` (`NOMBRE_PRODUCTO`);

--
-- Filtros para la tabla `orden_de_compra`
--
ALTER TABLE `orden_de_compra`
  ADD CONSTRAINT `orden_de_compra_ibfk_1` FOREIGN KEY (`COD_CORD_COMPRAS`) REFERENCES `usuario` (`COD_USUARIO`),
  ADD CONSTRAINT `orden_de_compra_ibfk_2` FOREIGN KEY (`COD_ORDEN_PEDIDO`) REFERENCES `orden_de_pedido` (`COD_ORDEN_PEDIDO`);

--
-- Filtros para la tabla `orden_de_pedido`
--
ALTER TABLE `orden_de_pedido`
  ADD CONSTRAINT `orden_de_pedido_ibfk_1` FOREIGN KEY (`COD_ORDEN_REQUERIMIENTO`) REFERENCES `orden_requerimiento` (`COD_ORDEN_REQUERIMIENTO`);

--
-- Filtros para la tabla `orden_prod_venta`
--
ALTER TABLE `orden_prod_venta`
  ADD CONSTRAINT `orden_prod_venta_ibfk_1` FOREIGN KEY (`COD_ORDEN_VENTA`) REFERENCES `orden_venta` (`COD_ORDEN_VENTA`),
  ADD CONSTRAINT `orden_prod_venta_ibfk_2` FOREIGN KEY (`COD_PRODUCTO`) REFERENCES `producto` (`COD_PRODUCTO`);

--
-- Filtros para la tabla `orden_requerimiento`
--
ALTER TABLE `orden_requerimiento`
  ADD CONSTRAINT `orden_requerimiento_ibfk_1` FOREIGN KEY (`COD_COTIZACION`) REFERENCES `cotizacion` (`COD_COTIZACION`);

--
-- Filtros para la tabla `orden_venta`
--
ALTER TABLE `orden_venta`
  ADD CONSTRAINT `orden_venta_ibfk_1` FOREIGN KEY (`COD_VENDEDOR`) REFERENCES `usuario` (`COD_USUARIO`),
  ADD CONSTRAINT `orden_venta_ibfk_2` FOREIGN KEY (`COD_CLIENTE`) REFERENCES `cliente` (`COD_CLIENTE`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`COD_CLASE`) REFERENCES `clase` (`COD_CLASE`);

--
-- Filtros para la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD CONSTRAINT `proveedor_ibfk_1` FOREIGN KEY (`COD_DEPARTAMENTO`) REFERENCES `departamento` (`COD_DEPARTAMENTO`),
  ADD CONSTRAINT `proveedor_ibfk_2` FOREIGN KEY (`COD_PROVINCIA`) REFERENCES `provincia` (`COD_PROVINCIA`),
  ADD CONSTRAINT `proveedor_ibfk_3` FOREIGN KEY (`COD_DISTRITO`) REFERENCES `distrito` (`COD_DISTRITO`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`COD_COLAB`) REFERENCES `colaborador` (`COD_COLAB`),
  ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`COD_TIPO_USUARIO`) REFERENCES `tipo_usuario` (`COD_TIPO_USUARIO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
