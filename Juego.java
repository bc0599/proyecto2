package com.bcm.proyecto2;
 
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
 
public class Juego implements Game{
	
JFrame ventana,ventana1;  //Variable del tipo JFrame, sirve para crear una ventana
  
  Container con;
  
  JPanel titulo, startpanel,mainpanel,choicepanel, playerpanel;
  
  JLabel titulolabel,imagen,hplabel, hplabelnumber,weaponlabelname,weaponlabel;
  
  JTextArea maintext;

  Font tituloletra= new Font ("Boomer Tantrum", Font.PLAIN,40);
  
  JButton startbutton,choice1,choice2,choice3,choice4,choice5, choice6;
  
  Font normalFont=new Font("Eight-Bit Madness", Font.PLAIN,30);
  
  StartFunc Handler=new StartFunc();
  
  ChoiceHandler choiceHandler=new ChoiceHandler();
  
  String position;
  
  int playerlives;
  
  public static void main (String [] args) {
	  	Personaje tu=Personaje.getInstance();
	  	tu.persona("Asi se hace");
    
    new Juego();
  
  }
  
  public Juego() {
 
    ventana=new JFrame();
    
    ventana.setSize(1200,800);//Crea una panatalla de 1200x800 pixeles
    
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
    ventana.getContentPane().setBackground(Color.gray); // Escogemos un color para la ventana 
    
    ventana.setLayout(null);
    
    ventana.setVisible(true);
    
    con=ventana.getContentPane();
      
    titulo= new JPanel();
    
    titulo.setBounds(400, 100, 600, 150);
    
    titulo.setBackground(Color.gray);
    
    titulolabel= new JLabel("WHAT WOULD YOU DO?");
    
    titulolabel.setForeground(Color.black);
    
    titulolabel.setFont(tituloletra);
    
    startpanel=new JPanel();
    
startpanel.setBounds(600, 400, 200, 100);
    
    startpanel.setBackground(Color.gray);
    
    startbutton=new JButton("START");
    
    startbutton.setBackground(Color.PINK);
    
    startbutton.setForeground(Color.black);
    
    startbutton.setFont(tituloletra);
    
    startbutton.addActionListener(Handler); // Cuando se presione el boton este "reconozca" el click y llame al "handler"
    
    startbutton.setFocusPainted(false);
    
    titulo.add(titulolabel);
    
    startpanel.add(startbutton);
    
 con.add(titulo);
    
    con.add(startpanel);
    
  }

