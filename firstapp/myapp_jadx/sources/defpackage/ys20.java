package defpackage;

import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyOTPBody;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OtpData;

/* JADX INFO: loaded from: classes5.dex */
public final class ys20 {
    public final lyz a;
    public final pc80 b;

    public ys20(lyz lyzVar, pc80 pc80Var) {
        lyzVar.getClass();
        this.a = lyzVar;
        this.b = pc80Var;
    }

    public static xs20 b(ys20 ys20Var, String str, String str2, String str3, boolean z, int i) {
        boolean z2 = (i & 16) == 0;
        boolean z3 = (i & 32) == 0;
        ys20Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        lyz lyzVar = ys20Var.a;
        return new xs20(z ? lyzVar.Y(new PrimaryPhoneVerifyOTPBody(str, str2, str3)) : lyzVar.e(new PrimaryPhoneVerifyOTPBody(str, str2, str3), z2, z3));
    }

    public final yzh a(OtpSelection otpSelection, String str, OtpData.PrimaryPhone primaryPhone) {
        otpSelection.getClass();
        str.getClass();
        return this.b.a(otpSelection, str, j6c.CHANGE_PRIMARY_PHONE, primaryPhone.a, primaryPhone.b);
    }
}
