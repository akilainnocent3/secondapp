package com.sporty.android.core.model.primaryphone;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toPrimaryPhoneConfig", "Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneConfig;", "Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneConfigResponse;", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class PrimaryPhoneConfigMapperKt {
    public static final PrimaryPhoneConfig toPrimaryPhoneConfig(PrimaryPhoneConfigResponse primaryPhoneConfigResponse) {
        primaryPhoneConfigResponse.getClass();
        return new PrimaryPhoneConfig(primaryPhoneConfigResponse.getAuthenticationEnabled(), primaryPhoneConfigResponse.getFunctionEnabled(), primaryPhoneConfigResponse.getNameMatchCheckEnabled(), primaryPhoneConfigResponse.getOldPhoneRegisteredMonths(), primaryPhoneConfigResponse.getOtpNewPhoneEnabled(), primaryPhoneConfigResponse.getOtpNewPhoneWrongThreshold(), primaryPhoneConfigResponse.getOtpOldPhoneEnabled(), primaryPhoneConfigResponse.getOtpOldPhoneWrongThreshold(), String.valueOf(primaryPhoneConfigResponse.getWithdrawLimitAmount() / 10000), primaryPhoneConfigResponse.getWithdrawLimitDays());
    }
}
