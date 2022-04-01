package aula7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Aula7 {
    public static void main(String[] args) throws ParseException {
        //Aula sobre data
        
        //Date(antigo e não muito usado atualmente)
//        Date date = new Date();//instância um objeto do tipo Date com a data atual.
//        System.out.println(date);
//        
//        date.setTime(524852234L);//setar data, trabalha com milissegundos em long
//        System.out.println(date);
//        
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//usa para formatar nossa datas, cria uma máscara para os inputs, pode por horário também.
//        date = sdf.parse("04/03/2022");//outra maneira de setar data, usando o SimpleDateFormat. O .parse extende Exception, então ele deve edstar em um try catch ou adicionar a tag throws parse na classe.
//        System.out.println(date);
//        
//        System.out.println("----------------");
//        System.out.println(sdf.format(date));//para mostrar no formato definido
//        
//        System.out.println("----------------");//pegar a diferença entre datas em dias
//        Date date2 = new Date();
//        date2 = sdf.parse("18/03/2022");
//        
//        long diferenca = date2.getTime() - date.getTime();//getTime retorna a data em milissegundos
//        
//        int dias = (int) diferenca/(1000 * 60 * 60 * 24);//como diferença é long tem que usar o (int) para fazer a troca de tipagem, multicasting
//        //                         (ms   * s  * m  * h )
//        
//        System.out.println(dias);
//        
//        System.out.println("----------------");//adicionando tempo na data
//        date = new Date(date.getTime() + diferenca);
//        System.out.println(sdf.format(date));

        //Calendar (antigo e usado mais para contas com datas, mas não muito usado atualmente)
//        Calendar calendar = Calendar.getInstance();//para criar um obj Calendar usasse o getInstance, pois ele é uma classe estática.
//        
//        Date data3 = calendar.getTime();//para printar o calendar ele pode ser alocado em um obj Date, pois não possui um toString().
//        System.out.println(data3);
//        
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        calendar.setTime(sdf.parse("18/04/2022"));//para definir a data de um obj Calendar é preciso usar esse método passando um Date.
//        System.out.println("---------------");
//        System.out.println(calendar.getTime());//retorna tipo Date
//        
//        //para add tempo na data com Calendar
//        calendar.add(Calendar.YEAR, 3);//primeiro passamos a unidade de tempo, depois a quantia
//        calendar.add(Calendar.MONTH, 2);
//        calendar.add(Calendar.DAY_OF_MONTH, 7);
//        System.out.println("---------------");
//        System.out.println(calendar.getTime());
//        
//        System.out.println("---------------");
//        System.out.println(calendar.getTimeInMillis());//retorna a data em milissegundos   
//        
//        Calendar calendar2 = Calendar.getInstance();
//        System.out.println("---------------");
//        if(calendar.equals(calendar2)){ //para comparar datas
//            System.out.println("É igual");
//        }else{
//            System.out.println("É diferente");
//        }

        //LocalDate (Mais atual, recomendado e utilizado, melhoria nas classes de data, veio no Java 8, faz contas e trabalha bem com BD)
//        LocalDate localDate = LocalDate.of(2022, Month.MARCH, 18);//para instanciar um LocalDate é assim (o mês pode tbm pode ser posto como inteiro sendo Janeiro 1)
//        System.out.println(localDate);//o format padrão do LocalDate é diferente dos demais (formato de banco de dados).
//        
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");//para mudar o format do LocalDate
//        System.out.println("----------------");
//        System.out.println(localDate.format(format));
//        
//        LocalDate localDate2 = LocalDate.of(2023, Month.MAY, 10);
//        
//        Period periodo = Period.between(localDate, localDate2);//pega a diferença entre essas datas de forma detalhada
//        System.out.println("----------------");
//        System.out.println(periodo);
//        System.out.println("----------------");
//        System.out.println(periodo.getYears());//ou pode-se pegar apenas uma parte da diferença
//        System.out.println("----------------");
//        System.out.println(localDate.plusYears(4).format(format));//pode-se adicionar tempo com os métodos plus
//        System.out.println("----------------");
//        System.out.println(localDate.minusMonths(2).format(format));//pode-se retirar tempo com os métodos minus

        //LocalDateTime, LocalDate com horas
        LocalDateTime ldt = LocalDateTime.of(2022, Month.MARCH, 18, 15, 30, 05, 06);
        System.out.println(ldt);
        
        System.out.println("------------");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:nn");//HH formato 24H, hh formato 12h
        System.out.println(ldt.format(format));
        
        System.out.println("------------");
        LocalDateTime ldt2 = LocalDateTime.of(2022, Month.MARCH, 18, 15, 31);
        
        if(ldt.equals(ldt2)){ //para comparar tanto LocalDate quanto LocalDateTime
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }
        
    }
    
}
