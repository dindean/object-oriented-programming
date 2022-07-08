public class stringMan implements CharSequence {

    //Implementando as assinaturas da interface CharSequence
    private String str = "";

    @Override
    public char charAt(int index) {
        return getStr().charAt(index);
    }

    @Override
    public int length() {
        return getStr().length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        stringMan toReturn = new stringMan();

        toReturn.setStr(str.substring(start, end));

        return toReturn;
    }

    @Override
    public String toString () {
        return getStr();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = new StringBuilder(str).reverse().toString();
    }

}
