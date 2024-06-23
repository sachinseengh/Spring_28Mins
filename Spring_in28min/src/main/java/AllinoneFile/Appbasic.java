package AllinoneFile;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.Spring_in28min.game.GameRunner;
import com.example.Spring_in28min.game.Gamingc;
import com.example.Spring_in28min.game.Mario;

//@Configuration
//class HelloConfig {
//
//	@Bean
//	 public Gamingc game() {
//		var game = new Mario();
//		return game;
//	}
//	
//	@Bean
//	public GameRunner gmr(Gamingc game) {
//		var gm = new GameRunner(game);
//		return gm;
//		
//	}
//	
//}

//for more simplification make the AppBasic configuration and beans inside that class
@Configuration

//@component in the class whose bean we want to make and using component scan while the package path 
//helps to get the bean
@ComponentScan("com.example.Spring_in28min.game")
public class Appbasic {

	// Component helps to simplify the code as well because @component on the class
	// make the bean
//	@Bean
//	 public Gamingc game() {
//		var game = new Mario();
//		return game;
//	}

	// we can even simplify this using @component because spring automatically does
	// auto wiring
//	@Bean
//	public GameRunner gmr(Gamingc game) {
//		var gm = new GameRunner(game);
//		return gm;
//		
//	}
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(Appbasic.class)) {
			//// context.getBean("name");
			// System.out.println(context.getBean("name"));
			//
			//
			//
			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			context.getBean(Gamingc.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

//if there are more than one class having the @component then it will show error so to define
//the @primary is used 
