
public class Team implements Comparable<Team> {
	private String name;
	private int seed;
	private double expected;
	private String region;
	private int wins;
	
	public Team(String name, double expected, String region, int seed) {
		this.seed = seed;
		this.region = region;
		this.expected = expected/100;
		this.name = name;
		this.wins = 0;
	}
	
	public String toString() {
		return (name + " " + seed + " " + region + " " +  expected);
	}
	
	public  double getExpected() {
		return expected;
	}
	
	public int getSeed() {
		return seed;
	}
	
	public String getRegion() {
		return region;
	}
	
	public String getName() {
		return name;
	}
	
	public void incrementWins() {
		wins ++; 
	}
	
	public int getWins() {
		return wins;
	}
	
	public int compareTo(Team team) {
		if(team.getWins() > wins) {
			return 1;
		}
		else if(team.getWins() == wins) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	public void setSeed(int newseed) {
		seed = newseed;
	}

}
