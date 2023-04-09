package com.knoldus;

public class MessagePrinter {
    private MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    // prints the message returned by the MessageService bean
    public void printMessage(){
        System.out.println("Message is : " + getMessageService().message());
    }
}
