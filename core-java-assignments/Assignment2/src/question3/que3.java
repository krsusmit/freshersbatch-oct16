package question3;

public class que3 {
	
    public static void main(String[] args) {
        CurrentAcc currentAcc = new CurrentAcc(1000,4000);
        currentAcc.disp();
        SavingAcc savingAcc = new SavingAcc(10000,6000);
        savingAcc.disp();
        double totalBankBalance = currentAcc.getBalance()+ savingAcc.getBalance();
        System.out.println("Total Cash in bank = " + totalBankBalance);
    }
}