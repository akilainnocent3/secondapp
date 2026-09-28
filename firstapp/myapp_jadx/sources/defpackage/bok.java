package defpackage;

import androidx.compose.animation.e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class bok {
    public static final void a(fok fokVar, final boolean z, float f, final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        yka.a.C1350a c1350a;
        d.a aVar2;
        boolean z2;
        final fok fokVar2 = fokVar;
        final float f2 = f;
        b bVarI = aVar.i(-1303200518);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(fokVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = fokVar2.q;
            boolean z3 = fokVar2.k;
            long jA = c68.a(i3, bVarI);
            long jA2 = c68.a(fokVar2.r, bVarI);
            long jA3 = c68.a(fokVar2.s, bVarI);
            d.a aVar3 = d.a.b;
            d dVarA = e.a(h.j(h.h(g3w.e(j.g(aVar3, 1.0f), fokVar2.o, null, 2), fjb0.d(bVarI).d, 0.0f, 2), 0.0f, fjb0.d(bVarI).f, 0.0f, fjb0.d(bVarI).d, 5));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            lkf0.d(vch0.a(fokVar2.g, bVarI), null, jA, null, 0L, null, t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).i, bVarI, 1572864, 0, 131002);
            b bVar2 = bVarI;
            UiText uiText = fokVar2.h;
            if (uiText == null) {
                bVar2.N(-43649162);
                bVar2.X(false);
            } else {
                bVar2.N(-43649161);
                lkf0.d(tx5.a("(", cb40.a(R.string.gift__exclusive_for, new Object[0], bVar2), " ", vch0.a(uiText, bVar2), ")"), null, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVar2).o, bVar2, 0, 0, 131066);
                bVar2 = bVar2;
                Unit unit = Unit.a;
                bVar2.X(false);
            }
            ty0.a(bVar2, j.i(aVar3, 4.0f));
            kw0.j jVar = kw0.a;
            d160 d160VarA = b160.a(jVar, ht.a.j, bVar2, 48);
            int iHashCode2 = Long.hashCode(bVar2.T);
            ne00 ne00VarS2 = bVar2.S();
            d dVarC2 = c.c(bVar2, aVar3);
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar4);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, d160VarA, bVar);
            hlh0.a(bVar2, ne00VarS2, dVar);
            if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode2))) {
                c1350a = c1350a2;
                n30.a(iHashCode2, bVar2, iHashCode2, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVar2, dVarC2, cVar);
            b bVar3 = bVar2;
            yka.a.C1350a c1350a3 = c1350a;
            lkf0.d(fokVar2.i, new LayoutWeightElement(1.0f, true), fjb0.b(bVar2).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVar2).o, bVar3, 0, 0, 131064);
            bVarI = bVar3;
            if (z3) {
                bVarI.N(-290714234);
                d dVarD = androidx.compose.foundation.d.d(aVar3, false, null, null, function0, 15);
                d160 d160VarA2 = b160.a(jVar, ht.a.k, bVarI, 48);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarD);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a3);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                aVar2 = aVar3;
                lkf0.d(cb40.a(R.string.common_functions__more, new Object[0], bVarI), null, jA2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).o, bVarI, 0, 0, 131066);
                bVarI = bVarI;
                ty0.a(bVarI, j.w(aVar2, 8.0f));
                f2 = f;
                h6n.b(pib0.a(R.drawable.ic__arrow_chevron_down, 0, bVarI), null, p1a.a(j.r(aVar2, 12.0f), f2), jA3, bVarI, 48, 0);
                z2 = true;
                bVarI.X(true);
                bVarI.X(false);
            } else {
                f2 = f;
                aVar2 = aVar3;
                z2 = true;
                bVarI.N(-289887774);
                bVarI.X(false);
            }
            bVarI.X(z2);
            if (z && z3) {
                hnw.a(bVarI, -42067789, aVar2, 4.0f, bVarI);
                fokVar2 = fokVar;
                String str = fokVar2.j;
                if (str == null) {
                    str = "";
                }
                b bVar4 = bVarI;
                lkf0.d(str, null, fjb0.b(bVarI).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).o, bVar4, 0, 0, 131066);
                bVarI = bVar4;
                bVarI.X(false);
            } else {
                fokVar2 = fokVar;
                bVarI.N(-41841954);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: znk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bok.a(fokVar2, z, f2, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final yik yikVar, final Function0 function0, d dVar, a aVar, final int i) {
        int i2;
        final d dVar2;
        b bVarI = aVar.i(-1334332770);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(yikVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            long jA = c68.a(yikVar.b, bVarI);
            long jA2 = c68.a(yikVar.c, bVarI);
            String strA = vch0.a(yikVar.a, bVarI);
            alb0 alb0Var = sya.e;
            ak5 ak5VarA = sya.a(jA, jA2, jA, jA2, bVarI, 24576, 0);
            boolean z = yikVar.d;
            int i4 = ((i3 >> 6) & 14) | ((i3 << 24) & 1879048192);
            dVar2 = d.a.b;
            xya.a(dVar2, z, strA, null, alb0Var, ak5VarA, null, null, null, function0, bVarI, i4, 456);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: aok
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    bok.b(yikVar, function0, dVar2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final fok fokVar, final Function1 function1, d dVar, a aVar, final int i) {
        final d dVar2;
        function1.getClass();
        b bVarI = aVar.i(-1445695123);
        int i2 = (bVarI.M(fokVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | 384;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            twd0 twd0VarB = xe0.b(((Boolean) ytwVar.getValue()).booleanValue() ? 180.0f : 0.0f, null, "arrow_rotation", null, bVarI, 3072, 22);
            dVar2 = d.a.b;
            d dVarH = h.h(j.g(dVar2, 1.0f), 0.0f, 8.0f, 1);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            boolean z = (i2 & 112) == 32;
            int i3 = i2 & 14;
            boolean z2 = z | (i3 == 4);
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: wnk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(fokVar.u);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            d(fokVar, (Function0) objY2, bVarI, i3);
            boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
            float fFloatValue = ((Number) twd0VarB.getValue()).floatValue();
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new ucb(ytwVar, 1);
                bVarI.r(objY3);
            }
            a(fokVar, zBooleanValue, fFloatValue, (Function0) objY3, bVarI, i3 | 3072);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, dVar2, i) { // from class: xnk
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ d c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bok.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(fok fokVar, Function0<Unit> function0, a aVar, int i) {
        int i2;
        fok fokVar2;
        Function0<Unit> function1;
        b bVar;
        int i3;
        j58 j58Var;
        d dVarE;
        long j;
        yka.a.c cVar;
        yka.a.C1350a c1350a;
        tsr.a aVar2;
        yka.a.b bVar2;
        n54.b bVar3;
        yka.a.d dVar;
        d.a aVar3;
        boolean z;
        kw0.k kVar;
        b bVar4;
        yka.a.C1350a c1350a2;
        yka.a.C1350a c1350a3;
        yka.a.b bVar5;
        yka.a.c cVar2;
        float f;
        String str = fokVar.d;
        int i4 = fokVar.m;
        b bVarI = aVar.i(-2024226308);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(fokVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        int i5 = i2;
        if (bVarI.q(i5 & 1, (i5 & 19) != 18)) {
            Integer num = fokVar.n;
            if (num == null) {
                bVarI.N(1909987276);
                bVarI.X(false);
                j58Var = null;
            } else {
                bVarI.N(1909987277);
                long jA = c68.a(num.intValue(), bVarI);
                bVarI.X(false);
                j58Var = new j58(jA);
            }
            long jA2 = c68.a(fokVar.p, bVarI);
            boolean z2 = fokVar.t;
            d.a aVar4 = d.a.b;
            if (z2) {
                bVarI.N(1911264198);
                final crz crzVarA = erz.a(i4, 0, bVarI);
                d dVarA = ls7.a(aVar4, new wna());
                boolean zA = bVarI.A(crzVarA);
                Object objY = bVarI.y();
                if (zA || objY == a.C0041a.a) {
                    objY = new Function1() { // from class: ynk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            crzVarA.g(tcfVar, tcfVar.d(), 1.0f, null);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                dVarE = androidx.compose.ui.draw.a.a(dVarA, (Function1) objY);
                bVarI.X(false);
            } else {
                bVarI.N(1911551351);
                dVarE = g3w.e(aVar4, i4, j58Var, 0);
                bVarI.X(false);
            }
            d dVarN = j.g(aVar4, 1.0f).n(dVarE);
            qyd0 qyd0Var = ejb0.a;
            d dVarG = h.g(dVarN, ((cjb0) bVarI.O(qyd0Var)).e, ((cjb0) bVarI.O(qyd0Var)).f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar6 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar6);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a4 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a4);
            }
            yka.a.c cVar3 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar3);
            kw0.j jVar = kw0.a;
            n54.b bVar7 = ht.a.j;
            d160 d160VarA = b160.a(jVar, bVar7, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar6);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a4);
            }
            LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC2, cVar3, 1.0f, true);
            n54.a aVar6 = ht.a.m;
            kw0.k kVar2 = kw0.c;
            i78 i78VarA = g78.a(kVar2, aVar6, bVarI, 0);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, layoutWeightElementA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar6);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a4);
            }
            hlh0.a(bVarI, dVarC3, cVar3);
            UiText uiText = fokVar.c;
            if (uiText == null) {
                bVarI.N(-1528258630);
                bVarI.X(false);
                bVar4 = bVarI;
                bVar2 = bVar6;
                aVar2 = aVar5;
                cVar = cVar3;
                dVar = dVar2;
                aVar3 = aVar4;
                z = false;
                c1350a = c1350a4;
                kVar = kVar2;
                j = jA2;
                bVar3 = bVar7;
            } else {
                bVarI.N(-1528258629);
                String strA = vch0.a(uiText, bVarI);
                imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).o;
                j = jA2;
                cVar = cVar3;
                c1350a = c1350a4;
                aVar2 = aVar5;
                bVar2 = bVar6;
                bVar3 = bVar7;
                dVar = dVar2;
                aVar3 = aVar4;
                z = false;
                kVar = kVar2;
                lkf0.d(strA, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131066);
                bVar4 = bVarI;
                ty0.a(bVar4, j.i(aVar3, 4.0f));
                Unit unit = Unit.a;
                bVar4.X(false);
            }
            d160 d160VarA2 = b160.a(jVar, bVar3, bVar4, 48);
            int iHashCode4 = Long.hashCode(bVar4.T);
            ne00 ne00VarS4 = bVar4.S();
            d dVarC4 = c.c(bVar4, aVar3);
            bVar4.D();
            if (bVar4.S) {
                bVar4.F(aVar2);
            } else {
                bVar4.p();
            }
            hlh0.a(bVar4, d160VarA2, bVar2);
            hlh0.a(bVar4, ne00VarS4, dVar);
            if (bVar4.S || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode4))) {
                c1350a2 = c1350a;
                n30.a(iHashCode4, bVar4, iHashCode4, c1350a2);
            } else {
                c1350a2 = c1350a;
            }
            yka.a.c cVar4 = cVar;
            hlh0.a(bVar4, dVarC4, cVar4);
            if (StringsKt.U(str)) {
                c1350a3 = c1350a2;
                bVar5 = bVar2;
                cVar2 = cVar4;
                f = 8.0f;
                bVar4.N(-989116894);
                bVar4.X(z);
            } else {
                bVar4.N(-989459010);
                long j2 = j;
                b bVar8 = bVar4;
                bVar5 = bVar2;
                f = 8.0f;
                cVar2 = cVar4;
                c1350a3 = c1350a2;
                lkf0.d(str, null, j2, null, mla.m(12.0f, bVar4), null, t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar8, 1572864, 0, 262058);
                j = j2;
                bVar4 = bVar8;
                dd3.b(aVar3, 8.0f, bVar4, z);
            }
            fokVar2 = fokVar;
            b bVar9 = bVar4;
            lkf0.d(vch0.a(fokVar2.e, bVar4), null, j, null, mla.m(24.0f, bVar4), null, t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar9, 1572864, 0, 262058);
            i3 = 1;
            bVar9.X(true);
            bVar9.X(true);
            i78 i78VarA2 = g78.a(kVar, ht.a.o, bVar9, 48);
            int iHashCode5 = Long.hashCode(bVar9.T);
            ne00 ne00VarS5 = bVar9.S();
            d dVarC5 = c.c(bVar9, aVar3);
            bVar9.D();
            if (bVar9.S) {
                bVar9.F(aVar2);
            } else {
                bVar9.p();
            }
            hlh0.a(bVar9, i78VarA2, bVar5);
            hlh0.a(bVar9, ne00VarS5, dVar);
            if (bVar9.S || !Intrinsics.g(bVar9.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVar9, iHashCode5, c1350a3);
            }
            hlh0.a(bVar9, dVarC5, cVar2);
            b(fokVar2.l, function0, null, bVar9, i5 & 112);
            ty0.a(bVar9, j.i(aVar3, f));
            function1 = function0;
            lkf0.d(vch0.a(fokVar2.f, bVar9), null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVar9.O(kjb0.a)).o, bVar9, 0, 0, 131066);
            bVar = bVar9;
            f30.a(bVar, true, true, true);
        } else {
            fokVar2 = fokVar;
            function1 = function0;
            bVar = bVarI;
            i3 = 1;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new vb2(fokVar2, i, i3, function1);
        }
    }
}
