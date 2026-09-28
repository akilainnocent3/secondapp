package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class m1j0 implements Function1<bwa, Unit> {
    public static final m1j0 a = new m1j0();

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(bwa bwaVar) {
        bwa bwaVar2 = bwaVar;
        bwaVar2.getClass();
        gxa gxaVar = bwaVar2.d;
        cwa cwaVar = bwaVar2.c;
        u2i0.a(gxaVar, cwaVar.d, 0.0f, 6);
        njm.a(bwaVar2.e, cwaVar.e, 0.0f, 6);
        njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
        bwaVar2.h(new gqe("spread"));
        return Unit.a;
    }
}
