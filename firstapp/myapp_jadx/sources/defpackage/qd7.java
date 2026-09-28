package defpackage;

import android.os.Handler;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportygames.commons.remote.model.LoadingState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qd7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qd7(Object obj, int i) {
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
                td7 td7Var = (td7) obj2;
                if (!((Boolean) obj).booleanValue() && td7Var.isVisible()) {
                    kd2.a(8, td7Var.m0().e, null);
                    synchronized (td7Var) {
                        try {
                            if (td7Var.m0().Z.length() != 0) {
                                ((Handler) td7Var.E.getValue()).removeCallbacks((Runnable) td7Var.D.getValue());
                                synchronized (td7Var) {
                                    if (td7Var.F == null) {
                                        kjs kjsVar = new kjs(new vd7(td7Var), td7Var.m0().V);
                                        kjsVar.a();
                                        td7Var.F = kjsVar;
                                    }
                                }
                            } else {
                                td7Var.p0();
                                synchronized (td7Var) {
                                    ((Handler) td7Var.E.getValue()).removeCallbacks((Runnable) td7Var.D.getValue());
                                    ((Handler) td7Var.E.getValue()).postDelayed((Runnable) td7Var.D.getValue(), td7Var.C);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return Unit.a;
            case 1:
                fgb fgbVar = (fgb) obj2;
                if (fgb.b.a[((LoadingState) obj).getStatus().ordinal()] == 1) {
                    fgbVar.w = true;
                }
                return Unit.a;
            default:
                vyf vyfVar = (vyf) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                vyfVar.b = OtpData.EmailChange.a((OtpData.EmailChange) vyfVar.B1(), oTPResult);
                return Unit.a;
        }
    }
}
