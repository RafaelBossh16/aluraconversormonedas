<img  alt="exchangeimg" width="200px" height="200px" align="right" src="https://static.vecteezy.com/system/resources/previews/015/265/011/non_2x/currency-conversion-icon-outline-style-vector.jpg" >

## Conversor de monedas

Proyecto para el programa ONE-Backend. La app está desarrollada en Java 21 para realizar la conversión de distintas monedas. Se basa en el consumo de la API de [ExchangeRate-API](https://www.exchangerate-api.com/), de este modo esta app se alimenta de la API y da como resultado la tasa de cambio entre dos monedas dadas.

## Tabla de contenidos

- [Funcionalidades de la app](#funcionalidades-de-la-app)

### Funcionalidades de la app

En estas app te encuentras 4 opciones:

    1. Hacer consulta o operación
    2. Ver historial de registros
    3. Guardar e imprimir
    4. Salir
    
4 Opciones de la aplicación:

- [1. Hacer consulta o operación](#hacer-consulta-o-operacion)
- [2. Ver historial de registros](#ver-historial-de-registros)
- [3. Guardar e imprimir](#guardar-e-imprimir)
- [4. salir](#salir) 
    
La app funciona con un listado de monedas para facilitar la interacción y ampliar las posibilidades de conversión de monedas. Este listado puede ser modificado a gusto del usuario.

Inicialmente se ejecuta un listado por defecto:

      1. Pesos Argentinos ARS -> Dólares USD
      2. Dólares USD -> Pesos Argentinos ARS
      3. Reales Brasileños BRL -> Dólares USD
      4. Dólares USD -> Reales Brasileños BRL
      5. Pesos Colombianos COP -> Dólares USD
      6. Dólares USD -> Pesos Colombianos COP
      7. x -> atrás

A continuación exploramos cada opción del menú:

### Hacer conversion de moneda
- Tienes que ingresar el monto que quieres convertir a dicho cambio respectivo según a las opciones disponibles.
- Una vez ingresas el monto te muestra la conversión con todos los datos que ingresaste.
- Luego de mostrar tu conversión, te preguntará si deseas realizar otra conversión o regresar a menu inicial.

<img width="1796" height="381" alt="imagenSalida" src="https://github.com/user-attachments/assets/ff39f6f8-5bb1-4e81-bafb-bbe7d2257915"/>
<br>
<img width="1873" height="595" alt="imagenSalida2" src="https://github.com/user-attachments/assets/9af7f4c8-465a-4c6e-a1a1-14ebf2c33f0d" />


### Ver tu historial de conversion de monedas

Al seleccionar esta opción te saldrá tu historial de todas las conversiones de moneda que haz hecho. Además, tu puedes organizar el registro según a tu preferencia según a las siguientes opciones:

    1. Ordenar por Fecha más próxima
    2. Ordenar por Fecha más antigua
    3. Ordenar por Monto Moneda Origen
    4. Ordenar por Monto Moneda Destino
    5. Ordenar por Nombre Moneda Origen
    6. Ordenar por Nombre Moneda Destino
    7. x => Volver atrás

Finalmente, te solicita que ingreses un carácter cualquiera para regresar al menú:

<img width="1856" height="630" alt="imagenSalida3" src="https://github.com/user-attachments/assets/3a296950-547c-4639-9a81-102a5bd574b6" />

### Generador de archivo.txt
Al momento de colocar la tercera de opción de guardar e imprimir. Nos dará como resultado el archivo json en un archivo txt, lo cual aparecerán todas los registros correspondientes según a las conversiones que hayamos realizado durante la ejecución del programa.

<img width="1862" height="613" alt="imagenSalida4" src="https://github.com/user-attachments/assets/d1546900-56e5-482f-8f13-f2a646117c56" />
<br>
<img width="1918" height="398" alt="imagenSalida5" src="https://github.com/user-attachments/assets/d552761d-215b-47f0-a5d3-6ac67271b02c" />

Con esta última funcionalidad mencionada, estaría completo la realización del challenge del Conversor de Monedas. Muchas gracias y pruébalo con mucho gusto!


