package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.core.model.security.otp.PreRegisterResponse;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface q4z {
    @flz("patron/register/complete")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<OTPCompleteResult>> a(@jh4 String str);

    @flz("patron/register/preRegister")
    @tti
    su5<BaseResponse<PreRegisterResponse>> b(@gjh("phoneCountryCode") String str, @gjh("phone") String str2, @gjh("password") String str3);
}
