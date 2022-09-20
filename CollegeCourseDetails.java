import java.util.*;

public class CollegeCourseDetails {
    HashMap<String, List<String>> coursemap = new LinkedHashMap<>();

    public void courseDetails(){
        coursemap.put("Courses Offered", Arrays.asList("Engineering","Medical","Art & Science"));
        coursemap.put("Engineering",Arrays.asList("B.E - CIVIL ENGINEERING - 4 YEARS"," B.E - COMPUTER SCIENCE ENGINEERING - 4 YEARS" ,
                "B.E - ELECTRONICS AND COMMUNICATION ENGINEERING - 4 YEARS" ,
                "B.E - ELECTRICAL AND ELECTRONIC ENGINEERING -4 YEARS" ,"B.E - MECHANICAL ENGINEERING - 4 YEARS",
                "B.tech - INFORMATION TECHNOLOGY - 4 YEARS" ,"B.Arch - 5 YEARS"));
        coursemap.put("Medical",Arrays.asList("MBBS    - 5 and Half Years including internship" ,
                "B.D.S   - 5  Years including internship" ,
                "B.S.M.S - 5 Years including internship" ,
                "B.Pharm - 4 and Half Years including internship" ,
                "BAMS    - 4 Years including internship" ,
                "BHMS    - 4 Years including internship" ,
                "BNYS    - 4 Years including internship" ,
                "BUMS    - 5 and Half Years including internship"));
        coursemap.put("Arts",Arrays.asList("B.A   - TAMIL               - 3 YEARS" ,
                "B.A   - ENGLISH             - 3 YEARS" ,
                "B.sc  - Mathematics         - 3 YEARS" ,
                "B.sc  - Computer Science    - 3 YEARS" ,
                "B.com - Computer Science    - 3 YEARS" ,
                "B.Com - General             - 3 YEARS"));
        System.out.println("Courses Offered");
        List i = coursemap.get("Courses Offered");
        for(Object k :i){
            System.out.println(k);
        }
    }
    public void courseDetails(int n){
        switch (n){
            case 1:
                System.out.println("----------------Engineering Courses Details--------------------------");
                List er = coursemap.get("Engineering");
                for(Object k :er)
                    System.out.println(k);
                break;
            case 2:
                System.out.println("----------------Medical Courses Details---------------------");
                List dr = coursemap.get("Medical");
                for(Object k :dr)
                    System.out.println(k);

                break;
            case 3:
                System.out.println("-----------Arts & Science Courses Details----------------");
                List art = coursemap.get("Arts");
                for(Object k :art)
                    System.out.println(k);
                break;
            default:
                System.out.println("Please enter valid input!");
                break;
        }
    }
    public void admissionDetails(String name,String no,String mailid,String dept){
        coursemap.put("Details",Arrays.asList(name,no,mailid,dept));
        List ad = coursemap.get("Details");
        for(Object k :ad)
            System.out.println(k);
        System.out.println("Our Admission officer will contact you soon.!!!!");
    }
}
