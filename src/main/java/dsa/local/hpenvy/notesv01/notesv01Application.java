package dsa.local.hpenvy.notesv01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class notesv01Application {
    	public static void main(String[] args) {
            System.out.println("Woher kommen Sie");
		    SpringApplication.run(notesv01Application.class, args);
	}
}
