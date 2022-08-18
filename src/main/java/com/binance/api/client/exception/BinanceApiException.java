package com.binance.api.client.exception;

import com.binance.api.client.BinanceApiError;
import okhttp3.Headers;

/**
 * An exception which can occur while invoking methods of the Binance API.
 */
public class BinanceApiException extends RuntimeException {

    private static final long serialVersionUID = 3788669840036201041L;

  /**
   * Error response object returned by Binance API.
   */
  private BinanceApiError error;

  /**
   * Headers associated with the error..
   */
  private Headers headers;

  /**
   * Instantiates a new binance api exception.
   *
   * @param error an error response object
   */
  public BinanceApiException(BinanceApiError error, Headers headers) {
    this.error = error;
    this.headers = headers;
  }

  /**
   * Instantiates a new binance api exception.
   */
  public BinanceApiException() {
    super();
  }

  /**
   * Instantiates a new binance api exception.
   *
   * @param message the message
   */
  public BinanceApiException(String message) {
    super(message);
  }

  /**
   * Instantiates a new binance api exception.
   *
   * @param cause the cause
   */
  public BinanceApiException(Throwable cause) {
    super(cause);
  }

  /**
   * Instantiates a new binance api exception.
   *
   * @param message the message
   * @param cause the cause
   */
  public BinanceApiException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * @return the response error object from Binance API, or null if no response object was returned (e.g. server returned 500).
   */
  public BinanceApiError getError() {
    return error;
  }

  /**
   * @return the response headers object from Binance API..
   */
  public Headers getHeaders() { return headers; }

  @Override
  public String getMessage() {
    if (error != null) {
      return error.getMsg();
    }
    return super.getMessage();
  }
}