  public void creategame() {
    
    titulo.setVisible(false);
    
    startpanel.setVisible(false);
    
    mainpanel=new JPanel();
    
    mainpanel.setBounds(100,150,1200,150);
    
    mainpanel.setBackground(Color.gray);
    
    con.add(mainpanel);
    
    maintext=new JTextArea("");
    
    maintext.setBounds(100,150,1200,150);
    
    maintext.setBackground(Color.gray);
    
    maintext.setForeground(Color.black);
    
    maintext.setFont(normalFont);
      
    maintext.setLineWrap(true);
    
    mainpanel.add(maintext);
    
    choicepanel=new JPanel();
    
    choicepanel.setBounds(100,350,1200,4000000);
    
    choicepanel.setBackground(Color.gray);
    
    con.add(choicepanel);
    
    choice1=new JButton("1");
    
    choice1.setBackground(Color.black);
    
    choice1.setForeground(Color.pink);
    
    choice1.setFont(normalFont);
    
    choicepanel.add(choice1);
    
    choice1.addActionListener((ActionListener) choiceHandler);
    
    choice1.setActionCommand("c1");
    
    choice1.setFocusPainted(false);
    
    choice2=new JButton("2");
    
    choice2.setBackground(Color.black);
    
    choice2.setForeground(Color.pink);
    
    choice2.setFont(normalFont);
    
    choicepanel.add(choice2);
    
    choice2.addActionListener(choiceHandler);
    
    choice2.setActionCommand("c2");
    
    choice2.setFocusPainted(false);
      
    choice3=new JButton("3");
    
    choice3.setBackground(Color.black);
    
    choice3.setForeground(Color.pink);
    
    choice3.setFont(normalFont);
    
    choicepanel.add(choice3);

    choice3.addActionListener(choiceHandler);
    
    choice3.setActionCommand("c3");
    
    choice3.setFocusPainted(false);
    
    choice4=new JButton("4");
    
    choice4.setBackground(Color.black);
    
    choice4.setForeground(Color.pink);
    
    choice4.setFont(normalFont);
    
    choicepanel.add(choice4);
    
    choice4.addActionListener(choiceHandler);
    
    choice4.setActionCommand("c4");
    
    choice4.setFocusPainted(false);
    
    choice5=new JButton("5");
    
    choice5.setBackground(Color.black);
    
    choice5.setForeground(Color.pink);
    
    choice5.setFont(normalFont);
    
    choicepanel.add(choice5);
    
    choice5.addActionListener(choiceHandler);
    
    choice5.setActionCommand("c5");
    
    choice5.setFocusPainted(false);
    
    choice6=new JButton("6");
    
    choice6.setBackground(Color.black);
    
    choice6.setForeground(Color.pink);
    
    choice6.setFont(normalFont);
    
    choicepanel.add(choice6);
    
    choice6.addActionListener(choiceHandler);
    
    choice6.setActionCommand("c6");
    
    choice6.setFocusPainted(false);
    
    playerpanel=new JPanel();
    
    playerpanel.setBounds(100,15,1200,50);
    
    playerpanel.setBackground (Color.black);
    
    playerpanel.setLayout(new GridLayout (1,4));
    
    con.add(playerpanel);
    
    hplabel=new JLabel("HP:");
    
    hplabel.setFont(tituloletra);
    
    hplabel.setForeground(Color.pink);
    
    playerpanel.add(hplabel);
    
    hplabelnumber= new JLabel();
    
    hplabelnumber.setFont(normalFont);
    
    hplabelnumber.setForeground(Color.green);
    
    playerpanel.add(hplabelnumber);
    
    JLabel weaponlabel = new JLabel("");
    
    weaponlabel.setFont(tituloletra);
    
    weaponlabel.setForeground(Color.pink);
    
    playerpanel.add(weaponlabel);
    
    JLabel weaponlabelname = new JLabel();
    
    weaponlabelname.setFont(normalFont);
    
    weaponlabelname.setForeground(Color.green);
    
    playerpanel.add(weaponlabelname);
    
    playersetup(); 
   
  }
  
  private void playersetup() {
	  
	  playerlives=3;
	  
	  hplabelnumber.setText("" +playerlives);

	  situation();
}
  
  public void morir() {
	  
	  if(playerlives<1) {
	      
	      position="dead";
	      
	      maintext.setText("YOU ARE DEAD, THE NUMBER OF LIVES HAS REACHED CERO");
	      
	      choice1.setVisible(false);
	      
	      choice2.setVisible(false);
	      
	      choice3.setVisible(false);
	      
	      choice4.setVisible(false);
	      
	      choice5.setVisible(false);
	      
	      choice6.setVisible(true);
	      
	      choice6.setText("RESTART");
	      
	    }
  }
  
public void situation()  {
    
    playerlives=3;
    
    hplabelnumber.setText("" +playerlives);
    
    position = "start";
    
	maintext.setText("You find yourself inside a building that is about to be demolished, you have to get out using one of three elevators, that have some obstacules");
    
    choice1.setVisible(true);
    
    choice1.setText("Killer spider");
    
    choice2.setVisible(true);
    
    choice2.setText("Mosquitoes that are infected with a deadly decease");
    
    choice3.setVisible(true);
    
    choice3.setText("Boiling water");
    
    choice4.setVisible(true);
    
    choice4.setText("Neither");
    
    choice5.setVisible(false);
    
    choice6.setVisible(false);
       
  }

public void elevator1() {
    
    position = "elevator1";
    
    maintext.setText("You died");
    
    playerlives=playerlives-1;
    
    hplabelnumber.setText(""+playerlives);
    
    choice1.setVisible(false);
    
    choice2.setVisible(false);
    
    choice3.setVisible(false);
    
    choice4.setVisible(false);
    
    choice5.setVisible(true);
    
    choice5.setText("Continue");
    
    morir();
    
    }
 
  public void elevator2() {
    
    position="elevator2";
    
    maintext.setText("Correct, the mosquitoe MIGHT not bite you, it's better than just dying, right? "
    +"\nYou have entered a cave for the first time, and the path that let you in has been covered by fallen rocks\n"
        + "There is 3 tunels that you can use to get out, but they have some obstacules");
    
    choice1.setVisible(true);
 
    choice1.setText("Tunnel number one has blood-sucking bats that will poison you with a deadly disease");
    
    choice2.setVisible(true);
    
    choice2.setText("A poisonous gas fills tunnel number two, it's extremely poisonous for animals ");
    
    choice3.setVisible(true);
    
    choice3.setText("Some radioactive plants grow in tunnel number three, tha radiation will kill you immediately");
    
    choice4.setVisible(true);
    
    choice4.setText("Tunnel number four is full of lava ");
    
    choice5.setVisible(true);
  
    choice5.setText("Go back");
    
    choice6.setVisible(false);
 
    morir();
  }
  
