import java.util.*;

class abc{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
float current_alt;
float peak_alt=0;
int flight_stage=0;

System.out.println("Cansat Flight Software Initialised!");
System.out.println("Enter simulated altitudes below:");

while(true){
System.out.println("Enter current altitude in meters:");
current_alt=sc.nextFloat();

if(current_alt>peak_alt){
peak_alt=current_alt;
}

if(flight_stage==0){
if(current_alt>=10.0){
flight_stage=1;
System.out.println("Launch detected!");
}
}

else if(flight_stage==1){
if(current_alt<peak_alt){
flight_stage=2;
System.out.println("Apogee reached!");
}
}

else if(flight_stage==2){
if(current_alt<(0.8 * peak_alt)){
flight_stage=3;
System.out.println("80% altitude reached!");
}
}

else if(flight_stage==3){
if(current_alt<=2.0 && current_alt>0){
flight_stage=4;
System.out.println("2m above the ground!");
}
}

else if(flight_stage==4){
if(current_alt<=0){
flight_stage=5;
System.out.println("Touchdown!");
}
}

else if(flight_stage==5){
System.out.println("Mission completed");
break;
}

System.out.println("Current Status --> Altitude:" + current_alt + "m | Peak: " + peak_alt + "m | Stage: " + flight_stage + "\n");
}
}
}
