/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import javax.swing.*;
import static tictactoe.SelectPlayer.players;

/**
 *
 * @author THE GAMOO
 */
public class Game extends javax.swing.JFrame {
static int player=1;
static Board board;
    private JButton [][]button=new JButton[3][3];
    protected void setReferencebtn()
    {
        button[0][0]=jButton1;
        button[0][1]=jButton3;
        button[0][2]=jButton4;
        button[1][0]=jButton5;
        button[1][1]=jButton6;
        button[1][2]=jButton7;
        button[2][0]=jButton8;
        button[2][1]=jButton9;
        button[2][2]=jButton10;
    }/**
     
     * Creates new form Game
     */
    public Game() {
        initComponents();
       
    }
    public void setPlayer(int value)
    {
        player=value;
    }
    public void playComputer()
    {
        int buttonNumber;
        buttonNumber=board.possibleWin(player);
        if(buttonNumber==0)
            buttonNumber=board.possibleWin(3-player);
        if(buttonNumber==0)
            buttonNumber=board.randomBlankButton();
        if(buttonNumber!=0)
        {
            switch(buttonNumber)
            {
                case 1:
                    if(player==1)
                    board.setboardValues(0,0,3);
                    else
                     board.setboardValues(0,0,5);
                    this.refreshBoardDisplay();
                    break;
                case 2:
                     if(player==1)
                    board.setboardValues(0,1,3);
                    else
                     board.setboardValues(0,1,5);
                    
                    this.refreshBoardDisplay();
                    break;
              case 3:
                     if(player==1)
                        board.setboardValues(0,2,3);
                    else
                         board.setboardValues(0,2,5);
                    this.refreshBoardDisplay();
                    break;
              case 4:
                     if(player==1)
                    board.setboardValues(1,0,3);
                    else
                     board.setboardValues(1,0,5);
                    this.refreshBoardDisplay();
                    break;
              case 5:
                     if(player==1)
                    board.setboardValues(1,1,3);
                    else
                     board.setboardValues(1,1,5);
                    this.refreshBoardDisplay();
                    break;
              case 6:
                     if(player==1)
                    board.setboardValues(1,2,3);
                    else
                     board.setboardValues(1,2,5);
                    this.refreshBoardDisplay();
                    break;
               case 7:
                     if(player==1)
                    board.setboardValues(2,0,3);
                    else
                     board.setboardValues(2,0,5);
                    this.refreshBoardDisplay();
                    break;
               case 8:
                     if(player==1)
                    board.setboardValues(2,1,3);
                    else
                     board.setboardValues(2,1,5);
                    this.refreshBoardDisplay();
                    break;
               case 9:
                     if(player==1)
                    board.setboardValues(2,2,3);
                    else
                     board.setboardValues(2,2,5);
                    this.refreshBoardDisplay();
                    break;
            }
            if(board.checkWin(player))
            {
                JOptionPane.showMessageDialog(this,"Computer won the match ");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                 JOptionPane.showMessageDialog(this,"Game draw ");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
                
            }
            else
            {
                setPlayer(3-player);
                
            }
        }
    }
    public void refreshBoardDisplay()
    {
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++)
            {
                switch(board.getboardValues(i,j))
                {
                    case 2: button[i][j].setEnabled(true);
                            button[i][j].setText(" ");
                            break;
                    case 3: button[i][j].setEnabled(false);
                            button[i][j].setText("X");
                            break;
                    case 5: button[i][j].setEnabled(false);
                            button[i][j].setText("O");
                            break;
                    
                }
            }
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

       
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

      

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(players=="one"){
        if(player==1)
        {
    board.setboardValues(0, 0, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }
}
else
{
    board.setboardValues(0, 0, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }
}
        
       }
else{
    
      if(player==1)
        {
    board.setboardValues(0, 0, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
    }
}
else
{
    board.setboardValues(0, 0, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
    }
    
    }
//
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 
        
     if(players=="one"){
        if(player==1)
        {
    board.setboardValues(1, 2, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }
}
else
{
    board.setboardValues(1, 2, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }

}
     }
     
  else
     {
        if(player==1)
        {
    board.setboardValues(1, 2, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
    }
}
else
{
    board.setboardValues(1, 2, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        
    }

}  
         
     }
     
     
     
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(players=="one"){
 if(player==1)
{
    board.setboardValues(0, 1, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }
}
else
{
    board.setboardValues(0, 1, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }
}

} 

else{
    if(player==1)
{
    board.setboardValues(0, 1, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
       
    }
}
else
{
    board.setboardValues(0, 1, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
       
    }
}
}

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    if(players=="one")  
    {
    if(player==1)
{
    board.setboardValues(1, 0, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }
}
else
{
    board.setboardValues(1, 0, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }

}
    }
    
   else
    {
            if(player==1)
{
    board.setboardValues(1, 0, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
       
    }
}
else
{
    board.setboardValues(1, 0, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        
    }

}
    }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
      if(players=="one")  
      {
        if(player==1)
        {
    board.setboardValues(0, 2, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }
}
else
{
    board.setboardValues(0, 2, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }

}
      }
      
      
      else{
                 if(player==1)
        {
    board.setboardValues(0, 2, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        
    }
}
else
{
    board.setboardValues(0, 2, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
       
    }

}
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(players=="one"){
        if(player==1)
        {
    board.setboardValues(1, 1, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw "); 
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }
}
else
{
    board.setboardValues(1, 1, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }

}
       }
       
       else{
                  if(player==1)
        {
    board.setboardValues(1, 1, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw "); 
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
      
    }
}
else
{
    board.setboardValues(1, 1, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
       
    }

}
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        if(players=="one")
        {
        if(player==1)
        {
    board.setboardValues(2, 0, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }
}
else
{
    board.setboardValues(2, 0, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }

}}
  else
        {
                    if(player==1)
        {
    board.setboardValues(2, 0, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
       
    }
}
else
{
    board.setboardValues(2, 0, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
     
    }

}
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        if(players=="one"){
        if(player==1)
        {
    board.setboardValues(2, 1, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }
}
else
{
    board.setboardValues(2, 1, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }

}}
        else{
                    if(player==1)
        {
    board.setboardValues(2, 1, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
       
    }
}
else
{
    board.setboardValues(2, 1, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
       
    }

}
        }       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       if(players=="one")
       {
        if(player==1)
    {
    board.setboardValues(2, 2, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }
}
else
{
    board.setboardValues(2, 2, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        playComputer();
    }

}}
       else{
                   if(player==1)
    {
    board.setboardValues(2, 2, 3);
    this.refreshBoardDisplay();
    if(board.checkWin(1))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        
    }
}
else
{
    board.setboardValues(2, 2, 5);
    this.refreshBoardDisplay();
    if(board.checkWin(2))
    {
        JOptionPane.showMessageDialog(this,"Congrates !'You win ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else if(board.isBoardFilled())
    {
        JOptionPane.showMessageDialog(this,"Game Draw ");
        board.initializeBoard();
        refreshBoardDisplay();
        setPlayer(1);
    }
    else
    {
        setPlayer(3-player);
        
    }

}
       }
    }//GEN-LAST:event_jButton9ActionPerformed

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
