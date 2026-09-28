package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx240;", "Lx2a0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$Reactivate;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x240 extends x2a0<OtpData.Reactivate> {
    public final s240 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x240(s240 s240Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, rdd0 rdd0Var) {
        super(oddVar, rdd0Var);
        rdd0Var.getClass();
        this.B = s240Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return this.B.a(otpSelection, z1().b, (OtpData.Reactivate) B1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<Unit>> P1(String str) {
        return b42.F1(this.B.b(str, z1().b, (OtpData.Reactivate) B1()), new xbm(this, 1));
    }
}
