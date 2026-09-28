package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.sporty.android.core.model.security.otp.TradingOTPResult;
import com.sporty.android.platform.features.newotp.agent.OTPAgentActivity;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.OtpViewModelClasses;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r900 extends vd<f0i0, l800> {
    public final /* synthetic */ p900.a a;

    public r900(p900.a aVar, q900 q900Var) {
        this.a = aVar;
    }

    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        OtpModule otpModule;
        f0i0 f0i0Var = (f0i0) obj;
        f0i0Var.getClass();
        String str = f0i0Var.b;
        String str2 = f0i0Var.a;
        p900.a.b bVar = p900.a.b.a;
        p900.a aVar = this.a;
        if (Intrinsics.g(aVar, bVar)) {
            str2.getClass();
            str.getClass();
            otpModule = new OtpModule(new OtpData.VerifyPrimaryPhone(str2, str, 28), new OtpViewModelClasses(p1e.class, a1i0.class, i1i0.class, x0i0.class, e1i0.class, s0i0.class));
        } else if (Intrinsics.g(aVar, p900.a.c.a)) {
            str2.getClass();
            str.getClass();
            otpModule = new OtpModule(new OtpData.PaymentCommonOtpData(str2, str, j6c.WITHDRAW), new OtpViewModelClasses(gnj0.class, toj0.class, orj0.class, wnj0.class, uoj0.class, cmj0.class));
        } else {
            if (!Intrinsics.g(aVar, p900.a.C0964a.a)) {
                uhc.a();
                return null;
            }
            str2.getClass();
            str.getClass();
            otpModule = new OtpModule(new OtpData.PaymentCommonOtpData(str2, str, j6c.BIND_PHONE_NEW), new OtpViewModelClasses(q0e.class, x0e.class, c1e.class, v0e.class, z0e.class, n0e.class));
        }
        int i = OTPAgentActivity.b;
        return OTPAgentActivity.a.a(context, otpModule);
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        if (i != -1) {
            return l800.a.a;
        }
        OTPResult<TradingOTPResult> oTPResult = null;
        OtpData otpData = intent != null ? (OtpData) ((Parcelable) uxo.a(intent, "key - otp data", OtpData.class)) : null;
        if (otpData instanceof OtpData.VerifyPrimaryPhone) {
            oTPResult = ((OtpData.VerifyPrimaryPhone) otpData).e;
        } else if (otpData instanceof OtpData.PaymentCommonOtpData) {
            oTPResult = ((OtpData.PaymentCommonOtpData) otpData).d;
        }
        if (oTPResult instanceof OTPResult.Failed) {
            return l800.b.a;
        }
        if (oTPResult instanceof OTPResult.NoResult) {
            return l800.a.a;
        }
        if (!(oTPResult instanceof OTPResult.Success)) {
            return l800.b.a;
        }
        TradingOTPResult tradingOTPResult = (TradingOTPResult) ((OTPResult.Success) oTPResult).a;
        return new l800.c(tradingOTPResult.getOtpCode(), tradingOTPResult.getOtpToken(), tradingOTPResult.isTrustedDevice());
    }
}
