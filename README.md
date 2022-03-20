# ParabankPOM

### **Introducción:**

El plan de pruebas está diseñado como una línea base para identificar lo que se considera dentro y fuera del alcance de las pruebas y cuáles son los riesgos.

### **Recursos:**

### **Alcance:**

Creación de un sitio web para la empresa **NOPCOMMERCE** donde sus usuarios puedes comprar equipos de informática y demás componentes electrónicos, de antemano la web deberá tener las opciones de registro y login de usuarios.

También dentro de la web estarán los productos especificados por categorías y con una descripción clara de cada uno.

Por otro lado, existirá la funcionalidad de carrito de compra donde el usuario tenga la posibilidad de agregar los productos que le interesen.

**Se Verificara:**

- Se muestre las opciones de ingresar con un usuario registrado
- Se visualice la sección de detalles de facturación.
- Se visualicen los métodos de pago.
- Se visualice el botón realizar el pedido.
- Se muestren los categorías de los productos

**Se Validara:**

- Permita elegir un solo método de pago
- Al ingresar con un usuario creado, aparezca una alerta cuando alguno de los campos obligatorios no se ha diligenciado.
- Permita continuar con el proceso si se ingresan correctamente los datos de un usuario creado.

### **Fuera de Alcance:**

- Capacidad de servidores
- Configuración de servidores
- Traducción de la página web
- No se validarán otras funcionalidades que no se encuentren descritas en el alcance.
- Las validaciones de los métodos de pago.
- No se tendrá en cuenta que el portal funcione en dispositivos móviles.

### Objetivos

- Comprobar que el sitio web haga lo que se planteo en los requerimientos
- Descubrir errores que aun no se haya descubierto
- Mostrar hasta que punto las funciones del Sitio web operan de acuerdo a lo requerido por el cliente

### **Estrategia:**

Se iniciará realizando un Smoke Test para determinar que el portal cargue correctamente, también que todos los campos están disponibles para ingresar información y que los botones se encuentren presentes.

Se ingresara al portal para validar que cada una de las opciones y categorías de los productos carguen de forma correcta y se comprobara que aparezca como mínimo un articulo perteneciente a cada categoría.

Por otra parte se procederá a finalizar la comprar de un articulo comenzando con escoger un método de pago y realizando el proceso con un usuario ya registrado

### **Escenarios**

- Compra con usuario existente.
- Despliegue de la categorías de los productos
- Despliegue del carrito de compras

### **Pruebas de Aceptación:**

Las pruebas de aceptación serán realizadas por el Product Owner y la empresa NOPCOMMERCE los cuales verificaran que el producto cumpla con los requisitos previamente establecidos.

### **Supuestos**

- Las cuentas proporcionadas deben estar registradas en el sistema.
- La página funcionará correctamente en el navegador.

### **Requisitos:**

- Se debe tener un conjunto de cuentas que ya estén registradas en el portal para las pruebas relacionadas con la finalización de compra.
- Documentación para conocer el funcionamiento de la web.

### **Infraestructura y Datos**

- El usuario y la contraseña de las cuentas que sean suministradas.
- Disponibilidad en la conexión a la red.
- Computador con sistema operativo Windows.

### **Riesgos:**

- Perdida de información por falla de Hardware Y Software
- Retraso en la entrega de los elementos de pruebas
