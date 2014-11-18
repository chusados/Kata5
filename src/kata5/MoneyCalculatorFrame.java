package kata5;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MoneyCalculatorFrame extends JFrame{

    public MoneyCalculatorFrame() {
        setTitle("MoneyCalculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300,300));
        createComponets();
        setVisible(true);
    }

    private void createComponets() {
        add(createExchangeDialog());
        add(createToolbar(),BorderLayout.SOUTH);
    }

    private JPanel createExchangeDialog() {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new MoneyDialog());
        panel.add(new CurrencyDialog());
        return panel;
        
    }

    private JPanel createToolbar() {
     JPanel toolBar = new JPanel(new FlowLayout(FlowLayout.RIGHT));
     toolBar.add(createCalculateButton());
     toolBar.add(createCancelteButton());
     return toolBar;
    }


    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculating.....");
            }
        });
        return button;
    }

    private JButton createCancelteButton() {
        
        JButton button = new JButton("Close");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyCalculatorFrame.this.dispose();
            
            }
        });
        return button;
    }
    
}
