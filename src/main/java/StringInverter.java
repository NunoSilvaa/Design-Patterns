public class StringInverter implements StringTransformer{

    public StringInverter(){
    }

    @Override
    public void execute(StringDrink drink) {
        String str = drink.getText();
        char ch;
        String nstr ="";

        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        drink.setText(nstr);
    }

    public void undo(StringDrink drink){
        execute(drink);
    }
}
