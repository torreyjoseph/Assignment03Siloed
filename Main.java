public class Main {

    public static void main(String[] args) {
	// write your code here
        float pi = 3.14f;
        float h1 = 72.0f;
        float h2 = 19.0f;
        float h3 = 50.0f;
        float h4 = 67.0f;
        float h5 = 16.0f;
        float h6 = 53.0f;
        float h7 = 69.0f;
        float h8 = 30.0f;
        float h9 = 52.0f;
        float h10 = 40.0f;
        float h11 = 31.0f;
        float h12 = 75.0f;
        float d1 = 22.0f;
        float d2 = 18.0f;
        float d3 = 13.0f;
        float d4 = 16.0f;
        float d5 = 14.0f;
        float d6 = 23.0f;
        float d7 = 22.0f;
        float d8 = 22.0f;
        float d9 = 23.0f;
        float d10 = 16.0f;
        float d11 = 18.0f;
        float d12 = 23.0f;
        float TowerVol1 = pi*(d1/2)*(d1/2)*h1;
        float TowerVol2 = pi*(d2/2)*(d2/2)*h2;
        float TowerVol3 = pi*(d3/2)*(d3/2)*h3;
        float TowerVol4 = pi*(d4/2)*(d4/2)*h4;
        float TowerVol5 = pi*(d5/2)*(d5/2)*h5;
        float TowerVol6 = pi*(d6/2)*(d6/2)*h6;
        float TowerVol7 = pi*(d7/2)*(d7/2)*h7;
        float TowerVol8 = pi*(d8/2)*(d8/2)*h8;
        float TowerVol9 = pi*(d9/2)*(d9/2)*h9;
        float TowerVol10 = pi*(d10/2)*(d10/2)*h10;
        float TowerVol11 = pi*(d11/2)*(d11/2)*h11;
        float TowerVol12 = pi*(d12/2)*(d12/2)*h12;
        float TotalWaterCubMet = TowerVol1 + TowerVol2 + TowerVol3 + TowerVol4 + TowerVol5 + TowerVol6 + TowerVol7 + TowerVol8 + TowerVol9 + TowerVol10 + TowerVol11 + TowerVol12;
        System.out.println("There are "+ TotalWaterCubMet +" cubic meters of water available for this town.");
        float Pop = 37640.0f;
        float DailyUse = 0.246f;
        float TMinusRsply = 28f;
        float H2OPPD = Pop*DailyUse*TMinusRsply;
        System.out.println("The average water usage per person over a "+ TMinusRsply +" day period would normally be "+ H2OPPD +" cubic meters.");
        float SavingsTot = H2OPPD-TotalWaterCubMet;
        float SavingsReq = (SavingsTot/Pop/TMinusRsply);
        System.out.println("Each person will have to conserve about "+ SavingsReq +" cubic meters of water per day in order to not run out before the resupply.\nHappy rationing!");

    }
}
