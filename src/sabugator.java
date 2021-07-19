import java.util.Scanner;
import java.util.Locale;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
/*import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    
    char[] c = a.toCharArray();
    char[] d = b.toCharArray();
    Arrays.sort(c);
    Arrays.sort(d);
    if (Arrays.equals(c, d)) {
        return true;
    } else {
        return false;
    }    
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. 
       StringBuffer sb = new StringBuffer(A);
       sb.reverse();
       String B= sb.toString();
       if(B.equalsIgnoreCase(A)){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
    }
}*/
/*
import com.sun.xml.internal.ws.util.StringUtils;
import java.io.*;
import java.util.*;
import java.security.*;
import java.math.*;


public class Solution  {

    public static String getSmallestAndLargest  (String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        
        int charN= s.length()-k;
        for(int i= 0;i<charN+1; i++){
            String current= s.substring(i, k+i);
            if(current.compareTo(smallest)<0){
                smallest= current;
            }
            if(current.compareTo(largest)>0){
                largest= current;
            }
            
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        //Solution.getSmallestAndLargest(s, k);
        System.out.println(getSmallestAndLargest(s, k));
    }
}
/*public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. 
        int sum = A.length()+ B.length();
        String str_1= new String(A);
        String str_2= new String(B);
        int x= A.compareTo(B);
        System.out.println(x);
        String resultOfCompare;
        if(x== -1 ||x== 2 ){
            resultOfCompare= "Yes";
        }else{
            resultOfCompare="No";
        }
        String aMaiuscula = A.substring(0, 1).toUpperCase();
        String bMaiuscula = B.substring(0, 1).toUpperCase();
        String cMaiuscula = A.substring(1, A.length());
        String dMaiuscula = B.substring(1, B.length());
        
        
        
        System.out.println(sum);
        System.out.println(resultOfCompare);
        System.out.println(aMaiuscula + cMaiuscula+ " " + bMaiuscula+ dMaiuscula );
    }
}*/

/*public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner teclado = new Scanner (System.in);
        String s = teclado.nextLine();
        MessageDigest m=MessageDigest.getInstance("SHA-256");
        m.update(s.getBytes(),0,s.length());
        System.out.println(s.length());
        
            System.out.println(new BigInteger(1,m.digest()).toString(16));
        
        
        
    }
}*/
 //K1t4fo0V
/*public static String GenerateHash(String input) throws NoSuchAlgorithmException {
        MessageDigest objSHA = MessageDigest.getInstance("SHA-256");
        byte[] bytSHA = objSHA.digest(input.getBytes());
        BigInteger intNumber = new BigInteger(1, bytSHA);
        String strHashCode = intNumber.toString(16);

        // pad with 0 if the hexa digits are less then 64.
        while (strHashCode.length() < 64) {
            strHashCode = "0" + strHashCode;
        }
        return strHashCode;
    }*/
public class sabugator {
    
