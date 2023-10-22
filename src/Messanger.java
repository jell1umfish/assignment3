public class Messanger implements MessageSender {
    public Messanger() {
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
