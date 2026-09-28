package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llt40;", "Lx2a0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$RegisterBrazil;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lt40 extends x2a0<OtpData.RegisterBrazil> {
    public final it40 B;
    public final pc80 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt40(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, it40 it40Var, pc80 pc80Var, rdd0 rdd0Var) {
        super(oddVar, rdd0Var);
        rdd0Var.getClass();
        this.B = it40Var;
        this.C = pc80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return this.C.a(otpSelection, z1().b, j6c.REGISTER, ((OtpData.RegisterBrazil) B1()).a, ((OtpData.RegisterBrazil) B1()).b);
    }

    @Override // defpackage.x2a0
    public final lyh<lk50<Unit>> P1(String str) {
        return b42.F1(bm50.a(this.B.a(z1(), str)), new Function1() { // from class: kt40
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                lt40 lt40Var = this.a;
                lt40Var.b = OtpData.RegisterBrazil.a((OtpData.RegisterBrazil) lt40Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }
}
