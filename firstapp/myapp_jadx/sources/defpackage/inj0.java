package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OtpData;

/* JADX INFO: loaded from: classes5.dex */
public final class inj0 {
    public final pc80 a;

    public inj0(pc80 pc80Var) {
        this.a = pc80Var;
    }

    public static or60 b(inj0 inj0Var, String str, String str2, OtpData.PaymentCommonOtpData paymentCommonOtpData) {
        inj0Var.getClass();
        str.getClass();
        str2.getClass();
        return new or60(new hnj0(str2, str, false, paymentCommonOtpData, null));
    }

    public final yzh a(OtpSelection otpSelection, String str, String str2, String str3) {
        otpSelection.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return this.a.a(otpSelection, str, j6c.WITHDRAW, str2, str3);
    }
}
