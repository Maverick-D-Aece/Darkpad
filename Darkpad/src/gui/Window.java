package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

	private static final long serialVersionUID = -8300935330561820576L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnEdit;
	private JMenu mnView;
	private JMenu mnItools;
	private JMenu mnHelp;
	private JPanel panel;
	private JTextArea textArea;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Consolas", Font.PLAIN, 12));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getMenuBar_1());
		contentPane.add(getPanel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			menuBar.setBackground(Color.DARK_GRAY);
			menuBar.setBounds(0, 0, 665, 21);
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnEdit());
			menuBar.add(getMnView());
			menuBar.add(getMnItools());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}

	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.setBackground(Color.DARK_GRAY);
			mnNewMenu.setFont(new Font("Consolas", Font.PLAIN, 12));
			mnNewMenu.setForeground(new Color(204, 204, 204));
		}
		return mnNewMenu;
	}

	private JMenu getMnEdit() {
		if (mnEdit == null) {
			mnEdit = new JMenu("Edit");
			mnEdit.setForeground(new Color(204, 204, 204));
			mnEdit.setFont(new Font("Consolas", Font.PLAIN, 12));
			mnEdit.setBackground(Color.DARK_GRAY);
		}
		return mnEdit;
	}

	private JMenu getMnView() {
		if (mnView == null) {
			mnView = new JMenu("View");
			mnView.setForeground(new Color(204, 204, 204));
			mnView.setFont(new Font("Consolas", Font.PLAIN, 12));
			mnView.setBackground(Color.DARK_GRAY);
		}
		return mnView;
	}

	private JMenu getMnItools() {
		if (mnItools == null) {
			mnItools = new JMenu("Tools");
			mnItools.setForeground(new Color(204, 204, 204));
			mnItools.setFont(new Font("Consolas", Font.PLAIN, 12));
			mnItools.setBackground(Color.DARK_GRAY);
		}
		return mnItools;
	}

	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.setForeground(new Color(204, 204, 204));
			mnHelp.setFont(new Font("Consolas", Font.PLAIN, 12));
			mnHelp.setBackground(Color.DARK_GRAY);
		}
		return mnHelp;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setFont(new Font("Consolas", Font.PLAIN, 11));
			panel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(102, 102, 102)), "Darkpad",
					TitledBorder.RIGHT, TitledBorder.BOTTOM, null, new Color(204, 204, 204)));
			TitledBorder border = (TitledBorder) panel.getBorder();
			border.setTitleFont(new Font("Consolas", Font.PLAIN, 12));
			panel.setBorder(border);
			panel.setForeground(new Color(255, 255, 255));
			panel.setBackground(new Color(51, 51, 51));
			panel.setBounds(10, 32, 700, 444);
			panel.setLayout(null);
			JScrollPane scroll = new JScrollPane(getTextArea());
	        scroll.setBounds(6, 6, 690, 418);
	        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
	        scroll.setBorder(null);
			panel.add(scroll);

		}
		return panel;
	}

	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setSelectedTextColor(new Color(255, 255, 255));
			textArea.setSelectionColor(new Color(153, 102, 204));
			textArea.setForeground(new Color(255, 255, 255));
			textArea.setFont(new Font("Consolas", Font.PLAIN, 12));
			textArea.setCaretColor(new Color(204, 204, 204));
			textArea.setBackground(new Color(51, 51, 51));
			textArea.setBounds(10, 11, 680, 415);
			

		}
		return textArea;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("x");
			btnNewButton.setFocusPainted(false);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			btnNewButton.setFont(new Font("Consolas", Font.PLAIN, 16));
			btnNewButton.setForeground(new Color(204, 204, 204));
			btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			btnNewButton.setBackground(Color.DARK_GRAY);
			btnNewButton.setBounds(692, 0, 28, 21);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\u2014");
			btnNewButton_1.setFocusPainted(false);
			btnNewButton_1.setFont(new Font("Consolas", Font.PLAIN, 16));
			btnNewButton_1.setForeground(new Color(204, 204, 204));
			btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			btnNewButton_1.setBackground(Color.DARK_GRAY);
			btnNewButton_1.setBounds(664, 0, 28, 21);
		}
		return btnNewButton_1;
	}
}

class MyScrollBarUI extends BasicScrollBarUI {

	private static final int THUMB_BORDER_SIZE = 7;
	private static final int TRACK_BORDER_SIZE = 0;
	private static final int THUMB_SIZE = 5;
	private static final int TRACK_SIZE = 20;
    private static final Color THUMB_COLOR =  new Color(204, 204, 204);
    private static final Color TRACK_COLOR = new Color(51, 51, 51);
    
    @Override
    protected JButton createDecreaseButton(int orientation) {
        return new MyScrollBarButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return new MyScrollBarButton();
    }
    
    
    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
    	int orientation = scrollbar.getOrientation();
        int x = trackBounds.x + TRACK_BORDER_SIZE;
        int y = trackBounds.y + TRACK_BORDER_SIZE;

        int width = orientation == JScrollBar.VERTICAL ?
        		TRACK_SIZE : trackBounds.width - (TRACK_BORDER_SIZE * 2);
        width = Math.max(width, TRACK_SIZE);

        int height = orientation == JScrollBar.VERTICAL ?
        		trackBounds.height - (TRACK_BORDER_SIZE * 2) : TRACK_SIZE;
        height = Math.max(height, TRACK_SIZE);

        Graphics2D graphics2D = (Graphics2D) g.create();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setColor(TRACK_COLOR);
        graphics2D.fillRect(x, y, width, height);
        graphics2D.dispose();
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
    	int orientation = scrollbar.getOrientation();
        int arc = THUMB_SIZE;
        int x = thumbBounds.x + THUMB_BORDER_SIZE;
        int y = thumbBounds.y + THUMB_BORDER_SIZE;

        int width = orientation == JScrollBar.VERTICAL ?
                THUMB_SIZE : thumbBounds.width - (THUMB_BORDER_SIZE * 2);
        width = Math.max(width, THUMB_SIZE);

        int height = orientation == JScrollBar.VERTICAL ?
                thumbBounds.height - (THUMB_BORDER_SIZE * 2) : THUMB_SIZE;
        height = Math.max(height, THUMB_SIZE);

        Graphics2D graphics2D = (Graphics2D) g.create();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setColor(THUMB_COLOR);
        graphics2D.fillRoundRect(x, y, width, height, arc, arc);
        graphics2D.dispose();
    }
}
@SuppressWarnings("serial")
class MyScrollBarButton extends JButton {
    MyScrollBarButton() {
        setOpaque(false);
        setFocusable(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setBorder(BorderFactory.createEmptyBorder());
    }
}
