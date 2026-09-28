package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class his {
    public static final void a(final d dVar, final zzr zzrVar, final String str, final op8 op8Var, a aVar, final int i) {
        dVar.getClass();
        zzrVar.getClass();
        b bVarI = aVar.i(973816305);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(zzrVar) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            final pd0 pd0Var = q8j0.a.a(bVarI).e;
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = a6a0.b(new Function0() { // from class: fis
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object next;
                        float fU1;
                        kzr kzrVarJ = zzrVar.j();
                        int iD = (int) (kzrVarJ.d() & 4294967295L);
                        Iterator<T> it = kzrVarJ.k().iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.g(((zyr) next).getKey(), str));
                        zyr zyrVar = (zyr) next;
                        if (zyrVar == null) {
                            fU1 = 0.0f;
                        } else {
                            int offset = iD - zyrVar.getOffset();
                            g8j0 g8j0Var = pd0Var;
                            mmd mmdVar2 = mmdVar;
                            int iC = offset - g8j0Var.c(mmdVar2);
                            if (iC < 0) {
                                iC = 0;
                            }
                            fU1 = mmdVar2.u1(iC);
                        }
                        return new g7f(fU1);
                    }
                });
                bVarI.r(objY);
            }
            d dVarI = j.i(j.g(dVar, 1.0f), ((g7f) ((twd0) objY).getValue()).a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            w1i.a(6, op8Var, bVarI, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(zzrVar, str, op8Var, i) { // from class: gis
                public final /* synthetic */ zzr b;
                public final /* synthetic */ String c;
                public final /* synthetic */ op8 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3457);
                    his.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
