public class Account {

    private final String name;
    public final int MAX_LENGTH  = 19;
    public final int MIN_LENGTH  = 3;
    public final int PERMITTED_SPACE_COUNT  = 1;

    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss() {
        int i = 0;
        int spaceCount = 0;
        if (name.length() >= MAX_LENGTH){
            return false;
        }
        if (name.length() <= MIN_LENGTH){
            return false;
        }

        if (name.startsWith(" ")){
            return false;
        }
        if (name.endsWith(" ")) {
            return false;
        }
        for(i=0; i < name.length(); i++){
            if( name.charAt(i) == ' ' ) {
                spaceCount++;
            }
        }
        if(spaceCount > PERMITTED_SPACE_COUNT){
            //System.out.println("more spaces then expected");
            return false;
        }

        return true;
    }
}