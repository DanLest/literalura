# 📚 LiterAlura - Challenge Alura Latam

Este proyecto es una aplicación de consola desarrollada como parte del **Challenge Backend de Alura Latam**. La aplicación permite buscar libros y autores utilizando la API pública [Gutendex](https://gutendex.com/).

## 🚀 Funcionalidades
- **Búsqueda de libros:** Busca libros por título a través de la API.
- **Registro automático:** Los libros encontrados se guardan automáticamente en una base de datos local.
- **Listado interactivo:** Permite listar todos los libros registrados, autores registrados y autores vivos en un determinado año.
- **Filtros por idioma:** Opción para filtrar libros por idioma (español, inglés, francés, etc.).

## 🛠 Tecnologías Utilizadas
- **Java** (JDK 17 o superior)
- **Spring Boot** (Spring Data JPA)
- **PostgreSQL** (para la persistencia de datos)
- **Jackson** (para el consumo y procesamiento de JSON)

## 📋 Cómo ejecutar el proyecto
1. Clona este repositorio en tu máquina local.
2. Asegúrate de tener configurada tu base de datos **PostgreSQL**.
3. Configura las credenciales de tu base de datos en el archivo `application.properties`.
4. Ejecuta la clase principal (`LiterAluraApplication`) desde tu IDE favorito (IntelliJ IDEA, Eclipse, VS Code).

## 💡 Aprendizajes
Este challenge me permitió consolidar mis conocimientos en:
* Consumo de APIs externas.
* Mapeo de objetos JSON a clases Java.
* Gestión de persistencia de datos con Spring Data JPA.
