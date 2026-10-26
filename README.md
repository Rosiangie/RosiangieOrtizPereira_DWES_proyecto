# Proyecto Pokémon

## Autor
**Nombre:** Rosiangie Nicol
**Apellidos** Ortiz Pereira

Aplicación web basada en el universo Pokémon. La plataforma permite validar un formulario de entrada con el nombre de un entrenador para mostrar un catálogo de Pokémon cargados desde un archivo JSON. Además, incluye la funcionalidad de consultar la información detallada de cada Pokémon mediante enlaces de referencia directos.

## Tabla de Contenidos
- [Características](#características)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Instalación y Configuración](#instalación-y-configuración)
- [Uso](#uso)
- [Peticiones de la Aplicación](#peticiones-de-la-aplicación)

---

## Características
- Validación de formulario de entrada para el nombre del entrenador.
- Carga y procesamiento de datos de Pokémon a partir de un archivo en formato JSON.
- Vista detallada e individual para cada Pokémon accesible mediante enlaces de referencia.
- Cumplimiento funcional completo con los requerimientos del proyecto.

## Tecnologías Utilizadas
- **Lenguaje:** Java 25
- **Framework Principal:** Spring Boot
- **Motor de Plantillas:** Thymeleaf
- **Formato de Datos:** JSON

## Instalación y Configuración

Sigue estos pasos para clonar y ejecutar la aplicación en tu entorno local:

1. Clona el repositorio en tu equipo:
   \`\`\`bash
   git clone https://github.com/Rosiangie/RosiangieOrtizPereira_DWES_proyecto.git
   \`\`\`

2. Navega al directorio del proyecto:
   \`\`\`bash
   cd RosiangieNicolOrtiz_DWES_proyecto
   \`\`\`

3. Ejecuta el bean o la clase principal desde tu IDE IntelliJ IDEA.

## Uso

Una vez iniciado el servidor, abre tu navegador e ingresa a la siguiente dirección:

\`\`\`
http://localhost:8082
\`\`\`

## Peticiones de la Aplicacion

Peticiones HTTP que atiende el servidor
| Método HTTP | Ruta | Descripción | Tipo de Respuesta |
| :--- | :--- | :--- | :--- |
| **GET** | `/` | Muestra la página principal con el formulario de acceso para el entrenador. | Página HTML (Thymeleaf) |
| **POST** | `/entrenador` | Recibe y valida los datos del formulario (nombre del entrenador). Si es válido, procesa la información y muestra el catálogo. | Página HTML (Catálogo) o redirección si la validación falla |
| **GET** | `/pokemon/{id}` | Consulta y muestra la información detallada del Pokémon seleccionado a partir de su referencia si ni existe, redirige a /notfound. | Página HTML con el detalle |