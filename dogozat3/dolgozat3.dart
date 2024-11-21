import 'dart:io';

void main(){

print("Mi legyen a txt neve:");
String? bekertnev = stdin.readLineSync();

TxtMaker(bekertnev);

print("milyen txt file szeretne törölni: ");
String? deletenev =stdin.readLineSync();

TxtDeleter(deletenev);

File employees = new File('employees.txt');
String employeelist=employees.readAsStringSync();
print(employeelist);

File numbers = new File('numbers.txt');
List<int> randomszamok =[8, 0, 5, 1, 3, 2, 11, 19,  1];
numbers.writeAsString(randomszamok.toString());
 List<int> szamok = numbers.readAsStringSync().split(',').map(int.parse).toList();
szamok.sort();
print(szamok);
}
String? TxtMaker(txtnev){
  File file = File(txtnev+".txt");
  if (file.existsSync()) {
    print("File already exists.");
    return null;
  }
  else{
  file.writeAsStringSync(txtnev);
  print("sikeresen létrehozva a file: "+txtnev+".txt");
  }
  return null;
}

 String? TxtDeleter(txtnev){
  File file = File(txtnev+".txt");
  if (!file.existsSync()) {
    print("File nem létezik.");
    return null;
  }
  else{
  file.deleteSync();
  print("sikeresen törölve a file: "+txtnev+".txt");  
  }
  return null;
}