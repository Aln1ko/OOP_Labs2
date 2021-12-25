package Game;

public class Shop
{
    ChangeAtributs changeAtributs = new ChangeAtributs();

    public void buy_coursework (Character hero)// купити курсову
    {
        changeAtributs.change_money(hero,-300);
        changeAtributs.change_marks(hero,+500);
        changeAtributs.change_moral_points(hero,+100);
    }

    public void buy_diploma (Character hero)// купити диплом
    {
        changeAtributs.change_money(hero,-3000);
        changeAtributs.change_marks(hero,+5000);
        changeAtributs.change_moral_points(hero,+1000);
    }

    public void buy_girl  (Character hero)// купити дівчину на годину
    {
        changeAtributs.change_money(hero,-150);
        changeAtributs.change_marks(hero,-25);
        changeAtributs.change_moral_points(hero,+500);
    }

    public void buy_drink (Character hero) // купити алкоголь
    {
        changeAtributs.change_money(hero,-50);
        changeAtributs.change_marks(hero,-100);
        changeAtributs.change_moral_points(hero,+300);
    }
}
