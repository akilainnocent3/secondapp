package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b5a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        int i;
        tcf tcfVar = (tcf) obj;
        tcfVar.getClass();
        float fC1 = tcfVar.C1(1.5f);
        float fC2 = tcfVar.C1(26.0f);
        float f2 = fC1 * 2.0f;
        int i2 = 0;
        while (true) {
            f = 0.5f;
            if (i2 >= 60) {
                break;
            }
            float f3 = i2;
            List listK = b.k(new j58(r58.d(4291414473L)), new j58(j58.c(0.5f, r58.d(4291414473L))));
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            float f4 = fC2 * 2.0f;
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
            tcf.P0(tcfVar, new hfs(listK, null, jFloatToRawIntBits, (jFloatToRawIntBits2 << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0), (f3 * 1.5f) + 180.0f, 1.5f, false, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), new yae0((f3 / 60.0f) * f2, 0.0f, 0, 0, null, 30), 832);
            i2++;
        }
        float f5 = 1.5f;
        int i3 = 0;
        for (i = 60; i3 < i; i = i) {
            float f6 = i3;
            float f7 = (1.0f - (f6 / 60.0f)) * f2;
            List listK2 = b.k(new j58(r58.d(4291414473L)), new j58(j58.c(f, r58.d(4291414473L))));
            float f8 = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            float f9 = f5;
            float f10 = fC2 * 2.0f;
            tcf.P0(tcfVar, new hfs(listK2, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), 270.0f + (f6 * f9), f9, false, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - f10)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32), new yae0(f7, 0.0f, 0, 0, null, 30), 832);
            i3++;
            f5 = f9;
            f = 0.5f;
        }
        float f11 = fC1 / 2.0f;
        tcf.Z1(tcfVar, r58.d(4291414473L), (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - fC2)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), fC1, 0, null, 496);
        return Unit.a;
    }
}