  public void elevator3() {
    
    position="elevator3";
    
    maintext.setText("You died, the water is BOILING. What were you thinking?");
    
    playerlives=playerlives-1;
    
    hplabelnumber.setText(""+playerlives);
    
    choice1.setVisible(false);
    
    choice2.setVisible(false);
    
    choice3.setVisible(false);
    
    choice4.setVisible(false);
    
    choice5.setVisible(false);
    
    choice6.setVisible(true);
    
    choice6.setText("Continue");
    
    morir();
    
    }
  
  
  public void tunel1() {
    
    position="tunel1";
    
    maintext.setText("You are dead! The bats sucked your blood and killed you");  
    
    playerlives=playerlives-1;
    
    hplabelnumber.setText(""+playerlives);
    
    choice1.setVisible(false);
    
    choice2.setVisible(false);
    
    choice3.setVisible(false);
    
    choice4.setVisible(false);
    
    choice5.setVisible(false);
    
    choice6.setVisible(true);
    
    choice6.setText("Continue");
    
    morir();
  }
  
  public void tunel2() {
    
    position="tunel2";
    
    maintext.setText("Correct! The gas is only poisonous for animals"
        +"\r\n" + 
    "You were kidnapped by a mad scientist, who will use you for his horrible experiments. However, the scientist offers you an opportunity to escape, using one of the following doors");
    
    choice1.setVisible(true);
    
    choice1.setText("If you activate the movement sensors behind this door, liquid nitrogen will freeze you inmediately");
    
    choice2.setVisible(true);
    
    choice2.setText("If you enter the second door you will bathe in acid");
    
 choice3.setVisible(true);
    
    choice3.setText("Behind the third door, you will find a serial killer that murdered 357 people in 1836");
    
    choice5.setVisible(true);
    
    choice5.setText("Go back");
    
    choice6.setVisible(false);
    
    choice4.setVisible(true);
    
    choice4.setText("Neither");
    
    morir();
    
  }
  
public void tunel3() {
    
      position="tunel3";
    
    maintext.setText("You died! Radiation killed you immediately");
    
 playerlives=playerlives-1;
    
    hplabelnumber.setText(""+playerlives);
    
    choice1.setVisible(false);
    
    choice2.setVisible(false);
    
    choice3.setVisible(false);
    
    choice4.setVisible(false);
    
    choice5.setVisible(false);
    
    choice6.setVisible(true);
    
    choice6.setText("Continue");
    morir();
    
  }
  
public void tunel4() {
    
      position="tunel4";
    
    maintext.setText("NO!! You have been burned by lava");
    
    playerlives=playerlives-1;
    
    hplabelnumber.setText(""+playerlives);
    
    choice1.setVisible(false);
    
    choice2.setVisible(false);
    
    choice3.setVisible(false);
    
    choice4.setVisible(false);
    
    choice5.setVisible(false);
    
    choice6.setVisible(true);
    
    choice6.setText("Continue");
    
    morir();
    
    }
  
  
public void door1() {
  
  position="door1";
  
  maintext.setText("You died! You have been frozen");
  
  playerlives=playerlives-1;
  
 hplabelnumber.setText(""+playerlives);
  
  choice1.setVisible(false);
  
  choice2.setVisible(false);
  
  choice3.setVisible(false);
  
  choice4.setVisible(false);
  
  choice5.setVisible(false);
  
  choice6.setVisible(true);
  
  choice6.setText("Continue");
  
  morir();
  
  }
    
public void door2() {
  
  position="door2";
  
  maintext.setText("You died, now you know being liquid feels like");
  
  playerlives=playerlives-1;
  
  hplabelnumber.setText(""+playerlives);
  
  choice1.setVisible(false);
  
  choice2.setVisible(false);
  
  choice3.setVisible(false);
  
  choice4.setVisible(false);
  
  choice5.setVisible(false);
  
  choice6.setVisible(true);
  
  choice6.setText("Continue");
  
  morir();

	}
	 
