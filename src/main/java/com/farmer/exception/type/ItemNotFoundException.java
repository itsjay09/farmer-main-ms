package com.farmer.exception.type;

public class ItemNotFoundException extends RuntimeException {

  public ItemNotFoundException() {
  }

  public  ItemNotFoundException(String message) {
    super(message);
  }

  public ItemNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
