package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class mmo {
    public static final void a(final nmo nmoVar, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, final Function0<Unit> function0, final Function1<? super moo, Unit> function3, a aVar, final int i) {
        Unit unit;
        function1.getClass();
        function2.getClass();
        function0.getClass();
        function3.getClass();
        b bVarI = aVar.i(-1878578292);
        int i2 = (bVarI.M(nmoVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            op8 op8VarB = pp8.b(1226937070, new Function2() { // from class: kmo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    nmo nmoVar2 = nmoVar;
                    qcn<voo> qcnVar = nmoVar2.b;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        kw0.i iVar = new kw0.i(8.0f, true, new hw0());
                        n54.a aVar3 = ht.a.m;
                        i78 i78VarA = g78.a(iVar, aVar3, aVar2, 6);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d.a aVar4 = d.a.b;
                        d dVarC = c.c(aVar2, aVar4);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarG = j.g(aVar4, 1.0f);
                        long j = ((lib0) aVar2.O(oib0.a)).m0;
                        zk40.a aVar6 = zk40.a;
                        d dVarI = h.i(androidx.compose.foundation.a.b(dVarG, j, aVar6), 12.0f, 10.0f, 32.0f, 24.0f);
                        i78 i78VarA2 = g78.a(new kw0.i(10.0f, true, new hw0()), aVar3, aVar2, 6);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarI);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA2, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        int iJ = kotlin.collections.b.j(qcnVar);
                        aVar2.N(-1159304281);
                        int i3 = 0;
                        for (voo vooVar : qcnVar) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            soo.a(vooVar, function2, function0, function3, aVar2, 8);
                            if (i3 != iJ) {
                                aVar2.N(2525446);
                                ute.b(null, ((qhb0) aVar2.O(shb0.a)).a, ((lib0) aVar2.O(oib0.a)).A, aVar2, 0, 1);
                                aVar2.H();
                            } else {
                                aVar2.N(2729178);
                                aVar2.H();
                            }
                            i3 = i4;
                        }
                        aVar2.H();
                        String strG = nmoVar2.c.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b));
                        HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(ht.a.n);
                        qyd0 qyd0Var = oib0.a;
                        long j2 = ((lib0) aVar2.O(qyd0Var)).b;
                        qyd0 qyd0Var2 = kjb0.a;
                        lkf0.d(strG, horizontalAlignElement, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(qyd0Var2)).q, aVar2, 0, 0, 131064);
                        a aVar7 = aVar2;
                        aVar7.s();
                        qcn<rmo> qcnVar2 = nmoVar2.d;
                        if (qcnVar2 == null) {
                            aVar7.N(-1996827211);
                            aVar7.H();
                        } else {
                            aVar7.N(-1996827210);
                            d dVarB = androidx.compose.foundation.a.b(j.g(aVar4, 1.0f), ((lib0) aVar7.O(qyd0Var)).m0, aVar6);
                            i78 i78VarA3 = g78.a(kw0.c, aVar3, aVar7, 0);
                            int iHashCode3 = Long.hashCode(aVar7.m());
                            ne00 ne00VarO3 = aVar7.o();
                            d dVarC3 = c.c(aVar7, dVarB);
                            yka.k.getClass();
                            tsr.a aVar8 = yka.a.b;
                            if (aVar7.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar7.D();
                            if (aVar7.g()) {
                                aVar7.F(aVar8);
                            } else {
                                aVar7.p();
                            }
                            yka.a.b bVar2 = yka.a.f;
                            hlh0.a(aVar7, i78VarA3, bVar2);
                            yka.a.d dVar2 = yka.a.e;
                            hlh0.a(aVar7, ne00VarO3, dVar2);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar7, iHashCode3, c1350a2);
                            }
                            yka.a.c cVar2 = yka.a.d;
                            hlh0.a(aVar7, dVarC3, cVar2);
                            d dVarI2 = j.i(j.g(aVar4, 1.0f), 42.0f);
                            aiv aivVarC = g75.c(ht.a.e, false);
                            int iHashCode4 = Long.hashCode(aVar7.m());
                            ne00 ne00VarO4 = aVar7.o();
                            d dVarC4 = c.c(aVar7, dVarI2);
                            if (aVar7.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar7.D();
                            if (aVar7.g()) {
                                aVar7.F(aVar8);
                            } else {
                                aVar7.p();
                            }
                            hlh0.a(aVar7, aivVarC, bVar2);
                            hlh0.a(aVar7, ne00VarO4, dVar2);
                            if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode4))) {
                                j3c.a(iHashCode4, aVar7, iHashCode4, c1350a2);
                            }
                            hlh0.a(aVar7, dVarC4, cVar2);
                            lkf0.d(cb40.a(R.string.bet_history__combo_details, new Object[0], aVar7), null, ((lib0) aVar7.O(qyd0Var)).c, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar7.O(qyd0Var2)).h, aVar7, 0, 0, 131066);
                            aVar7 = aVar7;
                            aVar7.s();
                            aVar7.N(-991305064);
                            Iterator<rmo> it = qcnVar2.iterator();
                            while (it.hasNext()) {
                                qmo.b(it.next(), aVar7, 0);
                            }
                            aVar7.H();
                            aVar7.s();
                            Unit unit2 = Unit.a;
                            aVar7.H();
                        }
                        aVar7.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            nno nnoVar = nmoVar.a;
            if (nnoVar == null) {
                bVarI.N(-1299240370);
                bVarI.X(false);
                unit = null;
            } else {
                bVarI.N(-1299240369);
                mno.b(nnoVar, function1, op8VarB, bVarI, (i2 & 112) | 384);
                bVarI.X(false);
                unit = Unit.a;
            }
            if (unit == null) {
                bVarI.N(-1427381704);
                op8VarB.invoke(bVarI, 6);
            } else {
                bVarI.N(-1427385114);
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function0, function3, i) { // from class: lmo
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    mmo.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
