package defpackage;

import com.sporty.android.core.model.patron.VerifyOtpRequest;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;

/* JADX INFO: loaded from: classes5.dex */
public final class u0i0 {
    public final pc80 a;
    public final oxg0 b;
    public final lyz c;

    public u0i0(pc80 pc80Var, oxg0 oxg0Var, lyz lyzVar) {
        oxg0Var.getClass();
        lyzVar.getClass();
        this.a = pc80Var;
        this.b = oxg0Var;
        this.c = lyzVar;
    }

    public static t0i0 b(u0i0 u0i0Var, String str, String str2, int i) {
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 8) == 0;
        u0i0Var.getClass();
        str.getClass();
        str2.getClass();
        return new t0i0(u0i0Var.c.q0(new VerifyOtpRequest(str, str2), z, z2), str, z);
    }

    public final yzh a(OtpSelection otpSelection, String str, String str2, String str3) {
        otpSelection.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return this.a.a(otpSelection, str, j6c.BIND_PHONE_PRIMARY, str2, str3);
    }
}
