package application;
import java.util.HashMap;
import java.util.Map;

public class Aptitude {

	public static void main(String args[]) {
		String left_char = "";
		char mid_char = 0;
		HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
		String name = "RAMAR";
		for(int i = 0;i < name.length();i++) {
			if(hash.containsKey(name.charAt(i))) {
				hash.put(name.charAt(i),(hash.get(name.charAt(i)))+1);
			}
			else {
				hash.put(name.charAt(i),1);
			}
		}
		for(Map.Entry m : hash.entrySet()) {
			System.out.println(m.getKey()+ " " +m.getValue());
			int l = (int) m.getValue();
			boolean visited = false;
			if(l % 2 == 1) {
				mid_char = (char) m.getKey();
				if(l>1) {
					left_char = left_char + (char) m.getKey();
				}
			}
			else if(l %2==0) {
				int n = l/2;
				for(int i = 0;i < n;i++) {
					left_char = (String) (left_char + (char)m.getKey());
				}
			}
		}
		String right_char = "";
		for(int i = left_char.length()-1;i >=0;i--) {
			right_char = right_char + left_char.charAt(i);
		}
		String full = left_char + mid_char + right_char;
		System.out.println(full);
	}
}
