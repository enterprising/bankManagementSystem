package view_Counter;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import view_ATM.CurrentTransfer_Main;
import view_ATM.MainView_User;
import view_ATM.Transfer_accounts_Main;
import view_Admin.MainView_Admin;


public class Transfer_accounts_Main_counter extends JDialog{
	
	private JLabel etishiLabel = new JLabel("Please    Select    Service");
	private JLabel ctishiLabel = new JLabel("��ѡ������ҵ��");

	private JButton b1 = new JButton("����ת��");
	private JButton b2 = new JButton("����ת��");
	private JButton b3 = new JButton("�˳�");
	private JButton b4 = new JButton("�������˵�");

	public Transfer_accounts_Main_counter(final String account_admin,final String account_user) {

		this.setLayout(null); // ���ַ�ʽ�����Բ���
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		etishiLabel.setBounds(140, 20, 620, 45);
		add(etishiLabel);
		etishiLabel.setFont(new Font("", Font.PLAIN, 29));
		etishiLabel.setForeground(Color.black);

		ctishiLabel.setBounds(250, 60, 350, 45);
		ctishiLabel.setForeground(Color.black);
		add(ctishiLabel);
		ctishiLabel.setFont(new Font("�п�", Font.PLAIN, 18));

		b1.setBounds(120, 140, 140, 50);
		add(b1);
		b2.setBounds(370, 140, 140, 50);
		add(b2);
		b3.setBounds(120, 220, 140, 50);
		add(b3);
		b4.setBounds(370, 220, 140, 50);
		add(b4);

		b1.setForeground(Color.red);
		b2.setForeground(Color.red);
		b3.setForeground(Color.red);
		b4.setForeground(Color.red);

		b1.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		b2.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		b3.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		b4.setFont(new Font("΢���ź�", Font.PLAIN, 20));

		// ����ת��
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Transfer_accounts_Main_counter.this.dispose();
				CurrentTransfer_Main_counter currentTransfer_Main = new CurrentTransfer_Main_counter(
						account_admin, account_user);

			}

		});

		// ����ת��
		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}

		});

		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "ȷ���˳���", "��ʾ",
						JOptionPane.YES_NO_OPTION);

				if (n == 0) {
					JOptionPane.showMessageDialog(null, "�˳��ɹ���ף������˳����");
					System.exit(0);
				} else {
					return;
				}
			}

		});

		b4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Transfer_accounts_Main_counter.this.dispose();
				MainView_Admin mainView_Admin = new MainView_Admin(account_admin);

			}

		});

		this.setTitle("ת��ҵ��");
		this.setResizable(false); // �����϶������
		this.setSize(650, 400);
		this.setLocationRelativeTo(null); // ����
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // �رգ���ʲô������
		this.setVisible(true); // ������ӻ�

	}

	

}