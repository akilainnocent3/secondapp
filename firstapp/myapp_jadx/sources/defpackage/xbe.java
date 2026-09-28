package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxbe;", "Lp0g;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$DeviceBlocking;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xbe extends p0g<OtpData.DeviceBlocking> {
    public final pc80 w;
    public final ige y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbe(pc80 pc80Var, ige igeVar, rdd0 rdd0Var) {
        super(rdd0Var);
        igeVar.getClass();
        rdd0Var.getClass();
        this.w = pc80Var;
        this.y = igeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<OTPResponse>> M1(OtpSelection otpSelection) {
        return this.w.a(otpSelection, z1().b, ((OtpData.DeviceBlocking) B1()).c, ((OtpData.DeviceBlocking) B1()).b, ((OtpData.DeviceBlocking) B1()).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<Unit>> O1(String str) {
        return b42.F1(this.y.c(str, z1().b, ((OtpData.DeviceBlocking) B1()).d), new wbe(this, 0));
    }
}
