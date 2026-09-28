package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0s implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0s(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                q0s q0sVar = (q0s) obj3;
                q0sVar.c.i(obj2);
                return new p0s(q0sVar, obj2);
            default:
                qcn qcnVar = (qcn) obj3;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szrVar.d(qcnVar.size(), null, new mfh0(qcnVar), new op8(802480018, new nfh0(qcnVar, (Function1) obj2), true));
                return Unit.a;
        }
    }
}
