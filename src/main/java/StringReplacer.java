public class StringReplacer implements StringTransformer{
    private char ch1;
    private char ch2;

    public StringReplacer(char ch1, char ch2){
        this.ch1 = ch1;
        this.ch2 = ch2;
    };
    @Override
    public void execute(StringDrink drink) {
        String str = drink.getText();
        str = str.replace(ch1, ch2);
        drink.setText(str);
    }

    public void undo(StringDrink drink){
        String str = drink.getText();
        str = str.replace(ch2, ch1);
        drink.setText(str);
    }
}
