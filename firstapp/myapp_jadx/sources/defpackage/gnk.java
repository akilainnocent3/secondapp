package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class gnk implements Function1<bwa, Unit> {
    public final /* synthetic */ cwa a;

    public gnk(cwa cwaVar) {
        this.a = cwaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(bwa bwaVar) {
        bwa bwaVar2 = bwaVar;
        bwaVar2.getClass();
        bwaVar2.h(new gqe("spread"));
        bwaVar2.e(new gqe("wrap"));
        gxa gxaVar = bwaVar2.d;
        cwa cwaVar = bwaVar2.c;
        u2i0.a(gxaVar, cwaVar.d, 0.0f, 6);
        njm.a(bwaVar2.e, cwaVar.e, 0.0f, 6);
        njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
        u2i0.a(bwaVar2.f, this.a.d, 0.0f, 6);
        return Unit.a;
    }
}
