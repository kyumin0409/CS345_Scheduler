import javax.swing.JFrame;

public class GuiApplication {
	
	public GuiApplication() {
		JFrame guiFrame;
		guiFrame = new JFrame("Scheduler");
		guiFrame.setSize(1200,1000);
		
		guiFrame.add(new CourseSelectionPage());
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiApplication();
	}
}
