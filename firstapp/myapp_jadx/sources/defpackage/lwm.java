package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sporty.android.core.model.patron.LoginResponse;
import com.sportybet.android.account.international.data.model.AccountActivationResponse;
import com.sportybet.android.account.international.data.model.FacialRecognitionSessionResponse;
import com.sportybet.android.account.international.data.model.FacialRecognitionStatusResponse;
import com.sportybet.android.account.international.data.model.INTRegisterRequest;
import com.sportybet.android.account.international.data.model.INTRegisterResendResponse;
import com.sportybet.android.account.international.data.model.INTResetPwdCheckResponse;
import com.sportybet.android.account.international.data.model.INTResetPwdCompleteResponse;
import com.sportybet.android.account.international.data.model.PostalCodeResponse;
import com.sportybet.android.account.international.data.model.RegistrationStatusResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface lwm {
    lyh<BaseResponse<INTRegisterResendResponse>> a(String str, CaptchaHeader captchaHeader);

    Object b(String str, String str2, sq5 sq5Var);

    lyh<BaseResponse<INTResetPwdCheckResponse>> c(String str, String str2);

    lyh<BaseResponse<PostalCodeResponse>> d(String str);

    lyh<BaseResponse<RegistrationStatusResponse>> e(String str, String str2, String str3);

    lyh<BaseResponse<AccountActivationResponse>> f(String str);

    lyh<BaseResponse<LoginResponse>> g(String str, String str2);

    lyh<BaseResponse<INTResetPwdCheckResponse>> h(String str, CaptchaHeader captchaHeader);

    lyh<BaseResponse<FacialRecognitionStatusResponse>> i(String str);

    or60 j(INTRegisterRequest iNTRegisterRequest, CaptchaHeader captchaHeader);

    lyh<BaseResponse<INTResetPwdCompleteResponse>> k(String str, String str2);

    lyh<BaseResponse<FacialRecognitionSessionResponse>> l(String str, q7h q7hVar);

    lyh<BaseResponse<xdp>> m(String str, String str2);
}
