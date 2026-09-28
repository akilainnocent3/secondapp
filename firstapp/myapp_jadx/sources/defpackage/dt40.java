package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldt40;", "Lp0g;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$RegisterBrazil;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dt40 extends p0g<OtpData.RegisterBrazil> {
    public final it40 w;
    public final pc80 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt40(it40 it40Var, pc80 pc80Var, rdd0 rdd0Var) {
        super(rdd0Var);
        rdd0Var.getClass();
        this.w = it40Var;
        this.y = pc80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<OTPResponse>> M1(OtpSelection otpSelection) {
        return this.y.a(otpSelection, z1().b, j6c.REGISTER, ((OtpData.RegisterBrazil) B1()).a, ((OtpData.RegisterBrazil) B1()).b);
    }

    @Override // defpackage.p0g
    public final lyh<lk50<Unit>> O1(String str) {
        return b42.F1(bm50.a(this.w.a(z1(), str)), new tcw(this, 1));
    }
}
