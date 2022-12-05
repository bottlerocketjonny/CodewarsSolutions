public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        String amountOfLikes = "";

        switch (names.length) {
            case 0:
                amountOfLikes = "no one likes this";
                break;
            case 1:
                amountOfLikes = names[0] + " likes this";
                break;
            case 2:
                amountOfLikes = names[0] + " and " + names[1] + " like this";
                break;
            case 3:
                amountOfLikes = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                amountOfLikes = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
                break;
        }
        return amountOfLikes;
    }
}
