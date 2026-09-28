package defpackage;

import com.sporty.android.core.model.security.otp.RegisterCompleteBody;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OtpData;

/* JADX INFO: loaded from: classes5.dex */
public final class ku40 {
    public final lyz a;

    public ku40(lyz lyzVar) {
        lyzVar.getClass();
        this.a = lyzVar;
    }

    public final ju40 a(OtpData.Register register, OTPInternalData oTPInternalData, String str) {
        str.getClass();
        return new ju40(this.a.i(new RegisterCompleteBody(oTPInternalData.b, str, register.b, register.a)));
    }
}
