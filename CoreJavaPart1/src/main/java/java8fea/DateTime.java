package java8fea;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime {

    public static void main(String[] args) {



    //Date

    LocalDate today LocalDate.now();

    System.out.println("Current Date-"+today );
     
    LocalDate firstDay_2023 =LocalDate.of(2022,12,1);
    System.out.println("Specific Date="+firstDay_2023);
    
    LocalDate todayKolkata =LocalDate.now(ZoneId.of("Asia/Kolkata"));
    System.out.println("Current Date IST="+todayKolkata);
    //Time
    LocalTime time = LocalTime.now();
    System.out.println("Current Time="+time);

    LocalTime specifiacTime = LocalTime.of(12,20,25,40);
    System.out.println("Specific time of Day="+specificTime);
    
    LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
    System.out.println("Time="+timekolkata);
    
    //Date
    
    