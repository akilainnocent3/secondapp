package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OtpData;

/* JADX INFO: loaded from: classes5.dex */
public final class v74 {
    public final pc80 a;
    public final w74 b;
    public final ysm c;

    public v74(pc80 pc80Var, w74 w74Var, ysm ysmVar) {
        w74Var.getClass();
        ysmVar.getClass();
        this.a = pc80Var;
        this.b = w74Var;
        this.c = ysmVar;
    }

    public final yzh a(OtpSelection otpSelection, String str, OtpData.BioAuth bioAuth) {
        str.getClass();
        return this.a.a(otpSelection, str, j6c.BioRegister, bioAuth.b, bioAuth.a);
    }

    public final u74 b(OtpData.BioAuth bioAuth, String str, String str2) {
        str.getClass();
        str2.getClass();
        return new u74(this.b.c(bioAuth.a, bioAuth.b, this.c.a().a, str2, str));
    }
}
