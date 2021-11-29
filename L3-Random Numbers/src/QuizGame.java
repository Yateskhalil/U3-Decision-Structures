
import javax.swing.*;
import java.util.Random;

public class QuizGame {


      static double userAnswer,correctAnswer;
      static String displayProblem=" ";
      JPanel panel;
      JButton newProblemButton, checkAnswer;
      JTextField answerInput;
      JLabel showProblem;
      JRadioButton add, sub, multiply, divide;

    public static void main(String[] args) {

        new QuizGame();

        /*createProblem();
       getUserAnswer();
       checkAnswer();*/

    }

    public QuizGame(){

       JFrame frame =new JFrame("Quiz game");
        frame.setSize(300,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel=new JPanel();
        add=new JRadioButton("Add");
        sub=new JRadioButton("Subtract");
        multiply= new JRadioButton("Multiply");
        divide= new JRadioButton("Division");


        add.setBounds(100,10, 200,30);
        sub.setBounds(100,40,200,30);
        multiply.setBounds(100,70,200,30);
        divide.setBounds(100,100,200,30);

        panel.add(add);
        panel.add(sub);
        panel.add(multiply);
        panel.add(divide);
        panel.setLayout(null);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void showResults(){

        JOptionPane.showMessageDialog(null, displayProblem);
    }
    public static void checkAnswer(){
        if (userAnswer==correctAnswer) {
            displayProblem = "You are Correct";
        }else{
            displayProblem="You are Incorrect, try again";
        }
        showResults();

    }
    public static void getUserAnswer(){

        userAnswer=input(displayProblem);
    }
    public static void createProblem(){

        int choice=Integer.parseInt(JOptionPane.showInputDialog("Choose : \nAddition(1), \nSubtraction(2), \nMultiplication(3) or \nDivision(4)"));

        if(choice <= 4){
            if (choice >= 1){
                if (choice==1){
                    addProblem();
                }
                if (choice==2){
                    subProblem();
                }
                if(choice==3){
                    multiplyProblem();
                }
                if(choice==4){
                    divProblem();

                }
            }else {
                JOptionPane.showMessageDialog(null, "Invalid Input, run program again");
                System.exit(0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Input, run program again");
            System.exit(0);
        }
    }
    public static void addProblem(){

    int num1= randomNum();
    int num2= randomNum();

     correctAnswer=num1+num2;
     displayProblem= num1+ " + "+ num2;
    }
    public static void subProblem(){

        int num1= randomNum();
        int num2= randomNum();

        correctAnswer=num1-num2;
        displayProblem= num1 +" - "+ num2;


    }
    public static void multiplyProblem(){

        int num1= randomNum();
        int num2= randomNum();

        correctAnswer=num1*num2;
        displayProblem= num1 +" X "+ num2;


    }
    public static void divProblem(){

        int num1= randomNum();
        int num2= randomNum();


        correctAnswer=(double) num1/num2;

        correctAnswer=(double)Math.round(correctAnswer*100)/100.0;
        System.out.println(correctAnswer);
        displayProblem= num1 +" / "+ num2;


    }
        //HELPER METHOD
        public static int randomNum(){
        Random random= new Random();
        return random.nextInt(20)+1;
    }
    public static double  input(String message){


        return  Double.parseDouble(JOptionPane.showInputDialog(message));



    }


}
