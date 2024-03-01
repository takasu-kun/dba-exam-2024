import java.util.;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Enter the number of newly hired males);
        int newlyHiredMale = scanner.nextInt();

        System.out.println(Enter the number of newly hired females);
        int newlyHiredFemale = scanner.nextInt();

        System.out.println(Enter the number of permanent position males);
        int permanentMale = scanner.nextInt();

        System.out.println(Enter the number of permanent position females);
        int permanentFemale = scanner.nextInt();

        System.out.println(Enter the number of resigned males);
        int resignedMale = scanner.nextInt();

        System.out.println(Enter the number of resigned females);
        int resignedFemale = scanner.nextInt();

        int totalNew = newlyHiredMale + newlyHiredFemale;
        int totalPermanent = permanentMale + permanentFemale;
        int totalResigned = resignedMale + resignedFemale;

        double percentNewMale = (double) newlyHiredMale  totalNew  100;
        double percentNewFemale = (double) newlyHiredFemale  totalNew  100;
        double percentPermanentMale = (double) permanentMale  totalPermanent  100;
        double percentPermanentFemale = (double) permanentFemale  totalPermanent  100;
        double percentResignedMale = (double) resignedMale  totalResigned  100;
        double percentResignedFemale = (double) resignedFemale  totalResigned  100;


        System.out.println(Number of hired employee  + totalNew);
        System.out.println(Male  + percentNewMale + %);
        System.out.println(Female  + percentNewFemale + %);
        System.out.println(Number of Permanent Employee =  + totalPermanent);
        System.out.println(Male  + percentPermanentMale + %);
        System.out.println(Female  + percentPermanentFemale + %);
        System.out.println(Number of Resigned Employee =  + totalResigned);
        System.out.println(Male  + percentResignedMale + %);
        System.out.println(Female  + percentResignedFemale + %);

        scanner.close();
    }
}
