package senderView;

//違和感があっても、実際の流れを汲み取っているためです。
public class StringArray_ReturnalClass {
	private MailSenderPanel receiveClass;
	private int callNumber;

	public StringArray_ReturnalClass(MailSenderPanel receiveClass, int callNumber){
		this.receiveClass = receiveClass;
		this.callNumber = callNumber;
		set();
	}

	public void set(){
		receiveClass.setResult(new String[]{"udonge.like@gmail.com", "x12j007@chiba-fjb.ac.jp"}, callNumber);
	}
}
