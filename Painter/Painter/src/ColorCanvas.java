import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Graphics2D;
 
import javax.imageio.ImageIO;

public class ColorCanvas {

    JFrame cnv_frame;
    JPanel cnv_panel;

    ColorCanvas() {
 
        cnv_frame = new JFrame();
        cnv_panel = new JPanel();
 
        // Setting up Frame
        cnv_frame.setSize(1500,900);
        cnv_frame.setLocationRelativeTo(null);
        cnv_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cnv_frame.add(cnv_panel);
        cnv_frame.setResizable(true);

        // Icon for top-left corener of Frame
        ImageIcon img = new ImageIcon(".\\image_icon.png");
        cnv_frame.setIconImage(img.getImage());

        // Setting up Panel
        cnv_panel.setBackground(Color.white);
        cnv_panel.setLayout(null);

        // Adding Border Decoration
        Border cnv_border = new LineBorder(Color.BLACK, 12, false);
        cnv_panel.setBorder(cnv_border);

        // Uses ColorTool class to enable drawing.
        new OptionsTabs(cnv_panel);

        cnv_frame.setVisible(true);

    }

    class OptionsTabs {

        JButton option_draw;
        JButton option_erase;
        JButton option_colorRed;
        JButton option_colorPurple;
        JButton option_colorGreen;
        JButton option_colorYellow;
        JButton save_image;
        JButton size_large;
        JButton size_medium;
        JButton size_small;

        ArrayList<JButton> buttons = new ArrayList();

        ImageIcon option_draw_image = new ImageIcon
            (".\\option_draw.png");

        ImageIcon option_erase_image = new ImageIcon
            (".\\option_erase.png");

        ImageIcon option_colorRed_image = new ImageIcon
            (".\\option_colorRed.png");

        ImageIcon option_colorPurple_image = new ImageIcon
            (".\\option_colorPurple.png");

        ImageIcon option_colorGreen_image = new ImageIcon
            (".\\option_colorGreen.png");

        ImageIcon option_colorYellow_image = new ImageIcon
            (".\\option_colorYellow.png");

        ImageIcon saveIcon = new ImageIcon
            (".\\save_button.png");

        ImageIcon sizeLargeIcon = new ImageIcon
            (".\\size_large.png");

        ImageIcon sizeMediumIcon = new ImageIcon
            (".\\size_medium.png");

        ImageIcon sizeSmallIcon = new ImageIcon
            (".\\size_small.png");    

        void optionDraw() {

            option_draw = new JButton();
            option_draw.setIcon(option_draw_image);
            option_draw.setBounds(20,20,20,53);
            option_draw.setFocusPainted(false);
            option_draw.setBorderPainted(false);
            option_draw.setBackground(Color.white);
            cnv_panel.add(option_draw);

            buttons.add(option_draw);

        }

        void optionErase() {

            option_erase = new JButton();
            option_erase.setIcon(option_erase_image);
            option_erase.setBounds(20,115,26,43);
            option_erase.setFocusPainted(false);
            option_erase.setBorderPainted(false);
            option_erase.setBackground(Color.white);
            cnv_panel.add(option_erase);

            buttons.add(option_erase);

        }

        void colorRed() {

            option_colorRed = new JButton();
            option_colorRed.setIcon(option_colorRed_image);
            option_colorRed.setBounds(95, 20, 20, 53);
            option_colorRed.setFocusPainted(false);
            option_colorRed.setBorderPainted(false);
            option_colorRed.setBackground(Color.white);
            cnv_panel.add(option_colorRed);

            buttons.add(option_colorRed);

        }

        void colorPurple() {

            option_colorPurple = new JButton();
            option_colorPurple.setIcon(option_colorPurple_image);
            option_colorPurple.setBounds(70, 20, 20, 53);
            option_colorPurple.setFocusPainted(false);
            option_colorPurple.setBorderPainted(false);
            option_colorPurple.setBackground(Color.white);
            cnv_panel.add(option_colorPurple);

            buttons.add(option_colorPurple);

        }

        void colorGreen() {

            option_colorGreen = new JButton();
            option_colorGreen.setIcon(option_colorGreen_image);
            option_colorGreen.setBounds(45, 20, 20, 53);
            option_colorGreen.setFocusPainted(false);
            option_colorGreen.setBorderPainted(false);
            option_colorGreen.setBackground(Color.white);
            cnv_panel.add(option_colorGreen);

            buttons.add(option_colorGreen);

        }

