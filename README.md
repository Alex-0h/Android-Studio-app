# Control de Gastos — Práctica de Interfaces Móviles

Prototipo de interfaz (Login + Home) de una app de control de gastos personales con **Material 3** y **Material You** (color dinámico), hecho con Kotlin y Jetpack Compose.

## Contenido
- `app/` — código del proyecto Android Studio
- `docs/01-investigacion-y-arquitectura.md` — investigación y arquitectura
- `docs/sketches/` — bocetos (agregar fotos)
- `docs/wireframes/` — wireframes (SVG)
- `docs/mockups/` — mockups claro / oscuro / dinámico (SVG)

## Tecnologías
Kotlin 2.0 · Jetpack Compose (BOM 2024.09.00) · Material 3 · Navigation Compose · minSdk 26 · targetSdk 34

## Cómo ejecutar
1. Instala **Android Studio Koala (2024.1.1) o superior** (incluye JDK 17).
2. `File → Open` y elige la carpeta del proyecto. Espera el *Gradle Sync* (necesita internet la primera vez).
3. Crea o elige un emulador **API 31+** (para ver Material You) y pulsa **Run ▶**.
4. En el login escribe cualquier correo válido (ej. `ana@correo.com`) y una contraseña de 6+ caracteres.

## Probar Material You
Con el emulador en API 31+: *Ajustes → Fondo de pantalla y estilo →* cambia el fondo; los colores de la app cambian automáticamente. En API < 31 se usa la paleta de respaldo (semilla `#006C4C`).

## Capturas
Agrega aquí capturas de pantalla de la app (carpeta `docs/screenshots/`).
