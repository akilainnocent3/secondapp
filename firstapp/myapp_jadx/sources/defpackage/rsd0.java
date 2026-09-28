package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class rsd0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(d dVar, final tsd0 tsd0Var, final Function1 function1, final Function1 function2, final Function0 function0, final Function0 function3, final Function1 function4, a aVar, final int i) {
        tsd0Var.getClass();
        boolean z = tsd0Var.c;
        b bVarI = aVar.i(397739591);
        int i2 = i | 6 | (bVarI.M(tsd0Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function3) ? 131072 : 65536) | (bVarI.A(function4) ? 1048576 : 524288);
        int i3 = 1;
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            qyd0 qyd0Var = kna.h;
            mmd mmdVar = (mmd) bVarI.O(qyd0Var);
            boolean zB = bVarI.b(((Boolean) ytwVar.getValue()).booleanValue()) | bVarI.b(z);
            Object objY2 = bVarI.y();
            if (zB || objY2 == c0042a) {
                if (z) {
                    i3 = 3;
                } else if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                    i3 = tsd0Var.b;
                }
                objY2 = k.a(i3);
                bVarI.r(objY2);
            }
            final osw oswVar = (osw) objY2;
            hna.a(qyd0Var.a(new nmd(mmdVar.getDensity(), 1.0f)), pp8.b(1800259975, new Function2() { // from class: esd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    tsd0 tsd0Var2;
                    osw oswVar2;
                    yka.a.d dVar2;
                    final Function1 function5;
                    float f;
                    final ytw ytwVar2;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarG = j.g(aVar3, 1.0f);
                        Object objY3 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (objY3 == c0042a2) {
                            objY3 = new ofx(1);
                            aVar2.r(objY3);
                        }
                        d dVarB = xa80.b(dVarG, false, (Function1) objY3);
                        kw0.k kVar = kw0.c;
                        n54.a aVar4 = ht.a.m;
                        i78 i78VarA = g78.a(kVar, aVar4, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
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
                        yka.a.d dVar3 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar3);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        tsd0 tsd0Var3 = tsd0Var;
                        int i4 = tsd0Var3.a;
                        final osw oswVar3 = oswVar;
                        ytw ytwVar3 = ytwVar;
                        if (i4 != 1) {
                            aVar2.N(-1619627345);
                            qcn<rkd0> qcnVar = tsd0Var3.d;
                            int i5 = tsd0Var3.a;
                            int iD = oswVar3.D();
                            Function1 function6 = function1;
                            boolean zM = aVar2.M(function6);
                            Object objY4 = aVar2.y();
                            if (zM || objY4 == c0042a2) {
                                objY4 = new qsd0(ytwVar3, function6);
                                aVar2.r(objY4);
                            }
                            Function1 function7 = (Function1) objY4;
                            boolean zM2 = aVar2.M(oswVar3);
                            Object objY5 = aVar2.y();
                            if (zM2 || objY5 == c0042a2) {
                                objY5 = new Function1() { // from class: hsd0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        int i6;
                                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                        if (zBooleanValue) {
                                            i6 = zBooleanValue ? 2 : 3;
                                        } else {
                                            i6 = 1;
                                        }
                                        oswVar3.k(i6);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY5);
                            }
                            dVar2 = dVar3;
                            oswVar2 = oswVar3;
                            tsd0Var2 = tsd0Var3;
                            mj30.a(qcnVar, i5, iD, function7, (Function1) objY5, aVar2, 0);
                            aVar2 = aVar2;
                            aVar2.H();
                        } else {
                            tsd0Var2 = tsd0Var3;
                            oswVar2 = oswVar3;
                            dVar2 = dVar3;
                            aVar2.N(-1618918127);
                            aVar2.H();
                        }
                        d dVarI = j.i(j.g(aVar3, 1.0f), 74.0f);
                        kw0.j jVar = kw0.a;
                        n54.b bVar2 = ht.a.j;
                        d160 d160VarA = b160.a(jVar, bVar2, aVar2, 0);
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
                        hlh0.a(aVar2, d160VarA, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar2);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        f160 f160Var = f160.a;
                        d dVarC3 = j.c(f160Var.a(4.0f, aVar3, true), 1.0f);
                        long jA = c68.a(R.color.bg_inverse_secondary, aVar2);
                        zk40.a aVar6 = zk40.a;
                        d dVarB2 = androidx.compose.foundation.a.b(dVarC3, jA, aVar6);
                        i78 i78VarA2 = g78.a(kVar, aVar4, aVar2, 0);
                        int iHashCode3 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO3 = aVar2.o();
                        d dVarC4 = c.c(aVar2, dVarB2);
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
                        hlh0.a(aVar2, ne00VarO3, dVar2);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar2, iHashCode3, c1350a);
                        }
                        hlh0.a(aVar2, dVarC4, cVar);
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        d160 d160VarA2 = b160.a(jVar, bVar2, aVar2, 0);
                        int iHashCode4 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO4 = aVar2.o();
                        d dVarC5 = c.c(aVar2, layoutWeightElement);
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
                        hlh0.a(aVar2, d160VarA2, bVar);
                        hlh0.a(aVar2, ne00VarO4, dVar2);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode4))) {
                            j3c.a(iHashCode4, aVar2, iHashCode4, c1350a);
                        }
                        hlh0.a(aVar2, dVarC5, cVar);
                        aVar2.N(194653960);
                        Iterator it = kotlin.collections.b.k("1", "2", "3", "4", "5", "6").iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            function5 = function2;
                            if (!zHasNext) {
                                break;
                            }
                            final String str = (String) it.next();
                            boolean zM3 = aVar2.M(function5) | aVar2.M(str);
                            Object objY6 = aVar2.y();
                            a.C0041a.C0042a c0042a3 = c0042a2;
                            if (zM3 || objY6 == c0042a3) {
                                ytwVar2 = ytwVar3;
                                objY6 = new Function0() { // from class: jsd0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ytwVar2.setValue(Boolean.TRUE);
                                        function5.invoke(str);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY6);
                            } else {
                                ytwVar2 = ytwVar3;
                            }
                            Iterator it2 = it;
                            ulp.a(0, aVar2, g3w.h(f160Var.a(1.0f, aVar3, true), "stake_keyboard_key_" + str + "_button"), str, (Function0) objY6);
                            c0042a2 = c0042a3;
                            it = it2;
                            ytwVar3 = ytwVar2;
                        }
                        final ytw ytwVar4 = ytwVar3;
                        a.C0041a.C0042a c0042a4 = c0042a2;
                        aVar2.H();
                        final Function0 function8 = function0;
                        boolean zM4 = aVar2.M(function8);
                        Object objY7 = aVar2.y();
                        if (zM4 || objY7 == c0042a4) {
                            objY7 = new Function0() { // from class: ksd0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ytwVar4.setValue(Boolean.TRUE);
                                    function8.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY7);
                        }
                        a aVar7 = aVar2;
                        c6n.a((Function0) objY7, g3w.h(j.c(f160Var.a(2.0f, aVar3, true), 1.0f), "stake_keyboard_delete_button"), false, null, null, su9.a, aVar7, 1572864, 60);
                        aVar7.s();
                        ute.b(null, 1.0f, c68.a(R.color.line_type1_secondary, aVar7), aVar7, 48, 1);
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        d160 d160VarA3 = b160.a(jVar, bVar2, aVar7, 0);
                        int iHashCode5 = Long.hashCode(aVar7.m());
                        ne00 ne00VarO5 = aVar7.o();
                        d dVarC6 = c.c(aVar7, layoutWeightElement2);
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
                        hlh0.a(aVar7, d160VarA3, yka.a.f);
                        hlh0.a(aVar7, ne00VarO5, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode5))) {
                            j3c.a(iHashCode5, aVar7, iHashCode5, c1350a2);
                        }
                        hlh0.a(aVar7, dVarC6, yka.a.d);
                        aVar7.N(1877732497);
                        for (final String str2 : kotlin.collections.b.k("7", QQWMbKFOuTf.MPFacIbgulpH, "9", "0", ".", CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS)) {
                            boolean zM5 = aVar7.M(function5) | aVar7.M(str2);
                            Object objY8 = aVar7.y();
                            if (zM5 || objY8 == c0042a4) {
                                objY8 = new Function0() { // from class: msd0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ytwVar4.setValue(Boolean.TRUE);
                                        function5.invoke(str2);
                                        return Unit.a;
                                    }
                                };
                                aVar7.r(objY8);
                            }
                            ulp.a(0, aVar7, g3w.h(f160Var.a(1.0f, aVar3, true), "stake_keyboard_key_" + str2 + "_button"), str2, (Function0) objY8);
                        }
                        aVar7.H();
                        final Function0 function9 = function3;
                        boolean zM6 = aVar7.M(function9);
                        Object objY9 = aVar7.y();
                        if (zM6 || objY9 == c0042a4) {
                            objY9 = new Function0() { // from class: nsd0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ytwVar4.setValue(Boolean.TRUE);
                                    function9.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar7.r(objY9);
                        }
                        nk5.c((Function0) objY9, g3w.h(j.c(f160Var.a(2.0f, aVar3, true), 1.0f), "stake_keyboard_clear_button"), false, null, null, null, null, null, su9.b, aVar7, 805306368, 508);
                        aVar7.s();
                        if (tsd0Var2.a != 1) {
                            aVar7.N(-104278666);
                            ute.b(null, 1.0f, c68.a(R.color.line_type1_secondary, aVar7), aVar7, 48, 1);
                            f = 1.0f;
                            aVar7.H();
                        } else {
                            f = 1.0f;
                            aVar7.N(-104082901);
                            aVar7.H();
                        }
                        aVar7.s();
                        d dVarB3 = androidx.compose.foundation.a.b(j.c(f160Var.a(1.0f, aVar3, true), 1.0f), c68.a(R.color.bg_brand_sub_primary_d_base, aVar7), aVar6);
                        final Function1 function10 = function4;
                        final osw oswVar4 = oswVar2;
                        boolean zM7 = aVar7.M(function10) | aVar7.M(oswVar4);
                        Object objY10 = aVar7.y();
                        if (zM7 || objY10 == c0042a4) {
                            objY10 = new Function0() { // from class: osd0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function10.invoke(Integer.valueOf(oswVar4.D()));
                                    return Unit.a;
                                }
                            };
                            aVar7.r(objY10);
                        }
                        d dVarH = g3w.h(androidx.compose.foundation.d.d(dVarB3, false, null, null, mla.d((Function0) objY10, aVar7, 0), 15), "stake_keyboard_done_button");
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode6 = Long.hashCode(aVar7.m());
                        ne00 ne00VarO6 = aVar7.o();
                        d dVarC7 = c.c(aVar7, dVarH);
                        yka.k.getClass();
                        tsr.a aVar9 = yka.a.b;
                        if (aVar7.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar7.D();
                        if (aVar7.g()) {
                            aVar7.F(aVar9);
                        } else {
                            aVar7.p();
                        }
                        hlh0.a(aVar7, aivVarC, yka.a.f);
                        hlh0.a(aVar7, ne00VarO6, yka.a.e);
                        yka.a.C1350a c1350a3 = yka.a.g;
                        if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode6))) {
                            j3c.a(iHashCode6, aVar7, iHashCode6, c1350a3);
                        }
                        hlh0.a(aVar7, dVarC7, yka.a.d);
                        lkf0.d(cb40.a(R.string.common_functions__done, new Object[0], aVar7), null, j58.f, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar7, 384, 0, 262138);
                        ute.b(androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.h), f, c68.a(R.color.line_type1_secondary, aVar7), aVar7, 48, 0);
                        aVar7.s();
                        aVar7.s();
                        aVar7.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
            dVar = d.a.b;
        } else {
            bVarI.G();
        }
        final d dVar2 = dVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(tsd0Var, function1, function2, function0, function3, function4, i) { // from class: fsd0
                public final /* synthetic */ tsd0 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function1 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rsd0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
