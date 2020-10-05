    package Recuperacioncadenas;
    import java.util.Scanner;
    public class RecuperacionCADENAS {
    public static int x;
    public static char y[];
    public static int z=0; 
    public static Scanner sc = new Scanner (System.in);
    public static String str;  
    public static void Cadenas() {
    System.out.print("Colocar la cadena:\n");
    str=sc.next();}    
    public static void Comparar() {
    x=str.length();
    y=new char[x];        
    for(int i=0; i<str.length();i++) {            
    if(str.charAt(i)=='['){
    y[z]='[';z++;}
    else if(str.charAt(i)==']'){
    if(z==0) {
    break;} else{z--;
    if(str.charAt(i)=='{'){
    y[z]='{';z++;} 
    else if(str.charAt(i)=='}'){
    if(z==0) { break;} 
    else{z--;}}
    if(str.charAt(i)=='('){
    y[z]='(';z++;} 
    else if(str.charAt(i)==')'){
    if(z==0) { break; } 
    else{z--; } } } } } }    
    public static void Resultados() {
    if(z==0){
    System.out.println("Correcto");
    } else{
    System.out.println("Incorrecto");
    } } }
  
