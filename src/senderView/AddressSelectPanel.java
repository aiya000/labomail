package senderView;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;

import AddressBook.PaneAddress;

public class AddressSelectPanel extends PaneAddress {

	private JButton addTo;
	private JButton addBCC;

	public AddressSelectPanel(){
		super();
		super.remove(3);
		addTo = new JButton("宛先に追加");
		this.add(addTo, "cell 0 1, center");
		addBCC = new JButton("BCCに追加");
		this.add(addBCC, "cell 1 1, center");
	}
	/* 「＋」ボタンクリック時 */
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("act");
	}

	/* リスト要素クリック時 */
	@Override
	public void valueChanged(ListSelectionEvent e){
		System.out.println("act");
	}
}
