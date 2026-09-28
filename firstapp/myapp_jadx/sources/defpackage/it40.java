package defpackage;

import com.sporty.android.core.model.security.otp.RegisterBrVerifyCode;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;

/* JADX INFO: loaded from: classes5.dex */
public final class it40 {
    public final lyz a;
    public final rdd0 b;

    public it40(lyz lyzVar, rdd0 rdd0Var) {
        lyzVar.getClass();
        rdd0Var.getClass();
        this.a = lyzVar;
        this.b = rdd0Var;
    }

    public final ht40 a(OTPInternalData oTPInternalData, String str) {
        str.getClass();
        return new ht40(this.a.x(new RegisterBrVerifyCode(oTPInternalData.b, str)), this);
    }
}
