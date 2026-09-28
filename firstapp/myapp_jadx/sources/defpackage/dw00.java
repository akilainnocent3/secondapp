package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dw00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8i0 b;

    public /* synthetic */ dw00(j8i0 j8i0Var, int i) {
        this.a = i;
        this.b = j8i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        j8i0 j8i0Var = this.b;
        switch (i) {
            case 0:
                vx00 vx00Var = (vx00) j8i0Var;
                String str = (String) obj;
                str.getClass();
                vx00Var.getClass();
                ej5.c(o8i0.d(vx00Var), null, null, new ky00(vx00Var, str, null), 3);
                break;
            default:
                pt40 pt40Var = (pt40) j8i0Var;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                pt40Var.b = OtpData.RegisterBrazil.a((OtpData.RegisterBrazil) pt40Var.B1(), oTPResult);
                break;
        }
        return Unit.a;
    }
}
