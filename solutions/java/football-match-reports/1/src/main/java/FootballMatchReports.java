public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String result = " ";
        
        switch (shirtNum) {
            case 1:
                result = "goalie";
                break;
            case 2:
                result = "left back";
                break;
            case 3:
            case 4:
                result = "center back";
                break;
            case 5:
                result = "right back";
                break;
            case 6:
            case 7:
            case 8:
                result = "midfielder";
                break;
            case 9:
                result = "left wing";
                break;
            case 10:
                result = "striker";
                break;
            case 11:
                result = "right wing";
                break;
            default:
                result = "invalid";
                break;
        }
    return result;
    }
}
