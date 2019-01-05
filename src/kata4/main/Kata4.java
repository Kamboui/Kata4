package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import static kata4.view.MailHistogramBuilder.build;
import static kata4.view.MailListReader.read;

public class Kata4 {
    public static void main(String[] args) {
        String filename = "email.txt";
        List<Mail> mailList = read(filename);
        Histogram <String> histogram = build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }  
}


