package defpackage;

import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class j0g implements Function0<OtpData> {
    public final /* synthetic */ OtpModule a;

    public j0g(OtpModule otpModule) {
        this.a = otpModule;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OtpData invoke() {
        return this.a.a;
    }
}
