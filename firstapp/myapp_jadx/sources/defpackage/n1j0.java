package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class n1j0 implements Function1<bwa, Unit> {
    public final /* synthetic */ cwa a;

    public n1j0(cwa cwaVar) {
        this.a = cwaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(bwa bwaVar) {
        bwa bwaVar2 = bwaVar;
        bwaVar2.getClass();
        hwa hwaVar = bwaVar2.e;
        cwa cwaVar = this.a;
        njm.a(hwaVar, cwaVar.e, 0.0f, 6);
        njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
        u2i0.a(bwaVar2.f, bwaVar2.c.f, 0.0f, 6);
        bwaVar2.e(new gqe("spread"));
        return Unit.a;
    }
}
