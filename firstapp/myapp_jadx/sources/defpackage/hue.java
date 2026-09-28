package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class hue implements Function1<bwa, Unit> {
    public final /* synthetic */ cwa a;
    public final /* synthetic */ aue b;

    public hue(cwa cwaVar, aue aueVar) {
        this.a = cwaVar;
        this.b = aueVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(bwa bwaVar) {
        bwa bwaVar2 = bwaVar;
        bwaVar2.getClass();
        u2i0.a(bwaVar2.d, bwaVar2.c.d, 0.0f, 6);
        hwa hwaVar = bwaVar2.e;
        cwa cwaVar = this.a;
        njm.a(hwaVar, cwaVar.e, 0.0f, 6);
        njm.a(bwaVar2.g, cwaVar.g, 0.0f, 6);
        if (this.b instanceof aue.a) {
            bwaVar2.g(0.0f);
        }
        return Unit.a;
    }
}
