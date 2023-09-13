package project;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

// Abstract Window Toolkit

class SimpleNotepadUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Notepad");
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu fileSave = new JMenu("Edit");
        JMenu fileFormate = new JMenu("Formate");
        JMenu fileView = new JMenu("View");
        JMenu fileHelp = new JMenu("Help");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem newindowItem = new JMenuItem("New Window");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem openItem = new JMenuItem("Open");
        
        ImageIcon i = new ImageIcon("C:\\Users\\Flutter Expert\\Desktop\\Class Notes\\Notepad.png");

        fileMenu.add(saveItem);
        fileMenu.add(openItem);
        fileMenu.add(newItem);
        fileMenu.add(newindowItem);

        menuBar.add(fileMenu);
        menuBar.add(fileSave);
        menuBar.add(fileFormate);
        menuBar.add(fileView);
        menuBar.add(fileHelp);

        frame.setJMenuBar(menuBar);
        frame.add(scrollPane);
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showSaveDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        FileWriter fileWriter = new FileWriter(fileChooser.getSelectedFile());
                        fileWriter.write(textArea.getText());
                        fileWriter.close();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }
        });

        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
                        StringBuilder text = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            text.append(line).append("\n");
                        }
                        textArea.setText(text.toString());
                        reader.close();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }
        });

        
    }
}
