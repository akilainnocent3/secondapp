package com.sporty.android.core.model.pay.security;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nameUpdateStatusModel", "Lcom/sporty/android/core/model/pay/security/NameUpdateStatus;", "Lcom/sporty/android/core/model/account/AccountInfo;", "getNameUpdateStatusModel", "(Lcom/sporty/android/core/model/account/AccountInfo;)Lcom/sporty/android/core/model/pay/security/NameUpdateStatus;", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class NameUpdateStatusMapperKt {
    public static final NameUpdateStatus getNameUpdateStatusModel(AccountInfo accountInfo) {
        accountInfo.getClass();
        Integer nameUpdateStatus = accountInfo.getNameUpdateStatus();
        if (nameUpdateStatus != null && nameUpdateStatus.intValue() == 20) {
            return NameUpdateStatus.Pending.INSTANCE;
        }
        if (nameUpdateStatus == null || nameUpdateStatus.intValue() != 30) {
            return (nameUpdateStatus != null && nameUpdateStatus.intValue() == 40) ? new NameUpdateStatus.Rejected(accountInfo.getNameUpdateRejectReasonTitle(), accountInfo.getNameUpdateRejectReasonDetail()) : new NameUpdateStatus.Unknown(accountInfo.getNameUpdateStatus());
        }
        String nameUpdateSuccessContent = accountInfo.getNameUpdateSuccessContent();
        if (nameUpdateSuccessContent == null) {
            nameUpdateSuccessContent = "";
        }
        return new NameUpdateStatus.Approved(nameUpdateSuccessContent);
    }
}
