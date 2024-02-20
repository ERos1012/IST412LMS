package Controller;

import Model.Message;

/**
 * The MessageController class manages messages in the system.
 */
public class MessageController {

    /**
     * Sends a message.
     */
    public void sendMessage() {
    }

    /**
     * Views a message.
     */
    public Message viewMessage() {
        // demo
        return new Message(1, 123, 456, "Hello!", "2024-02-20");
    }

    /**
     * Deletes a message.
     */
    public void deleteMessage() {
    }
}
