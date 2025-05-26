# Taller-Progrmaci-n-RC5
# 📌 Sistema de Gestión de Reservas para el Hotel Plaza

## 🏨 Introducción

En la comunidad de los Ilinizas, en Latacunga, provincia de Cotopaxi, se encuentra el Hotel Plaza, un establecimiento único en la zona que recibe a un importante número de turistas, especialmente en temporadas altas, con más de 200 visitantes en fechas de feriado. 

Al ser el único alojamiento en el área, este hotel enfrenta múltiples desafíos de gestión debido a la falta de personal capacitado y recursos tecnológicos. La escasa infraestructura y las limitadas capacidades en tecnología dificultan la organización de reservas y una adecuada atención al cliente, aspectos esenciales para una experiencia turística de calidad.

Estudios recientes subrayan la importancia de capacitar al personal local en temas de hospitalidad y administración, así como de impulsar iniciativas de turismo sostenible que permitan desarrollar infraestructura sin comprometer el entorno natural (OMT, 2015; Calvopiña Andrade, 2018).

No obstante, la falta de un sistema digital en el "Hotel Plaza" ha provocado pérdidas económicas, quejas de los visitantes, desorganización en la asignación de habitaciones y otros problemas, afectando tanto a la economía del hotel como a la experiencia turística en la zona.

A nivel general, los alojamientos rurales en Ecuador enfrentan desventajas considerables, como la baja conectividad y el acceso limitado a sistemas tecnológicos, factores que obstaculizan la adopción de plataformas digitales. Esto es especialmente relevante si se considera que solo el 38% de los hogares en zonas rurales de Ecuador cuenta con conexión a internet, frente al 70,1% en áreas urbanas (Revista Gestión).

Ante este panorama, surge la necesidad de analizar y proponer soluciones que permitan a los hoteles rurales mejorar su capacidad de respuesta y organización para garantizar una experiencia turística de calidad.

---

## 🎯 Objetivos

- Entender a profundidad los conceptos fundamentales de la POO, como clases, objetos, herencia, encapsulación y polimorfismo, y aplicarlos en el desarrollo de una aplicación funcional.

- Aprender a crear diagramas UML (como el de clases), que ayuden a visualizar la arquitectura y las interacciones del sistema.

- Adquirir experiencia en trabajo colaborativo, usando herramientas de control de versiones y comunicación para coordinar el desarrollo del sistema.

---

## 📋 Requerimientos Funcionales

### ✅ RF1. Registro de Clientes
El sistema debe permitir registrar la información básica de un cliente: nombre completo y número de cédula.

### ✅ RF2. Visualización de la Disponibilidad de Habitaciones
El sistema debe permitir consultar si las habitaciones están disponibles u ocupadas.

### ✅ RF3. Reserva de Habitaciones
El sistema debe permitir que un cliente realice una reserva, siempre que exista al menos una habitación disponible.

### ✅ RF4. Asignación Automática de Habitaciones
El sistema debe asignar automáticamente una habitación disponible al cliente cuando se realiza una reserva.

### ✅ RF5. Creación de Reservas con Fechas
El sistema debe registrar la fecha de inicio y fecha de fin de cada reserva.

### ✅ RF6. Registro de Reservas
El sistema debe almacenar las reservas realizadas, incluyendo cliente, habitación asignada y fechas.

### ✅ RF7. Actualización del Estado de Habitaciones
Cuando se crea una reserva, la habitación correspondiente debe pasar a estado "ocupada".

### ✅ RF8. Visualización de Detalles de Reserva
El sistema debe mostrar los detalles de la reserva (cliente, habitación, fechas) una vez esta ha sido creada.

---

## 📊 Identificación del Problema / Descripción de Datos

### 👤 Persona
- ¿Qué es?  
  Clase base que representa a una persona con datos básicos.

- Atributos:  
  - nombre: nombre completo de la persona.  
  - cedula: número de identificación.

- Métodos:  
  - getNombre(), getCedula(): obtienen los datos personales.  
  - mostrarInfo(): muestra por consola el nombre y la cédula.

- ¿Para qué sirve?  
  Sirve como clase base para representar a cualquier persona. En este caso, es usada por la clase Cliente.

---

### 🧾 Cliente (hereda de Persona)
- ¿Qué es?  
  Representa a un cliente que va a hacer una reserva en el hotel.

- ¿Para qué sirve?  
  Se utiliza para almacenar y acceder a la información del cliente que hace una reserva.

---

### 🛏 Habitacion
- ¿Qué es?  
  Representa una habitación dentro del hotel.

- Atributos:  
  - numero: número de habitación.  
  - disponible: indica si está libre (true) u ocupada (false).

