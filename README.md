# Banco
Un banco necesita almacenar la informaciòn de las tarjetas que poseen sus clientes. 
Hay 2 tipos de tarjetas: crédito y debito. 
Ambas tarjetas presentan el comportamiento de extracción y depósito de dinero.

Tarjeta de Credito. El saldo 0 significa que no tiene compras hechas, y puede comprar hasta llegar hasta su limite.
Atributos:
* int numero
* float saldo
* String titular
* float limite

Metodos:
+Depositar(float importe): método que representa el pago de la tarjeta, o sea que disminuye el saldo en base al importe por parametro.
+Extraer(float importe): mòntodo que representa una compra con la tarjeta, validar con el lìmite para saber si puede realizar o no la compra.

Tarjeta de Debito. Atributos
Atributos: 
* int numero
* float saldo
* String titular

Metodos:
+Depositar(float importe): móntodo que representa un depósito en el banco a la cuenta del titular
+Extraer(float importe): móntodo que representa una extracción de dinero. 
    Validar que la tarjeta tenga saldo suficiente para realizar la extracción.



Necesitan un sistema que permita (realizar estas acciones desde una clase Banco):
* Agregar una nueva tarjeta
* Depositar y extraer importes en base a número y tipo de tarjeta
* Mostrar el saldo total de las tarjetas de débito
* Mostrar el promedio de saldo de las tarjetas de crédito

Usar herencia y polimorfismo
