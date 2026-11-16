# Fase 1: Investigación y arquitectura — Control de Gastos Personales

## Problema y objetivo
Muchas personas no saben en qué gastan su dinero. La app permite registrar, categorizar y visualizar gastos de forma rápida.

## Personas
| Persona | Necesidad | Frustración actual |
|---|---|---|
| Ana, 22, estudiante | Controlar su mesada | Usa notas del celular y se desordena |
| Luis, 35, empleado | Ver a dónde se va el sueldo | Apps muy complejas |

## Competencia
| App | Fortaleza | Debilidad |
|---|---|---|
| Wallet | Reportes completos | Interfaz recargada |
| Fintonic | Automatización | Requiere vincular banco |
| Money Manager | Rápida de usar | Diseño anticuado |

**Oportunidad:** app simple, rápida, con diseño Material You.

## Requisitos
- **Funcionales:** login/registro, agregar gasto, listar gastos, resumen por categoría.
- **No funcionales:** Material 3, modo claro/oscuro, color dinámico, accesibilidad (contraste, áreas táctiles ≥ 48dp).

## Arquitectura
MVVM + Jetpack Compose. Flujo: `UI (Compose) → ViewModel → Repository → Room (fase futura)`.

```
app/src/main/java/com/example/controlgastos/
 ├─ MainActivity.kt        (NavHost: login → home)
 └─ ui/
     ├─ theme/             (Color.kt, Theme.kt con dynamic color)
     ├─ login/             (LoginScreen.kt)
     └─ home/              (HomeScreen.kt)
```

## Bocetos del Login
```
 Boceto A (centrado)      Boceto B (ilustración)       Boceto C (tarjeta)
┌──────────────┐         ┌──────────────┐          ┌──────────────┐
│    (logo)    │         │   ( logo )   │          │ ░░░░░░░░░░░░ │
│  Mis Gastos  │         │  ~~~~~~~~~~  │          │ ┌──────────┐ │
│ [ Correo   ] │         │ Bienvenido   │          │ │ Correo   │ │
│ [ Clave   👁]│         │ [ Correo   ] │          │ │ Clave    │ │
│ [  Entrar  ] │         │ [ Clave   👁]│          │ │ [Entrar] │ │
│ ¿Sin cuenta? │         │ [  Entrar  ] │          │ └──────────┘ │
└──────────────┘         └──────────────┘          └──────────────┘
```
**Decisión:** Boceto A (simplicidad, menor carga cognitiva).

## Wireframes y mockups
- Wireframes: `docs/wireframes/*.svg`
- Mockups (claro, oscuro, color dinámico): `docs/mockups/*.svg`

## Especificaciones visuales
| Elemento | Definición |
|---|---|
| Color semilla | `#006C4C` |
| Esquema | Material You (dynamic color en Android 12+), paleta propia en versiones anteriores |
| Tipografía | Escala tipográfica Material 3 |
| Formas | Esquinas redondeadas M3 |
| Íconos | Material Icons (extended) |
| Modos | Claro y oscuro |
