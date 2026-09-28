package defpackage;

import com.sportybet.plugin.sportypicks.ui.SportyPicksActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class thi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ thi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(ebi.a.a);
                return Unit.a;
            case 1:
                m410 m410Var = (m410) obj;
                m410Var.t0 = false;
                m410Var.z0();
                m410Var.m1();
                return Unit.a;
            case 2:
                int i2 = SportyPicksActivity.c;
                azm azmVar = ((SportyPicksActivity) obj).b;
                if (azmVar != null) {
                    azmVar.d(wae.HOME);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
