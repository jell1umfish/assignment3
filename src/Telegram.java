public class Telegram implements TelegramMessage{
    @Override
    public void sendTelegram(String ID, String text) {
        System.out.println(text);
    }
}
