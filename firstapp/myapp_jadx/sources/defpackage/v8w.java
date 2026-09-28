package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.InHoseCaptchaResult;
import com.sporty.android.core.model.captcha.OTPCodeRequest;
import com.sporty.android.core.model.captcha.Quiz;
import com.sporty.android.core.model.security.otp.OtpChannelsResponse;
import com.sporty.android.core.model.security.otp.OtpResultV2;
import com.sporty.android.core.model.security.otp.ReversedOTPResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface v8w {
    lyh<BaseResponse<InHoseCaptchaResult>> a(String str, String str2);

    lyh<BaseResponse<OtpResultV2>> b(OTPCodeRequest oTPCodeRequest, String str, String str2);

    lyh<BaseResponse<OtpChannelsResponse>> c(String str, String str2, String str3);

    lyh<BaseResponse<Quiz>> d(String str);

    lyh<BaseResponse<ReversedOTPResponse>> e(String str, String str2);
}
