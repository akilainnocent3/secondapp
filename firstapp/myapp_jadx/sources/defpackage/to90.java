package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class to90 {

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
        public final /* synthetic */ int b;
        public final /* synthetic */ Function2 c;

        public b(int i, List list, Function2 function2) {
            this.a = list;
            this.b = i;
            this.c = function2;
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
                ao90 ao90Var = (ao90) this.a.get(iIntValue);
                aVar2.N(-769820635);
                yn90.c(ao90Var, iIntValue == this.b, this.c, null, null, aVar2, 0, 24);
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static final void a(final uo90 uo90Var, final Function1<? super zji, Unit> function1, final Function0<Unit> function0, final Function1<? super ucn<String>, Unit> function2, final Function1<? super String, Unit> function3, final Function1<? super String, Unit> function4, Function2<? super String, ? super String, Unit> function5, Function0<Unit> function6, androidx.compose.runtime.a aVar, final int i) {
        Function0<Unit> function7;
        int i2;
        Unit unit;
        d.a aVar2;
        float f;
        final Function2<? super String, ? super String, Unit> function8 = function5;
        function1.getClass();
        function0.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function8.getClass();
        function6.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-182126914);
        int i3 = i | (bVarI.M(uo90Var) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536) | (bVarI.A(function8) ? 1048576 : 524288) | (bVarI.A(function6) ? 8388608 : 4194304);
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            d.a aVar3 = d.a.b;
            d dVarE = j.e(aVar3, 1.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarB = androidx.compose.foundation.a.b(dVarE, ((lib0) bVarI.O(qyd0Var)).i0, zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            mki.a(uo90Var.a, function1, function0, bVarI, i3 & 1008);
            c(uo90Var.b, uo90Var.c, function2, bVarI, (i3 >> 3) & 896);
            uo90.b bVar = uo90Var.d;
            if (bVar == null) {
                bVarI.N(311682768);
                i2 = 0;
                bVarI.X(false);
                unit = null;
            } else {
                i2 = 0;
                bVarI.N(311682769);
                b(bVar, function3, function4, bVarI, (i3 >> 9) & 1008);
                bVarI.X(false);
                unit = Unit.a;
            }
            if (unit == null) {
                bVarI.N(-1929600219);
                aVar2 = aVar3;
                f = 1.0f;
                ute.b(h.h(aVar3, 10.0f, 0.0f, 2), ((qhb0) bVarI.O(shb0.a)).a, ((lib0) bVarI.O(qyd0Var)).A, bVarI, 6, 0);
                bVarI.X(i2);
            } else {
                aVar2 = aVar3;
                f = 1.0f;
                bVarI.N(-1929609085);
                bVarI.X(i2);
            }
            d dVarA = zqu.a(f, j.g(aVar2, f), true);
            int i4 = ((i3 & 3670016) == 1048576 ? 1 : i2) | ((i3 & 14) != 4 ? i2 : 1);
            Object objY = bVarI.y();
            if (i4 != 0 || objY == androidx.compose.runtime.a.C0041a.a) {
                function8 = function5;
                objY = new Function1() { // from class: mo90
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        qcn<ao90> qcnVar = uo90Var.e;
                        szrVar.d(qcnVar.size(), null, new to90.a(qcnVar), new op8(2039820996, new to90.b(b.j(qcnVar), qcnVar, function8), true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                function8 = function5;
            }
            aur.a(dVarA, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, 0, 510);
            bVarI = bVarI;
            function7 = function6;
            pn90.a(cb40.a(R.string.common_functions__skip, new Object[i2], bVarI), "simulation_settlement_running_skip_button", function7, bVarI, ((i3 >> 15) & 896) | 48);
            bVarI.X(true);
        } else {
            function7 = function6;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function0<Unit> function9 = function7;
            eVarZ.d = new Function2(function1, function0, function2, function3, function4, function8, function9, i) { // from class: no90
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function2 i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    to90.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final uo90.b bVar, Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        j58 j58Var;
        boolean z;
        long jC;
        j58 j58Var2;
        long jC2;
        androidx.compose.runtime.b bVarI = aVar.i(2045910462);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarH = h.h(androidx.compose.foundation.a.b(dVarG, ((lib0) bVarI.O(qyd0Var)).r0, zk40.a), 8.0f, 0.0f, 2);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            crz crzVarA = erz.a(R.drawable.ic__arrow_triangle_right, 0, bVarI);
            d dVarF = h.f(aVar2, 2.0f);
            i060 i060Var = j060.a;
            d dVarA = ls7.a(dVarF, i060Var);
            String str = bVar.b;
            String str2 = bVar.c;
            boolean z2 = str != null;
            int i3 = i2 & 14;
            boolean z3 = ((i2 & 112) == 32) | (i3 == 4 || ((i2 & 8) != 0 && bVarI.A(bVar)));
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z3 || objY == c0042a) {
                objY = new os4(bVar, function1);
                bVarI.r(objY);
            }
            d dVarA2 = p1a.a(j.r(h.f(androidx.compose.foundation.d.d(dVarA, z2, null, null, (Function0) objY, 14), 6.0f), 16.0f), 180.0f);
            if (bVar.b == null) {
                bVarI.N(633939525);
                bVarI.X(false);
                j58Var = null;
            } else {
                bVarI.N(633939526);
                long j = ((lib0) bVarI.O(qyd0Var)).O;
                bVarI.X(false);
                j58Var = new j58(j);
            }
            if (j58Var == null) {
                bVarI.N(2098661780);
                jC = j58.c(0.5f, ((lib0) bVarI.O(qyd0Var)).P);
                z = false;
                bVarI.X(false);
            } else {
                z = false;
                bVarI.N(2098658432);
                bVarI.X(false);
                jC = j58Var.a;
            }
            int i4 = i2;
            h6n.b(crzVarA, "Go to previous ticket", dVarA2, jC, bVarI, 48, 0);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(bVar.a, null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).n, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
            crz crzVarA2 = erz.a(R.drawable.ic__arrow_triangle_right, 0, bVarI);
            d dVarA3 = ls7.a(h.f(aVar2, 2.0f), i060Var);
            boolean z4 = str2 != null;
            boolean z5 = ((i4 & 896) == 256) | (i3 == 4 || ((i4 & 8) != 0 && bVarI.A(bVar)));
            Object objY2 = bVarI.y();
            if (z5 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: oo90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String str3 = bVar.c;
                        if (str3 != null) {
                            function2.invoke(str3);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            d dVarR = j.r(h.f(androidx.compose.foundation.d.d(dVarA3, z4, null, null, (Function0) objY2, 14), 6.0f), 16.0f);
            if (str2 == null) {
                bVarI.N(634857125);
                bVarI.X(false);
                j58Var2 = null;
            } else {
                bVarI.N(634857126);
                long j2 = ((lib0) bVarI.O(qyd0Var)).O;
                bVarI.X(false);
                j58Var2 = new j58(j2);
            }
            if (j58Var2 == null) {
                bVarI.N(2098691380);
                jC2 = j58.c(0.5f, ((lib0) bVarI.O(qyd0Var)).P);
                bVarI.X(false);
            } else {
                bVarI.N(2098688156);
                bVarI.X(false);
                jC2 = j58Var2.a;
            }
            h6n.b(crzVarA2, "Go to next ticket", dVarR, jC2, bVarI, 48, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new iqw(i, 1, function2, bVar, function1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x022e  */
    public static final void c(final UiText uiText, uo90.a aVar, Function1<? super ucn<String>, Unit> function1, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        final uo90.a aVar3;
        final Function1<? super ucn<String>, Unit> function2;
        androidx.compose.runtime.b bVar;
        qyd0 qyd0Var;
        boolean z;
        boolean z2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        d.a aVar4;
        androidx.compose.runtime.b bVar2;
        boolean z3;
        Object objY;
        androidx.compose.runtime.b bVarI = aVar2.i(-1521203309);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(uiText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(aVar) : bVarI.A(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar5 = d.a.b;
            d dVarG = j.g(aVar5, 1.0f);
            qyd0 qyd0Var2 = oib0.a;
            d dVarG2 = h.g(androidx.compose.foundation.a.b(dVarG, ((lib0) bVarI.O(qyd0Var2)).m0, zk40.a), 12.0f, 8.0f);
            kw0.j jVar = kw0.a;
            n54.b bVar3 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar3, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG2);
            yka.k.getClass();
            tsr.a aVar6 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar4);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (uiText == null) {
                bVarI.N(-904261729);
                z = false;
                bVarI.X(false);
                aVar4 = aVar5;
                c0042a = c0042a2;
                qyd0Var = qyd0Var2;
                bVar2 = bVarI;
                z2 = true;
            } else {
                bVarI.N(-904261728);
                Object objY2 = bVarI.y();
                if (objY2 == c0042a2) {
                    objY2 = new po90();
                    bVarI.r(objY2);
                }
                d dVarB = xa80.b(aVar5, false, (Function1) objY2);
                d160 d160VarA2 = b160.a(new kw0.i(4.0f, true, new hw0()), bVar3, bVarI, 54);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarB);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar4);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                qyd0Var = qyd0Var2;
                z = false;
                h6n.b(erz.a(R.drawable.ic__stopwatch, 0, bVarI), "Speed icon", j.r(h.h(aVar5, 0.0f, 6.0f, 1), 20.0f), ((lib0) bVarI.O(qyd0Var2)).O, bVarI, 432, 0);
                z2 = true;
                c0042a = c0042a2;
                aVar4 = aVar5;
                lkf0.d(uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), g3w.h(aVar5, "simulation_settlement_speed_text"), ((lib0) bVarI.O(qyd0Var)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).n, bVarI, 48, 0, 131064);
                bVar2 = bVarI;
                bVar2.X(true);
                Unit unit = Unit.a;
                bVar2.X(false);
            }
            d040.a(1.0f, z2, bVar2);
            boolean z4 = (i2 & 896) == 256 ? z2 : z;
            if ((i2 & 112) != 32) {
                if ((i2 & 64) != 0) {
                    aVar3 = aVar;
                    if (bVar2.A(aVar3)) {
                    }
                } else {
                    aVar3 = aVar;
                }
                z3 = z | z4;
                objY = bVar2.y();
                if (!z3 || objY == c0042a) {
                    function2 = function1;
                    objY = new Function0() { // from class: qo90
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function2.invoke(aVar3.b);
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY);
                } else {
                    function2 = function1;
                }
                androidx.compose.runtime.b bVar5 = bVar2;
                nk5.b((Function0) objY, j.i(aVar4, 32.0f), false, j060.c(2.0f), null, m35.a(((qhb0) bVar2.O(shb0.a)).a, ((lib0) bVar2.O(qyd0Var)).D), null, pp8.b(1874208745, new gaj() { // from class: ro90
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar7 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (aVar7.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            lkf0.d(aVar3.a.g((Context) aVar7.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) aVar7.O(oib0.a)).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar7.O(kjb0.a)).n, aVar7, 0, 0, 131066);
                        } else {
                            aVar7.G();
                        }
                        return Unit.a;
                    }
                }, bVar2), bVar5, 805306416, 436);
                bVar = bVar5;
                bVar.X(z2);
            } else {
                aVar3 = aVar;
            }
            z = z2;
            z3 = z | z4;
            objY = bVar2.y();
            if (z3) {
                function2 = function1;
                objY = new Function0() { // from class: qo90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(aVar3.b);
                        return Unit.a;
                    }
                };
                bVar2.r(objY);
            } else {
                function2 = function1;
                objY = new Function0() { // from class: qo90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(aVar3.b);
                        return Unit.a;
                    }
                };
                bVar2.r(objY);
            }
            androidx.compose.runtime.b bVar6 = bVar2;
            nk5.b((Function0) objY, j.i(aVar4, 32.0f), false, j060.c(2.0f), null, m35.a(((qhb0) bVar2.O(shb0.a)).a, ((lib0) bVar2.O(qyd0Var)).D), null, pp8.b(1874208745, new gaj() { // from class: ro90
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar7 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar7.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        lkf0.d(aVar3.a.g((Context) aVar7.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) aVar7.O(oib0.a)).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar7.O(kjb0.a)).n, aVar7, 0, 0, 131066);
                    } else {
                        aVar7.G();
                    }
                    return Unit.a;
                }
            }, bVar2), bVar6, 805306416, 436);
            bVar = bVar6;
            bVar.X(z2);
        } else {
            aVar3 = aVar;
            function2 = function1;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: so90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    to90.c(uiText, aVar3, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