        void colorYellow() {

            option_colorYellow = new JButton();
            option_colorYellow.setIcon(option_colorYellow_image);
            option_colorYellow.setBounds(120, 20, 20, 53);
            option_colorYellow.setFocusPainted(false);
            option_colorYellow.setBorderPainted(false);
            option_colorYellow.setBackground(Color.white);
            cnv_panel.add(option_colorYellow);

            buttons.add(option_colorYellow);

        }

        void saveImage() {

            save_image = new JButton();
            save_image.setIcon(saveIcon);
            save_image.setBounds(700,25,82,40);
            save_image.setFocusPainted(false);
            save_image.setBorderPainted(false);
            cnv_panel.add(save_image);

            buttons.add(save_image);

        }

        void sizeLarge() {

            size_large = new JButton();
            size_large.setBounds(22,83,20,20);
            size_large.setFocusPainted(false);
            size_large.setBorderPainted(false);
            size_large.setIcon(sizeLargeIcon);
            cnv_panel.add(size_large);

            buttons.add(size_large);

        }

        void sizeMedium() {

            size_medium = new JButton();
            size_medium.setBounds(48,83,16,15);
            size_medium.setFocusPainted(false);
            size_medium.setBorderPainted(false);
            size_medium.setIcon(sizeMediumIcon);
            cnv_panel.add(size_medium);

            buttons.add(size_medium);

        }

        void sizeSmall() {

            size_small = new JButton();
            size_small.setBounds(72,83,11,10);
            size_small.setFocusPainted(false);
            size_small.setBorderPainted(false);
            size_small.setIcon(sizeSmallIcon);
            cnv_panel.add(size_small);

            buttons.add(size_small);

        }

        public void setAllButtonsInvisible(int x) {
            if (x == 1) {
                for (JButton button : buttons) { button.setVisible(false); }
            } else {
                for (JButton button : buttons) { button.setVisible(true); }
            }
            
        }

