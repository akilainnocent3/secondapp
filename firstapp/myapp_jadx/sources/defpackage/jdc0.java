package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jdc0 {
    public static final void a(final d dVar, final String str, final qcn qcnVar, final Function1 function1, a aVar, final int i) {
        b bVar;
        function1.getClass();
        b bVarI = aVar.i(1246794230);
        int i2 = i | (bVarI.M(str) ? 32 : 16) | (bVarI.M(qcnVar) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Iterator<E> it = qcnVar.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (((cdc0) it.next()).a.equals(str)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 < 0) {
                i3 = 0;
            }
            d dVarI = j.i(j.g(dVar, 1.0f), 24.0f);
            long jA = c68.a(R.color.transparent, bVarI);
            zk40.a aVar2 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarI, jA, aVar2);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new ejc(1);
                bVarI.r(objY);
            }
            d dVarB2 = xa80.b(dVarB, false, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            d dVarB3 = androidx.compose.foundation.a.b(j.c(d.a.b, 1.0f), c68.a(R.color.transparent, bVarI), aVar2);
            long j = j58.l;
            mfc.a(i3, dVarB3, j, j, 0.0f, 0.0f, false, null, null, pp8.b(-1444319138, new Function2() { // from class: hdc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    final String strA;
                    long jA2;
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        for (final cdc0 cdc0Var : qcnVar) {
                            String str2 = cdc0Var.a;
                            final boolean zEquals = str2.equals(str);
                            if (str2.equals("recommended")) {
                                aVar4.N(1678975303);
                                strA = cb40.a(R.string.page_instant_virtual__recommended, new Object[0], aVar4);
                                aVar4.H();
                            } else {
                                aVar4.N(1679085198);
                                aVar4.H();
                                strA = cdc0Var.b;
                            }
                            boolean zB = aVar4.b(zEquals);
                            final Function1 function2 = function1;
                            boolean zM = zB | aVar4.M(function2) | aVar4.A(cdc0Var);
                            Object objY2 = aVar4.y();
                            if (zM || objY2 == a.C0041a.a) {
                                objY2 = new Function0() { // from class: fdc0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        if (!zEquals) {
                                            function2.invoke(cdc0Var.a);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY2);
                            }
                            Function0 function0 = (Function0) objY2;
                            d dVarA = ls7.a(j.c(j.D(d.a.b, null, 3), 1.0f), j060.c(26.0f));
                            if (zEquals) {
                                jA2 = m7b.a(aVar4, 1578201063, R.color.bg_inverse_tertiary_d_base, aVar4);
                            } else {
                                aVar4.N(1578204156);
                                aVar4.H();
                                jA2 = j58.l;
                            }
                            w1f0.b(zEquals, function0, g3w.h(androidx.compose.foundation.a.b(dVarA, jA2, zk40.a), "sporty_legends_league_" + str2 + "_tab"), false, pp8.b(1199905271, new Function2() { // from class: gdc0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    a aVar5 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        int i4 = zEquals ? R.style.B2_M : R.style.B2_R;
                                        lkf0.d(strA, g3w.h(d.a.b, "sporty_legends_league_" + cdc0Var.a + "_text"), c68.a(R.color.text_inverse_primary, aVar5), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(i4, aVar5), aVar5, 0, 0, 130040);
                                    } else {
                                        aVar5.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar4), 0L, 0L, aVar4, 24576, 488);
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 805334400, 480);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, qcnVar, function1, i) { // from class: idc0
                public final /* synthetic */ String b;
                public final /* synthetic */ qcn c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    jdc0.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
