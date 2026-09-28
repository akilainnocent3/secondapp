package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class jue implements Function1<bwa, Unit> {
    public final /* synthetic */ iwa.b a;
    public final /* synthetic */ cwa b;

    public jue(iwa.b bVar, cwa cwaVar) {
        this.a = bVar;
        this.b = cwaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(bwa bwaVar) {
        bwa bwaVar2 = bwaVar;
        bwaVar2.getClass();
        u2i0.a(bwaVar2.d, this.a, 0.0f, 6);
        njm.a(bwaVar2.e, this.b.g, 16.0f, 4);
        u2i0.a(bwaVar2.f, bwaVar2.c.f, 0.0f, 6);
        bwaVar2.h(new gqe("spread"));
        return Unit.a;
    }
}
