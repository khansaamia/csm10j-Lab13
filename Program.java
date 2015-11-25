
package csm10jLab13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Program extends JFrame{
    
    private JLabel clickmelbl;
    private JPanel contentPane;
    
    public Program() {
        InitializeComponentForGUI();
        this.clickmelbl.setText("Click Me");
        String noOfOval=JOptionPane.showInputDialog(this,"Enter No Of Ovals between 1 to 20");
        DrawOval(noOfOval);
    }
    
    private void InitializeComponentForGUI()
    {
        this.setSize(400,400);

        this.contentPane = new JPanel();
        this.clickmelbl = new JLabel();
        
        this.contentPane.setOpaque(true);
        this.contentPane.setBackground(Color.WHITE);
        this.contentPane.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.clickmelbl.setFont(new java.awt.Font("Arial", 1, 12)); 
        
        this.clickmelbl.setSize(300, 30);
        this.clickmelbl.setForeground(Color.BLACK);
        this.clickmelbl.setLocation(100,100);
        
        this.contentPane.add(this.clickmelbl);
        
        this.contentPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent arg0) {
                super.mousePressed(arg0);
                jButton1ActionPerformed(arg0);
            }

        });
          
        this.setContentPane(this.contentPane);
        this.setVisible(true);

    }
    
    private void DrawOval(String noOfOval)
    {
        this.clickmelbl.setText("");
        int noofoval; 
        try
        {
            noofoval=Integer.parseInt(noOfOval);
            if(noofoval<1)
            {
                this.clickmelbl.setText("Click Me");
            }
            else if(noofoval>20 || noofoval>=1 && noofoval<=20)
            {
                DrawCircleNow(noofoval);
            }
        }
        catch (NumberFormatException nfe)
        {
            this.clickmelbl.setText("Click Me");
        }       
        
    }
    
    private void DrawCircleNow(int noofoval)
    {
      //  MyJPanel panel = new MyJPanel();
      //  this.contentPane.add(panel);
	//Container container = 	getContentPane();
	//container.add(panel);	      
        //repaint();
    }

  /*  @Override
    public void paint(Graphics g) {
       // super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.red);
        g.drawOval(10, 10, 10, 10);
        repaint();
    }*/
    
    private void jButton1ActionPerformed(MouseEvent arg0) {
        String noOfOval=JOptionPane.showInputDialog(this,"Enter No Of Ovals between 1 to 20");
        InitializeComponentForGUI();
        DrawOval(noOfOval);        
    }
    
    public static void main(String args[]) {
        Program program=new Program();
        program.show();
    }
    
  /*  public class MyJPanel extends JPanel 
	{	

	  MyJPanel()
	  {
	  }
	  public void paintComponent(Graphics graphics)
	  {	      
	      int r= (int)Math.round((Math.random()*255));
	      int g= (int)Math.round((Math.random()*255));
	      int b= (int)Math.round((Math.random()*255));

	      graphics.setColor(new Color(r,g,b));
	      graphics.fillOval(20,20,40,40);
              graphics.setColor(Color.red);
              graphics.drawOval(10, 10, 10, 10);
	  }
    }*/
}
