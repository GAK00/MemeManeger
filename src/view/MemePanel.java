package view;

import javax.swing.JPanel;

import controller.MemeController;

public class MemePanel extends JPanel
{
	private MemeController baseController;
	public MemePanel(MemeController baseController)
	{
		super();
		this.baseController = baseController;
	}
}
