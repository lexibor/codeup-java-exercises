public class ServerNameGenerator
{
    public static String[] adjectives = {"angry",
            "hurt",
            "subdued",
            "precious",
            "psychotic",
            "picayune",
            "unique",
            "learned",
            "drunk",
            "scintillating"};
    public static String[] nouns = {"psychology",
            "sector",
            "drawer",
            "satisfaction",
            "fishing",
            "hall",
            "camera",
            "population",
            "birthday",
            "love"};


    public static int randomNumGenerator(int min, int max)
    {
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;

        return rand;
    }


    public static String randomAdjective(String[] adjectives)
    {
        return adjectives[randomNumGenerator(0, adjectives.length - 1)];
    }

    public static String randomNoun(String[] nouns)
    {
        return nouns[randomNumGenerator(0, nouns.length - 1)];
    }


    public static void main(String[] args)
    {
//        System.out.println(randomNumGenerator(1, 20));

//        System.out.println(randomAdjective(adjectives));
//        System.out.println(randomNoun(nouns));

        System.out.printf("""
                Here is your sever name:
                %s-%s
                """, randomAdjective(adjectives), randomNoun(nouns));



    }

}
