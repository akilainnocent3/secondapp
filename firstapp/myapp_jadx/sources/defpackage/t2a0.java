package defpackage;

import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class t2a0 implements Function0<OtpData> {
    public final /* synthetic */ OtpModule a;

    public t2a0(OtpModule otpModule) {
        this.a = otpModule;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OtpData invoke() {
        return this.a.a;
    }
}
