package defpackage;

import android.content.Intent;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cew implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py1 b;

    public /* synthetic */ cew(py1 py1Var, int i) {
        this.a = i;
        this.b = py1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        py1 py1Var = this.b;
        Intent intentB = null;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                int i2 = MultiMakerActivity.E;
                wwd0 wwd0Var = ((MultiMakerActivity) py1Var).z1().U;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
                return Unit.a;
            default:
                TxDetailsV2Activity txDetailsV2Activity = (TxDetailsV2Activity) py1Var;
                f1h0 f1h0Var = (f1h0) obj;
                int i3 = TxDetailsV2Activity.v;
                f1h0Var.getClass();
                q8h0 q8h0Var = f1h0Var.a;
                String str = f1h0Var.b;
                if (q8h0Var instanceof r8h0) {
                    u700 u700Var = txDetailsV2Activity.c;
                    if (u700Var == null) {
                        Intrinsics.n("paymentIVUtils");
                        throw null;
                    }
                    intentB = u700Var.a(txDetailsV2Activity, str);
                } else if (q8h0Var instanceof s8h0) {
                    u700 u700Var2 = txDetailsV2Activity.c;
                    if (u700Var2 == null) {
                        Intrinsics.n("paymentIVUtils");
                        throw null;
                    }
                    intentB = u700Var2.b(((s8h0) q8h0Var).a, txDetailsV2Activity, str);
                } else if (Intrinsics.g(q8h0Var, q8h0.b.a)) {
                    d900 d900Var = txDetailsV2Activity.f;
                    if (d900Var == null) {
                        Intrinsics.n("paymentRouter");
                        throw null;
                    }
                    intentB = d900Var.b(txDetailsV2Activity, str);
                }
                if (intentB != null) {
                    intentB.addFlags(65536);
                    txDetailsV2Activity.startActivity(intentB);
                }
                return Unit.a;
        }
    }
}
