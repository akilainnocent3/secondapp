package defpackage;

import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class au40 {
    public static final pdd0 a(OtpData.Register register, OtpSelection otpSelection, ts40 ts40Var) {
        RegisterRevampConfig registerRevampConfig = register.e;
        if (registerRevampConfig instanceof RegisterRevampConfig.Revamp) {
            return new ts40.l(otpSelection.b);
        }
        if (Intrinsics.g(registerRevampConfig, RegisterRevampConfig.Default.a)) {
            return ts40Var;
        }
        uhc.a();
        return null;
    }
}
