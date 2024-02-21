package Controller;

import Model.Message;

import java.util.List;

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

    /**
     * Gets all of a student's messages
     * @param studentId
     * @return
     */
    public List<String> getStudentMessages(int studentId)
    {

    }

    /**
     * gets all of a teacher's messages
     * @param teacherID
     * @return
     */
    public List<String> getTeacherMessages (int teacherID)
    {

    }
}
