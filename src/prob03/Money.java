package prob03;

public class Money {

	private int amount;
	
	public Money(int i) {
		setAmount(i);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Object add(Money three) {
		Money add = new Money(this.amount + three.getAmount());
		//System.out.println(three.getAmount());
		return add;
	}

	public Object minus(Money two) {
		Money sub = new Money(this.amount - two.getAmount());
		return sub;
	}

	public Object multiply(Money two) {
		Money mul = new Money(this.amount * two.getAmount());
		return mul;
	}

	public Object devide(Money five) {
		Money div = new Money(this.amount / five.getAmount());
		return div;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Money)
			return ((Money) obj).getAmount() == this.amount;
		else
			return false;
	}
    
    
}
