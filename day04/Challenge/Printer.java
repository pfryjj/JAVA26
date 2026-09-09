package homework;
// 양면 출력부터 ai 돌려습니다 죄솧합니다.
public class Printer {
    private int numOfPapers;
    private boolean duplex;
    
    public Printer(int numOfPapers) {
        this.numOfPapers = numOfPapers;
        this.duplex = false; 
    }
    
    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }
    
    public void print(int amount) {
        int paperNeeded;
        if (duplex == true) {
            paperNeeded = (amount + 1) / 2;
        } else {
            paperNeeded = amount;
        }
        
        String modeName;
        if (duplex == true) {
            modeName = "양면으로 ";
        } else {
            modeName = "단면으로 ";
        }

        if(numOfPapers == 0) {
            System.out.println("용지가 없습니다.");
        }
        else if(numOfPapers < paperNeeded) {
            int a = paperNeeded - numOfPapers; 
            System.out.println(modeName + "모두 출력하려면 용지가 " + a + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
            numOfPapers = 0;
        }
        else {
            numOfPapers -= paperNeeded; 
            System.out.println(modeName + paperNeeded + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
        }
    }
    
    public boolean getDuplex() {
        return duplex;
    }
    
    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
    
    public int getpaper() {
        return numOfPapers;
    }
}