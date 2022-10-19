import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel PasswordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[]args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

         userlabel = new JLabel("user");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        PasswordLabel = new JLabel("password");
        PasswordLabel.setBounds(10, 50, 80, 25);
        panel.add(PasswordLabel);

         passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

         success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);




        frame.setVisible(true);




    }//end main

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if (user.equals("osman") && password.equals("ozzy")){
            success.setText("login successful!");
        }else{
            success.setText("Try again you Moron!!!");
        }
    }
}//end class
