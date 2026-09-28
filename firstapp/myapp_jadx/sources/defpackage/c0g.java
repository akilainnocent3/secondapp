package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c0g implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                d0g d0gVar = (d0g) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                d0gVar.b = OtpData.EmailChange.a((OtpData.EmailChange) d0gVar.B1(), oTPResult);
                break;
            default:
                ylb0 ylb0Var = (ylb0) obj2;
                ((Boolean) obj).getClass();
                ylb0Var.S0().S1(true);
                x5a0 x5a0Var = (x5a0) ylb0Var.j1;
                x5a0Var.setValue(Boolean.FALSE);
                ylb0Var.p1 = 1;
                ((u5a0) ylb0Var.n1).k(2);
                ylb0Var.R0().Q1(-1);
                x5a0Var.setValue(Boolean.TRUE);
                ylb0Var.R0().P1(2);
                ylb0Var.R0().R1(true);
                ylb0Var.R0().S1(false);
                ylb0Var.S0().P1(0);
                break;
        }
        return Unit.a;
    }
}
