package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gjy implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gjy(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke((kjy) obj);
                return Unit.a;
            default:
                tt60 tt60Var = (tt60) obj;
                tt60.a aVar = new tt60.a(bm50.f(((d100) obj2).G()), tt60Var);
                et7 et7Var = tt60Var.k;
                if (et7Var != null) {
                    return e1i.e(aVar, et7Var, q490.a.b, Boolean.FALSE);
                }
                Intrinsics.n("scope");
                throw null;
        }
    }
}
