
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

/**
 *
 * @author marcel
 */
public class Apresentacao extends javax.swing.JFrame {

	private Camara camara = new Camara();

	/**
	 * Creates new form Apresentacao
	 */
	public Apresentacao() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	
	JRadioButton rbPL;
	JRadioButton rbPLC;
	ButtonGroup gbTipoLei = new ButtonGroup();
	
	private void initComponents() {

		jLabel7 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jButton3 = new javax.swing.JButton();
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador v = camara.getVereadorMenorDesempenho();
				String str;
				if (v == null) {
					str = "Não há vereadores cadastrados";
				} else {
					str = "Menor desempenho\n\n" + v.getNome() + " do partido " + v.getPartido().getNome() + " = "
							+ v.getDesempenho();
				}
				JOptionPane.showMessageDialog(jTabbedPane1, str);
			}
		});
		jButton4 = new javax.swing.JButton();
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador v = camara.getVereadorMaisProjAprov();
				String str;
				if (v == null) {
					str = "Não há vereadores cadastrados";
				} else {
					str = "Mais projetos cadastrados\n\n" + v.getNome() + " do partido " + v.getPartido().getNome()
							+ " = " + v.getDesempenho();
				}
				JOptionPane.showMessageDialog(jTabbedPane1, str);
			}
		});
		jLabel9 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jButton5 = new javax.swing.JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Partido p = camara.getPartido(Integer.parseInt(jTextField7.getText()));
					String str;
					if (p == null) {
						str = "Não há partido com este número";
					} else {
						str = "Partido " + p.getNome() + "\n\nTotal de projetos aprovados = " + p.getTotalProjAprov()
								+ "\nTotal de projetos apresentados = " + p.getTotalProjApres()
								+ "\nMédia de desempenho do partido = " + p.getMediaDesempenho();
					}
					JOptionPane.showMessageDialog(jTabbedPane1, str);
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(jTabbedPane1, "Digite um n�mero de partido v�lido");
				}
			}
		});
		jSeparator1 = new javax.swing.JSeparator();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();

		jLabel7.setText("jLabel7");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lista 3 - Exercício 5");

		jLabel1.setText("Número:");

		jLabel2.setText("Nome:");

		jButton1.setText("Cadastrar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jButton1)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
							.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel1)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(153, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel1)
						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel2)
						.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(jButton1)
					.addContainerGap(139, Short.MAX_VALUE))
		);
		jPanel1.setLayout(jPanel1Layout);

		jTabbedPane1.addTab("Partido", jPanel1);

		jLabel3.setText("Nome: ");

		jLabel4.setText("Número do partido:");

		jLabel5.setText("Quantidade de projetos apresentados:");

		jLabel6.setText("aprovados:");

		jButton2.setText("Cadastrar");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 264,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(
												jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel6).addComponent(jLabel5))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 40,
														Short.MAX_VALUE)
												.addComponent(jTextField6)))
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(132, 132, 132)
										.addComponent(jButton2)))
						.addContainerGap(63, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(27, 27, 27).addComponent(jButton2).addGap(70, 70, 70)));

		jTabbedPane1.addTab("Vereador", jPanel2);

		jButton3.setText("Vereador menor desempenho");

		jButton4.setText("Vereador com mais proj. aprovados");

		jLabel9.setText("Número do partido:");

		jButton5.setText("Estatísticas do partido");

		jButton6.setText("Total de projetos da Câmara");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("Vereadores acima da média");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});
		
		jPanel4 = new JPanel();
		jTabbedPane1.addTab("Projetos de Lei", null, jPanel4, null);
		jPanel4.setLayout(null);
		
		rbPL = new JRadioButton("Projeto de Lei");
		rbPL.setSelected(true);
		rbPL.setBounds(6, 31, 109, 23);
		rbPL.addActionListener(e -> {
			tfLeiOrganica.setText("");
			tfVotosAFavor.setText("");
			tfLeiOrganica.setEditable(false);
			tfVotosAFavor.setEditable(false);
		});
		jPanel4.add(rbPL);
		
		rbPLC = new JRadioButton("Projeto de Lei complementar");
		rbPLC.setBounds(117, 31, 161, 23);
		rbPLC.addActionListener(e -> {
			tfLeiOrganica.setEditable(true);
			tfVotosAFavor.setEditable(true);
		});
		jPanel4.add(rbPLC);
		gbTipoLei.add(rbPL);
		gbTipoLei.add(rbPLC);
		
		rbPL.addActionListener(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de projeto:");
		lblNewLabel.setBounds(6, 11, 109, 14);
		jPanel4.add(lblNewLabel);
		
		tfNomeProjetoDeLei = new JTextField();
		tfNomeProjetoDeLei.setBounds(6, 76, 224, 23);
		jPanel4.add(tfNomeProjetoDeLei);
		tfNomeProjetoDeLei.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do Projeto de Lei");
		lblNewLabel_1.setBounds(6, 62, 122, 14);
		jPanel4.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Votos a favor:");
		lblNewLabel_2.setBounds(223, 178, 161, 14);
		jPanel4.add(lblNewLabel_2);
		
		tfLeiOrganica = new JTextField();
		tfLeiOrganica.setBounds(6, 203, 187, 23);
		tfLeiOrganica.setEditable(false);
		jPanel4.add(tfLeiOrganica);
		tfLeiOrganica.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Lei Organica:");
		lblNewLabel_3.setBounds(10, 178, 161, 14);
		jPanel4.add(lblNewLabel_3);
		
		tfVotosAFavor = new JTextField();
		tfVotosAFavor.setColumns(10);
		tfVotosAFavor.setBounds(221, 203, 86, 23);
		tfVotosAFavor.setEditable(false);
		jPanel4.add(tfVotosAFavor);
		
		tfDataApresentacao = new JTextField();
		tfDataApresentacao.setColumns(10);
		tfDataApresentacao.setBounds(6, 143, 109, 23);
		jPanel4.add(tfDataApresentacao);
		
		lblNewLabel_4 = new JLabel("Data apresentação:");
		lblNewLabel_4.setBounds(6, 118, 161, 14);
		jPanel4.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Data aprovação:");
		lblNewLabel_5.setBounds(129, 118, 161, 14);
		jPanel4.add(lblNewLabel_5);
		
		tfDataAprovacao = new JTextField();
		tfDataAprovacao.setColumns(10);
		tfDataAprovacao.setBounds(129, 143, 109, 23);
		jPanel4.add(tfDataAprovacao);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(141, 237, 89, 23);
		jPanel4.add(btnNewButton);
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LocalDate dataApresentacao, dataAprovacao;
				String nomePL;
				int votosAFavor;
				String leiOrganica;
				
				Boolean foiAprovada;
				if(!tfDataAprovacao.getText().isBlank()) {
					foiAprovada = true;
				} else {
					foiAprovada = false;
				}
				
				//Sobre o nome:
				nomePL = tfNomeProjetoDeLei.getText();
				
				//Sobre as datas:
				dataApresentacao = setData(tfDataApresentacao.getText());
				if(foiAprovada){
					dataAprovacao = setData(tfDataAprovacao.getText());
				}
				
				//Sobre o textField da lei organica:
				if(!rbPL.isSelected() && tfLeiOrganica.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "A Lei Organica não pode estar vazia");
					throw new IllegalArgumentException();
				} else {
					leiOrganica = tfLeiOrganica.getText();
				}
				
				if(!rbPL.isSelected()) { //Se o Radio button Projeto de Lei não estiver ON, Radio Button Projeto de Lei Complementar == true
					votosAFavor = setVotosAFavor(tfVotosAFavor.getText());
					JOptionPane.showMessageDialog(null, votosAFavor);
				}
				
				//Adicionando:
				
			}
		});
		
		todosOsVereadores = new JButton();
		todosOsVereadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Vereador> listaVereadores = camara.pegarVereadores();
				String conteudo = "Lista de vereadores: \r\n";
				
				for(Vereador v: listaVereadores) {
					conteudo += v.getNome() + ", " + v.getPartido() + ", " + v.getDesempenho() + "\r\n";
				}
				
				JOptionPane.showMessageDialog(null, conteudo);
			}
		});
		todosOsVereadores.setText("Mostrar todos vereadores");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addComponent(jLabel9)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(jButton5))))
						.addComponent(jButton3)
						.addComponent(jButton4)
						.addComponent(jButton6)
						.addComponent(jButton7)
						.addComponent(todosOsVereadores, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel9)
						.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton5))
					.addGap(13)
					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jButton3)
					.addGap(18)
					.addComponent(jButton4)
					.addGap(18)
					.addComponent(jButton6)
					.addGap(18)
					.addComponent(jButton7)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(todosOsVereadores)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel3.setLayout(jPanel3Layout);

		jTabbedPane1.addTab("Consultas", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(40))
		);
		getContentPane().setLayout(layout);
		
		
		
		ArrayList<String> camaeraStrings = new ArrayList<>();

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String str;
		try {
			if (camara.getPartido(Integer.parseInt(jTextField1.getText())) == null) {
				Partido partido = new Partido();
				partido.setNome(jTextField2.getText());
				partido.setNumero(Integer.parseInt(jTextField1.getText()));
				camara.addPartido(partido);
				str = "Partido cadastrado";
			} else {
				str = "Já há partido com este número. Escolha outro número";
			}
		} catch (IllegalArgumentException iae) {
			str = iae.getMessage();
		}
		JOptionPane.showMessageDialog(this, str);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		Partido p = camara.getPartido(Integer.parseInt(jTextField4.getText()));
		if (p == null) {
			jLabel8.setText("Número do partido não localizado");
		} else {
			try {
				jLabel8.setText(p.getNome());
				Vereador ver = new Vereador(jTextField3.getText(),p);
				ver.setQtdProjApres(Integer.parseInt(jTextField5.getText()));
				ver.setQtdProjAprov(Integer.parseInt(jTextField6.getText()));
				JOptionPane.showMessageDialog(this, "Vereador cadastrado com desempenho " + ver.getDesempenho());
			} catch (IllegalArgumentException iae) {
				JOptionPane.showMessageDialog(this, iae.getMessage());
			}
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		int aprov = camara.getTotalProjAprov();
		int apres = camara.getTotalProjApres();
		String str = "Total de projetos aprovados = " + aprov + "\nTotal de projetos apresentados = " + apres;
		JOptionPane.showMessageDialog(this, str);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		List<Vereador> acima = camara.getVereadoresAcimaMedia();
		String str = "Vereadores acima da média (" + camara.getMediaDesempenho() + ")\n";
		for (Vereador v : acima) {
			str += "\n" + v.getNome() + " do partido " + v.getPartido().getNome() + " = " + v.getDesempenho();
		}
		JOptionPane.showMessageDialog(this, str);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Apresentacao().setVisible(true);
			}
		});
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rbPL) {
			System.out.println("sad");
			
			JOptionPane.showMessageDialog(null, "entrou A");
			tfLeiOrganica.setText("");
			tfVotosAFavor.setText("");
			tfLeiOrganica.setEditable(false);
			tfVotosAFavor.setEditable(false);
			
		} else if (e.getSource()==rbPLC) {
			System.out.println("sad b");
			
			JOptionPane.showMessageDialog(null, "entrou B");
			tfLeiOrganica.setEditable(true);
			tfVotosAFavor.setEditable(true);
			
		}
	}
	
	public LocalDate setData(String supostaData) throws IllegalArgumentException{
		LocalDate data = LocalDate.of(2002, 10, 07);
		supostaData = supostaData.replace("/", "");
		supostaData = supostaData.replace("\\", "");
		supostaData = supostaData.replace(".", "");
		supostaData = supostaData.replace("-", "");
		if (supostaData.length()<8) {
			JOptionPane.showMessageDialog(null, "Data é muito pequena");
			throw new IllegalArgumentException();
		} else if (supostaData.length()>8) {
			JOptionPane.showMessageDialog(null, "A data é muito grande");
			throw new IllegalArgumentException();
		} 
		if(supostaData.matches("[a-zA-Z]+")) {
			JOptionPane.showMessageDialog(null, "A data não pode conter letras. Não escreva em números romanos, por exemplo");
			throw new IllegalArgumentException();
		}
		if(supostaData.length()==8) {
			data = LocalDate.of(Integer.parseInt(supostaData.substring(4)), Integer.parseInt(supostaData.substring(2,4)),Integer.parseInt(supostaData.substring(0, 2)));
			return data;
		}
		return data;
	}
	
	public int setVotosAFavor(String tfVotosAFavor) throws IllegalArgumentException {
		if(tfVotosAFavor.matches("[a-zA-Z]+")) {
			JOptionPane.showMessageDialog(null, "Não se deve ter letras na quantidade de votos");
			throw new IllegalArgumentException();
		}
		else {
			return Integer.parseInt(tfVotosAFavor);
		}
	}
	
	// Variables declaration
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private JPanel jPanel4;
	private JTextField tfNomeProjetoDeLei;
	private JLabel lblNewLabel_2;
	private JTextField tfLeiOrganica;
	private JLabel lblNewLabel_3;
	private JTextField tfVotosAFavor;
	private JTextField tfDataApresentacao;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tfDataAprovacao;
	private JButton todosOsVereadores;
}
