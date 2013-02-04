import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


@SuppressWarnings("serial")
public class trafficSimulationGui extends JFrame {
	
	private JButton buttonEditeTraffic = new JButton("Edite Traffic Lights");
	private JButton buttonEditeRoad = new JButton("Edite Road");

	private FlowLayout layout = new FlowLayout();
	//private FlowLayout layoutPanel = new FlowLayout();
	private Container container = getContentPane();

	public trafficSimulationGui() {
		super("Traffic simulation");
		JPanel panel = new JPanel();

		setLayout(layout);
		panel.setPreferredSize(new Dimension(150,150));
		 panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		 add(panel);
		 
		JButton button = new JButton("Click Me!");
		button.setAlignmentX(
		Component.CENTER_ALIGNMENT);
		panel.setLayout((LayoutManager) new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.add(Box.createVerticalGlue());
		panel.add(button);
		panel.add(Box.createVerticalGlue());
		
		
		//getContentPane().add(panel);
		panel.setBackground(Color.white);
		add(buttonEditeTraffic);
		
		buttonEditeTraffic.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		add(buttonEditeRoad);
		buttonEditeRoad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		layout.setAlignment(FlowLayout.RIGHT);
		layout.layoutContainer(container);
	}
	
}
