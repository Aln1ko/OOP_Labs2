package Manager;

import Game.Character;
import Game.Difficult_Game;
import Game.Rest;
import Game.Work;
import Game.Study;
import Game.Shop;

public class Manager
{
    Character hero = new Character();
    Difficult_Game diff_game = new Difficult_Game();
    Rest rest = new Rest();
    Work work = new Work();
    Study study = new Study();
    Shop shop = new Shop();

    public void create_hero(String name , String sex, int difficult )
    {
        hero.set_Name(name);
        hero.set_sex(sex);
        diff_game.fill_difficult(hero,difficult);
    }

    public void rest_polyana() {rest.go_to_polyana(hero);}

    public void rest_cart() {rest.make_cart_be_on_tree(hero);}

    public void rest_drink() {rest.drink_alchogol(hero);}

    public void rest_gachimuchi(){rest.make_gachimuchi(hero);}

    public void work_dance(){work.go_to_dance(hero);}

    public void work_coder(){work.coder_work(hero);}

    public void work_listovki(){work.rozdavat_listovki(hero);}

    public void work_senior(){work.senior_work(hero);}

    public void study_lab(){study.make_lab(hero);}

    public void study_homework(){study.make_homework(hero);}

    public void study_university(){study.go_to_university(hero);}

    public void study_kurs(){study.napisat_kursovu(hero);}

    public void shop_kurs(){shop.buy_coursework(hero);}

    public void shop_diplom(){shop.buy_diploma(hero);}




}
