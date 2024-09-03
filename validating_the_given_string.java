package jdbcformvalidation;

public class validating_the_given_string {
		String name;
		String pass;
		public boolean validate1(String username) {
			this.name = username;
			if(name.length()>=8) {
				int count =0;
				for(char i : name.toCharArray() ) {
					if(Character.isLetter(i)) {
						count++;
					}
				}
				if(count == name.length()) {
				return true;
				}
				return false;
			}
			else {
				return false;
			}
		}
		public boolean validate(String pass) {
			this.pass = pass;
			String specialCharacters = "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+";
			int num=0;
			int letter =0;
			int caps =0; 
			int spl=0;
			if(pass.length()>=8) {
				for(char i : pass.toCharArray()) {
					if(Character.isDigit(i)) {
						num++;
					}
					if(Character.isLetter(i)) {
						letter++;
					}
					if(Character.isUpperCase(i)) {
						caps++;
					}
					if(String.valueOf(i).matches(specialCharacters)) {
						spl++;
					}
				}
				if(num>0 && letter>0 && caps>0 && spl>0) {
				return true;
				}
				return false;
			}
			else {
				return false;
			}
		}
}
