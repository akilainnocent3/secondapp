package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes5.dex */
public final class n4n {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final List<Float> list, final long j, final d dVar, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-614255263);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(list) : bVarI.A(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(dVar) ? 256 : 128;
        }
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarB = androidx.compose.foundation.a.b(dVar, c68.a(R.color.border_primary, bVarI), zk40.a);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new i4n();
                bVarI.r(objY);
            }
            d dVarB2 = xa80.b(dVarB, false, (Function1) objY);
            int i4 = 6;
            d160 d160VarA = b160.a(new kw0.i(1.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            Iterator itA = yt1.a(bVarI, dVarC, yka.a.d, -220864429, list);
            int i5 = 0;
            while (itA.hasNext()) {
                Object next = itA.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                int i7 = i5;
                c(((Number) xe0.b(((Number) next).floatValue(), yi0.e((int) j, i3, null, i4), "quarterBar", null, bVarI, 3072, 20).getValue()).floatValue(), 0, bVarI, g3w.h(j.i(new LayoutWeightElement(1.0f, true), 5.0f), "quarter_progress_bar_" + i7));
                i3 = 0;
                i5 = i6;
                i4 = i4;
            }
            bVarI.X(i3);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j4n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    n4n.a(list, j, dVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, final long j, a aVar, final d dVar) {
        isw iswVar;
        isw iswVar2;
        isw iswVar3;
        isw iswVar4;
        b bVarI = aVar.i(454859174);
        int i3 = i2 | (bVarI.d(i) ? 4 : 2) | (bVarI.e(j) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(objY);
            }
            isw iswVar5 = (isw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(objY2);
            }
            isw iswVar6 = (isw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(objY3);
            }
            isw iswVar7 = (isw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(objY4);
            }
            isw iswVar8 = (isw) objY4;
            Integer numValueOf = Integer.valueOf(i);
            boolean z = (i3 & 14) == 4;
            Object objY5 = bVarI.y();
            if (z || objY5 == c0042a) {
                iswVar = iswVar7;
                iswVar2 = iswVar5;
                iswVar3 = iswVar6;
                iswVar4 = iswVar8;
                m4n m4nVar = new m4n(i, iswVar2, iswVar3, iswVar, iswVar4, null);
                bVarI.r(m4nVar);
                objY5 = m4nVar;
            } else {
                iswVar2 = iswVar5;
                iswVar3 = iswVar6;
                iswVar = iswVar7;
                iswVar4 = iswVar8;
            }
            xvf.e(bVarI, numValueOf, (Function2) objY5);
            a(kotlin.collections.b.k(Float.valueOf(iswVar2.j()), Float.valueOf(iswVar3.j()), Float.valueOf(iswVar.j()), Float.valueOf(iswVar4.j())), j, dVar, bVarI, i3 & 1008);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, j, dVar) { // from class: h4n
                public final /* synthetic */ int a;
                public final /* synthetic */ long b;
                public final /* synthetic */ d c;

                {
                    this.b = j;
                    this.c = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    n4n.b(this.a, iA, this.b, (a) obj, this.c);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(float f, final int i, a aVar, final d dVar) {
        final float f2;
        b bVarI = aVar.i(-752933172);
        int i2 = (bVarI.c(f) ? 4 : 2) | i | (bVarI.M(dVar) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final long jA = c68.a(R.color.border_primary, bVarI);
            final long jA2 = c68.a(R.color.bg_warning_primary, bVarI);
            boolean zE = bVarI.e(jA) | ((i2 & 14) == 4) | bVarI.e(jA2);
            Object objY = bVarI.y();
            if (zE || objY == a.C0041a.a) {
                f2 = f;
                Function1 function1 = new Function1() { // from class: k4n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        tcf.m0(tcfVar, jA, 0L, tcfVar.d(), 0.0f, null, 0, 122);
                        float f3 = f2;
                        if (f3 > 0.0f) {
                            float fD = f.d(f3, 0.0f, 1.0f) * Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                            tcf.m0(tcfVar, jA2, 0L, (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0.0f, null, 0, 122);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                objY = function1;
            } else {
                f2 = f;
            }
            rxo.b(dVar, (Function1) objY, bVarI, (i2 >> 3) & 14);
        } else {
            f2 = f;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f2, i, dVar) { // from class: l4n
                public final /* synthetic */ float a;
                public final /* synthetic */ d b;

                {
                    this.b = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    n4n.c(this.a, iA, (a) obj, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
