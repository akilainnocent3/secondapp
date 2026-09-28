package defpackage;

import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v3v implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tcf tcfVar = (tcf) obj;
        tcfVar.getClass();
        hfs hfsVarA = ya5.a.a(0.0f, tcfVar.C1(4.0f), 8, b.k(new j58(j58.c(0.12f, j58.b)), new j58(j58.l)));
        float fC1 = tcfVar.C1(4.0f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
        tcf.V1(tcfVar, hfsVarA, 0L, (((long) Float.floatToRawIntBits(fC1)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0.0f, null, null, 0, 120);
        return Unit.a;
    }
}
