package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class iue implements Function1<bwa, Unit> {
    public final /* synthetic */ iwa.b a;

    public iue(iwa.b bVar) {
        this.a = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(bwa bwaVar) {
        bwa bwaVar2 = bwaVar;
        bwaVar2.getClass();
        u2i0.a(bwaVar2.d, this.a, 0.0f, 6);
        hwa hwaVar = bwaVar2.e;
        cwa cwaVar = bwaVar2.c;
        njm.a(hwaVar, cwaVar.e, 0.0f, 6);
        u2i0.a(bwaVar2.f, cwaVar.f, 0.0f, 6);
        bwaVar2.h(new gqe("spread"));
        return Unit.a;
    }
}
