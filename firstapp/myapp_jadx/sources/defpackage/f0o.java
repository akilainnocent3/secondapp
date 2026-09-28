package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class f0o {

    public static final class a implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class b implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ Function1 b;
        public final /* synthetic */ float c;
        public final /* synthetic */ osw d;

        public b(List list, Function1 function1, float f, osw oswVar) {
            this.a = list;
            this.b = function1;
            this.c = f;
            this.d = oswVar;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                w1o w1oVar = (w1o) this.a.get(iIntValue);
                aVar2.N(103208953);
                v1o.a(w1oVar, this.b, this.d.D(), this.c, aVar2, 56);
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(d dVar, boolean z, final qcn<u0o> qcnVar, final qcn<w1o> qcnVar2, androidx.compose.runtime.a aVar, int i, int i2) {
        d dVar2;
        int i3;
        boolean z2;
        g7f g7fVar;
        qcnVar.getClass();
        qcnVar2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-216314990);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = i | (bVarI.M(dVar2) ? 4 : 2);
        }
        if ((i & 48) == 0) {
            z2 = z;
            i3 |= bVarI.b(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        int i5 = (bVarI.A(qcnVar2) ? 2048 : 1024) | i3 | (bVarI.M(qcnVar) ? 256 : 128);
        if (bVarI.q(i5 & 1, (i5 & 1171) != 1170)) {
            d dVar3 = i4 != 0 ? d.a.b : dVar2;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = k.a(0);
                bVarI.r(objY);
            }
            final osw oswVar = (osw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new b0o(oswVar, 0);
                bVarI.r(objY2);
            }
            final Function1 function1 = (Function1) objY2;
            olf0 olf0VarA = plf0.a(bVarI);
            imf0 imf0VarL = mla.l(R.style.B2_R, bVarI);
            bVarI.N(-1720251999);
            ArrayList arrayList = new ArrayList(l48.r(qcnVar2, 10));
            Iterator<w1o> it = qcnVar2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().e);
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                g7f g7fVar2 = new g7f(kla.b((String) it2.next(), olf0VarA, imf0VarL, bVarI));
                while (it2.hasNext()) {
                    g7f g7fVar3 = new g7f(kla.b((String) it2.next(), olf0VarA, imf0VarL, bVarI));
                    if (g7fVar2.compareTo(g7fVar3) < 0) {
                        g7fVar2 = g7fVar3;
                    }
                }
                g7fVar = g7fVar2;
            } else {
                g7fVar = null;
            }
            bVarI.X(false);
            final float f = g7fVar != null ? g7fVar.a : Float.NaN;
            boolean zC = ((i5 & 112) == 32) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048 || bVarI.A(qcnVar2)) | bVarI.c(f);
            Object objY3 = bVarI.y();
            if (zC || objY3 == c0042a) {
                final boolean z3 = z2;
                Function1 function2 = new Function1() { // from class: c0o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        if (!z3) {
                            final qcn qcnVar3 = qcnVar;
                            if (!qcnVar3.isEmpty()) {
                                szr.h(szrVar, null, m69.a, 3);
                                szr.h(szrVar, null, new op8(-783116533, new gaj() { // from class: d0o
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        a aVar2 = (a) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((gwr) obj2).getClass();
                                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            y0o.a(qcnVar3, aVar2, 0);
                                        } else {
                                            aVar2.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true), 3);
                            }
                        }
                        szr.h(szrVar, null, m69.b, 3);
                        qcn qcnVar4 = qcnVar2;
                        szrVar.d(qcnVar4.size(), null, new f0o.a(qcnVar4), new op8(802480018, new f0o.b(qcnVar4, function1, f, oswVar), true));
                        return Unit.a;
                    }
                };
                bVarI.r(function2);
                objY3 = function2;
            }
            dVar2 = dVar3;
            aur.a(dVar2, null, null, false, null, null, null, false, null, (Function1) objY3, bVarI, i5 & 14, 510);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new o75(dVar2, z, qcnVar, qcnVar2, i, i2);
        }
    }

    public static final void b(final int i, final int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1307198571);
        int i3 = (bVarI.d(i) ? 4 : 2) | i2;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            bVar = bVarI;
            lkf0.d(cb40.a(i, new Object[0], bVarI), j.A(h.h(androidx.compose.foundation.a.b(j.i(j.g(d.a.b, 1.0f), 28.0f), c68.a(R.color.bg_surface_primary, bVarI), zk40.a), 12.0f, 0.0f, 2), ht.a.k, 2), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVar, 0, 0, 130040);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2) { // from class: e0o
                public final /* synthetic */ int a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    f0o.b(this.a, iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }
}
