package kompas.pageobjects;

import java.util.Random;

public class Helper {

    public String randomEmail(String provider) {
        String emailName;
        String names[] = {"Selvia", "Kwon", "Vivi", "Taehyung", "Wonwoo", "Jungkook", "Jimin", "Dokyeom", "Minkyu", "Jeonghan", "Jihoon", "Lee", "Park", "Kim", "Jeon", "Jung", "Yoon"};
        emailName = names[new Random().nextInt(10)];
        return (emailName  + "@" + provider + ".com").toLowerCase();
    }
}