- Métodos:  
  - getNumero(), estaDisponible(): consultan estado.  
  - ocupar(), liberar(): cambian el estado de disponibilidad.

- ¿Para qué sirve?  
  Sirve para gestionar la disponibilidad de cada habitación dentro del hotel.

---

### 📅 Reserva
- ¿Qué es?  
  Representa una reserva hecha por un cliente para una habitación en un rango de fechas.

- Atributos:  
  - cliente: cliente que realiza la reserva.  
  - habitacion: habitación asignada.  
  - fechaInicio, fechaFin: fechas de la reserva.

- Método:  
  - mostrarDetalle(): imprime los detalles de la reserva.

- ¿Para qué sirve?  
  Almacena la información de cada reserva realizada, incluyendo cliente, habitación y fechas.

---

### 🏨 Hotel
- ¿Qué es?  
  Clase que gestiona todo el funcionamiento del hotel: habitaciones, reservas y disponibilidad.

- Atributos:  
  - habitaciones: lista de habitaciones del hotel.  
  - reservas: lista de reservas realizadas.

- Métodos:  
  - inicializarHabitaciones(): crea 5 habitaciones numeradas.  
  - buscarHabitacionDisponible(): busca una habitación libre.  
  - crearReserva(cliente, fechaInicio, fechaFin): crea una reserva.  
  - mostrarDisponibilidad(): muestra estado de habitaciones.

- ¿Para qué sirve?  
  Centraliza y administra las habitaciones y reservas. Es el “corazón” del sistema.

---

### 🧪 SistemaHotel (clase principal)
- ¿Qué es?  
  Clase principal con el método main, que se usa para ejecutar el programa.

- ¿Qué hace?  
  - Crea una instancia del hotel.  
  - Crea dos clientes.  
  - Muestra la disponibilidad inicial.  
  - Crea dos reservas.  
  - Muestra la disponibilidad después de las reservas.

- ¿Para qué sirve?  
  Es el punto de entrada al sistema. Simula la ejecución y prueba del programa.

---

## 📋 Requerimientos del Sistema Hotelero

### 🧑‍💼 Clientes y Usuarios

| Rol      | Descripción                                            |
|----------|--------------------------------------------------------|
| Cliente  | Propietarios y administradores del Hotel              |
| Usuario  | Personal del hotel como administrativo y Clientes     |

---

### ✅ Requerimientos Funcionales

| Código | Requerimiento                                                                 |
|--------|--------------------------------------------------------------------------------|
| RF1    | Registro de Clientes: El sistema debe permitir registrar la información básica de un cliente: nombre completo y número de cédula. |
| RF2    | Visualización de la Disponibilidad de Habitaciones: El sistema debe permitir consultar si las habitaciones están disponibles u ocupadas. |
| RF3    | Reserva de Habitaciones: El sistema debe permitir que un cliente realice una reserva, siempre que exista al menos una habitación disponible. |
| RF4    | Asignación Automática de Habitaciones: El sistema debe asignar automáticamente una habitación disponible al cliente cuando se realiza una reserva. |
| RF5    | Creación de Reservas con Fechas: El sistema debe registrar la fecha de inicio y fecha de fin de cada reserva. |
| RF6    | Registro de Reservas: El sistema debe almacenar las reservas realizadas, incluyendo cliente, habitación asignada y fechas. |
| RF7    | Actualización del Estado de Habitaciones: Cuando se crea una reserva, la habitación correspondiente debe pasar a estado "ocupada". |
| RF8    | Visualización de Detalles de Reserva: El sistema debe mostrar los detalles de la reserva (cliente, habitación, fechas) una vez esta ha sido creada. |

---

### ❌ Requerimientos No Funcionales

| Código | Requerimiento                                                                 |
|--------|--------------------------------------------------------------------------------|
| RNF1   | Utilizar Java como lenguaje de programación.                                  |
| RNF2   | Almacenamiento de datos en una base de datos (SQL).                           |
| RNF3   | Optimización para funcionar con conectividad limitada en áreas rurales.       |
| RNF4   | Cumplir con normativas locales de turismo e impuestos.                        |

---
## INTEGRANTES Y SUS ROLES

| ROL           | LIDER                                                     |
|---------------|------------------------------------------------------------|
| Cliente       | Alejandro Acosta                                          |
| Analista      | Dereck Proaño                                             |
| Arquitecto    | Dereck Proaño                                             |
| Desarrollador | Alejandro Acosta, Dereck Proaño, Fernando Salazar        |
| Tester        | Fernando Salazar                                          |
| Líder         | Dereck Proaño                                             |
