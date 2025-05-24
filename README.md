#  Hotel Plaza – Sistema de Gestión de Reservas

Este proyecto consiste en el desarrollo de una aplicación Java basada en los principios de la **Programación Orientada a Objetos (POO)** para la gestión de un hotel rural en la comunidad de los Ilinizas, Latacunga (Ecuador). El objetivo es mejorar la organización de reservas, atención al cliente, facturación, inventario y administración general del hotel mediante una solución tecnológica funcional y escalable.

---

##  Índice

- [ Objetivos](#-objetivos)
- [ Funcionalidades](#-funcionalidades)
- [ Arquitectura del Sistema](#-arquitectura-del-sistema)
- [ Estructura de Clases](#-estructura-de-clases)
- [ Estructura del Proyecto](#-estructura-del-proyecto)
- [ Tecnologías Utilizadas](#️-tecnologías-utilizadas)
- [ Requisitos](#-requisitos)
- [ Instrucciones de Ejecución](#️-instrucciones-de-ejecución)
- [ Pruebas](#-pruebas)
- [ Evidencias](#-evidencias)
- [ Equipo de Trabajo](#-equipo-de-trabajo)

---

##  Objetivos

- Aplicar conceptos clave de la POO: clases, objetos, herencia, encapsulación y polimorfismo.
- Diseñar diagramas UML para visualizar la arquitectura del sistema.
- Trabajar colaborativamente utilizando control de versiones (Git).
- Implementar un sistema funcional para reservas, inventario y administración hotelera.

---

##  Funcionalidades

### Cliente:
- Registrar cuenta e iniciar sesión.
- Realizar reservas.
- Cancelar reservas.
- Comprar artículos del inventario.
- Ver historial de facturas.

### Administrador:
- Iniciar sesión como administrador.
- Gestión de empleados, clientes, artículos y reservas.
- Consulta de historial de facturas y reservas.
- Control del inventario (stock y prioridad).
- Generación de facturas automáticamente.

---

##  Arquitectura del Sistema

El sistema está compuesto por los siguientes módulos principales:
- **Autenticación:** Login/registro (cliente o administrador).
- **Reservas:** Alta, consulta y cancelación.
- **Inventario:** Control de artículos, prioridades de stock, facturación.
- **Check-in / Check-out:** Validación de fechas y datos de reserva.
- **Administrador:** Panel de gestión completo.

---

## Estructura de Clases

- `Cliente`
- `Empleado`
- `Reserva`
- `Habitacion`
- `Articulo`
- `Factura`
- `Hotel` (clase central)
- `Login` / `Registro`
- `Sistema` (Main)

---

##  Estructura del Proyecto


