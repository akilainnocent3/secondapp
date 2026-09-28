package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g4y extends saj implements Function1<t3y, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(t3y t3yVar) {
        t3y t3yVar2 = t3yVar;
        t3yVar2.getClass();
        r4y r4yVar = (r4y) this.receiver;
        r4yVar.getClass();
        ej5.c(o8i0.d(r4yVar), null, null, new m4y(r4yVar, t3yVar2, null), 3);
        if (t3yVar2 instanceof t3y.b) {
            t3y.b bVar = (t3y.b) t3yVar2;
            ej5.c(o8i0.d(r4yVar), null, null, new q4y(r4yVar, !bVar.c, bVar.a, null), 3);
        } else {
            if (!(t3yVar2 instanceof t3y.a)) {
                uhc.a();
                return null;
            }
            if (((t3y.a) t3yVar2).a == 1) {
                r4yVar.d.a(k4y.a.a);
            }
        }
        return Unit.a;
    }
}
