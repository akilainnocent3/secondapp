package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.core.model.security.otp.PhoneOTPSessionData;

/* JADX INFO: loaded from: classes5.dex */
public interface kc50 {
    Object a(x1b x1bVar);

    lyh<BaseResponse<OTPGeneralResult>> c(PhoneOTPSessionData phoneOTPSessionData);

    yzh d(String str, String str2, String str3);

    lyh<BaseResponse<OTPGeneralResult>> e(OTPVerificationRequest oTPVerificationRequest, boolean z, boolean z2);
}
