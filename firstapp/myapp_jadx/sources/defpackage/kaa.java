package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kaa implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kaa(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final op8 op8Var = (op8) obj4;
                final naa naaVar = (naa) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-788388560, new Function2() { // from class: laa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            a aVar2 = (a) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                op8Var.invoke(naaVar, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                final jli0 jli0Var = (jli0) obj4;
                final Function1 function1 = (Function1) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int i2 = 0;
                    for (vki0 vki0Var : jli0Var.a) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            b.q();
                            throw null;
                        }
                        final vki0 vki0Var2 = vki0Var;
                        d dVarH = g3w.h(j.w(d.a.b, 108.0f), vki0Var2.b);
                        boolean z = i2 == jli0Var.c;
                        boolean zM = aVar2.M(function1) | aVar2.A(vki0Var2);
                        Object objY = aVar2.y();
                        if (zM || objY == a.C0041a.a) {
                            objY = new Function0() { // from class: zki0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(vki0Var2);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY);
                        }
                        w1f0.a(z, (Function0) objY, dVarH, false, 0L, 0L, pp8.b(1659442820, new gaj() { // from class: ali0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                long jA;
                                a aVar3;
                                vki0 vki0Var3 = jli0Var.b;
                                a aVar4 = (a) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                ((j78) obj5).getClass();
                                if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    d dVarH2 = h.h(j.i(d.a.b, 40.0f), 20.0f, 0.0f, 2);
                                    aiv aivVarC = g75.c(ht.a.e, false);
                                    int iHashCode = Long.hashCode(aVar4.m());
                                    ne00 ne00VarO = aVar4.o();
                                    d dVarC = c.c(aVar4, dVarH2);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar4.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar4.D();
                                    if (aVar4.g()) {
                                        aVar4.F(aVar5);
                                    } else {
                                        aVar4.p();
                                    }
                                    hlh0.a(aVar4, aivVarC, yka.a.f);
                                    hlh0.a(aVar4, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar4, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar4, dVarC, yka.a.d);
                                    vki0 vki0Var4 = vki0Var2;
                                    if (vki0Var4.c) {
                                        aVar4.N(-1949478888);
                                        dli0.a(vki0Var4, vki0Var3, aVar4, 72);
                                        aVar4.H();
                                        aVar3 = aVar4;
                                    } else {
                                        aVar4.N(-1949339357);
                                        String strA = cb40.a(vki0Var4.a, new Object[0], aVar4);
                                        imf0 imf0Var = ((ijb0) aVar4.O(kjb0.a)).i;
                                        if (vki0Var4.equals(vki0Var3)) {
                                            aVar4.N(-1949149730);
                                            jA = ((lib0) aVar4.O(oib0.a)).t;
                                            aVar4.H();
                                        } else {
                                            jA = m7b.a(aVar4, -1949053661, R.color.text_type1_secondary, aVar4);
                                        }
                                        aVar3 = aVar4;
                                        lkf0.d(strA, null, jA, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, aVar3, 0, 0, 130042);
                                        aVar3.H();
                                    }
                                    aVar3.s();
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 12582912, 120);
                        i2 = i3;
                    }
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }
}
