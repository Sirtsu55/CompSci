package Homeworks;

// Make Gui
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

class GUI extends javax.swing.JFrame
{
    GUI(App app)
    {
        super("A simple GUI demo");
        this.application = app;

        // Set up the window.
        setSize(400, 200);
        setVisible(true);
    }

    private App application;
}

class App
{
    App()
    {
        gui = new GUI(this);
    }

    private GUI gui;
}

public class UserInterface
{

    public static void Run(String[] args)
    {
        SwingUtilities.invokeLater(() -> new App());
    }
}
