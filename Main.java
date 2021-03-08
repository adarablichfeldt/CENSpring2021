//Written by Adara Blichfeldt
package application;
	
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.beans.value.ChangeListener;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane p = new Pane();
			StackPane root = new StackPane();
			Scene scene = new Scene(p,800,900);
			
			Label b = new Label();
			b.setLayoutX(100);
			b.setLayoutY(50);
			
			 ScrollBar s = new ScrollBar(); 
			 //s.setLayoutY(scene.getHeight()-s.getHeight());
			 s.setMin(0);  
			 s.setPrefHeight(900);
		        //s.setMax(900); 
		        s.setOrientation(Orientation.VERTICAL);  
		        //s.setUnitIncrement(20);  
		        //s.setBlockIncrement(20); 
		        
		        s.valueProperty().addListener(new ChangeListener<Number>() {
		            public void changed(ObservableValue<? extends Number> ov,
		                Number old_val, Number new_val) {
		                    p.setLayoutY(-new_val.doubleValue());
		                }
		        });
			
			b.setText(" Once upon a midnight dreary, while I pondered, weak and weary,\r\n"
					+ "Over many a quaint and curious volume of forgotten lore�\r\n"
					+ "While I nodded, nearly napping, suddenly there came a tapping,\r\n"
					+ "As of some one gently rapping, rapping at my chamber door.\r\n"
					+ "\"'Tis some visitor,\" I muttered, \"tapping at my chamber door�\r\n"
					+ "Only this and nothing more.\"\r\n"
					+ "\r\n"
					+ "Ah, distinctly I remember it was in the bleak December,\r\n"
					+ "And each separate dying ember wrought its ghost upon the floor.\r\n"
					+ "Eagerly I wished the morrow;�vainly I had sought to borrow\r\n"
					+ "From my books surcease of sorrow�sorrow for the lost Lenore�\r\n"
					+ "For the rare and radiant maiden whom the angels name Lenore�\r\n"
					+ "Nameless here for evermore.\r\n"
					+ "\r\n"
					+ "And the silken sad uncertain rustling of each purple curtain\r\n"
					+ "Thrilled me�filled me with fantastic terrors never felt before;\r\n"
					+ "So that now, to still the beating of my heart, I stood repeating\r\n"
					+ "\"'Tis some visiter entreating entrance at my chamber door�\r\n"
					+ "Some late visiter entreating entrance at my chamber door;\r\n"
					+ "This it is and nothing more.\"\r\n"
					+ "\r\n"
					+ "Presently my soul grew stronger; hesitating then no longer,\r\n"
					+ "\"Sir,\" said I, \"or Madam, truly your forgiveness I implore;\r\n"
					+ "But the fact is I was napping, and so gently you came rapping,\r\n"
					+ "And so faintly you came tapping, tapping at my chamber door,\r\n"
					+ "That I scarce was sure I heard you\"�here I opened wide the door�\r\n"
					+ "Darkness there and nothing more.\r\n"
					+ "\r\n"
					+ "Deep into that darkness peering, long I stood there wondering, fearing,\r\n"
					+ "Doubting, dreaming dreams no mortals ever dared to dream before;\r\n"
					+ "But the silence was unbroken, and the stillness gave no token,\r\n"
					+ "And the only word there spoken was the whispered word, \"Lenore?\"\r\n"
					+ "This I whispered, and an echo murmured back the word, \"Lenore!\"�\r\n"
					+ "Merely this and nothing more.\r\n"
					+ "\r\n"
					+ "Back into the chamber turning, all my soul within me burning,\r\n"
					+ "Soon again I heard a tapping something louder than before.\r\n"
					+ "\"Surely,\" said I, \"surely that is something at my window lattice;\r\n"
					+ "Let me see, then, what thereat is and this mystery explore�\r\n"
					+ "Let my heart be still a moment and this mystery explore;�\r\n"
					+ "'Tis the wind and nothing more.\r\n"
					+ "\r\n"
					+ "Open here I flung the shutter, when, with many a flirt and flutter,\r\n"
					+ "In there stepped a stately Raven of the saintly days of yore.\r\n"
					+ "Not the least obeisance made he; not a minute stopped or stayed he,\r\n"
					+ "But, with mien of lord or lady, perched above my chamber door�\r\n"
					+ "Perched upon a bust of Pallas just above my chamber door�\r\n"
					+ "Perched, and sat, and nothing more.\r\n"
					+ "\r\n"
					+ "Then the ebony bird beguiling my sad fancy into smiling,\r\n"
					+ "By the grave and stern decorum of the countenance it wore,\r\n"
					+ "\"Though thy crest be shorn and shaven, thou,\" I said, \"art sure no craven,\r\n"
					+ "Ghastly grim and ancient Raven wandering from the Nightly shore�\r\n"
					+ "Tell me what thy lordly name is on the Night's Plutonian shore!\"\r\n"
					+ "Quoth the Raven, \"Nevermore.\"\r\n"
					+ "\r\n"
					+ "Much I marvelled this ungainly fowl to hear discourse so plainly,\r\n"
					+ "Though its answer little meaning�little relevancy bore;\r\n"
					+ "For we cannot help agreeing that no living human being\r\n"
					+ "Ever yet was blessed with seeing bird above his chamber door�\r\n"
					+ "Bird or beast upon the sculptured bust above his chamber door,\r\n"
					+ "With such name as \"Nevermore.\"\r\n"
					+ "\r\n"
					+ "But the Raven, sitting lonely on that placid bust, spoke only\r\n"
					+ "That one word, as if its soul in that one word he did outpour\r\n"
					+ "Nothing farther then he uttered; not a feather then he fluttered�\r\n"
					+ "Till I scarcely more than muttered: \"Other friends have flown before�\r\n"
					+ "On the morrow he will leave me, as my Hopes have flown before.\"\r\n"
					+ "Then the bird said \"Nevermore.\"\r\n"
					+ "\r\n"
					+ "Startled at the stillness broken by reply so aptly spoken,\r\n"
					+ "\"Doubtless,\" said I, \"what it utters is its only stock and store,\r\n"
					+ "Caught from some unhappy master whom unmerciful Disaster\r\n"
					+ "Followed fast and followed faster till his songs one burden bore�\r\n"
					+ "Till the dirges of his Hope that melancholy burden bore\r\n"
					+ "Of 'Never�nevermore.'\"\r\n"
					+ "\r\n"
					+ "But the Raven still beguiling all my sad soul into smiling,\r\n"
					+ "Straight I wheeled a cushioned seat in front of bird and bust and door;\r\n"
					+ "Then, upon the velvet sinking, I betook myself to linking\r\n"
					+ "Fancy unto fancy, thinking what this ominous bird of yore�\r\n"
					+ "What this grim, ungainly, ghastly, gaunt, and ominous bird of yore\r\n"
					+ "Meant in croaking \"Nevermore.\"\r\n"
					+ "\r\n"
					+ "This I sat engaged in guessing, but no syllable expressing\r\n"
					+ "To the fowl whose fiery eyes now burned into my bosom's core;\r\n"
					+ "This and more I sat divining, with my head at ease reclining\r\n"
					+ "On the cushion's velvet lining that the lamp-light gloated o'er,\r\n"
					+ "But whose velvet violet lining with the lamp-light gloating o'er\r\n"
					+ "She shall press, ah, nevermore!\r\n"
					+ "\r\n"
					+ "Then, methought, the air grew denser, perfumed from an unseen censer\r\n"
					+ "Swung by Seraphim whose foot-falls tinkled on the tufted floor.\r\n"
					+ "\"Wretch,\" I cried, \"thy God hath lent thee�by these angels he hath sent thee\r\n"
					+ "Respite�respite and nepenthe from thy memories of Lenore!\r\n"
					+ "Quaff, oh quaff this kind nepenthe and forget this lost Lenore!\"\r\n"
					+ "Quoth the Raven, \"Nevermore.\"\r\n"
					+ "\r\n"
					+ "\"Prophet!\" said I, \"thing of evil!�prophet still, if bird or devil!�\r\n"
					+ "Whether Tempter sent, or whether tempest tossed thee here ashore,\r\n"
					+ "Desolate, yet all undaunted, on this desert land enchanted�\r\n"
					+ "On this home by Horror haunted�tell me truly, I implore�\r\n"
					+ "Is there�is there balm in Gilead?�tell me�tell me, I implore!\"\r\n"
					+ "Quoth the Raven, \"Nevermore.\"\r\n"
					+ "\r\n"
					+ "\"Prophet!\" said I, \"thing of evil!�prophet still, if bird or devil!\r\n"
					+ "By that Heaven that bends above us�by that God we both adore�\r\n"
					+ "Tell this soul with sorrow laden if, within the distant Aidenn,\r\n"
					+ "It shall clasp a sainted maiden whom the angels name Lenore�\r\n"
					+ "Clasp a rare and radiant maiden whom the angels name Lenore.\"\r\n"
					+ "Quoth the Raven, \"Nevermore.\"\r\n"
					+ "\r\n"
					+ "\"Be that our sign of parting, bird or fiend!\" I shrieked, upstarting�\r\n"
					+ "\"Get thee back into the tempest and the Night's Plutonian shore!\r\n"
					+ "Leave no black plume as a token of that lie thy soul has spoken!\r\n"
					+ "Leave my loneliness unbroken!�quit the bust above my door!\r\n"
					+ "Take thy beak from out my heart, and take thy form from off my door!\"\r\n"
					+ "Quoth the Raven, \"Nevermore.\"\r\n"
					+ "\r\n"
					+ "And the Raven, never flitting, still is sitting, still is sitting\r\n"
					+ "On the pallid bust of Pallas just above my chamber door;\r\n"
					+ "And his eyes have all the seeming of a demon's that is dreaming\r\n"
					+ "And the lamp-light o'er him streaming throws his shadows on the floor;\r\n"
					+ "And my soul from out that shadow that lies floating on the floor\r\n"
					+ "Shall be lifted�nevermore!\r\n"
					+ "\r\n"
					+ "");
			
