# 🚀 Practica 07 - Mejora de Arrastre de Imágenes

## 📝 Descripción

Este proyecto es una práctica enfocada en mejorar la interacción del usuario con **ImageViews** en Android, permitiendo el **arrastre de imágenes** por la pantalla. Al tocar y mover una imagen, esta sigue el movimiento del dedo sin retrasos, proporcionando una experiencia de usuario fluida y responsiva.

La aplicación tiene dos imágenes (una más pequeña y otra más grande) que se pueden mover de forma independiente al arrastrarlas sobre la pantalla. La posición de las imágenes se actualiza en tiempo real mientras se mueve el dedo, usando el evento **MotionEvent** para controlar el movimiento.

## ⚙️ Tecnologías usadas

- Android SDK 34  
- Java (MainActivity)  
- ConstraintLayout
- MotionEvent
- Gradle Kotlin DSL (`build.gradle.kts`)

## 📐 Diseño UI

El layout principal (`activity_main.xml`) utiliza **ConstraintLayout** para posicionar las imágenes:

- **ImageView 1**: Imagen pequeña (50dp x 50dp), que puede ser arrastrada libremente por la pantalla.
- **ImageView 2**: Imagen más grande (150dp x 200dp), también interactiva y arrastrable.

Ambas imágenes tienen un `OnTouchListener` para detectar los eventos de movimiento y actualizar su posición.

## 🚀 Ejecución

1. Abrir el proyecto en **Android Studio** con el SDK 34 configurado.
2. Ejecutar en un **dispositivo/emulador con Android 11 (API 30)** o superior.
3. Tocar y arrastrar las imágenes para ver cómo se mueven en tiempo real.

## 📌 Versionado

Este proyecto utiliza **Git** y **GitHub** para el control de versiones, lo que permite mantener un registro detallado de los cambios realizados durante el desarrollo.

## 📄 Licencia

Este proyecto está bajo la [MIT License](./LICENSE).

## 🎁 Expresiones de Gratitud  

Podéis invitarme a una cerveza 🍺 o un café ☕.  
Gracias por la lectura 🤓.  
