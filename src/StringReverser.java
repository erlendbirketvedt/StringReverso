public class StringReverser {
    public StringReverser() {

    }
    public void SimpleReverse(String s) {

        String reverso = new StringBuilder(s).reverse().toString();
        System.out.println("You entered " + s + ". " + "Let's reverse it using StringBuilder: " + reverso);
    }

    public void AdvanceReverse(String s) {
        String reversoAdvanced = "";
        for (int i=s.length()-1; i >= 0; i--) {
            reversoAdvanced = reversoAdvanced + s.charAt(i);
        }
        System.out.println("You entered " + s + ". " + "Let's reverse it using replaceAtChar: " + reversoAdvanced);

    }
}
