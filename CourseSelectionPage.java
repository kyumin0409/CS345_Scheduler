import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseSelectionPage extends JPanel{
	
	private JPanel subjectpanel;
	private JPanel coursepanel;
	private JButton buttonSelect1 = new JButton("Select");
	private JButton buttonSelect2 = new JButton("Select");

	
	public CourseSelectionPage() {
		super(new BorderLayout());
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 500));
		setFocusable(true);
		initPanel();
	}
	
	public void initPanel() {
		//add(subjectPanel(), BorderLayout.WEST);
		//add(coursePanel(), BorderLayout.EAST);
		add(subjectPanel());
		add(coursePanel());
	}
	
	public JPanel subjectPanel() {
		subjectpanel = new JPanel(new BorderLayout());
		JLabel subjectLabel = new JLabel("subject");
		subjectpanel.add(subjectLabel, BorderLayout.NORTH);
		//subjectpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		subjectLabel.setHorizontalAlignment(JLabel.CENTER);
		subjectLabel.setVerticalAlignment(JLabel.CENTER);
		subjectLabel.setFont(new Font("Calibri", Font.BOLD, 40));
		
		JComboBox<String> dropdown = new JComboBox<String>();
		dropdown.addItem("math");
		dropdown.addItem("CS");
		
		dropdown.setForeground(Color.BLUE);
		dropdown.setFont(new Font("Arial", Font.BOLD, 25));
		dropdown.setMaximumRowCount(10);
		
		// make the combo box editable so we can add new item when needed
		dropdown.setEditable(true);

		// add an event listener for the combo box
		dropdown.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox<String> combo = (JComboBox<String>) event.getSource();
				String selectedSubject = (String) combo.getSelectedItem();

				DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) combo
						.getModel();

				int selectedIndex = model.getIndexOf(selectedSubject);
				if (selectedIndex < 0) {
					// if the selected book does not exist before, 
					// add it into this combo box
					model.addElement(selectedSubject);
				}

			}
		});

		// add event listener for the button Select 
		buttonSelect1.setPreferredSize(new Dimension(40, 40));
		buttonSelect1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				String selectedSubject = (String) dropdown.getSelectedItem();
				JOptionPane.showMessageDialog(CourseSelectionPage.this,
						"You selected the subject: " + selectedSubject);
			}
		});

	

		// add components to this frame
		add(dropdown);
		add(buttonSelect1);
		

	

	
		
		
		
		return subjectpanel;
	}
	
	public JPanel coursePanel() {
		coursepanel = new JPanel(new BorderLayout());
		JLabel courseLabel = new JLabel("courses");
		coursepanel.add(courseLabel, BorderLayout.NORTH);
		//subjectpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		courseLabel.setHorizontalAlignment(JLabel.CENTER);
		courseLabel.setVerticalAlignment(JLabel.CENTER);
		courseLabel.setFont(new Font("Calibri", Font.BOLD, 40));
		
		JComboBox<String> dropdown = new JComboBox<String>();
		dropdown.addItem("121");
		dropdown.addItem("187");
		dropdown.addItem("311");
		
		dropdown.setForeground(Color.BLUE);
		dropdown.setFont(new Font("Arial", Font.BOLD, 25));
		dropdown.setMaximumRowCount(10);
		
		// make the combo box editable so we can add new item when needed
		dropdown.setEditable(true);

		// add an event listener for the combo box
		dropdown.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JComboBox<String> combo = (JComboBox<String>) event.getSource();
				String selectedCourse = (String) combo.getSelectedItem();

				DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) combo
						.getModel();

				int selectedIndex = model.getIndexOf(selectedCourse);
				if (selectedIndex < 0) {
					// if the selected book does not exist before, 
					// add it into this combo box
					model.addElement(selectedCourse);
				}

			}
		});

		// add event listener for the button Select 
		buttonSelect2.setPreferredSize(new Dimension(40, 40));
		buttonSelect2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				String selectedSubject = (String) dropdown.getSelectedItem();
				JOptionPane.showMessageDialog(CourseSelectionPage.this,
						"You selected the course: " + selectedSubject);
			}
		});

	

		// add components to this frame
		add(dropdown);
		add(buttonSelect2);
		

	

	
		
		
		
		return coursepanel;
	}
}
