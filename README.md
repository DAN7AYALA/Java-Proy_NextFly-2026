NEXTFLY – Sistema de Gestión de Contenido Multimedia
📌 Resumen Técnico
NEXTFLY es una aplicación Java basada en consola que implementa un sistema de gestión de contenido multimedia, simulando una plataforma de streaming.

El sistema permite administrar películas y documentales mediante operaciones CRUD parciales, búsqueda avanzada y simulación de reproducción.

🏗 Arquitectura del Sistema
Estructura por paquetes
- nextfly.play
  - Main (punto de entrada)
- contenido
  - Contenido (clase base)
  - Pelicula
  - Documental
  - Genero
  - ResumenContenido
- plataforma
  - Plataforma (núcleo de la lógica)
- util
  - ScannerUtils (captura segura de datos)
  - FileUtils (persistencia)
- excepcion
  - PeliculaExistenteException

🔄 Flujo de Ejecución
  1. Se instancia la clase Plataforma.
  2. Se cargan contenidos desde archivo.
  3. Se calcula la duración total disponible.
  4. Se muestran contenidos promocionables.
  5. Se inicia un menú interactivo en bucle.
  6. El usuario ejecuta acciones hasta salir.

🧠 Principios Aplicados
  - Programación Orientada a Objetos
  - Polimorfismo en manejo de contenidos
  - Excepción personalizada para control de duplicados
  - Uso de colecciones (List)
  - Streams y funciones lambda
  - Separación de responsabilidades
  - Constantes inmutables con static final

📋 Funcionalidades
| Opción | Función                      |
|--------|------------------------------|
| 1      | Agregar contenido            |
| 2      | Mostrar todos los contenidos |
| 3      | Buscar por título            |
| 4      | Buscar por género            |
| 5      | Ver populares                |
| 6      | Reproducir                   |
| 7      | Buscar por tipo              |
| 8      | Eliminar                     |
| 9      | Salir                        |

▶️ Ejecución del Proyecto
*Requisitos
  - Java JDK 17+
  - Terminal / CMD

Verificar instalación:
  - java -version
  - javac -version

Compilar (Windows):
  - javac -d out src\nextfly\play\**\*.java
    
Ejecutar:
  - java -cp out nextfly.play.Main
    
