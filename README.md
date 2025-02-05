# Java Collections Exercises

## 📌 Descripción
Este repositorio contiene una serie de ejercicios destinados a practicar y familiarizarse con el uso de **Java Collections**.

- Puedes usar cualquier **IDE** **Eclipse** o **IntelliJ** para ello, en este caso se utilizó  **IntelliJ**.

- En este repositorio no se ha utilizado ni **Maven**,ni  **Gradle**. Solo se ha ultilizado **Java**.

- El lenguaje de programación utilizado: **Java** **Openjdk23**

---

## 📝 Ejercicios

### 🏆 Nivel 1

#### 📌 Ejercicio 1
1. Crea una clase llamada `Month` con un atributo `name` (almacenará el nombre de un mes del año).
2. Añade **11 objetos** `Month` a un `ArrayList`, **excepto** el mes "Agosto".
3. Inserta el mes "Agosto" en su posición correspondiente y demuestra que la lista mantiene el orden.
4. Convierte el `ArrayList` en un `HashSet` y verifica que no permite duplicados.
5. Recorre la lista utilizando un **bucle for** y un **iterador**.

#### 📌 Ejercicio 2
1. Crea y rellena un `List<Integer>`.
2. Crea un segundo `List<Integer>` e inserta en él los elementos del primer `List`, pero en orden inverso.
3. Utiliza `ListIterator` para leer los elementos de la primera lista e insertarlos en la segunda.

#### 📌 Ejercicio 3
1. Dado el archivo `countries.txt` (ver apartado **Recursos**), el programa debe leerlo y almacenar sus datos en un `HashMap<String, String>`.
2. Solicitar el nombre del usuario/a.
3. Mostrar un país aleatorio del `HashMap` y pedir al usuario/a que introduzca la capital correspondiente.
4. Si la respuesta es correcta, sumar un punto.
5. Repetir el proceso **10 veces**.
6. Al finalizar, guardar el nombre del usuario/a y su puntuación en el archivo `classificacio.txt`.

---

### 🏆 Nivel 2

#### 📌 Ejercicio 1
1. Crea una clase `Restaurante` con los atributos `nombre` (`String`) y `puntuacion` (`int`).
2. Implementa los métodos necesarios para que un `HashSet<Restaurante>` **no permita** objetos con el mismo `nombre` y la misma `puntuacion`.
3. Puede haber restaurantes con el mismo `nombre`, pero diferente `puntuacion`.

#### 📌 Ejercicio 2
1. Modifica la clase `Restaurante` para que los objetos puedan ordenarse:
   - **Por nombre**.
   - **Por puntuación en orden descendente**.
2. Implementa la lógica necesaria para que la lista ordenada cumpla con estos criterios.

---

## 📝 Clonar el repositorio

- Puedes usar el **GitHub CLI**
  ## **gh repo clone acocinas/S103Collections**
- Puedes usar la **URL**
  ## **https://github.com/acocinas/S103Collections.git**

  ---

## 🎯 Objetivos
- Aprender y practicar con **Java Collections**.
- Comprender las estructuras de datos como **ArrayList, HashSet, HashMap y ListIterator**.
- Implementar ordenaciones personalizadas.
- Aplicar buenas prácticas en el desarrollo y gestión de repositorios GitHub.

---

## 📂 Recursos
📄 Archivo `countries.txt` con la lista de países y capitales.
