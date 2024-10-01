import 'dart:io';

void main() {
  print("1.feladat");
  print(" ");
  print("kérek egy számot: ");
  int number = int.parse(stdin.readLineSync()!);
  print("kérek egy másik számot");
  int number2 = int.parse(stdin.readLineSync()!);
  if(number>number2){
    print("$number nagyobb szám");
    print("$number2 kisebb szám");
  }else if(number<number2){
    print("$number kisebb szám");
    print("$number2 nagyobb szám");
  }
  else{
    print("egyenlők az oldalak");
  }

  print("");
  if(number==number2){
    print("négyzet");
    print(" ");
    print("kerület");
    print(number2*4);
    print("");
    print("területe:");
    print(number*number2);
  }
  else{
    print("téglalap");
    print(" ");
    print("kerület");
    print(2*(number+number2));
    print("");
    print("területe:");
    print(number*number2);
  }
  print("");
  print("2.feladat");
  print("");
  print("kérek egy számot: ");
  int szam = int.parse(stdin.readLineSync()!);
  print("kérek egy masik számot");
  int szam2 = int.parse(stdin.readLineSync()!);
  print("kérek egy utolsó számot");
  int szam3 = int.parse(stdin.readLineSync()!);
  if(szam+szam2>szam3&&szam+szam3>szam2&&szam2+szam3>szam){
    print("lehet háromszöget alkotni");
  }
  else{
   print("nem lehet háromszöget alkotni :C");
  }
  print("");
  print("3.feladat");
  print("");
  int nagyszam;

  while (true) {
    print("adj meg 3 jegyű számot:");
    nagyszam = int.parse(stdin.readLineSync()!);

    if (nagyszam.abs() >= 100 && nagyszam.abs() <= 999) {
      break; 
    } else {
      print("nem 3 jegyű kérek újat");
    }
  }
  int primszam =0;
  for (int i = 1; i <= nagyszam; i++) {
    if (nagyszam % i == 0) {
      primszam++;
    }
  }
  if (primszam == 1) {
    print("A megadott szám primszám. ");
  } else {
    print("A megadott szám nem primszám. ");
  }
  print("");
  print("4.feladat");
  print("");

 print("Kérek egy számot:");
  int cica = int.parse(stdin.readLineSync()!);

  if (cica == 0) {
    print("elfelejtettem hogy kell hiba kódot kiírtani");
  } else {
    double eredmeny = 100 / cica.toDouble();
    print(eredmeny.toStringAsFixed(2)); 
  }
}