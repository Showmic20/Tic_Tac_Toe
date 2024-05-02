import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.*;
import java.awt.*;
public class Tic_Tac extends WindowAdapter implements WindowListener, ActionListener {

    private Frame f;
    Panel P ;
    Button Zero0 , Zero1, Zero2, One0, One1, One2, Two0, Two1, Two2;
    Dialog D;
    public Tic_Tac () {
        f = new Frame("Tic Tac Toe");
        P = new Panel(new GridLayout(3, 3));
        f.add(P);
        Font myFont = new Font("",Font.BOLD,55);

        // P.setBackground(Color.BLACK);
        Zero0 = new Button();
        Zero0.setFont(myFont);
        Zero0.setActionCommand("00");
        Zero1 = new Button();
        Zero1.setActionCommand("01");
        Zero1.setFont(myFont);
        Zero2 = new Button();
        Zero2.setFont(myFont);
        Zero2.setActionCommand("02");
        One0 = new Button();
        One0.setActionCommand("10");
        One0.setFont(myFont);
        One1 = new Button();
        One1.setActionCommand("11");
        One1.setFont(myFont);
        One2 = new Button();
        One2.setActionCommand("12");
        One2.setFont(myFont);
        Two0 = new Button();
        Two0.setActionCommand("20");
        Two0.setFont(myFont);
        Two1 = new Button();
        Two1.setActionCommand("21");
        Two1.setFont(myFont);
        Two2 = new Button();
        Two2.setActionCommand("22");
        Two2.setFont(myFont);
        // Zero0.setBackground(Color.BLACK);
        //Zero1.setBackground(Color.green);

    }
        public void LauchGame () {
            P.add(Zero0);
            P.add(Zero1);
            P.add(Zero2);
            P.add(One0);
            P.add(One1);
            P.add(One2);
            P.add(Two0);
            P.add(Two1);
            P.add(Two2);

            Zero0.addActionListener(this);
            Zero1.addActionListener(this);
            Zero2.addActionListener(this);
            One0.addActionListener(this);
            One1.addActionListener(this);
            One2.addActionListener(this);
            Two0.addActionListener(this);
            Two1.addActionListener(this);
            Two2.addActionListener(this);

            f.addWindowListener(this);
            f.setLocation(500,200);
            f.setSize(400, 400);
            f.setVisible(true);
            D.addWindowListener(this);
        }


    int i = 0;
    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand();
       if(i <= 8){

           if(s == "00"){
              if(i % 2 == 0){
                  Zero0.setLabel("X");
                  if(i >=3)checkWinner();
                  i++;
                  if(i == 9)
                      showDialogue("This is Draw");
              }
              else {
                  Zero0.setLabel("O");
                  if(i >=3)checkWinner();
                  ++i;
                  if(i == 9)
                      showDialogue("This is Draw");
              }
           }
           else if(s == "01"){
               if(i % 2 == 0){
                   Zero1.setLabel("X");
                   if(i >=3)checkWinner();
                   ++i;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
               else {
                   Zero1.setLabel("O");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
           }
           else if( s =="02"){
               if(i % 2 == 0){
                   Zero2.setLabel("X");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
               else {
                   Zero2.setLabel("O");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
           }
           else if( s =="10"){
               if(i % 2 == 0){
                   One0.setLabel("X");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
               else {
                   One0.setLabel("O");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");

               }
           }
           else if( s =="11"){
               if(i % 2 == 0){
                   One1.setLabel("X");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
               else {
                   One1.setLabel("O");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
           }
           else if( s =="12"){
               if(i % 2 == 0){
                   One2.setLabel("X");

                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
               else {
                   One2.setLabel("O");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
           }

           else if( s =="20"){
               if(i % 2 == 0){
                   Two0.setLabel("X");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
               else {
                   Two0.setLabel("O");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
           }
           else if( s =="21"){
               if(i % 2 == 0){
                   Two1.setLabel("X");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
               else {
                   Two1.setLabel("O");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
           }
           else if( s =="22"){
               if(i % 2 == 0){
                   Two2.setLabel("X");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
               else {
                   Two2.setLabel("O");
                   if(i >=3)checkWinner();
                   i++;
                   if(i == 9)
                       showDialogue("This is Draw");
               }
           }

       }
       else{
           showDialogue("The game is Draw ");

       }


    }// End of Action Performed

    public void windowIconified (WindowEvent e){}
    public void windowDeiconified (WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void showDialogue(String Massage){


        D = new Dialog(f,"Dialogue Example", true);
        D.setLayout(new FlowLayout());
        D.add(new Label(Massage));
       //D.setLocationRelativeTo(f);
        D.setLocation(550,300);
        D.setSize(300,150);
        D.addWindowListener(this);
        D.setVisible(true);


    }// End of Dialogue


    public void windowClosing(WindowEvent e){
        System.exit(0);

    }

    public void checkWinner(){
        String arr[][] = new String[3][3];
        arr[0][0] = Zero0.getLabel();
        arr[0][1] = Zero1.getLabel();
        arr[0][2] = Zero2.getLabel();
        arr[1][0] = One0.getLabel();
        arr[1][1] = One1.getLabel();
        arr[1][2] = One2.getLabel();
        arr[2][0] = Two0.getLabel();
        arr[2][1] = Two1.getLabel();
        arr[2][2] = Two2.getLabel();

        if((arr[0][0] == arr[0][1] ) && (arr[0][1] == arr[0][2]) && arr[0][0]!="" && arr[0][1] != "" && arr[0][2] != ""){
            showDialogue(arr[0][0]+" is winner");

        }
        else if((arr[1][0] == arr[1][1] ) && (arr[1][1] == arr[1][2]) && arr[1][0]!= "" && arr[1][1] != "" && arr[1][2] != ""){
            showDialogue(arr[1][0]+" is winner");
            f.setVisible(false);
        }
        else  if((arr[2][0] == arr[2][1] ) && (arr[2][1] == arr[2][2]) && arr[1][0]!= "" && arr[2][1] != "" && arr[2][2] != ""){
            showDialogue(arr[2][0]+" is winner");
             f.setVisible(false);
        }
        else if((arr[0][0] == arr[1][0]) && (arr[1][0] == arr[2][0])&& arr[0][0] != "" && arr[1][0] != "" && arr[2][0] != ""){
            showDialogue(arr[0][0]+" is winner");
            f.setVisible(false);
        }
        else if((arr[0][1] == arr[1][1]) && (arr[1][1] == arr[2][1]) && arr[0][1] != "" && arr[1][1] != "" && arr[2][1] != ""){
            showDialogue(arr[0][1]+" is winner");
            f.setVisible(false);
        }
        else if((arr[0][2] == arr[1][2]) && (arr[1][2] == arr[2][2]) && arr[0][2] != "" && arr[1][2] != "" && arr[2][2] != ""){
            showDialogue(arr[0][2]+" is winner");
            f.setVisible(false);
        }
        else if((arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) && arr[0][0] != "" && arr[1][1] != "" && arr[2][2] != ""){
            showDialogue(arr[0][0]+" is winner");
            f.setVisible(false);
        }
        else if((arr[0][2] == arr[1][1]) && (arr[1][1] == arr[2][0]) && arr[0][2] != "" && arr[1][1] != "" && arr[2][0] != ""){
            showDialogue(arr[0][0]+" is winner");
            f.setVisible(false);

        }// End of CheckWinner




    }

public static void main(String []args){
      Tic_Tac tc = new Tic_Tac();
      tc.LauchGame();

}


}
