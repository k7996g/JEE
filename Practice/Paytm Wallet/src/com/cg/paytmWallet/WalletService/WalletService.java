package com.cg.paytmWallet.WalletService;

import java.math.BigDecimal;

public interface WalletService {
void createAccount(String name,String phone,double d);
void showBalance(String phone);
}
