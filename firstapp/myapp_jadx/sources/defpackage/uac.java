package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uac implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        s9s.a aVar = (s9s.a) obj2;
        ((ibs) obj).getClass();
        aVar.getClass();
        int i = rbc.i.a[aVar.ordinal()];
        if (i == 1) {
            ftg.a(new t8a0(true));
        } else if (i != 2) {
            Unit unit = Unit.a;
        } else {
            ftg.a(new t8a0(false));
        }
        return Unit.a;
    }
}
