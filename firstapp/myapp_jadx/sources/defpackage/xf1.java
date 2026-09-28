package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class xf1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, d dVar, final imf0 imf0Var, int i, final long j, ix80 ix80Var, final int i2, tmz tmzVar, long j2, a aVar, final int i3, final int i4) {
        long j3;
        b bVar;
        final d dVar2;
        final int i5;
        final ix80 ix80Var2;
        final long j4;
        final tmz tmzVar2;
        ix80 ix80Var3;
        tmz umzVar;
        d dVar3;
        long j5;
        int i6;
        ytw ytwVar;
        b bVar2;
        str.getClass();
        b bVarI = aVar.i(-318882613);
        int i7 = i3 | (bVarI.M(str) ? 4 : 2) | 48 | (bVarI.M(imf0Var) ? 256 : 128) | 199680 | (bVarI.d(i2) ? 1048576 : 524288);
        int i8 = 12582912 | i7;
        int i9 = i4 & 256;
        if (i9 != 0) {
            i8 = 113246208 | i7;
            j3 = j2;
        } else {
            j3 = j2;
            if ((i3 & 100663296) == 0) {
                i8 |= bVarI.e(j3) ? 67108864 : 33554432;
            }
        }
        int i10 = i8;
        if (bVarI.q(i10 & 1, (i10 & 38347923) != 38347922)) {
            bVarI.A0();
            if ((i3 & 1) == 0 || bVarI.h0()) {
                ix80Var3 = new ix80(0L, 7, 0L, 0.0f);
                umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
                dVar3 = d.a.b;
                j5 = i9 != 0 ? j58.f : j3;
                i6 = 1;
            } else {
                bVarI.G();
                dVar3 = dVar;
                i6 = i;
                ix80Var3 = ix80Var;
                umzVar = tmzVar;
                j5 = j3;
            }
            bVarI.Y();
            long jF = imf0Var.a.b;
            if ((jF & 1095216660480L) == 0) {
                jF = d2l.f(14);
            }
            long j6 = imf0Var.b.c;
            if ((1095216660480L & j6) == 0) {
                j6 = jF;
            }
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new omf0(jF));
                bVarI.r(objY);
            }
            final ytw ytwVar2 = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(new omf0(j6));
                bVarI.r(objY2);
            }
            final ytw ytwVar3 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Boolean.FALSE);
                bVarI.r(objY3);
            }
            ytw ytwVar4 = (ytw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(str);
                bVarI.r(objY4);
            }
            ytw ytwVar5 = (ytw) objY4;
            if (!str.equals((String) ytwVar5.getValue())) {
                ytwVar2.setValue(new omf0(jF));
                ytwVar3.setValue(new omf0(j6));
                ytwVar5.setValue(str);
                ytwVar4.setValue(Boolean.FALSE);
            }
            tmz tmzVar3 = umzVar;
            d dVar4 = dVar3;
            imf0 imf0VarB = imf0.b(imf0Var, 0L, ((omf0) ytwVar2.getValue()).a, null, null, null, 0L, null, ix80Var3, null, 0, ((omf0) ytwVar3.getValue()).a, null, null, 16637949);
            ix80 ix80Var4 = ix80Var3;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                ytwVar = ytwVar4;
                objY5 = new kf1(ytwVar, 0);
                bVar2 = bVarI;
                bVar2.r(objY5);
            } else {
                ytwVar = ytwVar4;
                bVar2 = bVarI;
            }
            d dVarE = h.e(androidx.compose.ui.draw.a.c(dVar4, (Function1) objY5), tmzVar3);
            gdf0 gdf0Var = new gdf0(i2);
            Object objY6 = bVar2.y();
            if (objY6 == c0042a) {
                final ytw ytwVar6 = ytwVar;
                Function1 function1 = new Function1() { // from class: mf1
                    /* JADX WARN: Code duplicated, block: B:9:0x006a  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ukf0 ukf0Var = (ukf0) obj;
                        ukf0Var.getClass();
                        if (ukf0Var.e() || ukf0Var.d()) {
                            ytw ytwVar7 = ytwVar2;
                            long j7 = ((omf0) ytwVar7.getValue()).a;
                            long j8 = j;
                            d2l.b(j7, j8);
                            if (Float.compare(omf0.c(j7), omf0.c(j8)) > 0) {
                                long j9 = ((omf0) ytwVar7.getValue()).a;
                                d2l.a(j9);
                                ytwVar7.setValue(new omf0(gkw.a(0.9f, j9, j9 & 1095216660480L)));
                                ytw ytwVar8 = ytwVar3;
                                long j10 = ((omf0) ytwVar8.getValue()).a;
                                d2l.a(j10);
                                ytwVar8.setValue(new omf0(gkw.a(0.9f, j10, 1095216660480L & j10)));
                            } else {
                                ytwVar6.setValue(Boolean.TRUE);
                            }
                        } else {
                            ytwVar6.setValue(Boolean.TRUE);
                        }
                        return Unit.a;
                    }
                };
                bVar2.r(function1);
                objY6 = function1;
            }
            bVar = bVar2;
            long j7 = j5;
            int i11 = i6;
            lkf0.b(str, dVarE, j7, 0L, null, null, null, 0L, gdf0Var, 0L, 0, false, i11, 0, (Function1) objY6, imf0VarB, bVar, (i10 & 14) | ((i10 >> 18) & 896) | ((i10 << 9) & 1879048192), 3072, 24056);
            j4 = j7;
            i5 = i11;
            dVar2 = dVar4;
            ix80Var2 = ix80Var4;
            tmzVar2 = tmzVar3;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            i5 = i;
            ix80Var2 = ix80Var;
            j4 = j3;
            tmzVar2 = tmzVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: of1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i3 | 1);
                    xf1.a(str, dVar2, imf0Var, i5, j, ix80Var2, i2, tmzVar2, j4, (a) obj, iA, i4);
                    return Unit.a;
                }
            };
        }
    }
}
