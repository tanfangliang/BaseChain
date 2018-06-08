package com.android.blockchain.api.currency;

public interface EthereumTransactionConfiguration {
  long getGasPrice();

  long getSimpleTxGas();

  long getContractGas();

  long getWeiMultiplier();
}
