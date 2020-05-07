# pattern-template-method

## Lavarropas

Si no bastaba con lavar la ropa de casa ahora la empresa `Drean` nos contrató para rediseñar
el software de sus productos.

En un principio vamos a contar con la clase `Lavarropas` que lo unico que sabe hacer es lavar ropa sin más.

La empresa desea que agreguemos diferentes programas de lavado asi como la posibilidad de contar con un periodo de
enjuague y secado.

Todos los lavados cumplen con el siguiente ciclo:

* `prepararLavado():` Indicará por pantalla que comenzó la carga de agua.

* `iniciarLavado():` Indicara por pantalla que el ciclo de peparacion termino y comienza el lavado en el tiempo establecido
 en el `TipoDeLavado`.
 
* `comenzarEnjuague():` Indicará por pantalla que el enjuague comenzó.
      
* `centrifugar():` Indicara por pantalla que el enjuague terminó y que comenzara el ciclo de enjuaje indicado en el `TipoDeLavado`


### Tipos de lavado

* `lavadoNormal():` Este lavado durará `30 minutos` y tendra un ciclo de centrifugado `suave`.

* `lavadoRapido():` Este lavado durará `15 minutos` y será `sin centrifugado`.

* `lavadoExremo():` Este lavado durará `45 minutos` y será `extremo`.
