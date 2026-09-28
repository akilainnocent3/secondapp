package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq94;", "Lecf0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$BioAuth;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q94 extends ecf0<OtpData.BioAuth> {
    public final v74 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q94(v74 v74Var, rdd0 rdd0Var) {
        super(rdd0Var);
        v74Var.getClass();
        rdd0Var.getClass();
        this.z = v74Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return this.z.a(otpSelection, z1().b, (OtpData.BioAuth) B1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final lyh<lk50<Unit>> P1(String str) {
        return b42.F1(bm50.a(this.z.b((OtpData.BioAuth) B1(), str, z1().b)), new Function1() { // from class: p94
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                q94 q94Var = this.a;
                q94Var.b = OtpData.BioAuth.a((OtpData.BioAuth) q94Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }
}