	public void door3() {
	  
	  position="door3";
	 
	  maintext.setText("If this serial killer was killing people back in 1836 he must be dead by now\n" +"You are trapped on a dungeon, you have been given enough water and food for three days\n"+"However, you've got a chance to freedom, using one of these doors\n WARNING: If you choose incorrectly it will be an instant game over" );
	 
	  choice1.setVisible(true);
	  
	  choice1.setText("The first door leads you to a wall of fire that's five meters long");
	  
	  choice2.setVisible(true);

	  choice2.setText("The second door leads you a bear and her cub");
	  
	  choice3.setVisible(true);
	  
	  choice3.setText("This door takes you to a lake full of cocodriles, they are really hungry");
	  
	  choice4.setVisible(true);
	  
	  choice4.setText("Neither");
	  
	  choice5.setVisible(true);
	  
	  choice5.setText("Go back");
	  
	  choice6.setVisible(false);
	  morir();
	  
	}
	 
	public void neither() {
	  
	  position="neither";
	  
	  maintext.setText("NO!");
	  
	  choice1.setVisible(false);
	  
	  choice2.setVisible(false);
	  
	  choice3.setVisible(false);
	  
	  choice4.setVisible(false);
	  
	  choice5.setVisible(false);
	  
	  choice6.setVisible(true);

	  choice6.setText("Continue");
	  
	  morir();
	  }
	 
	 
	public void dungeondoor1() {
	  
	  position="dungeondoor1";
	  
	  maintext.setText("WRONG! You have been burned");
	  
	  playerlives=playerlives-1;
	  
	  hplabelnumber.setText(""+playerlives);
	  
	  choice1.setVisible(false);
	  
	  choice2.setVisible(false);
	  
	  choice3.setVisible(false);
	  
	  choice4.setVisible(false);
	  
	  choice5.setVisible(false);
	  
	  choice6.setVisible(true);
	  
	  choice6.setText("Continue");
	  
	  morir();
	  }
	 
	 
	public void dungeondoor2() {
	  
	  position="dugeondoor2";
	  
	  maintext.setText("DEAD! The bear attacked you");
	  
	  playerlives=playerlives-1;
	  
	  hplabelnumber.setText(""+playerlives);
	  
	  choice1.setVisible(false);
	  
	  choice2.setVisible(false);
	  
	  choice3.setVisible(false);
	  
	  choice4.setVisible(false);
	  
	  choice5.setVisible(false);
	  
	  choice6.setVisible(true);
	  
	  choice6.setText("Continue");
	  
	  morir();
		    }
	
	public void dungeondoor3() {
		  
		  position="dungeondoor3";
		  
		  maintext.setText("You died! the cocodriles ate you");
		  
		  playerlives=playerlives-1;
		  
		  hplabelnumber.setText(""+playerlives);
		  
		  choice1.setVisible(false);
		  
		  choice2.setVisible(false);
		  
		  choice3.setVisible(false);
		  
		  choice4.setVisible(false);
		  
		  choice5.setVisible(false);
		  
		  choice6.setVisible(true);
		  
		  choice6.setText("Continue");
		  
		  morir();
			  }
		  
		  public void neither1() {
			  
			  position="neither1";
			  
			  maintext.setText("Correct! But your are not done yet, if you don't want any of that, what would you do?");
			  
			  choice1.setVisible(true);
			  
			  choice1.setText("Use the food to distract the cocodriles and pass through the lake");
			  
			  choice2.setVisible(true);
			  
			  choice2.setText("Use your water to stop the fire ");
			  
			  choice3.setVisible(true);
			  
			  choice3.setText("Offer your food to the bear");
			  
			  choice4.setVisible(true);
			  
			  choice4.setText("Distract the cocodriles using your food in order to use the water bucket to stop the fire");
			 
			  choice6.setVisible(false);
			 
			  choice5.setVisible(true);
			  
			  choice5.setText("Go back");
			  
			  morir();
	     }
		  
		  public void opc1() {
			  
			  position="opc1";
			  
			  maintext.setText("The amount of food does not give you enough time to pass through the lake, you are dead");
			  
			  playerlives=playerlives-1;
			  
			  hplabelnumber.setText(""+playerlives);
			  
			  choice1.setVisible(false);
			  
			  choice2.setVisible(false);
			  
			  choice3.setVisible(false);
			  
			  choice4.setVisible(false);
			  
			  choice5.setVisible(false);
			  
			  choice6.setVisible(true);
			  
			  choice6.setText("Continue");
			  
			  morir();
		  }
			     
