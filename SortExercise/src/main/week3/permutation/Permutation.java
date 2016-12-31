package week3.permutation;

public class Permutation{
	
	public static String substract(String sum, String minus) {
		String rest = "";
		for (int i = 0; i < sum.length(); i++) {
			String component = sum.charAt(i)+"";
			if (!minus.contains(component)) {
				rest = rest + component;
			}
		}
		return rest;
	}
	
	public static void permutation(int index, String done , String total){
		String rest = substract(total, done);
		if (index == total.length()) {
			System.out.println(done+rest);
			return;
		} else {
			for (int j = 0; j < total.length() - index; j++){
				permutation(index + 1, done + rest.charAt(j), total);
			}
		}
	}
	
	public static String checkRepetition(String initial) {
		String output = "";
		Boolean repeat = true;
		for (int k = 0; k < initial.length(); k++){
			repeat = true;
			for (int m = k + 1; m < initial.length(); m++) {
				if (initial.charAt(k) == initial.charAt(m)){
					repeat = false;
				}
			}
			if (repeat) {
				output = output + initial.charAt(k);
			}
		}
		return output;
	}
    public static void main(String[] args) {
    	String toPermute = "123355";
    	String noRepetition = checkRepetition(toPermute);
    	permutation(0,"",noRepetition);
    }
}