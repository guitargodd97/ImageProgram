package main.java.com.heidenreich;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
//Hunter Heidenreich 2013
//https://github.com/filthyharold/rpgGame <--Look at this later

public class Main extends JFrame implements Runnable, MouseListener {
	Container con = getContentPane();
	Thread t = new Thread(this);
	Color alternate;
	Point target = new Point(0, 0);
	int stuff = 640, thickness = 13;
	private final int SCREEN_WIDTH = 640,
			SCREEN_HEIGHT = 640,
			X = (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width - SCREEN_WIDTH) / 2,
			Y = (java.awt.Toolkit.getDefaultToolkit().getScreenSize().height - SCREEN_HEIGHT) / 2;
	byte[][] red, blue, green;

	public Main() {
		alternate = new Color(127, 12, 54);
		con.setLayout(new FlowLayout());
		setBounds(X, Y, SCREEN_WIDTH, SCREEN_HEIGHT);
		setVisible(true);
		setTitle("Heidenreich Image Program");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		t.start();
		red = new byte[SCREEN_WIDTH][SCREEN_HEIGHT];
		blue = new byte[SCREEN_WIDTH][SCREEN_HEIGHT];
		green = new byte[SCREEN_WIDTH][SCREEN_HEIGHT];
		for (int i = 0; i < red.length; i++) {
			for (int id = 0; id < red[i].length; id++) {
				red[i][id] = 0;
				blue[i][id] = 0;
				green[i][id] = 0;
			}
		}
		addMouseListener(this);
	}

	@Override
	public void run() {
		try {
			while (true) {
				try {
					Thread.sleep(16);
					repaint();
					drawFromPoint();
				} catch (Exception e) {
				}
			}
		} catch (Exception e) {
		}
	}

