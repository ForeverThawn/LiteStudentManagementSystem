package main_pack;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ImagePanel extends JPanel {
    // auto
	private static final long serialVersionUID = 8560197692669488034L;
	private JLabel label;

    public ImagePanel(String fileName) {
        try {
            ImageIcon icon = new ImageIcon(fileName);
            label = new JLabel(icon);
            setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
            setLayout(new BorderLayout());
            add(label, BorderLayout.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class StudentManagementLayout extends BasicFrame {
	public StudentManagementLayout() {
		frame = new JFrame("ѧ���ɼ�����ϵͳ");
		frame.setLayout(null);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);

		welcomeLabel = new JLabel("��ӭʹ��ѧ���ɼ�����ϵͳ��");
		welcomeLabel.setFont(new Font("΢���ź�", Font.BOLD, 32));
		welcomeLabel.setBounds(180, 30, 500, 60);
		frame.add(welcomeLabel);

		idLabel = new JLabel("ѧ�ţ�");
		idLabel.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		idLabel.setBounds(80, 110, 80, 30);
		frame.add(idLabel);
		idField = new JTextField();
		idField.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		idField.setBounds(150, 110, 120, 30);
		frame.add(idField);

		nameLabel = new JLabel("������");
		nameLabel.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		nameLabel.setBounds(80, 150, 80, 30);
		frame.add(nameLabel);
		nameField = new JTextField();
		nameField.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		nameField.setBounds(150, 150, 120, 30);
		frame.add(nameField);

		genderLabel = new JLabel("�Ա�");
		genderLabel.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		genderLabel.setBounds(80, 190, 80, 30);
		frame.add(genderLabel);
		genderField = new JTextField();
		genderField.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		genderField.setBounds(150, 190, 120, 30);
		frame.add(genderField);

		chineseLabel = new JLabel("���ģ�");
		chineseLabel.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		chineseLabel.setBounds(80, 230, 80, 30);
		frame.add(chineseLabel);
		chineseField = new JTextField();
		chineseField.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		chineseField.setBounds(150, 230, 120, 30);
		frame.add(chineseField);

		mathLabel = new JLabel("��ѧ��");
		mathLabel.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		mathLabel.setBounds(80, 270, 80, 30);
		frame.add(mathLabel);
		mathField = new JTextField();
		mathField.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		mathField.setBounds(150, 270, 120, 30);
		frame.add(mathField);

		englishLabel = new JLabel("Ӣ�");
		englishLabel.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		englishLabel.setBounds(80, 310, 80, 30);
		frame.add(englishLabel);
		englishField = new JTextField();
		englishField.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		englishField.setBounds(150, 310, 120, 30);
		frame.add(englishField);

		computerLabel = new JLabel("�������");
		computerLabel.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		computerLabel.setBounds(80, 350, 80, 30);
		frame.add(computerLabel);
		computerField = new JTextField();
		computerField.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		computerField.setBounds(150, 350, 120, 30);
		frame.add(computerField);
		
		/*
		 * sumUpLabel = new JLabel("");
		 * sumUpLabel.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		 * sumUpLabel.setBounds(350, 110, 80, 30);
		 * frame.add(sumUpLabel);
		*/
		
		// ImagePanel panel = new ImagePanel("/resource/image.png");
		// frame.add(panel);
		
		/*iconPanel = new JPanel();
		iconLabel = new JLabel();
		iconLabel.setBounds(350, 140, 380, 240);
		iconLabel.setIcon(new ImageIcon("/resource/icon.png"));//�ļ�·��
		iconPanel.add(iconLabel);
		frame.add(iconPanel);*/

		saveButton = new JButton("����");
		saveButton.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		saveButton.setBounds(80, 400, 90, 30);
		saveButton.addActionListener((ActionListener)this);         // ���������  ��ǿת���� ��ActionListener
		frame.add(saveButton);

		findButton = new JButton("����");
		findButton.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		findButton.setBounds(190, 400, 90, 30);
		findButton.addActionListener((ActionListener)this);
		frame.add(findButton);

		updateButton = new JButton("����");
		updateButton.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		updateButton.setBounds(80, 440, 90, 30);
		updateButton.addActionListener((ActionListener)this);
		frame.add(updateButton);

		deleteButton = new JButton("ɾ��");
		deleteButton.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		deleteButton.setBounds(190, 440, 90, 30);
		deleteButton.addActionListener((ActionListener)this);
		frame.add(deleteButton);

		showAllButton = new JButton("��ʾ����ѧ����Ϣ");
		showAllButton.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		showAllButton.setBounds(300, 440, 180, 30);
		showAllButton.addActionListener((ActionListener)this);
		frame.add(showAllButton);

		statButton = new JButton("ͳ�����ѧ���ĳɼ�");
		statButton.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		statButton.setBounds(300, 400, 180, 30); // 490 400 180 30
		statButton.addActionListener((ActionListener)this);
		frame.add(statButton);
		
		helpButton = new JButton("����");
		helpButton.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		helpButton.setBounds(490, 400, 90, 30);
		helpButton.addActionListener((ActionListener)this);
		frame.add(helpButton);

		
		loadFromFileButton = new JButton("��������");
		loadFromFileButton.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		loadFromFileButton.setBounds(490, 440, 120, 30);
		loadFromFileButton.addActionListener((ActionListener)this);
		frame.add(loadFromFileButton);
		
		
		saveToFileButton = new JButton("��������");
		saveToFileButton.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		saveToFileButton.setBounds(610, 440, 120, 30);
		saveToFileButton.addActionListener((ActionListener)this);
		frame.add(saveToFileButton);		

		StudentDatabases = new ArrayList<>();

		frame.setVisible(true);
		
		// frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);    // �Ӹ�ȷ�Ϲر�
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "ȷ���˳�?", "ȷ��", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if (result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