    public int nen(int n){
       
        int cont= 0;
        while (n>=0){
            int dim=n-1;
            int sub=dim;
            if( sub % 2==0) {
            
                cont=cont+dim;
            }
            n=n-1;
            
        }
        return cont +1;
    }
    public void SomaTroco(double a, double b){
        
        double troco=a-b;
        System.out.println("troco"+troco);
        double cincocent=0.05;
        double dezcent=0.10;
        double vinte5cent= 0.25;
        double cinquentacent=0.50;
        double um =1.00;
        double doisr=2.00;
        double cincor=5.00;
        double dezr=10.00;
        double vinter=20.00;
        double cinquetar=50.00;
        double cemr= 100.00;
        int moeda5=0;
        int moeda10=0;
        int moeda25=0;
        int moeda50=0;
        int moeda1=0;
        int nota2=0;
        int nota5=0;
        int nota10=0;
        int nota20=0;
        int nota50=0;
        int nota100=0;
        double aux=100.00;
        if ( troco>aux){
            
            while(troco>=aux){
                troco=troco-100;
                nota100++;}
            } if(troco>50){
               troco=troco-50;
               nota50++;     
           }else if(troco>49.00){
               int cont20=(int)(troco/20);
               troco=troco-20;
               nota20++;
        }
            System.out.println("Notas de cem"+ nota100);
        }
    public void contanota(){
    Scanner teclado=new Scanner(System.in);
    int recebe= teclado.nextInt();
    int auxcem=100;
    int cem= 0;
    int cinquenta=0;
    int vinte=0;
    int dez=0;
    int cinco=0;
    int dois=0;
    int um= 0;
    float valor =100;
    valor %=100;
    do{
    if(recebe>100){
    while(recebe>=100){
        System.out.println("dentro do while");
        recebe= recebe-100;
        cem=cem+1;
    }    
    }else if(recebe >=50){
        recebe=recebe-50;
        cinquenta=+1;
    }else if(recebe>=20){
        recebe= recebe-20;
        vinte=vinte+1;
    }else if(recebe>=10){
        recebe=recebe-10;
        dez=+1;
    }else if(recebe>=5){
        recebe=recebe-5;
        cinco=+1;
    }else if(recebe>=2){
        recebe=recebe-2;
        dois=dois+1;
    }else if(recebe>=1){
        recebe=recebe -1;
        um=+1;
    }
        
    }while(recebe!=0);
    System.out.printf("%d nota(s) de R$ 100,00\n",cem);
    System.out.printf("%d nota(s) de R$ 50,00\n",cinquenta);
    System.out.printf("%d nota(s) de R$ 20,00\n",vinte);
    System.out.printf("%d nota(s) de R$ 10,00\n",dez);
    System.out.printf("%d nota(s) de R$ 5,00\n",cinco);
    System.out.printf("%d nota(s) de R$ 2,00\n",dois);
    System.out.printf("%d nota(s) de R$ 1,00\n",um);
    }
    public void idade(){ 
        Scanner teclado= new Scanner(System.in);
        System.out.println("Digite a idade");
        int idade= teclado.nextInt();
        int anos=0;
        int meses=0;
        int dias=0;
        if (idade>=365){
            while (idade>=365){
                idade=idade-365;
                anos= anos+1;
            }
        } if(idade>=30){
            while(idade>=30){
            idade=idade-30;
            meses=meses+1;
            dias=idade;
        }
        }
        System.out.printf("%d ano (s)",anos);
        System.out.printf("%d mes (es)",meses);
        System.out.printf("%d dia (s)",dias);
    }
    
    public void testsel(){
         Scanner teclado=new Scanner(System.in);
         System.out.println("Entre os valores");
       int a= teclado.nextInt();
       int b= teclado.nextInt();
       int c= teclado.nextInt();
       int d= teclado.nextInt();
       
       if((b>c & d>a) &(c+d > a+b)){
           if(c>=0 & d>=0){
               if(a%2==0){
                   System.out.print("Valores aceitos");
               }
           }
       }else{
           System.out.print("Valores não aceitos");
       }
    }
    public void calculaValorLanche(){
        Scanner teclado=new Scanner(System.in);
        int cod=teclado.nextInt();
        int qtd=teclado.nextInt();
        double valor=0.00;
        switch(cod){
        case 1:
        valor= qtd*4.00;
        break;
    case 2:
        System.out.println("opção 2");
        valor= qtd*4.50;
        break;
    case 3:
        valor= qtd*5.00;
        System.out.println("opção3");
        System.out.println(valor);
        break;
    case 4:
        valor= qtd*2.00;
        break;
    case 5:
        valor= qtd*1.50;
        break;
        }
    System.out.printf("Total: R$ %.2f\n",valor);    
 
    }
    public void intervalo(){
        Scanner teclado =new Scanner(System.in);
    double valor=teclado.nextInt();
    if(valor>0 && valor<=25){
        System.out.println("Intervalo (0,25]");
        
    }else if(valor>25 && valor<=50){
        System.out.println("Intervalo [25,50]");
        
    }else if(valor>50 && valor<=75){
        System.out.println("Intervalo (50,75]");
        
    }else if(valor>75 && valor<=100){
        System.out.println("Intervalo (75,100]");
        
    }else{
        System.out.println("Fora de intervalo");
    }
    }
    public void crescente(){
        Scanner teclado=new Scanner(System.in);
      int a=teclado.nextInt();
      int b=teclado.nextInt();
      int c=teclado.nextInt();
      
      int menor=0;
      int meio=0;
      int maior=0;
      
      if (a>b && a>c){
          maior=a;
          if(b>c){
              meio=b;
              menor=c;
          }else{
              meio=c;
              menor=b;
          }
      }else if(b>a && b>c){
          maior=b;
          if(a>c){
              meio=a;
              menor=c;
          }else{
              meio=c;
              menor=a;
          }  
      }else if(c>a && c>b){
          maior=c;
          if(b>a){
              meio=b;
              menor=a;
          }else{
              meio=a;
              menor=b;
          }  
      }
      System.out.println(menor);
      System.out.println(meio);
      System.out.println(maior);
      System.out.println("");
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
    }
    
