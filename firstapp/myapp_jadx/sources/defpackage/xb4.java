package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.OtpViewModelClasses;
import com.sporty.android.platform.features.newotp.util.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xb4 extends saj implements Function0<OtpModule<OtpData.BioAuth>> {
    @Override // kotlin.jvm.functions.Function0
    public final OtpModule<OtpData.BioAuth> invoke() {
        cc4 cc4Var = (cc4) this.receiver;
        a aVar = cc4Var.d;
        String phoneNumber = cc4Var.b.getPhoneNumber();
        phoneNumber.getClass();
        String strP = cc4Var.c.P();
        aVar.getClass();
        strP.getClass();
        return new OtpModule<>(new OtpData.BioAuth(strP, phoneNumber, j6c.BioRegister, OTPResult.NoResult.a), new OtpViewModelClasses(r74.class, m94.class, hc4.class, a84.class, q94.class, j64.class));
    }
}
