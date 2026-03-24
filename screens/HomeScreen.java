package screens;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
public class HomeScreen extends JPanel{
    private int stopCount = 0;
    public HomeScreen(){
        setLayout(new BorderLayout());

        JPanel topTab = new JPanel();
        topTab.setBackground(Color.BLUE);
        JLabel currentPage = new JLabel("Home");
        currentPage.setFont(new Font("Arial", Font.BOLD, 24));
        currentPage.setAlignmentX(Component.CENTER_ALIGNMENT);
        currentPage.setAlignmentY(Component.CENTER_ALIGNMENT);
        topTab.add(currentPage);

        JPanel history = new JPanel();
        history.setBackground(Color.yellow);
        history.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel wipMsg = new JLabel("Recent Routes/Summary of current route will go here");
        wipMsg.setFont(new Font("Arial", Font.BOLD, 20));
        history.add(wipMsg);

        JPanel content = new JPanel();
        JScrollPane mainContent = new JScrollPane(content, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        mainContent.setBackground(Color.RED);


        JLabel title = new JLabel("Create a new Route");
        title.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel form = new JPanel();
        form.setLayout(new GridBagLayout());
        GridBagConstraints f = new GridBagConstraints();
        f.gridx = 0;
        f.gridy = 0;
        f.fill = GridBagConstraints.HORIZONTAL;
        f.weightx = 1.0;
        f.insets = new Insets(5, 0, 5, 0);

        form.setBorder(new EmptyBorder(20, 60, 20, 60));
        form.setPreferredSize(new Dimension(500, 250));
        form.setOpaque(false);

        JLabel departure = new JLabel("Departure Station:");
        departure.setAlignmentY(Component.CENTER_ALIGNMENT);
        JComboBox departureStation = new JComboBox();
        departureStation.setEditable(true);
        departureStation.setMaximumSize(new Dimension(Integer.MAX_VALUE/3, 60));

        JButton addStop = new JButton("Add a Stop");
        addStop.setAlignmentX(Component.CENTER_ALIGNMENT);
        addStop.setBackground(Color.GREEN);
        addStop.setMaximumSize(new Dimension(Integer.MAX_VALUE/3, 60));
        addStop.addActionListener(e -> {
            if(stopCount >= 3) return;
            JLabel stopLabel = new JLabel("Stop " + (char)('A' + stopCount) + ":");
        });

        JButton removeStop = new JButton("Remove a Stop");
        removeStop.setAlignmentX(Component.CENTER_ALIGNMENT);
        removeStop.setBackground(Color.RED);
        removeStop.setMaximumSize(new Dimension(Integer.MAX_VALUE/3, 60));
        removeStop.addActionListener(e -> {});

        JLabel arrival = new JLabel("Arrival Station:");
        arrival.setAlignmentY(Component.CENTER_ALIGNMENT);
        JComboBox arrivalStation = new JComboBox();
        arrivalStation.setEditable(true);
        arrivalStation.setMaximumSize(new Dimension(Integer.MAX_VALUE/3, 60));


        form.add(departure, f);

        f.gridy = 1;
        form.add(departureStation, f);


        f.gridy = 2;
        form.add(arrival, f);

        f.gridy = 3;
        form.add(arrivalStation, f);


        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.add(title);
        content.add(form);

        topTab.setPreferredSize(new Dimension(0, 60));
        history.setPreferredSize(new Dimension(0, 100));

        add(topTab, BorderLayout.NORTH);
        add(history, BorderLayout.SOUTH);
        add(mainContent, BorderLayout.CENTER);
    }
}
