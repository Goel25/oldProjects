import java.util.Scanner;
public class Scoreboard {
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter team 1:");
		String team1 = Scan.next();
		System.out.println("Enter team 2:");
		String team2 = Scan.next();
		int score1 = 0, score2 = 0;
		System.out.println("Enter how many points you need to win");
		int win = Scan.nextInt();
		for (int counter = 0; counter <= 1000; counter++){
		System.out.println("#########################");
		System.out.println("#\t" + team1 + "\t" + team2 + "\t#");
		System.out.println("#\t" + score1 + "\t" + score2 + "\t#");
		System.out.println("#########################");
		if (score1 >= win || score2 >= win){
			if (score1 > score2){
				System.out.println("#########################");
				System.out.println("#\t" + team1 + "\t" + team2 + "\t#");
				System.out.println("#\t" + score1 + "\t" + score2 + "\t#");
				System.out.println("#########################");
				System.out.println(team1 + " WINS!");
				break;
			}else{
				System.out.println("#########################");
				System.out.println("#\t" + team1 + "\t" + team2 + "\t#");
				System.out.println("#\t" + score1 + "\t" + score2 + "\t#");
				System.out.println("#########################");
				System.out.println(team2 + " WINS!");
				break;
			}
		}else{
			System.out.println("Enter team that scored (1 or 2)");
			int sel = Scan.nextInt();
			switch (sel){
				case 1:
					System.out.println("Enter points scored for " + team1);
					score1 += Scan.nextInt();
					break;
				case 2:
					System.out.println("Enter points scored for " + team2);
					score2 += Scan.nextInt();
					break;
			}
			}
		}
	}
}