			    public void opc2() {
			      
			      position="opc2";
			      
			      maintext.setText("You do not have enough water to stop that amount of fire, you are dead");
			      
			      playerlives=playerlives-1;
			      
			      hplabelnumber.setText(""+playerlives);
			      
			      choice1.setVisible(false);
			      
			      choice2.setVisible(false);
			      
			      choice3.setVisible(false);
			      
			      choice4.setVisible(false);
			      
			      choice5.setVisible(false);
			      
			      choice6.setVisible(true);
			      
			      choice6.setText("Continue");
			      
			      morir();
			    }
			     
			    public void opc3() {
			      
			      position="opc3";
			      
			      maintext.setText("You died, the bear will attack you even if you offer your food");
			      
			      playerlives=playerlives-1;
			      
			      hplabelnumber.setText(""+playerlives);
			      
			      choice1.setVisible(false);
			      
			      choice2.setVisible(false);
			      
			      choice3.setVisible(false);
			      
			      choice4.setVisible(false);
			      
			      choice5.setVisible(false);
			      
			      choice6.setVisible(true);
			      
			      choice6.setText("Continue");
			      
			      morir();
			     
			    }
			    public void opc4() {
			    	  
			    	  position="opc4";
			    	 
			    	  maintext.setText("That's right, you`ll have to use the food to distract the cocodriles and take water from the lake, then you`ll use the water to stop the fire\n"+ "YOU WON!");
			    	  
			    	  choice1.setVisible(false);
			    	  
			    	  choice2.setVisible(false);
			    	  
			    	  choice3.setVisible(false);
			    	  
			    	  choice4.setVisible(false);
			    	  
			    	  choice5.setVisible(false);
			    	  
			    	  choice6.setVisible(true);
			    	  
			    	  choice6.setText("RESTART");
			    	  
			    	  morir();
			    	  
			    	}
			    	  
			    	public class StartFunc implements ActionListener{
			    		
			    		 public void actionPerformed(ActionEvent e) {
			    		      
			    		      creategame();
			    		        
			    		    }
			    		    
			    		  }
			    		  
