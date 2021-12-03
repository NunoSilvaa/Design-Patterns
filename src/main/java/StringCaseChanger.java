public class StringCaseChanger implements StringTransformer{
    StringCaseChanger(){};
    @Override
    public void execute(StringDrink drink) {
        char ch;
        String str = drink.getText();
        StringBuffer nstr = new StringBuffer(str.length());

        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                ch=Character.toUpperCase(ch);
            }
            else{
                ch=Character.toLowerCase(ch);
            }
            nstr.append(ch);
        }
        drink.setText(nstr.toString());
    }

    public void undo(StringDrink drink){
        execute(drink);
    }
}
