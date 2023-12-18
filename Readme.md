# My favorite images gallery

Aplicación para subir y visualizar mis imágenes favoritas


## Requisitos:
- Como usuario será necesario poder ver una lista de mis imágenes (imagen y un título)
- Como usuario será necesario poder añadir imágenes a una base de datos
- Como usuario será necesario poder eliminar una imágen
- Como usuario será necesario poder editar una imagen existente

# Herramientas utilizadas:
- HTML5
- SASS (SCSS)
- JS
- VUE3
- Vuetify
- Vite
- Pinia
- Java
- Maven
- SpringBoot
- Postman
- Postgres



## Como configurar el proyecto

```sh
npm install
```

# En frontend

Para acceder a la parte de frontend sigue estos comandos:

```sh
cd src/main/frontend
```

Para ver el proyecto en servidor utiliza el siguiente comando:

```sh
npm run dev
```

### Compilar para producción

```sh
npm run build
```

# En backend

  ```sh
mvn clean package
```
Para compilar el proyecto utiliza el siguiente comando:

```sh
mvn compile
```

Para lanzar el servidor con Springbot utiliza el siguiente comando:

```sh
mvn spring-boot:run
```

 ### Autora
- Mari1a Villaverde https://github.com/soymariavillaverde


## Explicación del proceso de desarrollo:
Para esta prueba técnica he utilizado las tecnologi1as en las que me sentía más cómoda. Como la intención de la misma era medir mi desarrollo en backend principalmente, es la parte que está más completa.

Empecé por mostrar una estructura base y decidí hacer un proyecto monolítico. Una vez hechas las instalaciones, me centré en la construcción de la BBDD con postgres, y en como levantar el servidor sirviéndome de springboot.

Creé todo lo necesario para conectarme con la base de datos y generar los métodos para hacer las peticiones HTTP.

Una vez que la parte del back era funcional, pasé al front a hacer lo básico para que al lanzar el servidor mostrara por pantalla la página de inicio de la aplicación, aunqeu no llegué a hacer el servicio para consumir la API