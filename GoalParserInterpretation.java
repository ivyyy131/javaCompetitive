public class GoalParserInterpretation {
	
	public String interpret(String command) {
		char[] ch = new char[command.length()];
		
		for (int i = 0; i < command.length(); i++) { 
            ch[i] = command.charAt(i); 
        } 
		
		String ans = "";
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='G'){
                ans+='G';
            }else{
                if(ch[i+1]==')'){
                    ans+="o";
                    i++;
                }else{
                	ans+="al";
                    i+=3;
                }
            }
        }
        return ans;
    }
	
	public String interpret2(String command) {
		String ans = "";
        for(int i=0; i<command.length(); i++){
        	String ch = command.charAt(i)+"";
            if(ch.equals("G")){
                ans+='G';
            }else{
            	String ch2 = command.charAt(i+1)+"";
                if(ch2.equals(")")){
                    ans+="o";
                    i++;
                }else{
                	ans+="al";
                    i+=3;
                }
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		String s = "G()()()()(al)";
		String ans = new GoalParserInterpretation().interpret2(s);
	    System.out.println(ans);
		
	}

}
