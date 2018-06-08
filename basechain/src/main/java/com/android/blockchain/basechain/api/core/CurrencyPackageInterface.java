package com.android.blockchain.api.core;

import com.android.blockchain.api.currency.CurrencyConfiguration;
import com.android.blockchain.api.currency.Monitor;
import com.android.blockchain.api.currency.Wallet;

public interface CurrencyPackageInterface {
  CurrencyConfiguration getConfiguration();

  void setConfiguration(CurrencyConfiguration configuration);

  Wallet getWallet();

  void setWallet(Wallet wallet);

  Monitor getMonitor();

  void setMonitor(Monitor monitor);
}
