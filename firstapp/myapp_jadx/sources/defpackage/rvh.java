package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rvh {
    public static final void a(final float f, a aVar, final int i) {
        b bVarI = aVar.i(966586462);
        int i2 = (bVarI.c(f) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarE = j.e(d.a.b, 1.0f);
            aiv aivVarC = g75.c(ht.a.b, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            b(f, bVarI, i2 & 14);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, f) { // from class: ovh
                public final /* synthetic */ float a;

                {
                    this.a = f;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rvh.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final float f, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-1713374388);
        int i2 = (bVarI.c(f) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new jxo(0L));
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            final float fB = mla.b(f, bVarI);
            final float fB2 = mla.b(175.0f, bVarI);
            float fB3 = mla.b(4.0f, bVarI);
            boolean zC = bVarI.c(fB) | bVarI.c(fB2);
            Object objY2 = bVarI.y();
            if (zC || objY2 == c0042a) {
                objY2 = new Function1() { // from class: pvh
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((mmd) obj).getClass();
                        return new iwo(((long) ((int) ((fB - ((int) (((jxo) ytwVar.getValue()).a & 4294967295L))) - fB2))) & 4294967295L);
                    }
                };
                bVarI.r(objY2);
            }
            d dVarB = g.b(d.a.b, (Function1) objY2);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new l94(ytwVar, 1);
                bVarI.r(objY3);
            }
            d dVarA = w.a(dVarB, (Function1) objY3);
            v1k v1kVar = f8i.b;
            bVar = bVarI;
            lkf0.d("Flick the ball !", dVarA, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, new imf0(shi.d, mla.m(32.0f, bVarI), new t9i(900), null, v1kVar, 0L, null, new ix80(fB3, shi.e, (((long) Float.floatToRawIntBits(fB3)) << 32) | (((long) Float.floatToRawIntBits(fB3)) & 4294967295L)), 0, mla.m(36.8f, bVarI), null, null, 16637912), bVar, 6, 0, 130044);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, f) { // from class: qvh
                public final /* synthetic */ float a;

                {
                    this.a = f;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rvh.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
