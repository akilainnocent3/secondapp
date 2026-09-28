package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iz8 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarG = j.g(j.i(d.a.b, 20.0f), 1.0f);
            final long jD = r58.d(4285783781L);
            dVarG.getClass();
            g75.a(androidx.compose.ui.draw.a.c(dVarG, new Function1() { // from class: ome
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) throws Throwable {
                    qc6.b bVar;
                    long j;
                    lza lzaVar = (lza) obj3;
                    lzaVar.getClass();
                    lzaVar.b2();
                    lk40 lk40VarB = pk40.b(0L, lzaVar.d());
                    b90 b90VarA = c90.a();
                    b90VarA.m(jD);
                    float f = (lk40VarB.d - lk40VarB.b) * 2.0f;
                    float fC1 = lzaVar.C1(8.0f);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                    qc6.b bVarF1 = lzaVar.F1();
                    long jD2 = bVarF1.d();
                    bVarF1.a().p();
                    try {
                        bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        lc6 lc6VarA = lzaVar.F1().a();
                        float fC2 = lzaVar.C1(10.0f);
                        lc6VarA.s(lk40VarB, b90VarA);
                        j = jD2;
                        try {
                            try {
                                bVar = bVarF1;
                                try {
                                    lc6VarA.l(lk40VarB.a, lk40VarB.b, lk40VarB.c, f, fC1, fC1, b90VarA);
                                    Paint paint = b90VarA.a;
                                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                    paint.setMaskFilter(new BlurMaskFilter(fC2, BlurMaskFilter.Blur.NORMAL));
                                    lc6VarA.l(lk40VarB.a, lk40VarB.b, lk40VarB.c, f, fC1, fC1, b90VarA);
                                    paint.setXfermode(null);
                                    paint.setMaskFilter(null);
                                    hrh.a(bVar, j);
                                    return Unit.a;
                                } catch (Throwable th) {
                                    th = th;
                                    hrh.a(bVar, j);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bVar = bVarF1;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bVar = bVarF1;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bVar = bVarF1;
                        j = jD2;
                    }
                }
            }), aVar, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
