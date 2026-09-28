package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x3b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x3b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) ((ytw) obj).getValue();
                bool.booleanValue();
                return bool;
            case 1:
                tt60 tt60Var = (tt60) obj;
                v340 v340Var = tt60Var.h;
                if (v340Var == null) {
                    Intrinsics.n("savedAssetsStateFlow");
                    throw null;
                }
                n1i n1iVar = new n1i(bm50.f(v340Var), tt60Var.n, new tt60.b(3, null));
                et7 et7Var = tt60Var.k;
                if (et7Var != null) {
                    return e1i.e(n1iVar, et7Var, q490.a.b, m2g.a);
                }
                Intrinsics.n("scope");
                throw null;
            default:
                try {
                    ((kab0) obj).w0().y1();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return Unit.a;
        }
    }
}
