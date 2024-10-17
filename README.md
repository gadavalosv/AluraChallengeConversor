# Conversor de Divisas

Este proyecto es un conversor de divisas desarrollado como parte de un challenge de Alura Latam. El conversor permite transformar cantidades entre diferentes monedas utilizando datos en tiempo real de una API de tipos de cambio.

## Características

- **Conversión de divisas**: Convierte entre varias monedas latinoamericanas y el dólar estadounidense.
- **Selección intuitiva**: Los usuarios pueden seleccionar las monedas de origen y destino utilizando un menú interactivo.
- **Datos en tiempo real**: El proyecto consulta una API externa para obtener los tipos de cambio actuales.
- **Sistema modular**: La aplicación está organizada en módulos que separan la lógica del menú, consultas a la API, y cálculos de conversión.

## Monedas Soportadas

- `ARS` - Peso argentino
- `BOB` - Boliviano boliviano
- `BRL` - Real brasileño
- `CLP` - Peso chileno
- `COP` - Peso colombiano
- `USD` - Dólar estadounidense

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Gson**: Biblioteca para manejar JSON en Java.
- **API ExchangeRate**: Fuente de datos de tipos de cambio actualizados.

## Cómo Usar

1. Clona este repositorio en tu máquina local.
   ```bash
   git clone https://github.com/gadavalosv/AluraChallengeConversor.git
   ```
2. Asegúrate de tener una API Key válida para la API ExchangeRate. Coloca la clave en un archivo `apiKey.txt` en la raíz del proyecto.
3. Compila y ejecuta el proyecto con tu entorno de desarrollo favorito.

## Ejemplo de Uso

1. Selecciona la moneda que deseas convertir desde el menú.
2. Introduce la cantidad a convertir.
3. Selecciona la moneda a la cual deseas convertir.
4. Obtendrás el monto convertido basado en el tipo de cambio actual.

## Autor

**Gustavo Alejandro Dávalos Valadez**

Proyecto realizado como parte del challenge de Alura Latam.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar este proyecto, no dudes en hacer un fork y enviar un pull request.
