package defpackage;

import android.graphics.DashPathEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ab60 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tcf tcfVar = (tcf) obj;
        tcfVar.getClass();
        float fC1 = tcfVar.C1(0.5f);
        k90 k90Var = new k90(new DashPathEffect(new float[]{tcfVar.C1(3.0f), tcfVar.C1(3.0f)}, 0.0f));
        tcf.Z1(tcfVar, j58.d, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)))) & 4294967295L), fC1, 0, k90Var, 464);
        return Unit.a;
    }
}
