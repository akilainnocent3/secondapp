package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h87 implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ i060 d;

    public /* synthetic */ h87(float f, float f2, long j, i060 i060Var) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i060Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        lza lzaVar = (lza) obj;
        lzaVar.getClass();
        lzaVar.b2();
        float fC1 = lzaVar.C1(this.a);
        float f = this.b / 360.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + Float.intBitsToFloat((int) (lzaVar.d() >> 32))) * 2.0f;
        float f2 = f * fIntBitsToFloat;
        if (f2 < Float.intBitsToFloat((int) (lzaVar.d() >> 32))) {
            jFloatToRawIntBits = Float.floatToRawIntBits(f2);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        } else {
            if (f2 < Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + Float.intBitsToFloat((int) (lzaVar.d() >> 32))) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                float fIntBitsToFloat3 = f2 - Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat3);
            } else {
                if (f2 < Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + (Float.intBitsToFloat((int) (lzaVar.d() >> 32)) * 2.0f)) {
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - ((f2 - Float.intBitsToFloat((int) (lzaVar.d() >> 32))) - Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)));
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                    jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat4);
                    iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat5);
                } else {
                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - ((f2 - (Float.intBitsToFloat((int) (lzaVar.d() >> 32)) * 2.0f)) - Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)));
                    jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat6);
                }
            }
        }
        long j = (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
        Float fValueOf = Float.valueOf(0.0f);
        long j2 = this.c;
        vu30 vu30VarG = ya5.a.g(new Pair[]{new Pair(fValueOf, new j58(j2)), new Pair(Float.valueOf(0.4f), new j58(j58.c(0.6f, j2))), new Pair(Float.valueOf(0.7f), new j58(j58.c(0.2f, j2))), new Pair(Float.valueOf(1.0f), new j58(j58.l))}, j, fIntBitsToFloat * 0.15f, 8);
        float fA = this.d.a.a(lzaVar.d(), lzaVar);
        tcf.q1(lzaVar, vu30VarG, 0L, 0L, (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L), 0.0f, new yae0(fC1, 0.0f, 0, 0, null, 30), null, 0, 214);
        return Unit.a;
    }
}
