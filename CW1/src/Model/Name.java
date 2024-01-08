package Model;

public class Name {
	public static String getInitials(String fullName) {
		int idxLastWhitespace = fullName.lastIndexOf(' ');
        return fullName.charAt(0) + fullName.substring(idxLastWhitespace + 1, idxLastWhitespace + 2);
    }  
}