    public void media(){
        Scanner teclado=new Scanner(System.in);
      double nota1=teclado.nextDouble();
      double nota2=teclado.nextDouble();
      double nota3=teclado.nextDouble();
      double nota4=teclado.nextDouble();
     
      double media=( (nota1*2 +nota2*3+ nota3*4 +nota4*1)/10);
      System.out.printf("Média:%.1f\n",media);
      if(media>=7.0){
          System.out.println("Aluno aprovado.\n");
      }else if(media<5.0){
          System.out.println("Aluno reprovado.\n");
      }else{
          System.out.println("Aluno em exame.\n");
          double exame=teclado.nextDouble();
          System.out.println("Nota do exame:"+ exame);
          double media2= (media+ exame) /2;
          if(media2>=5.0){
              System.out.print("Aluno aprovado.\n");
              System.out.printf("Media final%.1f\n",media2);
          }else{
              System.out.println("Aluno reprovado.\n");
              System.out.println("Media final\n"+ media2);
          }
      }
    }
    public void multiplos(){
         Scanner teclado=new Scanner(System.in);
        int a= teclado.nextInt();
        int b= teclado.nextInt();
        
        if (b %a==0){
            System.out.print("Sao Multiplos");
        }else{
            System.out.print("Nao sao Multiplos");
        }
    }
    public void horarios(){
         Scanner teclado=new Scanner(System.in);
        int hora_inicial= teclado.nextInt();
        int min_inicial= teclado.nextInt();
        int hora_final= teclado.nextInt();
        int min_final= teclado.nextInt();
        
        if(min_final==0){
            min_final=60;
        }
        
        int total_hora= hora_final - hora_inicial;
        int total_min=  min_final-min_inicial;
        
        System.out.println("total hora"+total_hora);
        System.out.println("total_min: "+total_min);
        
          if(hora_inicial==hora_final &&min_inicial==min_final){
            total_hora=24;
            total_min=0;
        } 
          
          if(hora_final< hora_inicial){
              int aux=hora_inicial-hora_final;
            total_hora=24-aux;
              System.out.println("Entrou na caceta do if");
              System.out.println(total_hora);
        }
          if(min_final< min_inicial){
              int aux=min_inicial-min_final;
            total_min=60-aux;
              System.out.println("Entrou na caceta do if");
              System.out.println(total_hora);
        }
          System.out.println("total hora depois do if"+total_hora);
        if(total_min<0){
            total_min=total_min*-1;
        }
        int converte_hora=total_hora*60*60;
        System.out.println("hora em segundos"+converte_hora);
        System.out.println("mf"+min_final);
        System.out.println("mi"+min_inicial);
        int converte_min=total_min*60;
        if(converte_hora==3600 && min_final ==60 ||converte_hora==3600 && min_final < min_inicial ){
            
            converte_hora=0;
            total_min=60-min_inicial;
            System.out.println("hora em segundos no if"+converte_hora);
            System.out.println("total minutos no if"+converte_min);
        }
        System.out.println("hora em segundos 2: "+converte_hora);
        
        System.out.println("converte min"+ converte_min);
        int tempo_convertido_segundos= converte_hora+converte_min;
        System.out.println("total tempo convertido seg"+tempo_convertido_segundos);
        int tempo_em_minutos=tempo_convertido_segundos /60;
        System.out.println("marcador" +tempo_em_minutos);
        int horas=0;
        int minutos=0;
        if (tempo_em_minutos>=60){
        while(tempo_em_minutos >=60){
            tempo_em_minutos=tempo_em_minutos -60;
            horas=horas+1;
            System.out.println("dentro do while"+horas);
            minutos=tempo_em_minutos;
        }}else{
            minutos=tempo_em_minutos;
        }
        System.out.printf("Horas: %d ,Minutos: %d",horas,minutos);
    }
    public void hora2(){
        Scanner leitor = new Scanner(System.in);
		int hInicio = leitor.nextInt();
		int mInicio = leitor.nextInt();
		int hFim = leitor.nextInt();
		int mFim = leitor.nextInt();
		int totalH = hFim - hInicio;
		int totalM = mFim - mInicio;
		
		if (totalH < 0) {
			totalH = 24 + (hFim - hInicio);
		}
		
		if (totalM < 0) {
			totalM = 60 + (mFim - mInicio);
			totalH--;
		}
		
		if (hInicio == hFim && mInicio == mFim) System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		else System.out.println("O JOGO DUROU "+ totalH + " HORA(S) E " + totalM + " MINUTO(S)");
    }
    public void salario(){
        Locale.setDefault(Locale.US);
        Scanner teclado=new Scanner(System.in);
       
       double salario =teclado.nextInt();
       double reajuste;
       int percentual;
       double novosalario;
       if(salario>0 && salario<=400.00){
           
           reajuste=salario*0.15;
           percentual=15;
          novosalario=salario + reajuste;
       }else if(salario>=400.01 && salario<=800.00){
           reajuste=salario*0.12;
           percentual=12;
            novosalario=salario + reajuste;
       }else if(salario>=800.00 && salario<=1200.00){
           reajuste=salario*0.10;
           percentual=10;
            novosalario=salario + reajuste;
       }else if(salario>=1200.01 && salario<=2000.00){
           reajuste=salario*0.07;
           percentual=7;
            novosalario=salario + reajuste;
       }else{
           reajuste=salario*0.04;
           percentual=4;
            novosalario=salario + reajuste;
       }
        System.out.printf("Novo salario %.2f\n", novosalario);
        System.out.printf("Reajuste ganho %.2f\n", reajuste);
        System.out.printf("Novo salario %d" + percentual + " %\n");
    }
    public void salario2(){
        Scanner teclado=new Scanner(System.in);
                double salario = teclado.nextDouble();
		double reajuste;
		double novoSalario;
		int percent;
		
		if (salario >= 0 && salario <= 400) {
			reajuste = salario * 0.15;
			novoSalario = salario + reajuste;
			percent = 15;
		} else if (salario > 400 && salario <= 800) {
			reajuste = salario * 0.12;
			novoSalario = salario + reajuste;
			percent = 12;
		} else if (salario > 800 && salario <= 1200) {
			reajuste = salario * 0.10;
			novoSalario = salario + reajuste;
			percent = 10;
		} else if (salario > 1200 && salario <= 2000) {
			reajuste = salario * 0.07;
			novoSalario = salario + reajuste;
			percent = 7;
		} else {
			reajuste = salario * 0.04;
			novoSalario = salario + reajuste;
			percent = 4;
		}
    }
    public int fatorial(int num){
        if (num==0){
            System.out.println("dentro do if");
            return 1;
        }
        System.out.println("num" +num);
        System.out.println("resultado do fatorial:  "+num*fatorial(num-1));
        return num*fatorial(num-1);
    }
    
    public int lista(){
        
        return 0;
    }
    
    }
        
    

