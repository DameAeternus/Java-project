import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class MyDiscordBot {
    public static void main(String[] args) throws Exception {
        JDA jda = new JDABuilder("MTAwMTkzODg4NDYzODI4MTgwOA.Ggxt78.SjYVhVWJ1W8eQxohH6F090hxfBDj_Ik9BBSbpE").build();
        jda.addEventListener(new WaveCommand());
    }
}
