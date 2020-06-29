Scanner sc = new Scanner(System.in);
String pergunta = "Qual o seu Nome : ";
String nome;
String admitirString(String str) {
String nm ;
System.out.print(str);
nm = sc.nextLine();
return nm;
}
void mostraNome(String str){
System.out.printf("\n\tOla %s",str);
}
void main(){

nome = admitirString(pergunta);
mostraNome(nome);

System.out.println();
}
main()