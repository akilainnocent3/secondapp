package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r3w implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;

    public /* synthetic */ r3w(float f, long j) {
        this.c = f;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = this.c;
        switch (i) {
            case 0:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                lzaVar.b2();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) + 8.0f;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + 8.0f;
                j90 j90VarA = m90.a();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                bxz.s(j90VarA, bys.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))));
                j90 j90VarA2 = m90.a();
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                bxz.s(j90VarA2, bys.b(-8.0f, -8.0f, fIntBitsToFloat3, fIntBitsToFloat4, Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))));
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                bxz.s(j90VarA2, bys.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L))));
                j90VarA2.h(1);
                b90 b90VarA = c90.a();
                b90VarA.m(j58.c(0.25f, this.b));
                Paint paint = b90VarA.a;
                paint.setAntiAlias(true);
                paint.setMaskFilter(new BlurMaskFilter(4.0f, BlurMaskFilter.Blur.NORMAL));
                qc6.b bVarF1 = lzaVar.F1();
                long jD = bVarF1.d();
                bVarF1.a().p();
                try {
                    bVarF1.a.a(j90VarA, 1);
                    lc6 lc6VarA = lzaVar.F1().a();
                    lc6VarA.p();
                    lc6VarA.e(0.0f, 2.0f);
                    lc6VarA.m(j90VarA2, b90VarA);
                    lc6VarA.f();
                    return Unit.a;
                } finally {
                    hrh.a(bVarF1, jD);
                }
            default:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (4294967295L & tcfVar.d()));
                j90 j90VarA3 = m90.a();
                j90VarA3.a(0.0f, fIntBitsToFloat6);
                float f2 = fIntBitsToFloat6 - f;
                j90VarA3.c(0.0f, f2);
                j90VarA3.c(fIntBitsToFloat5 / 2.0f, 0.0f);
                j90VarA3.c(fIntBitsToFloat5, f2);
                j90VarA3.c(fIntBitsToFloat5, fIntBitsToFloat6);
                j90VarA3.close();
                tcf.Q1(tcfVar, j90VarA3, this.b, 0.0f, null, 60);
                return Unit.a;
        }
    }

    public /* synthetic */ r3w(long j, float f) {
        this.b = j;
        this.c = f;
    }
}
