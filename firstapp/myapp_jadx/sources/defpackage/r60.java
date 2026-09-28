package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r60 implements gaj<d, a, Integer, d> {
    public static final r60 a = new r60();

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        d dVar2 = dVar;
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(-2126899193);
        final long j = ((bmf0) aVar2.O(cmf0.a)).a;
        boolean zE = aVar2.e(j);
        Object objY = aVar2.y();
        if (zE || objY == a.C0041a.a) {
            objY = new Function1() { // from class: p60
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    mr5 mr5Var = (mr5) obj;
                    final float fIntBitsToFloat = Float.intBitsToFloat((int) (mr5Var.a.d() >> 32)) / 2.0f;
                    final c8n c8nVarD = tz9.d(mr5Var, fIntBitsToFloat);
                    final gf4 gf4Var = new gf4(j, 5);
                    return mr5Var.g(new Function1() { // from class: q60
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            float f = fIntBitsToFloat;
                            c8n c8nVar = c8nVarD;
                            gf4 gf4Var2 = gf4Var;
                            lza lzaVar = (lza) obj2;
                            lzaVar.b2();
                            qc6.b bVarF1 = lzaVar.F1();
                            long jD = bVarF1.d();
                            bVarF1.a().p();
                            try {
                                rc6 rc6Var = bVarF1.a;
                                rc6Var.i(f, 0.0f);
                                rc6Var.f(45.0f, 0L);
                                tcf.b1(lzaVar, c8nVar, 0L, 0.0f, gf4Var2, 0, 46);
                                return Unit.a;
                            } finally {
                                hrh.a(bVarF1, jD);
                            }
                        }
                    });
                }
            };
            aVar2.r(objY);
        }
        d dVarN = dVar2.n(androidx.compose.ui.draw.a.b(d.a.b, (Function1) objY));
        aVar2.H();
        return dVarN;
    }
}
