package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hj40 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(jj40 jj40Var, final Function0 function0, a aVar, final int i) {
        final jj40 jj40Var2;
        b bVar;
        Object obj;
        kw0.k kVar;
        boolean z;
        n54.a aVar2;
        yka.a.C1350a c1350a;
        float f;
        yka.a.b bVar2;
        d.a aVar3;
        int i2;
        b bVar3;
        b bVar4;
        int i3;
        b bVar5;
        jj40Var.getClass();
        b bVarI = aVar.i(-875739312);
        int i4 = i | (bVarI.M(jj40Var) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i4 & 1, (i4 & 19) != 18)) {
            d.a aVar4 = d.a.b;
            d dVarG = j.g(aVar4, 1.0f);
            Object objY = bVarI.y();
            Object obj2 = a.C0041a.a;
            if (objY == obj2) {
                obj = objY;
                Object cj40Var = new cj40();
                bVarI.r(cj40Var);
                obj = cj40Var;
            }
            obj = objY;
            d dVarB = androidx.compose.foundation.a.b(xa80.b(dVarG, false, (Function1) obj), c68.a(R.color.background_general_primary, bVarI), zk40.a);
            boolean z2 = jj40Var instanceof jj40.a;
            boolean z3 = !z2 || ((jj40.a) jj40Var).e;
            boolean z4 = (i4 & 112) == 32;
            Object objY2 = bVarI.y();
            Object obj3 = objY2;
            if (z4 || objY2 == obj2) {
                Object hz3Var = new hz3(function0, 3);
                bVarI.r(hz3Var);
                obj3 = hz3Var;
            }
            d dVarD = androidx.compose.foundation.d.d(dVarB, z3, null, null, (Function0) obj3, 14);
            kw0.k kVar2 = kw0.c;
            n54.a aVar5 = ht.a.m;
            i78 i78VarA = g78.a(kVar2, aVar5, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar6 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            yka.a.b bVar6 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar6);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (jj40Var.a()) {
                bVarI.N(275777932);
                kVar = kVar2;
                f = 1.0f;
                c1350a = c1350a2;
                aVar2 = aVar5;
                z = z2;
                h2f0.a.a(j.g(aVar4, 1.0f), 1.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 3126, 0);
                bVarI.X(false);
            } else {
                kVar = kVar2;
                z = z2;
                aVar2 = aVar5;
                c1350a = c1350a2;
                f = 1.0f;
                bVarI.N(275968520);
                bVarI.X(false);
            }
            d dVarH = h.h(hib0.a(aVar4, 16.0f, bVarI, aVar4, f), jj40Var.b(), 0.0f, 2);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar6);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            o2s o2sVarC = jj40Var.c();
            if (o2sVarC == null) {
                bVarI.N(1930149554);
                bVarI.X(false);
                i2 = 0;
                bVar2 = bVar6;
                aVar3 = aVar4;
                bVar3 = bVarI;
            } else {
                fx90 fx90Var = o2sVarC.b;
                bVarI.N(1930149555);
                bVar2 = bVar6;
                aVar3 = aVar4;
                h9n.a(erz.a(o2sVarC.a, 0, bVarI), null, kj40.b(fx90Var), null, kj40.a(fx90Var), 0.0f, null, bVarI, 48, 104);
                b bVar7 = bVarI;
                ty0.a(bVar7, j.w(aVar3, 8.0f));
                Unit unit = Unit.a;
                i2 = 0;
                bVar7.X(false);
                bVar3 = bVar7;
            }
            kw0.k kVar3 = kVar;
            n54.a aVar7 = aVar2;
            i78 i78VarA2 = g78.a(kVar3, aVar7, bVar3, i2);
            int iHashCode3 = Long.hashCode(bVar3.T);
            ne00 ne00VarS3 = bVar3.S();
            d dVarC3 = c.c(bVar3, aVar3);
            bVar3.D();
            if (bVar3.S) {
                bVar3.F(aVar6);
            } else {
                bVar3.p();
            }
            hlh0.a(bVar3, i78VarA2, bVar2);
            hlh0.a(bVar3, ne00VarS3, dVar);
            if (bVar3.S || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVar3, iHashCode3, c1350a);
            }
            hlh0.a(bVar3, dVarC3, cVar);
            UiText uiTextD = jj40Var.d();
            uiTextD.getClass();
            androidx.compose.runtime.d dVar2 = AndroidCompositionLocals_androidKt.b;
            boolean z5 = i2;
            b bVar8 = bVar3;
            yka.a.C1350a c1350a3 = c1350a;
            yka.a.b bVar9 = bVar2;
            lkf0.e(uiTextD.a((Context) bVar3.O(dVar2)), null, c68.a(R.color.text_type1_primary, bVar3), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mla.l(R.style.H4_B, bVar3), bVar8, 0, 0, 262138);
            b bVar10 = bVar8;
            if (z) {
                bVar10.N(1326436783);
                UiText uiText = ((jj40.a) jj40Var).d;
                if (uiText == null) {
                    bVar10.N(-1830132686);
                    bVar10.X(z5);
                    bVar5 = bVar10;
                } else {
                    hnw.a(bVar10, -1830132685, aVar3, 4.0f, bVar10);
                    lkf0.e(uiText.a((Context) bVar10.O(dVar2)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mla.l(R.style.B2_R, bVar10), bVar10, 0, 0, 262142);
                    b bVar11 = bVar10;
                    Unit unit2 = Unit.a;
                    bVar11.X(z5);
                    bVar5 = bVar11;
                }
                bVar5.X(z5);
                bVar4 = bVar5;
            } else {
                bVar10.N(-1829823646);
                bVar10.X(z5);
                bVar4 = bVar10;
            }
            bVar4.X(true);
            ty0.a(bVar4, new LayoutWeightElement(1.0f, true));
            i78 i78VarA3 = g78.a(kVar3, aVar7, bVar4, z5 ? 1 : 0);
            int iHashCode4 = Long.hashCode(bVar4.T);
            ne00 ne00VarS4 = bVar4.S();
            d dVarC4 = c.c(bVar4, aVar3);
            bVar4.D();
            if (bVar4.S) {
                bVar4.F(aVar6);
            } else {
                bVar4.p();
            }
            hlh0.a(bVar4, i78VarA3, bVar9);
            hlh0.a(bVar4, ne00VarS4, dVar);
            if (bVar4.S || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVar4, iHashCode4, c1350a3);
            }
            hlh0.a(bVar4, dVarC4, cVar);
            if (!z || ((jj40.a) jj40Var).e) {
                bVar4.N(-1815173161);
                if (z) {
                    i3 = R.drawable.arrow_down_16dp;
                    jj40Var2 = jj40Var;
                } else {
                    jj40Var2 = jj40Var;
                    if (!(jj40Var2 instanceof jj40.b)) {
                        uhc.a();
                        return;
                    }
                    i3 = R.drawable.arrow_up_16dp;
                }
                h6n.b(erz.a(i3, z5 ? 1 : 0, bVar4), null, null, c68.a(R.color.text_type1_primary, bVar4), bVar4, 48, 4);
                bVar4.X(z5);
            } else {
                bVar4.N(-1814525447);
                bVar4.X(z5);
                jj40Var2 = jj40Var;
            }
            bVar4.X(true);
            bVar4.X(true);
            ty0.a(bVar4, j.i(aVar3, 16.0f));
            bVar4.X(true);
            bVar = bVar4;
        } else {
            jj40Var2 = jj40Var;
            bVarI.G();
            bVar = bVarI;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, i) { // from class: dj40
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iA = qj40.a(1);
                    hj40.a(this.a, this.b, (a) obj4, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final jj40 jj40Var, final Function0 function0, a aVar, final int i) {
        float f;
        yka.a.d dVar;
        yka.a.b bVar;
        d.a aVar2;
        boolean z;
        float f2;
        jj40Var.getClass();
        b bVarI = aVar.i(983043128);
        int i2 = (bVarI.M(jj40Var) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar3 = d.a.b;
            d dVarG = j.g(aVar3, 1.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new ej40(0);
                bVarI.r(objY);
            }
            d dVarB = androidx.compose.foundation.a.b(xa80.b(dVarG, false, (Function1) objY), c68.a(R.color.background_general_primary, bVarI), zk40.a);
            boolean z2 = jj40Var instanceof jj40.a;
            boolean z3 = (i2 & 112) == 32;
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: fj40
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            d dVarD = androidx.compose.foundation.d.d(dVarB, z2, null, null, (Function0) objY2, 14);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (jj40Var.a()) {
                bVarI.N(-721512456);
                dVar = dVar2;
                f = 1.0f;
                bVar = bVar2;
                h2f0.a.a(j.g(aVar3, 1.0f), 1.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 3126, 0);
                bVarI.X(false);
            } else {
                f = 1.0f;
                dVar = dVar2;
                bVar = bVar2;
                bVarI.N(-721321868);
                bVarI.X(false);
            }
            ty0.a(bVarI, j.i(aVar3, 16.0f));
            n54.b bVar3 = ht.a.k;
            if (z2) {
                bVarI.N(-721139836);
                d dVarH = h.h(j.g(aVar3, f), 20.0f, 0.0f, 2);
                d160 d160VarA = b160.a(kw0.e, bVar3, bVarI, 54);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarH);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                UiText uiText = ((jj40.a) jj40Var).c;
                uiText.getClass();
                aVar2 = aVar3;
                lkf0.e(uiText.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, c68.a(R.color.text_brand_sub_primary_d_base, bVarI), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mla.l(R.style.B1_B, bVarI), bVarI, 0, 0, 262138);
                bVarI = bVarI;
                ty0.a(bVarI, j.w(aVar2, 4.0f));
                h6n.b(erz.a(R.drawable.arrow_down_16dp, 0, bVarI), null, null, c68.a(R.color.icon_brand_sub_primary_d_base, bVarI), bVarI, 48, 4);
                bVarI.X(true);
                bVarI.X(false);
                f2 = 16.0f;
                z = true;
            } else {
                yka.a.b bVar4 = bVar;
                yka.a.d dVar3 = dVar;
                aVar2 = aVar3;
                if (!(jj40Var instanceof jj40.b)) {
                    throw igf0.a(bVarI, 1500756473, false);
                }
                bVarI.N(-720034779);
                d dVarH2 = h.h(j.g(aVar2, f), 20.0f, 0.0f, 2);
                d160 d160VarA2 = b160.a(kw0.a, bVar3, bVarI, 48);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarH2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar4);
                hlh0.a(bVarI, ne00VarS3, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                jj40.b bVar5 = (jj40.b) jj40Var;
                o2s o2sVar = bVar5.b;
                if (o2sVar == null) {
                    bVarI.N(1079658325);
                    bVarI.X(false);
                } else {
                    fx90 fx90Var = o2sVar.b;
                    bVarI.N(1079658326);
                    h9n.a(erz.a(o2sVar.a, 0, bVarI), null, kj40.b(fx90Var), null, kj40.a(fx90Var), 0.0f, null, bVarI, 48, 104);
                    bVarI = bVarI;
                    ty0.a(bVarI, j.w(aVar2, 8.0f));
                    Unit unit = Unit.a;
                    bVarI.X(false);
                }
                UiText uiText2 = bVar5.c;
                uiText2.getClass();
                b bVar6 = bVarI;
                z = true;
                lkf0.e(uiText2.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, c68.a(R.color.text_type1_primary, bVarI), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mla.l(R.style.H4_B, bVarI), bVar6, 0, 0, 262138);
                bVarI = bVar6;
                bVarI.X(true);
                bVarI.X(false);
                f2 = 16.0f;
            }
            iib0.a(aVar2, f2, bVarI, z);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, i) { // from class: gj40
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hj40.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(ComposeView composeView, final jj40 jj40Var, final Function0<Unit> function0) {
        composeView.getClass();
        jj40Var.getClass();
        composeView.setViewCompositionStrategy(u6i0.b.a);
        composeView.setContent(new op8(-1682328375, new Function2() { // from class: bj40
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jj40 jj40Var2 = jj40Var;
                    boolean zE = jj40Var2.e();
                    Function0 function1 = function0;
                    if (zE) {
                        aVar.N(-271206267);
                        hj40.b(jj40Var2, function1, aVar, 0);
                        aVar.H();
                    } else {
                        aVar.N(-271053840);
                        hj40.a(jj40Var2, function1, aVar, 0);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
