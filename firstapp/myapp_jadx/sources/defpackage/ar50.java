package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ar50 implements Function1<bwa, Unit> {
    public final /* synthetic */ cwa a;

    public ar50(cwa cwaVar) {
        this.a = cwaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(bwa bwaVar) {
        bwa bwaVar2 = bwaVar;
        bwaVar2.getClass();
        gxa gxaVar = bwaVar2.d;
        cwa cwaVar = this.a;
        u2i0.a(gxaVar, cwaVar.f, 4.0f, 4);
        njm.a(bwaVar2.e, cwaVar.e, 0.0f, 6);
        njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
        return Unit.a;
    }
}
