package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwzc;", "Lgoi0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$Deactivate;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wzc extends goi0<OtpData.Deactivate> {
    public final kzc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzc(kzc kzcVar, rdd0 rdd0Var) {
        super(rdd0Var);
        rdd0Var.getClass();
        this.z = kzcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.goi0
    public final lyh<lk50<OTPResponse>> M1(OtpSelection otpSelection) {
        return this.z.a(otpSelection, z1().b, (OtpData.Deactivate) B1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.goi0
    public final lyh<lk50<Unit>> O1(String str) {
        return b42.F1(this.z.b(str, z1().b, (OtpData.Deactivate) B1()), new vzc(this, 0));
    }
}
