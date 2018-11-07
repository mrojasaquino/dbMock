# dbMock
Ejemplo de "mock-up" para acceso a base de datos por medio de jOOQ

El punto de entrada es la clase `MockTester`. En esta se ejecutan un par de ejemplos:

 * Generar una consulta utilizando la API propia de jOOQ
 * Genera una consulta por medio de los métodos de jOOQ pero utilizando una literal
   de texto con la sentencia SQL
   
   
La clase `MyDataProvider` por el momento solo devuelve una lista con un solo elemento
si es que la sentencia SQL proporcionada inicia con la palabra `SELECT`

El resultado se construye utilizando la API de jOOQ. Por este medio se crean un par
de objetos `Field<?>`, uno de tipo `Integer` para el campo `id` y otro de tipo
`String` para el campo `nombre`. Una vez hecho esto se crea un objeto de clase
`Result` el cual contendrá el "resltado" de la "consulta". A este se agrega
un "registro" con los valores para la prueba.