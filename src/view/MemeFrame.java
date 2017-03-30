package view;

import javax.swing.JFrame;

import controller.MemeController;

public class MemeFrame extends JFrame
{
	private MemePanel panel;
	private MemeController baseController;

	public MemeFrame(MemeController baseController )
	{
		super();
		this.baseController = baseController;
		this.panel = new MemePanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setTitle("Meme Maneger");
		this.setSize(500, 500);
		this.setContentPane(panel);
		this.setVisible(true);
	}

	public MemePanel getPanel()
	{
		return panel;
	}

}
