package Game;

interface InterfaceChangeAtributs
{
    public static void change_money(character hero,int money){}

    public static void change_marks(character hero,int marks){}

    public static void change_moral_points(character hero,int moral_points){}

}

public class ChangeAtributs implements  InterfaceChangeAtributs
{
    public void change_money(character hero, int money)
    {
        int my_money = hero.get_money();
        my_money += money;
        hero.set_money(my_money);
    }

    public void change_marks(character hero,int marks)
    {
        int my_marks = hero.get_marks();
        my_marks += marks;
        hero.set_marks(my_marks);
    }

    public void change_moral_points(character hero,int moral_points)
    {
        int my_moral_points = hero.get_moral_points();
        my_moral_points += moral_points;
        hero.set_moral_points(my_moral_points);
    }
}


