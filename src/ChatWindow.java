import java.awt.*;
import javax.swing.*;


public class ChatWindow extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    public ChatWindow() {
        // Set up the window
        setTitle("Chat Application");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up components
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        inputField = new JTextField();
        sendButton = new JButton("Send");

        // Layout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(chatArea), BorderLayout.CENTER);
        panel.add(inputField, BorderLayout.SOUTH);
        panel.add(sendButton, BorderLayout.EAST);
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        panel.add(inputPanel, BorderLayout.SOUTH);
        


        // Add to JFrame
        add(panel);

        // Set visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChatWindow();
    }
}
