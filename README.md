# pattern-template-method

## Lavarropas

Si no bastaba con lavar la ropa de casa ahora la empresa `Drean` nos contrató para rediseñar
el software de sus productos.

En un principio vamos a contar con la clase `Lavarropas` que lo único que sabe hacer es lavar ropa, sin más
(nuestro colega no estaba inspirado ese día).

La empresa desea que agreguemos diferentes programas de lavado así como la posibilidad de contar con un periodo de
enjuague y secado.

Todos los lavados cumplen con el siguiente ciclo:

* `prepararLavado():` Indica por pantalla que comenzó la carga de agua.

* `iniciarLavado():` Indica por pantalla lo establecido en el **TipoDeLavado**.
 
* `comenzarEnjuague():` Indica por pantalla que el enjuague comenzó.
      
* `centrifugar():` Indica por pantalla que el enjuague terminó y que comenzara el ciclo de centrifugado indicado en el _**TipoDeLavado**_. En caso de no tener centrifugado _**no mostrará nada**_.

### Tipos de lavado

* `lavadoNormal():` Indica por pantalla _**"Iniciando ciclo de lavado Normal Duracion 30 minutos"**_ y tendrá un ciclo de centrifugado `suave`.

* `lavadoRapido():` Indica por paltalla _**"Iniciando ciclo de lavado Rapido Duracion 15 minutos"**_ y será `sin centrifugado`.

* `lavadoExremo():` Indica por paltalla _**"Iniciando ciclo de lavado Rapido Duracion 45 minutos"**_ y será con centrifugado `extremo`. Este lavado a diferencia de los demas a mitad de ciclo va a `comenzarEnjuague()` y `prepararLavado()`. Luego continúa el ciclo normalmente.