        public void save()
        {
            BufferedImage bImg = new BufferedImage
             (cnv_panel.getWidth(),cnv_panel.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D cg = bImg.createGraphics();
            cnv_panel.paintAll(cg);
            String name = JOptionPane.showInputDialog(cnv_frame,
                        "       What would you like to name the file?"+
                        "\nWarning, do not name it the same as another file.", null);
            try {
                ImageIO.write(bImg, "png", new File
                (".\\painter\\Painter\\saves\\" + name + ".png"));
            } catch (IOException e) {e.printStackTrace();}
        }

        OptionsTabs(JPanel cnv_panel) {

            optionDraw();
            optionErase();
            colorRed();
            colorPurple();
            colorGreen();
            colorYellow();
            saveImage();
            sizeLarge();
            sizeMedium();
            sizeSmall();

            ColorTool coloring = new ColorTool(cnv_panel);

            option_draw.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == option_draw) {
                        coloring.setImageIcon(0);
                        coloring.setImageSize(0);
                        cnv_panel.repaint();
                    }}});

            option_erase.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == option_erase) {
                        coloring.setImageIcon(1);
                        coloring.setImageSize(0);
                        cnv_panel.repaint();
                    }}});

            option_colorRed.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == option_colorRed) {
                        coloring.setImageIcon(2);
                        coloring.setImageSize(0);
                        cnv_panel.repaint();
                    }}});

            option_colorPurple.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == option_colorPurple) {
                        coloring.setImageIcon(3);
                        coloring.setImageSize(0);
                        cnv_panel.repaint();
                    }}});       
            
            option_colorGreen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == option_colorGreen) {
                        coloring.setImageIcon(4);
                        coloring.setImageSize(0);
                        cnv_panel.repaint();
                    }}}); 
             
            option_colorYellow.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == option_colorYellow) {
                        coloring.setImageIcon(5);
                        coloring.setImageSize(0);
                        cnv_panel.repaint();
                    }}});   
                    
            save_image.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == save_image) {
                        setAllButtonsInvisible(1);
                        save();
                        setAllButtonsInvisible(0);
                    }}});
            
            size_small.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == size_small) {
                        coloring.setImageSize(0);
                    }}});
            
            size_medium.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == size_medium) {
                        coloring.setImageSize(1);
                    }}});
            
            size_large.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == size_large) {
                        coloring.setImageSize(2);
                    }}});

        }

    }

    class ColorTool {

        ImageIcon drawed_image_black = new ImageIcon
                (".\\drawed_image_black.png");

        ImageIcon drawed_image_black_medium = new ImageIcon
                (".\\drawed_image_black_medium.png");

        ImageIcon drawed_image_black_large = new ImageIcon
                (".\\drawed_image_black_large.png");

        ImageIcon drawed_image_red = new ImageIcon
                (".\\drawed_image_red.png");

        ImageIcon drawed_image_purple = new ImageIcon
                (".\\drawed_image_purple.png");

        ImageIcon drawed_image_green = new ImageIcon
                (".\\drawed_image_green.png");
        
        ImageIcon drawed_image_green_medium = new ImageIcon
                (".\\drawed_image_green_medium.png");
        
        ImageIcon drawed_image_green_large = new ImageIcon
                (".\\drawed_image_green_large.png");

        ImageIcon drawed_image_yellow = new ImageIcon
                (".\\drawed_image_yellow.png");

        ImageIcon erased_image = new ImageIcon
                (".\\erased_image.png");

        ImageIcon baseIcon = new ImageIcon();

        void setImageIcon(int x) {
            switch(x) {
                case 0:baseIcon = drawed_image_black; break;
                case 1:baseIcon = erased_image; break;
                case 2:baseIcon = drawed_image_red; break;
                case 3:baseIcon = drawed_image_purple; break;
                case 4:baseIcon = drawed_image_green; break;
                case 5:baseIcon = drawed_image_yellow; break;
                default: break;
            }
        }

        void setImageSize(int x) {
            if (x==0) {
                if (baseIcon == drawed_image_black || baseIcon == drawed_image_black_medium || baseIcon == drawed_image_black_large)
                    baseIcon = drawed_image_black;
                if (baseIcon == drawed_image_green || baseIcon == drawed_image_green_medium || baseIcon == drawed_image_green_large)
                    baseIcon = drawed_image_green;
            }
            if (x==1) {
                if (baseIcon == drawed_image_black || baseIcon == drawed_image_black_medium || baseIcon == drawed_image_black_large)
                    baseIcon = drawed_image_black_medium;
                if (baseIcon == drawed_image_green || baseIcon == drawed_image_green_medium || baseIcon == drawed_image_green_large)
                    baseIcon = drawed_image_green_medium;
            }
            if (x==2) {
                if (baseIcon == drawed_image_black || baseIcon == drawed_image_black_medium || baseIcon == drawed_image_black_large)
                    baseIcon = drawed_image_black_large;
                if (baseIcon == drawed_image_green || baseIcon == drawed_image_green_medium || baseIcon == drawed_image_green_large)
                    baseIcon = drawed_image_green_large;
            }
        }

        ColorTool(JPanel cnv_panel) {

            int index = 0;

            // Draws 20x20 pixel when clicked
            cnv_panel.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    JLabel x = new JLabel();  x.setIcon(baseIcon);
                    if (baseIcon == erased_image) {x.setBounds(e.getX()-15,e.getY()-15,30,30);
                    cnv_panel.add(x,index);  cnv_panel.repaint();}
                    else {x.setBounds(e.getX()-5,e.getY()-15,30,30);
                    cnv_panel.add(x,index);  cnv_panel.repaint();}
                    }});

            // Draws 20x20 pixels when dragged
            cnv_panel.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    JLabel x = new JLabel();  x.setIcon(baseIcon);
                    if (baseIcon == erased_image) {x.setBounds(e.getX()-15,e.getY()-15,30,30);
                        cnv_panel.add(x,index);  cnv_panel.repaint();}
                    else {x.setBounds(e.getX()-5,e.getY()-15,30,30);
                        cnv_panel.add(x,index);  cnv_panel.repaint();}
                }});

        }

    }
    
    /**
     *  TODO -> Implement mechanism for size buttons
     *  Do this by creating a seperate setImageIcon that corelates with setimageicon
     *  e.g. if setImageIcon is already 0 and size small is pressed, set the image to a smaller
     *  version of black.
     */

    public static void main(String[] args) {
        new ColorCanvas();
    }

}