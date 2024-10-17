import 'dart:io';

void main(){

String? name="";
String? getname(){
  print("kérek egy nevet: ");
  name=stdin.readLineSync();
}
String? welcome(name){
  print("Hello "+name);
}

getname();
welcome(name);

int? getPower(){
  print("kérek egy számot: ");
  int elsoszam=int.parse(stdin.readLineSync()!);

  print("kérek egy másik számozt: ");
  int masodikszam=int.parse(stdin.readLineSync()!);
  int megoldas=elsoszam;
  if(elsoszam>0 || masodikszam>0){
    for(int i=1; i<masodikszam;i++)
    {
      megoldas += megoldas*elsoszam;
    }   
  }
  else{print("imaginary number");
  }
  print(megoldas);
}
getPower();



 bool? isPrime(){
    print("kérek egy számot: ");
  int szam=int.parse(stdin.readLineSync()!);
  int oszto =1;
  for(int i=1; i<szam;i++){
    if(szam % i ==0){
      oszto++;
    }
  }
  if(oszto<=2){
    return true;
  }
  else{
    return false;
  }
 }

 isPrime();
}