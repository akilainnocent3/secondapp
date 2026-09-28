package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class dli0 {
    public static final void a(final vki0 vki0Var, final vki0 vki0Var2, a aVar, final int i) {
        b bVarI = aVar.i(1219387287);
        int i2 = (bVarI.A(vki0Var) ? 4 : 2) | i | (bVarI.A(vki0Var2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ju1.b(e0a.b, null, pp8.b(6363997, new gaj() { // from class: bli0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long jA;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((m75) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarJ = h.j(d.a.b, 0.0f, 4.0f, 8.0f, 0.0f, 9);
                        vki0 vki0Var3 = vki0Var;
                        String strA = cb40.a(vki0Var3.a, new Object[0], aVar2);
                        imf0 imf0Var = ((ijb0) aVar2.O(kjb0.a)).i;
                        if (vki0Var3.equals(vki0Var2)) {
                            aVar2.N(611480747);
                            jA = ((lib0) aVar2.O(oib0.a)).t;
                            aVar2.H();
                        } else {
                            jA = m7b.a(aVar2, 611545072, R.color.text_type1_secondary, aVar2);
                        }
                        lkf0.d(strA, dVarJ, jA, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, aVar2, 48, 0, 130040);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 390, 2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(vki0Var2, i) { // from class: cli0
                public final /* synthetic */ vki0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(73);
                    dli0.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final jli0 jli0Var, final Function1 function1, a aVar, final int i) {
        int i2;
        b bVar;
        function1.getClass();
        b bVarI = aVar.i(-1672831368);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(jli0Var) : bVarI.A(jli0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarH = h.h(dVar, 16.0f, 0.0f, 2);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new wki0();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarH, false, (Function1) objY);
            int i3 = jli0Var.c;
            long j = j58.l;
            bVar = bVarI;
            mfc.a(i3, dVarB, j, j, 0.0f, 0.0f, false, pp8.b(1060286554, new gaj() { // from class: xki0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List list = (List) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    list.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        h2f0.a.b(h2f0.c((y1f0) list.get(jli0Var.c)), 3.0f, ((lib0) aVar2.O(oib0.a)).t, aVar2, 3120, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), e0a.a, pp8.b(1330078298, new kaa(1, jli0Var, function1), bVarI), bVar, 918777216, 64);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yki0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    dli0.b(dVar, jli0Var, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
