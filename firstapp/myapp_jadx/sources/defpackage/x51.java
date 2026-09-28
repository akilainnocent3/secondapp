package defpackage;

import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x51 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x51(int i, Object obj, Function1 function1) {
        this.a = i;
        this.c = obj;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a.C0041a.C0042a c0042a = a.C0041a.a;
        final Function1 function1 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                final i91 i91Var = (i91) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    String strA = cb40.a(R.string.common_functions__view, new Object[0], aVar);
                    imf0 imf0VarL = mla.l(R.style.B1_B, aVar);
                    long jA = c68.a(R.color.text_brand_sub_primary_d_base, aVar);
                    boolean zA = aVar.A(i91Var) | aVar.M(function1);
                    Object objY = aVar.y();
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: v51
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str = i91Var.t;
                                if (str != null) {
                                    function1.invoke(str);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    lkf0.d(strA, g3w.h(d.d(androidx.compose.ui.d.a.b, false, null, null, (Function0) objY, 15), "auto_bet_completed_view_ticket_link"), jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, aVar, 0, 0, 131064);
                } else {
                    aVar.G();
                }
                break;
            default:
                w3x w3xVar = (w3x) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    for (final b4x b4xVar : w3xVar.b) {
                        boolean z = w3xVar.a == b4xVar.a;
                        long jA2 = c68.a(R.color.text_type1_primary, aVar2);
                        long jA3 = c68.a(R.color.text_type1_primary, aVar2);
                        boolean zM = aVar2.M(function1) | aVar2.A(b4xVar);
                        Object objY2 = aVar2.y();
                        if (zM || objY2 == c0042a) {
                            objY2 = new x0y(0, b4xVar, function1);
                            aVar2.r(objY2);
                        }
                        w1f0.b(z, (Function0) objY2, null, false, pp8.b(-44351417, new Function2() { // from class: y0y
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                a aVar3 = (a) obj4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar3, 0);
                                    int iHashCode = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    androidx.compose.ui.d.a aVar4 = androidx.compose.ui.d.a.b;
                                    androidx.compose.ui.d dVarC = c.c(aVar3, aVar4);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    yka.a.b bVar = yka.a.f;
                                    hlh0.a(aVar3, d160VarA, bVar);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar3, ne00VarO, dVar);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar3, dVarC, cVar);
                                    b4x b4xVar2 = b4xVar;
                                    lkf0.d(cb40.a(b4xVar2.a.b, new Object[0], aVar3), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, aVar3), aVar3, 0, 0, 131070);
                                    if (b4xVar2.b) {
                                        aVar3.N(-1308735215);
                                        androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.r(aVar4, 6.0f), c68.a(R.color.brand_primary, aVar3), j060.a);
                                        aiv aivVarC = g75.c(ht.a.a, false);
                                        int iHashCode2 = Long.hashCode(aVar3.m());
                                        ne00 ne00VarO2 = aVar3.o();
                                        androidx.compose.ui.d dVarC2 = c.c(aVar3, dVarB);
                                        if (aVar3.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar3.D();
                                        if (aVar3.g()) {
                                            aVar3.F(aVar5);
                                        } else {
                                            aVar3.p();
                                        }
                                        hlh0.a(aVar3, aivVarC, bVar);
                                        hlh0.a(aVar3, ne00VarO2, dVar);
                                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                        }
                                        hlh0.a(aVar3, dVarC2, cVar);
                                        aVar3.s();
                                        aVar3.H();
                                    } else {
                                        aVar3.N(-1308237417);
                                        aVar3.H();
                                    }
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), jA2, jA3, aVar2, 24576, 300);
                    }
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
