# README.txt
#
# Copyright (C) 2012-2021 Rafael Corchuelo.
#
# In keeping with the traditional purpose of furthering education and research, it is
# the policy of the copyright owner to permit non-commercial use and redistribution of
# this software. It has been tested carefully, but it is not guaranteed for any particular
# purposes.  The copyright owner does not offer any warranties or representations, nor do
# they accept any liabilities with respect to them.

This is the Starter Project, which is intended to be a core learning asset for the students
who have enroled the Design and Testing subject of the Software Engineering curriculum of the 
University of Sevilla.  This project helps them start working on their new information system 
projects.

This is Acme Work-Plans, the second project of Group 10 for Design & Testing 2 subject
(September evaluation).

* GitHub repository: https://github.com/Jomer1998/Acme-Work-Plans-D04
* GitHub release: https://github.com/Jomer1998/Acme-Work-Plans-D04/releases/tag/v1.2.1

* Apunte sobre Clever Cloud: debido a un error, en la aplicación desplegada las URLs que contienen
"/manager" provocan errores. Para solucionarlo, se modifica el campo 'context' del war.json
y para probar la aplicación desplegada habrá que añadir a la URL que proporciona Clever Cloud
lo siguiente: "/Acme-Planner".

* Interpretaciones y consideraciones referentes al cuarto entregable:
	- Debido a que las cuentas de GitHub creadas (en un primer momento) para desplegar la
	aplicación en Clever Cloud han sido marcadas como spam (impidiendo por ello el acceso
	a Clever Cloud con dichas cuentas), se ha repetido el despliegue únicamente de la
	entrega D04 con la cuenta utilizada para subir las implementaciones del código.

* Interpretaciones y consideraciones referentes al tercer entregable:
	- Se ha modificado el valor del atributo moment en los shouts "shout01" y "shout05" en el
	sample-data.xml, con el fin de evitar errores en el test de listar shouts en el momento
	de corregir este entregable.
	
	- En casos como los listados o los shows (como por ejemplo el de Dashboard), no se han implementado casos negativos
	en los tests porque no es posible realizarlos.

* Interpretaciones y consideraciones referentes al segundo entregable:
	- La funcionalidad de hacerse manager no está implementada porque no se pide como requisito.
	Para solventar este problema (de cara al uso de la aplicación desplegada en Clever Cloud),
	se añade al initial-data.xml un manager con las siguientes credenciales: manager / manager
	
	- Al no concretarse en los requisitos lo contrario, se interpreta que no es necesario
	incluir @Past para el atributo 'moment' de la entidad Shout. Al realizarse la creación
	de un Shout, siempre estará en pasado porque así se ha implementado en el servicio
	correspondiente. La decisión de no incluir @Past se toma para poder introducir
	ejemplos de la entidad Shout con fecha de creación posterior a la del entregable,
	de forma que se simplifica la corrección al profesor al listar Shouts.
	
	- En atributos de texto para los que no se pide un máximo de longitud como, por ejemplo,
	el link opcional en un Shout, se limitan a 255 caracteres porque más resulta en un error
	al guardar en base de datos.
	
	- Para la entidad Task se pide 500 caracteres como máximo en el atributo 'description',
	pero el framework no da la posibilidad a aumentar un campo de texto a 500 caracteres en
	base de datos, por tanto, se limita al máximo posible que son 255.
	
	- Se interpreta como Task finalizada aquella cuyo final de periodo de ejecución es
	anterior al momento actual.
	
	