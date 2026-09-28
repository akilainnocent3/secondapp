package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w1q implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = (d) obj;
        a aVar = (a) obj2;
        e3w.a((Integer) obj3, dVar, aVar, -293843468);
        final float fC1 = ((mmd) aVar.O(kna.h)).C1(((Configuration) aVar.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp);
        boolean zC = aVar.c(fC1);
        Object objY = aVar.y();
        if (zC || objY == a.C0041a.a) {
            objY = new Function1() { // from class: b2q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    lza lzaVar = (lza) obj4;
                    lzaVar.getClass();
                    float f = fC1;
                    float f2 = -f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) + f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                    qc6.b bVarF1 = lzaVar.F1();
                    long jD = bVarF1.d();
                    bVarF1.a().p();
                    try {
                        bVarF1.a.b(f2, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        lzaVar.b2();
                        return Unit.a;
                    } finally {
                        hrh.a(bVarF1, jD);
                    }
                }
            };
            aVar.r(objY);
        }
        d dVarC = androidx.compose.ui.draw.a.c(dVar, (Function1) objY);
        aVar.H();
        return dVarC;
    }
}