			    		  public class ChoiceHandler implements ActionListener {
			    		 
			    		    
			    		    public void actionPerformed(ActionEvent e) {
			    		      
			    		      String yourchoice=e.getActionCommand(); 
			    		          
			    		      switch (position) {
			    		      
			    		      case "start":
			    		 
			    		        switch(yourchoice) {
			    		        
			    		        case "c1":elevator1();
			    		        
			    		        break;
			    		        
			    		        case"c2":elevator2();
			    		        
			    		        break;
			    		        
			    		        case "c3":elevator3();
			    		        
			    		        break;
			    		        
			    		        case "c4":neither();
			    		        
			    		        break;
			    		          
			    		        }
			    		        
			    		        break;
			    		      
			    		      case "elevator2":
			    		    
			    		        switch(yourchoice) {
			    		        
			    		        case "c1":tunel1();
			    		        
			    		          break;
			    		          
			    		        case "c2":tunel2();
			    		        
			    		            break;
			    		          
			    		        case "c3":tunel3();
			    		          
			    		          break;
			    		          
			    		        case "c4":tunel4();
			    		          
			    		          break;
			    		          
			    		        case "c5":situation();
			    		        
			    		        break;
			    		          
			    		        }
			    		        
			    		        break;
			    		      
			    		      case "neither": 
			    		    	  
			    		    	  switch(yourchoice) {
			    		          
			    		          case "c6":situation();
			    		          
			    		          break;
			    		          
			    		          }
			    		       
			    		        case "elevator3": 
			    		          
			    		          switch(yourchoice) {
			    		          
			    		          case "c6": situation(); 
			    		          
			    		          break;
			    		          
			    		          }
			    		          
			    		          break;
			    		          
			    		        case "elevator1":
			    		          
			    		          switch(yourchoice) {
			    		          
			    		          case "c5": situation();
			    		          
			    		          break;
			    		          
			    		          }
			    		          
			    		          break;
			    		          
			    		        case "tunel1":
			    		          
			    		          switch (yourchoice) {
			    		          
			    		          case "c6": elevator2();
			    		          
			    		          break;
			    		          
			    		          }
			    		          
			    		          break;
			    		          
			    		        case "tunel2":
			    		          
			    		          switch(yourchoice) {
			    		          
			    		          case "c1": door1();
			    		          
			    		          break;
			    		          
			    		          case "c2": door2();
			    		          
			    		          break;
			    		          
			    		          case "c3": door3();
			    		          
			    		          break;
			    		          
			    		          case "c4": neither();
			    		          
			    		          break;
			    		          
			    		          case "c5": elevator2();
			    		          
			    		          break;    
			    		          
			    		          }
			    		          
			    		          break;
			    		          
			    		        case "tunel3":
			    		          
			    		          switch(yourchoice) {
			    		          
			    		          case "c6": elevator2();
			    		          
			    		          break;
			    		        
			    		        }
			    		        
			    		        break;
			    		        
			    		      case "tunel4":
			    		        
			    		        switch(yourchoice) {
			    		        
			    		        case "c6": elevator2();
			    		        
			    		        break;
			    		        
			    		        }
			    		        
			    		        break;
			    		        
			    		      case "door3":
			    		        
			    		        switch(yourchoice) {
			    		        
			    		        case "c1": dungeondoor1();
			    		        
			    		        break;
			    		        
			    		        case "c2": dungeondoor2();
			    		        
			    		        break;
			    		        
			    		        case "c3": dungeondoor3();
			    		        
			    		        break;
			    		        
			    		        
			    		        case "c4": neither1();
			    		        
			    		        break;
			    		        
			    		        case "c5":tunel2(); 
			    		        
			    		        break;
			    		        
			    		        }break;
			    		        
			    		      case "dungeondoor1":
			    		    	  
			    		    	  switch(yourchoice) {
			    		    	 
			    		    	  case "c6":door3();
			    		    	
			    		    	  break;
			    		    	 
			    		    	  }
			    		    	 
			    		    	  break;
			    		    	  
			    		      case "dungeondoor2":
			    		    	 
			    		    	  switch(yourchoice) {
			    		    	 
			    		    	  case "c6": door3();
			    		    	 
			    		    	  break;
			    		    	 
			    		    	  }
			    		  
			    		    	  break;
			    		    	  
			    		      case "dungeondoor3":
			    		    	 
			    		    	  switch(yourchoice) {
			    		    	  
			    		    	  case "c6": door3();
			    		    	  
			    		    	  break;
			    		    	  
			    		    	  }
			    		    	  
			    		    	  break;
			    		    	  
			    		      case "opc1":
			    		    	  
			    		    	  switch(yourchoice) {
			    		    	  
			    		    	  case "c6":door3();
			    		    	  
			    		    	  break;
			    		    	  
			    		    	  }
			    		       
			    		    	  break;
			    		    	  
			    		      case "opc2":
			    		    	  
			    		    	  switch(yourchoice) {
			    		    	  
			    		    	  case "c6":door3();
			    		    	  
			    		    	  break;
			    		    	  
			    		    	  }
			    		       
			    		    	  break;
			    		    	  
			    		      case "opc3":
			    		    	  
			    		    	  switch(yourchoice) {
			    		    	  
			    		    	  case "c6":door3();
			    		    	  
			    		    	  break;
			    		    	  
			    		    	  }
			    		       
			    		    	  break;
			    		    	  
			    		      case "opc4":
			    		    	  
			    		    	  switch(yourchoice) {
			    		    	  
			    		    	  case"c6": situation();
			    		    	  
			    		    	  break;
			    		    	  
			    		    	  }
			    		    	  
			    		    	  break;
			    		    	  
			    		      case "door1": 
			    		        
			    		        switch(yourchoice) {
			    		        
			    		        case "c6":tunel2();
			    		        
			    		        break;
			    		        
			    		        }
			    		        
			    		        break;
			    		        
			    		      case "door2":
			    		        
			    		        switch(yourchoice) {
			    		        
			    		        case "c6": tunel2();
			    		        
			    		        break;
			    		        
			    		        }
			    		        break;    
			    		    
			    		      case"neither1":
			    		    	  
			    		             switch(yourchoice) { 
			    		               
			    		              case "c1": opc1(); 
			    		               
			    		              break; 
			    		               
			    		              case "c2": opc2(); 
			    		               
			    		              break; 
			    		               
			    		              case "c3": opc3(); 
			    		               
			    		              break; 
			    		               
			    		              case "c4": opc4(); 
			    		               
			    		              break; 
			    		               
			    		              case "c5":door3();
			    		              
			    		              break;
			    		             
			    		             }
			    		             
			    		             break; 
			    		        
			    		   case "dead":
			    		        
			    		        switch(yourchoice) {
			    		 
			    		        case "c6": situation();
			    		        
			    		        break;
			    		        
			    		        }
			    		        
			    		        break;
			    		          
			    		      }
			    		    }
			    		  }

}