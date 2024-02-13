#Variables
numero=45 #Tipo numero entero int
decimal=4.5 #Tipo decimal float
texto="Hola Mundo" #Tipo texto str
print(texto) #Imprime una variable

#Métodos de String: Una variable de tipo str puede ser un objeto que tiene métods o funciones
print(texto.upper())#Mayusculas
print(texto.lower())#Minúsculas
print(texto.capitalize())#La primera palabra inicia en mayúscula
print(texto.title())#Cada Palabra Inicia En Mayúscula
print(texto.strip())#Elimina espacios antes y después de todo el texto
print(texto.find("M"))#Buscar la posición de una letra o cadena de texto (5)
print(texto.find("Mun"))#Imprimira (5) porque en 5 inicia la cadena
print(texto.find("M"))#Buscar la posición de una letra o cadena de texto (5)
nuevoTexto=(texto.replace("Mundo", "Estrellitas"))#Este metodo no combia el valor de la var texto, sólo trae el valor y reemplaza Mundo por Estrellitas
print ("Mundo" in texto)# Para saber si ("Mundo") esta en la variables texto (true)

#Operaciones y comparaciones
print(5+15)
print(numero-3)
print(5*15)
print(34/2)
print(3**3)#Potencia
print(20%4)#Modulo
num=4
num+=2
num-=2
num*=2
num/=2
print(round(1.358))#(1)
print(round(2.874))#(2)
print(abs(-36))#(36)
print(abs(567))#(567)
import math #Libreria de métodos matemáticos
print(math.ceil(1.2))#Imprime el número superior entero más cercano(2)
print(math.floor(2.899))#Imprime el número inferior entero más cercano(2)
print(math.isn(32))
#print(math.isnan("3")) error, sólo funciona con números
print(math.pow(10,3))#potencia
print(math.sqrt(9))#raiz cuadrada
#TODAS las funciones de math se encuentran en pyton.org


n1=19
n2=23
print(n1<n2)#(true)
print(n1>n2)#(False)
print(n1<=19)#(True)
print(n1==n2)#(False)

#Input
cosa=input("Ingresa tu edad")
print(cosa)
print(type(cosa))#Aunque se ingresa un numero la variable se guarda como String

#Convertir en otros datos
cosa2=input("Ingresa tu edad")
print(cosa2)
conver=int(cosa2)#Convierte cosa2 en int
print(type(conver))

#Operadores lógicos
edad=22
print (edad>18 and edad<30)#(True)
print (edad>18 or edad<30)#(True)
print (not(edad>18 and edad<30))#(False)Porque estoy negando el resultado

#Condicionales
punt=97
if punt>=95:
    print("Aprobado, excelente")#TENER EN CUENTA LA INDENTACIÓN
elif punt>=50:
    print("Aprobado")
else:
    print("Reprobado")

#if ternario
edad=15
mensaje="Es mayor" if edad>17 else "Es menor"
print(mensaje)

#Listas
lenguajes=["py", "ry", "php", "js","java"]
#indices+ 0, 1, 2, 3, 4
#indices+ -5, -4, -3, -2, -1
print(lenguajes[1])#(ry)
lenguajes[1]="Go"#En la posición 1 se pone "Go"
print(lenguajes[1:3])#Imprime desde la posición 1 hasta la 2 como un conjunto [1,3)
print(lenguajes[:3])#Desde 0 hasta 2 [0, 3)
print(lenguajes[1:])#Desde 1 hasta el último dato de la lista

#Métodos con listas
lenguaj=["py", "ry", "php", "js","java"]
lenguaj.insert(3, "Go")
print(lenguaj)
lenguaj.insert(0, "C")
print(lenguaj)
lenguaj.remove("ry")
print(lenguaj)
print("php" in lenguaj)
print(len(lenguaj))
lenguaj.clear
print(lenguaj)

#Ciclos
#Haremos uso de la lista "lenguajes"

i=1
while i<=5:
    print(i)#Se imprimirá el valor que tenga i
    i=i+1 

i=0
while i < len(lenguajes):
    print(lenguajes[i])
    i=i+1

for lenguaje in lenguajes:
    print(lenguaje)


