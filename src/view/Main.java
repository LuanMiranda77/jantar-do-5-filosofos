 package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import model.Filosofo;
import model.FilososfoComDeadLock;

import model.Filosofos;
import model.Garfo;

public class Main extends JFrame {
	public static int[] semaforo = {1,1,1,1,1};
	private static final long serialVersionUID = 1L;
	public static int p1=0,p2=0,p3=0, p4=0,p5=0;
	private JPanel contentPane;
	public static JLabel prato1, prato2, prato3, prato4, prato5;
	public static JLabel garfo1, garfo2, garfo3, garfo4, garfo5;
	public static JLabel processo;
	private Filosofos filosofo1;
	private Filosofos filosofo2;
	private Filosofos filosofo3;
	private Filosofos filosofo4;
	private Filosofos filosofo5;
	public static JLabel pensar1, pensar2, pensar3, pensar4, pensar5;
	public static JLabel comer1, comer2, comer3, comer4, comer5;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Main();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 542);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);

		JPanel panel = new JPanel();
		panel.setForeground(Color.ORANGE);
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 457, 540, 46);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(0, 0, 540, 27);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblJantarDosFilosofos = new JLabel("Jantar Dos Filosofos");
		lblJantarDosFilosofos.setBackground(Color.RED);
		lblJantarDosFilosofos.setBounds(169, 0, 201, 25);
		lblJantarDosFilosofos.setVerticalAlignment(SwingConstants.TOP);
		lblJantarDosFilosofos.setForeground(Color.RED);
		lblJantarDosFilosofos.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblJantarDosFilosofos);

		prato1 = new JLabel("");
		prato1.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
		prato1.setBounds(242, 136, 57, 57);
		contentPane.add(prato1);

		prato2 = new JLabel("");
		prato2.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
		prato2.setBounds(327, 187, 57, 57);
		contentPane.add(prato2);

		prato3 = new JLabel("");
		prato3.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
		prato3.setBounds(302, 290, 57, 57);
		contentPane.add(prato3);

		prato4 = new JLabel("");
		prato4.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
		prato4.setBounds(179, 290, 57, 57);
		contentPane.add(prato4);

		prato5 = new JLabel("");
		prato5.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
		prato5.setBounds(158, 186, 57, 62);
		contentPane.add(prato5);

		garfo1 = new JLabel("");
		garfo1.setIcon(new ImageIcon(Main.class.getResource("/icon/grafo1.png")));
		garfo1.setBounds(185, 150, 65, 62);
		contentPane.add(garfo1);

		garfo4 = new JLabel("");
		garfo4.setHorizontalAlignment(SwingConstants.CENTER);
		garfo4.setIcon(new ImageIcon(Main.class.getResource("/icon/grafo4.png")));
		garfo4.setBounds(242, 307, 57, 69);
		contentPane.add(garfo4);

		garfo3 = new JLabel("");
		garfo3.setIcon(new ImageIcon(Main.class.getResource("/icon/garfo3.png")));
		garfo3.setHorizontalAlignment(SwingConstants.CENTER);
		garfo3.setBounds(320, 242, 84, 46);
		contentPane.add(garfo3);

		garfo2 = new JLabel("");
		garfo2.setIcon(new ImageIcon(Main.class.getResource("/icon/garfo2.png")));
		garfo2.setHorizontalAlignment(SwingConstants.CENTER);
		garfo2.setBounds(290, 140, 68, 57);
		contentPane.add(garfo2);

		garfo5 = new JLabel("");
		garfo5.setIcon(new ImageIcon(Main.class.getResource("/icon/grafo5.png")));
		garfo5.setHorizontalAlignment(SwingConstants.CENTER);
		garfo5.setBounds(144, 235, 94, 57);
		contentPane.add(garfo5);

		JLabel filo1 = new JLabel("");
		filo1.setHorizontalAlignment(SwingConstants.CENTER);
		filo1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		filo1.setBounds(170, 38, 205, 20);
		contentPane.add(filo1);

		JLabel filo2 = new JLabel("");
		filo2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		filo2.setBounds(368, 122, 164, 20);
		contentPane.add(filo2);

		JLabel filo3 = new JLabel("");
		filo3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		filo3.setBounds(327, 419, 205, 20);
		contentPane.add(filo3);

		JLabel filo4 = new JLabel("");
		filo4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		filo4.setBounds(94, 419, 205, 20);
		contentPane.add(filo4);

		JLabel filo5 = new JLabel("");
		filo5.setHorizontalAlignment(SwingConstants.TRAILING);
		filo5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		filo5.setBounds(0, 115, 170, 20);
		contentPane.add(filo5);

		JLabel lb = new JLabel("Processo:");
		lb.setVerticalAlignment(SwingConstants.TOP);
		lb.setBorder(new LineBorder(Color.GRAY, 2, true));
		lb.setForeground(Color.BLACK);
		lb.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb.setBounds(0, 438, 65, 22);
		contentPane.add(lb);

		processo = new JLabel("");
		processo.setVerticalAlignment(SwingConstants.TOP);
		processo.setBorder(new LineBorder(Color.GRAY, 2, true));
		processo.setForeground(Color.RED);
		processo.setFont(new Font("Tahoma", Font.BOLD, 12));
		processo.setBounds(63, 438, 472, 22);
		contentPane.add(processo);

		pensar1 = new JLabel("");
		pensar1.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar1.png")));
		pensar1.setHorizontalAlignment(SwingConstants.LEFT);
		pensar1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		pensar1.setBounds(288, 52, 71, 57);
		contentPane.add(pensar1);

		pensar3 = new JLabel("");
		pensar3.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar3.png")));
		pensar3.setHorizontalAlignment(SwingConstants.LEFT);
		pensar3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		pensar3.setBounds(312, 362, 84, 57);
		contentPane.add(pensar3);

		pensar2 = new JLabel("");
		pensar2.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar2.png")));
		pensar2.setHorizontalAlignment(SwingConstants.LEFT);
		pensar2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		pensar2.setBounds(425, 191, 71, 57);
		contentPane.add(pensar2);

		pensar4 = new JLabel("");
		pensar4.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar4.png")));
		pensar4.setHorizontalAlignment(SwingConstants.LEFT);
		pensar4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		pensar4.setBounds(83, 319, 84, 57);
		contentPane.add(pensar4);

		pensar5 = new JLabel("");
		pensar5.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar5.png")));
		pensar5.setHorizontalAlignment(SwingConstants.LEFT);
		pensar5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		pensar5.setBounds(53, 136, 84, 57);
		contentPane.add(pensar5);
		
		comer1 = new JLabel(""+p1);
		//comer1.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar1.png")));
		comer1.setHorizontalAlignment(SwingConstants.LEFT);
		comer1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comer1.setBounds(340, 70, 71, 57);
		contentPane.add(comer1);

		comer3 = new JLabel(""+p3);
		//comer3.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar3.png")));
		comer3.setHorizontalAlignment(SwingConstants.LEFT);
		comer3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comer3.setBounds(382, 392, 84, 57);
		contentPane.add(comer3);

		comer2 = new JLabel(""+p2);
		//comer2.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar2.png")));
		comer2.setHorizontalAlignment(SwingConstants.LEFT);
		comer2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comer2.setBounds(425, 221, 71, 57);
		contentPane.add(comer2);

		comer4 = new JLabel(""+p4);
		//comer4.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar4.png")));
		comer4.setHorizontalAlignment(SwingConstants.LEFT);
		comer4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comer4.setBounds(83, 339, 84, 57);
		contentPane.add(comer4);

		comer5 = new JLabel(""+p5);
		//comer5.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar5.png")));
		comer5.setHorizontalAlignment(SwingConstants.LEFT);
		comer5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comer5.setBounds(53, 166, 84, 57);
		contentPane.add(comer5);
		
		

		JLabel fundo = new JLabel("");
		fundo.setHorizontalAlignment(SwingConstants.CENTER);
		fundo.setIcon(new ImageIcon(Main.class.getResource("/icon/fundo.png")));
		fundo.setBounds(0, 27, 540, 431);
		contentPane.add(fundo);
		setLocationRelativeTo(null);

		JButton btnPlay = new JButton("Play");
		btnPlay.setHorizontalAlignment(SwingConstants.LEFT);
		btnPlay.setIcon(new ImageIcon(Main.class.getResource("/icon/play.png")));
		btnPlay.setBounds(190, 5, 104, 35);
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(btnPlay);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <= 5; i++) {
					String nome = JOptionPane.showInputDialog(null, "Digite o nome do " + i + "º" + " Filósofo?");
					if (i == 1) {
						filo1.setText(i + "º - " + nome);
						filosofo1 = new Filosofo(nome, new Garfo(1, 2));
					} else if (i == 2) {
						filo2.setText(i + "º - " + nome);
						filosofo2 = new Filosofo(nome, new Garfo(2, 3));
					} else if (i == 3) {
						filo3.setText(i + "º - " + nome);
						filosofo3 = new Filosofo(nome, new Garfo(3, 4));
					} else if (i == 4) {
						filo4.setText(i + "º - " + nome);
						filosofo4 = new Filosofo(nome, new Garfo(4, 5));
					} else if (i == 5) {
						filo5.setText(i + "º - " + nome);
						filosofo5 = new Filosofo(nome, new Garfo(5, 1));
					}
				}
				new Thread((Filosofo) filosofo1).start();
				new Thread((Filosofo) filosofo2).start();
				new Thread((Filosofo) filosofo3).start();
				new Thread((Filosofo) filosofo4).start();
				new Thread((Filosofo) filosofo5).start();

			}
		});

		JButton btnPlayComDeadLock = new JButton("<html>Play com DEADLOCK<html>");
		btnPlayComDeadLock.setHorizontalAlignment(SwingConstants.LEFT);
		btnPlayComDeadLock.setIcon(new ImageIcon(Main.class.getResource("/icon/playDeadlock.png")));
		btnPlayComDeadLock.setBounds(75, 5, 104, 35);
		btnPlayComDeadLock.setFont(new Font("Tahoma", Font.BOLD, 8));
		panel.add(btnPlayComDeadLock);
		btnPlayComDeadLock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <= 5; i++) {
					String nome = JOptionPane.showInputDialog(null, "Digite o nome do " + i + "º" + " Filósofo?");
					if (i == 1) {
						filo1.setText(i + "º - " + nome);
						filosofo1 = new FilososfoComDeadLock(nome, new Garfo(1, 2));
					} else if (i == 2) {
						filo2.setText(i + "º - " + nome);
						filosofo2 = new FilososfoComDeadLock(nome, new Garfo(2, 3));
					} else if (i == 3) {
						filo3.setText(i + "º - " + nome);
						filosofo3 = new FilososfoComDeadLock(nome, new Garfo(3, 4));
					} else if (i == 4) {
						filo4.setText(i + "º - " + nome);
						filosofo4 = new FilososfoComDeadLock(nome, new Garfo(4, 5));
					} else if (i == 5) {
						filo5.setText(i + "º - " + nome);
						filosofo5 = new FilososfoComDeadLock(nome, new Garfo(5, 1));
					}
				}
				new Thread((FilososfoComDeadLock) filosofo1).start();
				new Thread((FilososfoComDeadLock) filosofo2).start();
				new Thread((FilososfoComDeadLock) filosofo3).start();
				new Thread((FilososfoComDeadLock) filosofo4).start();
				new Thread((FilososfoComDeadLock) filosofo5).start();

			}
		});

		JButton btnStop = new JButton("Stop");
		btnStop.setIcon(new ImageIcon(Main.class.getResource("/icon/stop.png")));
		btnStop.setHorizontalAlignment(SwingConstants.LEFT);
		btnStop.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnStop.setBounds(305, 5, 105, 35);
		panel.add(btnStop);
		btnStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		setVisible(true);
	}
}
