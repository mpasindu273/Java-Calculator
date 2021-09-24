import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;
 
 
class calculator implements ActionListener
{
	JFrame f;
        JPanel p,p1,p2;
	JTextField t;       
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
        Font fnt=new Font("Arial",Font.BOLD,28);
        Font bt=new Font("Arial",Font.BOLD,23);
        Font opp=new Font("Arial Black",Font.BOLD,29);
        static String word="",q,s;
	static double number,a=0,b=0,result=0;
        static int operator,rep=0;
        DecimalFormat d=new DecimalFormat("0.####################");
	 
 
	calculator()
	{
		f=new JFrame("Calculator");
		t=new JTextField();
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bdiv=new JButton("/");
		bmul=new JButton("*");
		bsub=new JButton("-");
		badd=new JButton("+");
		bdec=new JButton(".");
		beq=new JButton("=");
		bdel=new JButton("Delete");
		bclr=new JButton("Clear");
		
                t.setBounds(20,20,280,60);
                t.setEditable(false);
                t.setFont(fnt);
                               
                b1.setFont(bt);
                b2.setFont(bt);
                b3.setFont(bt);
                b4.setFont(bt);
                b5.setFont(bt);
                b6.setFont(bt);
                b7.setFont(bt);
                b8.setFont(bt);
                b9.setFont(bt);
                b0.setFont(bt);
                bdec.setFont(opp);
                badd.setFont(opp);
                bsub.setFont(opp);
                bmul.setFont(opp);
                bdiv.setFont(opp);
                beq.setFont(opp);
                
                bdel.setBounds(60,380,100,40);
                bdel.setFont(bt);
                
		bclr.setBounds(180,380,100,40);
                bclr.setFont(bt);
                             
                p=new JPanel(new GridLayout(4,4));
                p.setBounds(-1,100,319,250);
                
                p1=new JPanel(new GridLayout(1,2));
                p1.setBounds(-1,350,319,60);
                
                p2=new JPanel();
                p2.setLayout(null);
                p2.setBounds(-1,0,319,100);
                                 
               
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bdiv);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bmul);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bsub);
		p.add(bdec);
		p.add(b0);
		p.add(beq);
		p.add(badd);                
		p1.add(bdel);
		p1.add(bclr);
                p2.add(t,BorderLayout.CENTER);
                
                f.add(p);
                f.add(p1);                 		
		f.add(p2);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(332,449);                
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		bdec.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);
	}
        
        
        @Override
	public void actionPerformed(ActionEvent e)
	{
	       if(e.getSource()==b1)
                {
                        t.setText(t.getText().concat("1"));
			q="1";
                        word=word+q;                       
                }
                
               else if(e.getSource()==b2)
                {
                        t.setText(t.getText().concat("2"));
			q="2";
                        word=word+q;
                }
                
               else if(e.getSource()==b3)
                {
                        t.setText(t.getText().concat("3"));
			q="3";
                        word=word+q;
                }
                
               else if(e.getSource()==b4)
                {
                        t.setText(t.getText().concat("4"));
			q="4";
                        word=word+q;
                }
		 
               else if(e.getSource()==b5)
                {
                        t.setText(t.getText().concat("5"));
			q="5";
                        word=word+q;
                }
                
               else if(e.getSource()==b6)
                {
                        t.setText(t.getText().concat("6"));
			q="6";
                        word=word+q;
                }
                
               else if(e.getSource()==b7)
                {
                        t.setText(t.getText().concat("7"));
			q="7";
                        word=word+q;
                }
                
               else if(e.getSource()==b8)
                {
                        t.setText(t.getText().concat("8"));
			q="8";
                        word=word+q;
                }
                
               else if(e.getSource()==b9)
                {
                        t.setText(t.getText().concat("9"));
			q="9";
                        word=word+q;
                }
                
               else if(e.getSource()==b0)
                {
                        t.setText(t.getText().concat("0"));
			q="0";
                        word=word+q;
                }
                
               else if(e.getSource()==bdec)
                {
                        t.setText(t.getText().concat("."));
			q=".";
                        word=word+q;
                }
        
                
          
               else if(e.getSource()==badd)
		{                   
                    rep++;  
                    operator=1;
                                                      
                    if(rep<=1)
                    { 
                        t.setText(t.getText().concat("+"));
                        number=Double.parseDouble(word); 
                        result=result+number;  
                        word="";               
                    }        
                      
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Only two numbers at a time!");   
                    }
               
		} 
                
               else if(e.getSource()==bsub)
		{                    
                    rep++;                      
                    operator=2;
                   
                    if(rep<=1)
                    { 
                        t.setText(t.getText().concat("-"));
                       number=Double.parseDouble(word); 
                        result=result+number;  
                        word="";                  
                    }                
                      
                    else
                    {
                         JOptionPane.showMessageDialog(null,"Only two numbers at a time!");   
                    }
                    
		} 
                
               else if(e.getSource()==bmul)
		{                    
                    rep++;  
                    operator=3;
                   
                    if(rep<=1)
                    {
                        t.setText(t.getText().concat("*"));
                       number=Double.parseDouble(word); 
                        result=result+number;  
                        word="";
                    }            
                                          
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Only two numbers at a time!");   
                    }
		} 
                
               else if(e.getSource()==bdiv)
		{
                    
                    rep++;  
                    operator=4;
                   
                    if(rep<=1)
                    {
                        t.setText(t.getText().concat("/"));
                       number=Double.parseDouble(word); 
                        result=result+number;  
                        word="";                  
                    }     
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Only two numbers at a time!");   
                    }
		} 
                
                
                
               else if(e.getSource()==beq)
		{
                     number=Double.parseDouble(word);
                    
                    switch(operator){
                        
                        case 1:
                            result=result+number;
                            t.setText(""+d.format(result)); 
                            word=t.getText();
                            result=0;
                            rep=0;
                            break;
                            
                        case 2:
                            result=result-number;
                            t.setText(""+d.format(result));
                            word=t.getText();
                            result=0;                             
                            rep=0;
                            break;
                            
                        case 3:
                            result=result*number;
                            t.setText(""+d.format(result));
                            word=t.getText();
                            result=0;
                            rep=0;
                            break;
                            
                        case 4:
                            result=result/number;
                            t.setText(""+d.format(result));
                            word=t.getText();
                            result=0;
                            rep=0;
                            break;     
                    }
		} 
                 
	
		
               else if(e.getSource()==bclr)
                {
			t.setText("");
                        result=0; 
                        rep=0;
                        word="";
                }
                
               else if(e.getSource()==bdel)
		{
                        rep=0;
			s=t.getText();
			t.setText("");
                        
			t.setText(s.substring(0,s.length()-1));                           
                        word=word.substring(0,word.length()-1);                        
		}		
	}
       
        
	public static void main(String args[])
	{
		new calculator();
	}
}