	private void drawFromPoint() {
		if (target.getX() - stuff > 0 && stuff < 640) {
			for (int i = 1; i < thickness; i += 2) {
				red[(int) target.getX() - stuff][(int) target.getY()] = (byte) alternate
						.getRed();
				red[(int) target.getX() - stuff][(int) target.getY() - i] = (byte) alternate
						.getRed();
				red[(int) target.getX() - stuff][(int) target.getY() + i] = (byte) alternate
						.getRed();
				red[(int) target.getX() - stuff][(int) target.getY() - (i + 1)] = (byte) alternate
						.getRed();
				red[(int) target.getX() - stuff][(int) target.getY() + (i + 1)] = (byte) alternate
						.getRed();

				blue[(int) target.getX() - stuff][(int) target.getY()] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() - stuff][(int) target.getY() - i] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() - stuff][(int) target.getY() + i] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() - stuff][(int) target.getY() - (i + 1)] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() - stuff][(int) target.getY() + (i + 1)] = (byte) alternate
						.getBlue();

				green[(int) target.getX() - stuff][(int) target.getY()] = (byte) alternate
						.getGreen();
				green[(int) target.getX() - stuff][(int) target.getY() - i] = (byte) alternate
						.getGreen();
				green[(int) target.getX() - stuff][(int) target.getY() + i] = (byte) alternate
						.getGreen();
				green[(int) target.getX() - stuff][(int) target.getY()
						- (i + 1)] = (byte) alternate.getGreen();
				green[(int) target.getX() - stuff][(int) target.getY()
						+ (i + 1)] = (byte) alternate.getGreen();
			}

		}
		if (target.getX() + stuff < 640 && stuff < 640) {
			for (int i = 0; i < thickness; i += 2) {
				red[(int) target.getX() + stuff][(int) target.getY()] = (byte) alternate
						.getRed();
				red[(int) target.getX() + stuff][(int) target.getY() - i] = (byte) alternate
						.getRed();
				red[(int) target.getX() + stuff][(int) target.getY() + i] = (byte) alternate
						.getRed();
				red[(int) target.getX() + stuff][(int) target.getY() - (i + 1)] = (byte) alternate
						.getRed();
				red[(int) target.getX() + stuff][(int) target.getY() + (i + 1)] = (byte) alternate
						.getRed();

				blue[(int) target.getX() + stuff][(int) target.getY()] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() + stuff][(int) target.getY() - i] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() + stuff][(int) target.getY() + i] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() + stuff][(int) target.getY() - (i + 1)] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() + stuff][(int) target.getY() + (i + 1)] = (byte) alternate
						.getBlue();

				green[(int) target.getX() + stuff][(int) target.getY()] = (byte) alternate
						.getGreen();
				green[(int) target.getX() + stuff][(int) target.getY() - i] = (byte) alternate
						.getGreen();
				green[(int) target.getX() + stuff][(int) target.getY() + i] = (byte) alternate
						.getGreen();
				green[(int) target.getX() + stuff][(int) target.getY()
						- (i + 1)] = (byte) alternate.getGreen();
				green[(int) target.getX() + stuff][(int) target.getY()
						+ (i + 1)] = (byte) alternate.getGreen();
			}

		}
		if (target.getY() - stuff > 0 && stuff < 640) {
			for (int i = 0; i < thickness; i += 2) {
				red[(int) target.getX()][(int) target.getY() - stuff] = (byte) alternate
						.getRed();
				red[(int) target.getX() - i][(int) target.getY() - stuff] = (byte) alternate
						.getRed();
				red[(int) target.getX() + i][(int) target.getY() - stuff] = (byte) alternate
						.getRed();
				red[(int) target.getX() - (i + 1)][(int) target.getY() - stuff] = (byte) alternate
						.getRed();
				red[(int) target.getX() + (i + 1)][(int) target.getY() - stuff] = (byte) alternate
						.getRed();

				blue[(int) target.getX()][(int) target.getY() - stuff] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() - i][(int) target.getY() - stuff] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() + i][(int) target.getY() - stuff] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() - (i + 1)][(int) target.getY() - stuff] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() + (i + 1)][(int) target.getY() - stuff] = (byte) alternate
						.getBlue();

				green[(int) target.getX()][(int) target.getY() - stuff] = (byte) alternate
						.getGreen();
				green[(int) target.getX() - i][(int) target.getY() - stuff] = (byte) alternate
						.getGreen();
				green[(int) target.getX() + i][(int) target.getY() - stuff] = (byte) alternate
						.getGreen();
				green[(int) target.getX() - (i + 1)][(int) target.getY()
						- stuff] = (byte) alternate.getGreen();
				green[(int) target.getX() + (i + 1)][(int) target.getY()
						- stuff] = (byte) alternate.getGreen();
			}

		}
		if (target.getY() + stuff < 640 && stuff < 640) {
			for (int i = 0; i < thickness; i += 2) {
				red[(int) target.getX()][(int) target.getY() + stuff] = (byte) alternate
						.getRed();
				red[(int) target.getX() - i][(int) target.getY() + stuff] = (byte) alternate
						.getRed();
				red[(int) target.getX() + i][(int) target.getY() + stuff] = (byte) alternate
						.getRed();
				red[(int) target.getX() - (i + 1)][(int) target.getY() + stuff] = (byte) alternate
						.getRed();
				red[(int) target.getX() + (i + 1)][(int) target.getY() + stuff] = (byte) alternate
						.getRed();

				blue[(int) target.getX()][(int) target.getY() + stuff] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() - i][(int) target.getY() + stuff] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() + i][(int) target.getY() + stuff] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() - (i + 1)][(int) target.getY() + stuff] = (byte) alternate
						.getBlue();
				blue[(int) target.getX() + (i + 1)][(int) target.getY() + stuff] = (byte) alternate
						.getBlue();

				green[(int) target.getX()][(int) target.getY() + stuff] = (byte) alternate
						.getGreen();
				green[(int) target.getX() - i][(int) target.getY() + stuff] = (byte) alternate
						.getGreen();
				green[(int) target.getX() + i][(int) target.getY() + stuff] = (byte) alternate
						.getGreen();
				green[(int) target.getX() - (i + 1)][(int) target.getY()
						+ stuff] = (byte) alternate.getGreen();
				green[(int) target.getX() + (i + 1)][(int) target.getY()
						+ stuff] = (byte) alternate.getGreen();
			}

		}
		stuff++;
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void paint(Graphics gr) {
		Image img = createImage(getSize().width, getSize().height);
		Graphics2D g2 = (Graphics2D) img.getGraphics();
		for (int i = 0; i < red.length; i++) {
			for (int id = 0; id < red[i].length; id++) {
				g2.setColor(new Color(red[i][id], blue[i][id], green[i][id]));
				g2.fillRect(i, id, 1, 1);
			}
		}
		g2.dispose();
		gr.drawImage(img, 0, 0, this);
	}

	public static void main(String[] args) {
		new Main();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getX() > 0 && arg0.getX() < SCREEN_WIDTH && arg0.getY() > 0
				&& arg0.getY() < SCREEN_HEIGHT) {
			red[arg0.getX()][arg0.getY()] = (byte) alternate.getRed();
			blue[arg0.getX()][arg0.getY()] = (byte) alternate.getBlue();
			green[arg0.getX()][arg0.getY()] = (byte) alternate.getGreen();

			for (int i = 1; i < thickness; i += 2) {
				red[arg0.getX() - i][arg0.getY()] = (byte) alternate.getRed();
				blue[arg0.getX() - i][arg0.getY()] = (byte) alternate.getBlue();
				green[arg0.getX() - i][arg0.getY()] = (byte) alternate
						.getGreen();
				red[arg0.getX() - i][arg0.getY()] = (byte) alternate.getRed();
				blue[arg0.getX() - i][arg0.getY()] = (byte) alternate.getBlue();
				green[arg0.getX() - i][arg0.getY()] = (byte) alternate
						.getGreen();
				red[arg0.getX() + i][arg0.getY()] = (byte) alternate.getRed();
				blue[arg0.getX() + i][arg0.getY()] = (byte) alternate.getBlue();
				green[arg0.getX() + i][arg0.getY()] = (byte) alternate
						.getGreen();
				red[arg0.getX()][arg0.getY() - i] = (byte) alternate.getRed();
				blue[arg0.getX()][arg0.getY() - i] = (byte) alternate.getBlue();
				green[arg0.getX()][arg0.getY() - i] = (byte) alternate
						.getGreen();
				red[arg0.getX()][arg0.getY() + i] = (byte) alternate.getRed();
				blue[arg0.getX()][arg0.getY() + i] = (byte) alternate.getBlue();
				green[arg0.getX()][arg0.getY() + i] = (byte) alternate
						.getGreen();
				red[arg0.getX() - i][arg0.getY() + i] = (byte) alternate
						.getRed();
				blue[arg0.getX() - i][arg0.getY() + i] = (byte) alternate
						.getBlue();
				green[arg0.getX() - i][arg0.getY() + i] = (byte) alternate
						.getGreen();
				red[arg0.getX() - i][arg0.getY() - i] = (byte) alternate
						.getRed();
				blue[arg0.getX() - i][arg0.getY() - i] = (byte) alternate
						.getBlue();
				green[arg0.getX() - i][arg0.getY() - i] = (byte) alternate
						.getGreen();
				red[arg0.getX() + i][arg0.getY() + i] = (byte) alternate
						.getRed();
				blue[arg0.getX() + i][arg0.getY() + i] = (byte) alternate
						.getBlue();
				green[arg0.getX() + i][arg0.getY() + i] = (byte) alternate
						.getGreen();
				red[arg0.getX() + i][arg0.getY() - i] = (byte) alternate
						.getRed();
				blue[arg0.getX() + i][arg0.getY() - i] = (byte) alternate
						.getBlue();
				green[arg0.getX() + i][arg0.getY() - i] = (byte) alternate
						.getGreen();

				red[arg0.getX() - (i + 1)][arg0.getY()] = (byte) alternate
						.getRed();
				blue[arg0.getX() - (i + 1)][arg0.getY()] = (byte) alternate
						.getBlue();
				green[arg0.getX() - (i + 1)][arg0.getY()] = (byte) alternate
						.getGreen();
				red[arg0.getX() + (i + 1)][arg0.getY()] = (byte) alternate
						.getRed();
				blue[arg0.getX() + (i + 1)][arg0.getY()] = (byte) alternate
						.getBlue();
				green[arg0.getX() + (i + 1)][arg0.getY()] = (byte) alternate
						.getGreen();
				red[arg0.getX()][arg0.getY() - (i + 1)] = (byte) alternate
						.getRed();
				blue[arg0.getX()][arg0.getY() - (i + 1)] = (byte) alternate
						.getBlue();
				green[arg0.getX()][arg0.getY() - (i + 1)] = (byte) alternate
						.getGreen();
				red[arg0.getX()][arg0.getY() + (i + 1)] = (byte) alternate
						.getRed();
				blue[arg0.getX()][arg0.getY() + (i + 1)] = (byte) alternate
						.getBlue();
				green[arg0.getX()][arg0.getY() + (i + 1)] = (byte) alternate
						.getGreen();
				red[arg0.getX() - (i + 1)][arg0.getY() + (i + 1)] = (byte) alternate
						.getRed();
				blue[arg0.getX() - (i + 1)][arg0.getY() + (i + 1)] = (byte) alternate
						.getBlue();
				green[arg0.getX() - (i + 1)][arg0.getY() + (i + 1)] = (byte) alternate
						.getGreen();
				red[arg0.getX() - (i + 1)][arg0.getY() - (i + 1)] = (byte) alternate
						.getRed();
				blue[arg0.getX() - (i + 1)][arg0.getY() - (i + 1)] = (byte) alternate
						.getBlue();
				green[arg0.getX() - (i + 1)][arg0.getY() - (i + 1)] = (byte) alternate
						.getGreen();
				red[arg0.getX() + (i + 1)][arg0.getY() + (i + 1)] = (byte) alternate
						.getRed();
				blue[arg0.getX() + (i + 1)][arg0.getY() + (i + 1)] = (byte) alternate
						.getBlue();
				green[arg0.getX() + (i + 1)][arg0.getY() + (i + 1)] = (byte) alternate
						.getGreen();
				red[arg0.getX() + (i + 1)][arg0.getY() - (i + 1)] = (byte) alternate
						.getRed();
				blue[arg0.getX() + (i + 1)][arg0.getY() - (i + 1)] = (byte) alternate
						.getBlue();
				green[arg0.getX() + (i + 1)][arg0.getY() - (i + 1)] = (byte) alternate
						.getGreen();

				red[arg0.getX() - (i + 1)][arg0.getY() + i] = (byte) alternate
						.getRed();
				blue[arg0.getX() - (i + 1)][arg0.getY() + i] = (byte) alternate
						.getBlue();
				green[arg0.getX() - (i + 1)][arg0.getY() + i] = (byte) alternate
						.getGreen();
				red[arg0.getX() + i][arg0.getY() - (i + 1)] = (byte) alternate
						.getRed();
				blue[arg0.getX() + i][arg0.getY() - (i + 1)] = (byte) alternate
						.getBlue();
				green[arg0.getX() + i][arg0.getY() - (i + 1)] = (byte) alternate
						.getGreen();
				red[arg0.getX() - i][arg0.getY() + (i + 1)] = (byte) alternate
						.getRed();
				blue[arg0.getX() - i][arg0.getY() + (i + 1)] = (byte) alternate
						.getBlue();
				green[arg0.getX() - i][arg0.getY() + (i + 1)] = (byte) alternate
						.getGreen();
				red[arg0.getX() + (i + 1)][arg0.getY() - i] = (byte) alternate
						.getRed();
				blue[arg0.getX() + (i + 1)][arg0.getY() - i] = (byte) alternate
						.getBlue();
				green[arg0.getX() + (i + 1)][arg0.getY() - i] = (byte) alternate
						.getGreen();
			}

			target = arg0.getPoint();
			stuff = 0;
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

	public boolean returnTrue(boolean tr) {
		return tr;
	}
}