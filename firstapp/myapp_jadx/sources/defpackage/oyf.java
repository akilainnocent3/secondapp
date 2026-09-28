package defpackage;

import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeBindOtpSessionDTO;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeConfigResponse;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeOtpVerificationRequest;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePasswordCheckRequest;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePinCheckRequest;
import com.sporty.android.core.model.account.verifiedemailchange.EmailUpdateRequest;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;

/* JADX INFO: loaded from: classes4.dex */
public interface oyf {
    Object a(EmailChangePinCheckRequest emailChangePinCheckRequest, wtj0.a aVar);

    lyh<EmailChangeBindOtpSessionDTO> b(EmailChangeBindOtpSessionDTO emailChangeBindOtpSessionDTO);

    Object c(tje0 tje0Var);

    lyh<OTPGeneralResult> d(EmailChangeOtpVerificationRequest emailChangeOtpVerificationRequest);

    Object e(tje0 tje0Var);

    lyh<EmailChangeConfigResponse> f();

    Object g(EmailChangePasswordCheckRequest emailChangePasswordCheckRequest, zzf.a aVar);

    lyh<Boolean> h();

    Object i(EmailUpdateRequest emailUpdateRequest, nxf.a aVar);
}
