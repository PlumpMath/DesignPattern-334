package strupattern.decorator;

public class SocialNetworkBanking extends FeatureDecorator{

	BankAccount account;

	public SocialNetworkBanking(BankAccount account) {
		super(account);
		this.account = account;
	}

	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return account.balanceToMaintain() + 2000.00;
	}
	
	
}
