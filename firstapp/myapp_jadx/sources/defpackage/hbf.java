package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class hbf implements Function1<urr, Unit> {
    public final /* synthetic */ fcf a;
    public final /* synthetic */ int b;

    public hbf(int i, fcf fcfVar) {
        this.a = fcfVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(urr urrVar) {
        urr urrVar2 = urrVar;
        urrVar2.getClass();
        this.a.e.set(this.b, new r2p((int) (urrVar2.a() & 4294967295L), Float.intBitsToFloat((int) (eb9.d(urrVar2) & 4294967295L))));
        return Unit.a;
    }
}
