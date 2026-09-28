package defpackage;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.kyc.phonemigration.VerifyMainOTPBody;
import com.sporty.android.core.model.kyc.phonemigration.VerifySubsidiaryOTPBody;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OtpData;

/* JADX INFO: loaded from: classes5.dex */
public final class es00 {
    public final pc80 a;
    public final lyz b;

    public es00(lyz lyzVar, pc80 pc80Var) {
        lyzVar.getClass();
        this.a = pc80Var;
        this.b = lyzVar;
    }

    public final yzh a(OtpSelection otpSelection, String str, OtpData.PhoneMigration phoneMigration) {
        otpSelection.getClass();
        str.getClass();
        return this.a.a(otpSelection, str, j6c.MigratePhone, phoneMigration.a, phoneMigration.b);
    }

    public final ds00 b(String str, String str2, String str3, boolean z, boolean z2) {
        m.a(str, str2, str3);
        lyz lyzVar = this.b;
        return new ds00(z ? lyzVar.c0(new VerifyMainOTPBody(str, str2, str3), z2) : lyzVar.G0(new VerifySubsidiaryOTPBody(str, str2)));
    }
}
