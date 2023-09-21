
public class Review implements Comparable<Review>{

	private String userName;
	private int points;
	private String comments;
	
	public Review(String userName, int points, String comments) {
		super();
		this.userName = userName;
		this.points = points;
		this.comments = comments;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public boolean checkUser() throws UserNotFound{
		if(userName == null || userName.isEmpty()) {
			throw new UserNotFound();
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Review [userName=" + userName + ", points=" + points + ", comments=" + comments + "]";
	}

	@Override
	public int compareTo(Review rev) {
		// TODO Auto-generated method stub
		return this.getPoints()-rev.getPoints();
	}
	
	
}
