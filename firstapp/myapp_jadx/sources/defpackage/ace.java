package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lace;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$DeviceBlocking;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ace extends c7z<OtpData.DeviceBlocking> {
    public final pc80 A;
    public final ige B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ace(pc80 pc80Var, ige igeVar, v8w v8wVar, rdd0 rdd0Var) {
        super(v8wVar, rdd0Var);
        igeVar.getClass();
        v8wVar.getClass();
        rdd0Var.getClass();
        this.A = pc80Var;
        this.B = igeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<String> P1() {
        return this.B.d(((OtpData.DeviceBlocking) B1()).d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.A.a(otpSelection, z1().b, ((OtpData.DeviceBlocking) B1()).c, ((OtpData.DeviceBlocking) B1()).b, ((OtpData.DeviceBlocking) B1()).a);
    }
}
