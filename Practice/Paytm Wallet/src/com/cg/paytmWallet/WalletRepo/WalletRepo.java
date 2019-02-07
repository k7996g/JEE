package com.cg.paytmWallet.WalletRepo;

import com.cg.patmWallet.bean.Customer;

public interface WalletRepo {
boolean save();
Customer findByPhone(String phone);
}
