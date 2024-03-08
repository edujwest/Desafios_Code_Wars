public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return (name.toUpperCase().charAt(0) == 'R') ? name + " plays banjo" : name + " does not play banjo";
    }
}