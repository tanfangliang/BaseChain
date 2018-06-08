package com.android.blockchain.api.validation;

import com.android.blockchain.api.currency.Wallet;

/**
 * Indicates whether a currency's wallet makes sense to be validated.
 */
public interface Validatable {
  /**
   * Decode a transaction returned by the prepare and/or sign step.
   */
  Wallet.TransactionDetails decodeRawTransaction(String transaction);
}
