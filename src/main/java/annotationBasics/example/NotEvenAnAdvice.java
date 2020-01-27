package annotationBasics.example;

import common.IAdviceService;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

@Component
public class NotEvenAnAdvice implements IAdviceService {
    @Override
    public String getAdvice() {
        ArrayList<String> advices = new ArrayList<>();
        Random random = new Random();

        try{
            File file = new File("src/main/resources/advices.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                advices.add(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
         }
        return advices.get(random.nextInt(advices.size()));
    }

    @PreDestroy
    public void destroy(){
        ArrayList<String> advices = new ArrayList<>();
        Random random = new Random();

        try{
            File file = new File("src/main/resources/randomFacts.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                advices.add(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println(advices.get(random.nextInt(advices.size())));
    }
}
