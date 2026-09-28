package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q4b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q4b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                t4b t4bVar = (t4b) obj2;
                t4b.s2(t4bVar.H, ((nk0) obj).b, t4bVar.I, t4bVar.J);
                return Boolean.TRUE;
            default:
                ((Function1) obj2).invoke(new igm.d.k(((Long) obj).longValue()));
                return Unit.a;
        }
    }
}
