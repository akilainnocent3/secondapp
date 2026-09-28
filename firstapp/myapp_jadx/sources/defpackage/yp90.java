package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class yp90 implements Function1<bwa, Unit> {
    public final /* synthetic */ cwa a;

    public yp90(cwa cwaVar) {
        this.a = cwaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(bwa bwaVar) {
        bwa bwaVar2 = bwaVar;
        bwaVar2.getClass();
        bwaVar2.h(new gqe("wrap"));
        bwaVar2.e(new gqe("spread"));
        gxa gxaVar = bwaVar2.d;
        cwa cwaVar = this.a;
        u2i0.a(gxaVar, cwaVar.f, 0.0f, 6);
        hwa hwaVar = bwaVar2.e;
        cwa cwaVar2 = bwaVar2.c;
        njm.a(hwaVar, cwaVar2.e, 0.0f, 6);
        u2i0.a(bwaVar2.f, cwaVar.d, 0.0f, 6);
        njm.a(bwaVar2.g, cwaVar2.g, 0.0f, 6);
        return Unit.a;
    }
}
