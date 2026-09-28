package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.d;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.NameMismatchCSActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cc0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cc0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) ((ytw) obj).getValue();
                if (urrVar != null) {
                    return urrVar;
                }
                zkn.d("Required value was null.");
                fkd.a();
                return null;
            case 1:
                ((Function1) obj).invoke(d.m.a);
                return Unit.a;
            case 2:
                p5e p5eVar = (p5e) obj;
                b900 b900VarZ0 = p5eVar.z0();
                p5eVar.requireContext().getClass();
                ((d900) b900VarZ0).b.d(wae.TRANSACTION_MANUAL);
                return Unit.a;
            case 3:
                djh djhVar = ((u6j) obj).b;
                if (djhVar != null) {
                    djhVar.H.setVisibility(8);
                }
                return Unit.a;
            case 4:
                NameMismatchCSActivity nameMismatchCSActivity = (NameMismatchCSActivity) obj;
                int i2 = NameMismatchCSActivity.c;
                d900 d900Var = nameMismatchCSActivity.b;
                if (d900Var == null) {
                    Intrinsics.n("paymentRouter");
                    throw null;
                }
                d900Var.b.d(wae.NAME_UPDATE);
                nameMismatchCSActivity.finish();
                return Unit.a;
            default:
                return (f46) ((qn70) obj).a(jq40.a(f46.class), null, null);
        }
    }
}
