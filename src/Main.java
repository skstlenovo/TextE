import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.metal.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.io.*;
class editor extends JFrame implements ActionListener{
    // Creating the text area
    JTextArea t;
    //Creating the frame to accomodate the text area and menu bar
    JFrame f;
    editor(){
        //initialising the frame
        f=new JFrame("TextEdit");
        //setting the overall theme of the application
        try{
            UIManager.setLookAndFeel("Javax.swing.plaf.metallicLookandFeel"); // for look
            MetalLookAndFeel.setCurrentTheme(new OceanTheme()); //Them of the platform
        }
        catch(Exception e)
        {

        }
        //intitialising the text area
        t=new JTextArea();
        //intitialising the MenuBar
        JMenuBar m=new JMenuBar();

        //initialising file menu
        JMenu f1 = new JMenu("File");
        // Create the individual File menu items
        JMenuItem m1 =new JMenuItem("New");
        JMenuItem m2 =new JMenuItem("Open");
        JMenuItem m3 =new JMenuItem("Save");
        JMenuItem m4 =new JMenuItem("Print");
        //adding the ActionListener
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        //to adding file menu items to file menu
        f1.add(m1);
        f1.add(m2);
        f1.add(m3);
        f1.add(m4);

        //initialising edit menu
        JMenu f2=new JMenu("Edit");
        //Creating the individual edit menu items
        JMenuItem m5=new JMenuItem("Cut");
        JMenuItem m6=new JMenuItem("Copy");
        JMenuItem m7=new JMenuItem("Paste");
        //adding action listener
        m5.addActionListener(this);
        m6.addActionListener(this);
        m7.addActionListener(this);
        //to adding edit menu items to edit menu
        f2.add(m5);
        f2.add(m6);
        f2.add(m7);
        //initialising Exit item
        JMenuItem c=new JMenuItem("Exit");
        c.addActionListener(this); //add action listener

        //adding menus in menu bar
        m.add(f1);
        m.add(f2);
        m.add(c);

        f.add(t);
        f.setJMenuBar(m);
        f.setSize(500,500); //resolution of frame
        f.show();

    }
    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        if(s.equals("New"))
        {
            t.setText("");
        }
        else if(s.equals("Open")
        {
            JFileChooser j=new JFileChooser("c:");
            int r= j.showOpenDialog(null);
            if(r==JFileChooser.APPROVE_OPTION)
            {
                File fi=new File(j.getSelectedFile().getAbsolutePath());
                try{
                    String s1="";
                    FileReader fr=new FileReader(fi);
                    
                }
            }

        }
        else if(s.equals("Save"))
        {

        }
        else if(s.equals("Print"))
        {

        }
        else if(s.equals("Cut"))
        {

        }
        else if(s.equals("Copy"))
        {

        }
        else if(s.equals("Past"))
        {

        }
        else if(s.equals("Exit"))
        {

        }

    }
    public static void main(String []args){
        editor e=new editor();
    }
}
