package cerebro;

public class Cerebro {
    public static void main(String[] args) throws Exception {
        Model model = new Model();
        Id3 tree = model.getTreeFromDB();
        System.out.println(tree);
        Game game = new Game(tree);

        game.start();

        // TEST POUR addScore
//        ArrayList<String> q = new ArrayList<>();
//        q.add("Votre personnage peut-il mourir ?");
//        q.add("Le personnage fait-il partie des Watchmen ?");
//        model.addScore("Rorschach", q);

        // TEST POUR addCharacter DANGER DANGER DANGER
//        ArrayList<String> q = new ArrayList<>();
//        q.add("Votre personnage peut-il mourir ?");
//        q.add("Le personnage fait-il partie des Watchmen ?");
//
//        ArrayList<String> r = new ArrayList<>();
//        r.add("Non");
//        r.add("Non");
//
//        model.addNewHero("Dio_Brando", "Le personnage est-il un faggot ?", false, q, r);

        /* Au cas où
        DELETE FROM `Cerebro`.`answer` WHERE `answer`.`questionId` > 23 OR `answer`.`characterId` > 63;
        DELETE FROM `Cerebro`.`question` WHERE `questionId` > 23;
        DELETE FROM `Cerebro`.`hero` WHERE `characterId` > 63;
        */


    }
}
