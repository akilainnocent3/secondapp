package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hb0 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ Function0<Boolean> a;
    public final /* synthetic */ boolean b;

    public hb0(boolean z, Function0 function0) {
        this.a = function0;
        this.b = z;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        d dVar2 = dVar;
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(-196777734);
        final long j = ((bmf0) aVar2.O(cmf0.a)).a;
        boolean zE = aVar2.e(j);
        final Function0<Boolean> function0 = this.a;
        boolean zM = zE | aVar2.M(function0);
        final boolean z = this.b;
        boolean zB = zM | aVar2.b(z);
        Object objY = aVar2.y();
        if (zB || objY == a.C0041a.a) {
            objY = new Function1() { // from class: fb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    mr5 mr5Var = (mr5) obj;
                    final c8n c8nVarD = tz9.d(mr5Var, Float.intBitsToFloat((int) (mr5Var.a.d() >> 32)) / 2.0f);
                    final gf4 gf4Var = new gf4(j, 5);
                    final Function0 function1 = function0;
                    final boolean z2 = z;
                    return mr5Var.g(new Function1() { // from class: gb0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            lza lzaVar = (lza) obj2;
                            lzaVar.b2();
                            if (!((Boolean) function1.invoke()).booleanValue()) {
                                return Unit.a;
                            }
                            boolean z3 = z2;
                            c8n c8nVar = c8nVarD;
                            gf4 gf4Var2 = gf4Var;
                            if (z3) {
                                long jR1 = lzaVar.R1();
                                qc6.b bVarF1 = lzaVar.F1();
                                long jD = bVarF1.d();
                                bVarF1.a().p();
                                try {
                                    bVarF1.a.g(-1.0f, 1.0f, jR1);
                                    tcf.b1(lzaVar, c8nVar, 0L, 0.0f, gf4Var2, 0, 46);
                                } finally {
                                    hrh.a(bVarF1, jD);
                                }
                            } else {
                                tcf.b1(lzaVar, c8nVar, 0L, 0.0f, gf4Var2, 0, 46);
                            }
                            return Unit.a;
                        }
                    });
                }
            };
            aVar2.r(objY);
        }
        d dVarB = androidx.compose.ui.draw.a.b(dVar2, (Function1) objY);
        aVar2.H();
        return dVarB;
    }
}