//			String line;  
//	        int count = 0;  
//	          
//	        HashMap<String, Integer> map = new HashMap<>();
//	        
//	        //Opens a file in read mode  
//	        FileReader file = new FileReader("Raven.txt");  
//	        BufferedReader br = new BufferedReader(file);  
//	              
//	        //Gets each line till end of file is reached  
//	        while((line = br.readLine()) != null) {  
//	            //Splits each line into words  
//	            String words[] = line.split(" ");  
//	            //Counts each word  
//	            count = count + words.length; 
//	            
//	            for (String w : words) {
//	                Integer l = map.get(w);
//	                l = (l == null) ? 1 : ++l;
//	                map.put(w, l);
//	                //Collection<Integer> values = w.values();
//	               // Collections.sort(n, );
//	               
//	                //Collections.reverseOrder()
//	                
//	                //Collections.sort(map);
//	                Label Ranking = new Label();
//	                Ranking.setLayoutX(500);
//        			Ranking.setLayoutY(50);
//        			p.getChildren().add(Ranking);
//	                for (int i = 0; i < 1; i++) {
//	                	Ranking.setText(w + ": " + l + "\n");
//	                	//Label Ranking = new Label();
//	        	        
//		                }
//	                
//	            }
//	            
//	        }
	            //
	            //do a for loop until 20
	            
                //map.forEach((w, n) -> { 
                
	        
	        
	        //System.out.println("Number of words present in given file: " + count);  
	        
	        //br.close();  
			
			p.getChildren().add(b);
			p.getChildren().add(s);
			
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
