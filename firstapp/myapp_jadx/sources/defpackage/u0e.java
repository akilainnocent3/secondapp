package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OtpData;

/* JADX INFO: loaded from: classes5.dex */
public final class u0e {
    public final pc80 a;

    public u0e(pc80 pc80Var) {
        this.a = pc80Var;
    }

    public static or60 b(String str, String str2, OtpData.PaymentCommonOtpData paymentCommonOtpData) {
        str.getClass();
        str2.getClass();
        return new or60(new t0e(str2, str, paymentCommonOtpData, null));
    }

    public final yzh a(OtpSelection otpSelection, String str, String str2, String str3) {
        otpSelection.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return this.a.a(otpSelection, str, j6c.BIND_PHONE_NEW, str2, str3);
    }
}
