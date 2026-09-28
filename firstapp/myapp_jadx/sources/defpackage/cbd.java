package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cbd implements v82 {
    public static final cbd a = new cbd();

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ w82 a;

        public a(w82 w82Var) {
            this.a = w82Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                final String strA = xae0.a(R.string.m3c_dialog, aVar2);
                w82 w82Var = this.a;
                d dVar = w82Var.b;
                umz umzVar = ys.a;
                d dVarV = j.v(dVar, 280.0f, 0.0f, 560.0f, 10);
                boolean zM = aVar2.M(strA);
                Object objY = aVar2.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new Function1() { // from class: bbd
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            lb80.e((pb80) obj, strA);
                            return Unit.a;
                        }
                    };
                    aVar2.r(objY);
                }
                d dVarN = dVarV.n(xa80.b(d.a.b, false, (Function1) objY));
                aiv aivVarC = g75.c(ht.a.a, true);
                int I = aVar2.I();
                ne00 ne00VarO = aVar2.o();
                d dVarC = c.c(aVar2, dVarN);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                if (aVar2.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar2.D();
                if (aVar2.g()) {
                    aVar2.F(aVar3);
                } else {
                    aVar2.p();
                }
                hlh0.a(aVar2, aivVarC, yka.a.f);
                hlh0.a(aVar2, ne00VarO, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                    j3c.a(I, aVar2, I, c1350a);
                }
                hlh0.a(aVar2, dVarC, yka.a.d);
                fc0.a(0, w82Var.d, aVar2);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    @Override // defpackage.v82
    public final void a(final w82 w82Var, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(1565826668);
        int i2 = (bVarI.M(w82Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            u60.a(w82Var.a, w82Var.c, pp8.b(1163527043, new a(w82Var), bVarI), bVarI, 384, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(w82Var, i) { // from class: abd
                public final /* synthetic */ w82 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.a(this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
