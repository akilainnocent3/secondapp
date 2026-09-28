package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wy1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wy1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                psm psmVar = ((yy1) obj).a;
                return Boolean.valueOf(psmVar.v() || psmVar.F() || psmVar.z());
            case 1:
                t4b t4bVar = (t4b) obj;
                ((n6s) t4bVar.H.w.b).r.b(t4bVar.N.e);
                Unit unit = Unit.a;
                return Boolean.TRUE;
            default:
                ((Function1) obj).invoke(igm.d.h.a);
                return Unit.a;
        }
    }
}
