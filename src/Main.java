public class Main {
    public static void main(String[] args) {
        MessageSender messageSender = new Messanger();
        messageSender.sendMessage("Hello");

        TelegramMessage tg = new Telegram();
        MessageSender adapter = new TelegramToSMSAdapter(tg);
        adapter.sendMessage("adaptive message");
    }
}
