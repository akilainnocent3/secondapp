package com.sporty.android.core.model.account;

import defpackage.fu5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"phoneNumber", "", "Lcom/sporty/android/core/model/account/AccountInfo;", "getPhoneNumber", "(Lcom/sporty/android/core/model/account/AccountInfo;)Ljava/lang/String;", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class AccountInfoKt {
    public static final String getPhoneNumber(AccountInfo accountInfo) {
        accountInfo.getClass();
        return fu5.a("(?<=\\d{2})\\d(?=\\d{1})", accountInfo.getPhone(), "*");
    }
}
