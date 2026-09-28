package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cj cjVar = (cj) obj;
                v340 v340Var = cjVar.h;
                if (v340Var == null) {
                    Intrinsics.n("supportBanksStateFlow");
                    throw null;
                }
                n1i n1iVar = new n1i(bm50.f(v340Var), cjVar.o, new cj.c(3, null));
                et7 et7Var = cjVar.k;
                if (et7Var != null) {
                    return e1i.e(n1iVar, et7Var, q490.a.b, m2g.a);
                }
                Intrinsics.n("scope");
                throw null;
            case 1:
                ixi ixiVar = (ixi) ((m410) obj).b;
                if (ixiVar != null) {
                    ixiVar.z.d();
                }
                return Unit.a;
            default:
                ((Function1) obj).invoke(s3d0.d.a);
                return Unit.a;
        }
    }
}
