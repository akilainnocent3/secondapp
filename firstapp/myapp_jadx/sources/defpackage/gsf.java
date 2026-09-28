package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gsf extends saj implements Function1<i2z, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(i2z i2zVar) {
        i2z i2zVar2 = i2zVar;
        i2zVar2.getClass();
        suf sufVar = (suf) this.receiver;
        sufVar.getClass();
        wwd0 wwd0Var = sufVar.a;
        lsf lsfVar = sufVar.e;
        if (lsfVar == null) {
            Intrinsics.n("originalOption");
            throw null;
        }
        cr10 cr10Var = lsfVar.a;
        cr10Var.getClass();
        ksf.b bVar = new ksf.b(new lsf(cr10Var, i2zVar2));
        wwd0Var.getClass();
        wwd0Var.k(null, bVar);
        return Unit.a;
    }
}
