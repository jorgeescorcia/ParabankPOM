# ParabankPOM

### **Introducción:**

El plan de pruebas está diseñado como una línea base para identificar lo que se considera dentro y fuera del alcance de las pruebas y cuáles son los riesgos.

### **Recursos:**
| Tester | Participación | 
--- | --- | 
|Jorge Escorcia | 100% | 

### **Alcance:**

Para las diferentes historias de usuario se realizarán las validaciones utilizando el sistema operativo Windows con el navegador Web Google Chrome


**Se Verificara:**
Modulos
- Login
- Register
- ContactUs

HU1: yo como usuario necestio validar la funcionalidad de login exitoso y fallido

se verificara la funcionalidad de login ingresando usuario previamente registrado, por otro lado
se validará que cuando el usuario no ingrese texto en usuario del login el sistema no le de acceso a la web

HU2: Yo como usuario necesito validar la funcionalidad de registro exitoso y fallido

Se verificara la funcionalidad de registo en la web cuando el usuario llene todos los campos del formulario, 
tambien se verificara que si el usurio no ingresa texto en algun campo, el usuario no podra registrarse

HU3: Yo como usuario necesito validar la funcionalidad de contacto exitoso y fallido

se verificara que el usuario pueda enviar el mensaje a soporte llenando todos los campos requeridos, por otra parte
se validara que si el usuario no ingresa ningun valor en unos de los campos, el mensaje de contacto no sera enviado



### **Fuera de Alcance:**

- Capacidad de servidores
- Configuración de servidores
- Traducción de la página web
- No se validarán otras funcionalidades que no se encuentren descritas en el alcance.
- No se tendrá en cuenta que el portal funcione en dispositivos móviles.

### Objetivos

- Comprobar que el sitio web haga lo que se planteo en los requerimientos
- Descubrir errores que aun no se haya descubierto
- Mostrar hasta que punto las funciones del Sitio web operan de acuerdo a lo requerido por el cliente

### **Estrategia:**

Se iniciará realizando un Smoke Test para determinar que el portal cargue correctamente, también que todos los campos están disponibles para ingresar información y que los botones se encuentren presentes.

Se ingresara al portal para validar que cada una de las opciones y que los modulos de Login, Register y ContactUs sean accesibles

Por otro lado las pruebas se realizara de forma automatizada utilizando las siguientes herramientas
- Selenium
- Cucumber
- Java
- POM / Page Factory


### **Escenarios**

- Compra con usuario existente.
- Despliegue de la categorías de los productos
- Despliegue del carrito de compras

### **Pruebas de Aceptación:**

Las pruebas de aceptación serán realizadas por el Product Owner y la empresa ParaBank los cuales verificaran que el producto cumpla con los requisitos previamente establecidos.

### **Supuestos**

- Las cuentas proporcionadas deben estar registradas en el sistema.
- La página funcionará correctamente en el navegador.

### **Requisitos:**

- Se debe tener un conjunto de cuentas que ya estén registradas en el portal para las pruebas relacionadas con el acceso a la web.
- Documentación para conocer el funcionamiento de la web.

### **Infraestructura y Datos**

- El usuario y la contraseña de las cuentas que sean suministradas.
- Disponibilidad en la conexión a la red.
- Computador con sistema operativo Windows.

### **Riesgos:**

- Perdida de información por falla de Hardware Y Software
- Retraso en la entrega de los elementos de pruebas
