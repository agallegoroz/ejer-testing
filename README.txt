COUNTPOSITIVE

Para corregir el error tenemos que eliminar el igual del if ya que sino considera también el 0 un número positivo.
Si introducimos un array vacío salta la excepción nullpointerexception y no se ejecuta el código del error.
Con el test arraywithoutZero de countPositiveTest.java no se detectaría el error
Se corrige el error y ya se pasan todas las pruebas verificando que el programa es correcto en todos los casos posibles

LASTZERO

El programa se queda con el primer cero en caso de que haya varios y no con el último.Lo solucionó con last y found la que se guarda la posición del último cero.
Al igual que en el apartado anterior, si introducimos un array vacío salta la excepción nullpointerexception y no se ejecuta el código del error
Con el test arraylastZero que solo tiene un cero y conel test ArrayWithoutZero no detectariamos el error.
Corrijo el programa con lo comentado en al principio y ya se verifican todos los casos posibles

FINDLAST

Para corregir el error tenemos que guardar el último número que haya igual, como en el apartado anterior y cambiar el orden en el que se recorre el for.
Al igual que en los apartados anteriores, si introducimos un array vacío salta la excepción nullpointerexception y no se ejecuta el código del error
Con el test arrayWithElemementFound no detectamos el error.
Modifico el código para que pasen todos los test.

ODDORPOS

Tenemos que contemplar también en el if el caso de un numero impar negativo.
Con un array vacío no se ejecuta el código de error porque salta la excepción null pointer
En el test oddPositive no detectamos el error, porque no metemos un impar negativo que no están contemplados
Se añade al if lo comentado anteriormente y ya nuestro programa tendría en cuenta todos los casos
