import java.util.Scanner;

class DaysOfMonth{
    public int month;
    public int year;
    public int setM(String strMonth){
        switch(strMonth){
            case "January":     case "Jan.":    case "Jan":     case "1":
                this.month=1;
                return 1;
            case "February":    case "Feb.":    case "Feb":     case "2":
                this.month=2;
                return 1;
            case "March":       case "Mar.":    case "Mar":     case "3":
                this.month=3;
                return 1;
            case "April":       case "Apr.":    case "Apr":     case "4":
                this.month=4;
                return 1;
            case "May":                                         case "5":
                this.month=5;
                return 1;
            case "June":                        case "Jun":     case "6":
                this.month=6;
                return 1;
            case "July":                        case "Jul":     case "7":
                this.month=7;
                return 1;
            case "August":      case "Aug.":    case "Aug":     case "8":
                this.month=8;
                return 1;
            case "September":   case "Sep.":    case "Sep":     case "9":
                this.month=9;
                return 1;
            case "October":     case "Oct.":    case "Oct":     case "10":
                this.month=10;
                return 1;
            case "November":    case "Nov.":    case "Nov":     case "11":
                this.month=11;
                return 1;
            case "December":    case "Dec.":    case "Dec":     case "12":
                this.month=12;
                return 1;
            default: 
                return 0;
        }
        
    }
    public int setY(int year){
        if(year>=0){
            this.year=year;
            return 1;
        }
        else return 0;
    }
    public int daysinmonth(){
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if((year%4==0&&year%100!=0)||year%400==0) return 29;
                else return 28;
            default:
                return -1;
        }
    }
}
public class DaysinMonth {
    public static void main(String agrs[]){
        Scanner keyboard1 =  new Scanner (System.in);

        DaysOfMonth my= new DaysOfMonth();
        int validM,validY;

        do{
            System.out.println("Year?");
            int Year=keyboard1.nextInt();
            validY = my.setY(Year);
        } while(validY==0);
        Scanner keyboard2 =  new Scanner (System.in);
        do{
            System.out.println("Month?");
            String strMonth=keyboard2.nextLine();
            validM = my.setM(strMonth);
        } while(validM==0);

        System.out.println("There are " + my.daysinmonth() + " days in " + my.month + "/" + my.year);
    }
}
