public final class TelegramToSMSAdapter implements MessageSender{

    private final TelegramMessage message;

    public TelegramToSMSAdapter(TelegramMessage message){
        this.message=message;
    }

    @Override
    public void sendMessage(String text) {
        String ID = "123123123";
        message.sendTelegram(ID, text);
    }
}
