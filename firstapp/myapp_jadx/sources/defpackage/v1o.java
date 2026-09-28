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
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v1o {
    public static final void a(w1o w1oVar, final Function1<? super jxo, Unit> function1, final int i, final float f, a aVar, final int i2) {
        w1o w1oVar2;
        long jA;
        yka.a.C1350a c1350a;
        tsr.a aVar2;
        yka.a.d dVar;
        boolean z;
        boolean z2;
        yka.a.b bVar;
        tsr.a aVar3;
        n54 n54Var;
        d.a aVar4;
        int i3;
        int i4;
        boolean z3;
        w1oVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-110625256);
        int i5 = i2 | (bVarI.A(w1oVar) ? 4 : 2) | (bVarI.d(i) ? 256 : 128) | (bVarI.c(f) ? 2048 : 1024);
        if (bVarI.q(i5 & 1, (i5 & 1171) != 1170)) {
            w1o.b bVar2 = w1oVar.a;
            if (bVar2 != null) {
                bVarI.N(-1396849366);
                jA = c68.a(bVar2.a, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-1396780887);
                bVarI.X(false);
                jA = j58.m;
            }
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new ra5(1);
                bVarI.r(objY);
            }
            d.a aVar5 = d.a.b;
            d dVarB = xa80.b(aVar5, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar6 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar3);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarB2 = j.b(j.g(androidx.compose.foundation.a.b(aVar5, jA, zk40.a), 1.0f), 0.0f, 27.0f, 1);
            d160 d160VarA = b160.a(kw0.b, ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarB3 = j.b(aVar5, bVar2 != null ? 80.0f : 72.0f, 0.0f, 2);
            kw0.j jVar = kw0.a;
            n54.b bVar4 = ht.a.j;
            d160 d160VarA2 = b160.a(jVar, bVar4, bVarI, 0);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarB3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            if (bVar2 == null) {
                bVarI.N(1479537076);
                bVarI.X(false);
                bVar = bVar3;
                z = false;
                dVar = dVar2;
                c1350a = c1350a2;
                z2 = true;
                aVar2 = aVar6;
            } else {
                bVarI.N(1479537077);
                crz crzVarA = erz.a(bVar2.b, 0, bVarI);
                d dVarH = g3w.h(j.r(h.j(aVar5, 12.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), bVar2.c);
                c1350a = c1350a2;
                aVar2 = aVar6;
                dVar = dVar2;
                z = false;
                z2 = true;
                bVar = bVar3;
                h9n.a(crzVarA, "Hit result image", dVarH, null, null, 0.0f, null, bVarI, 48, 120);
                Unit unit = Unit.a;
                bVarI.X(false);
            }
            d dVarJ = h.j(aVar5, bVar2 != null ? 4.0f : 16.0f, 0.0f, 0.0f, 0.0f, 14);
            n54 n54Var2 = ht.a.e;
            aiv aivVarC = g75.c(n54Var2, z);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            tsr.a aVar7 = aVar2;
            boolean z4 = z2;
            lkf0.d(w1oVar.b.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
            bVarI.X(z4);
            bVarI.X(z4);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z4);
            aiv aivVarC2 = g75.c(n54Var2, false);
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                aVar3 = aVar7;
                bVarI.F(aVar3);
            } else {
                aVar3 = aVar7;
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            tsr.a aVar8 = aVar3;
            lkf0.d(w1oVar.c, null, c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
            b bVar5 = bVarI;
            bVar5.X(z4);
            n54 n54Var3 = ht.a.f;
            aiv aivVarC3 = g75.c(n54Var3, false);
            int iHashCode6 = Long.hashCode(bVar5.T);
            ne00 ne00VarS6 = bVar5.S();
            d dVarC6 = c.c(bVar5, aVar5);
            bVar5.D();
            if (bVar5.S) {
                bVar5.F(aVar8);
            } else {
                bVar5.p();
            }
            hlh0.a(bVar5, aivVarC3, bVar);
            hlh0.a(bVar5, ne00VarS6, dVar);
            if (bVar5.S || !Intrinsics.g(bVar5.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVar5, iHashCode6, c1350a);
            }
            hlh0.a(bVar5, dVarC6, cVar);
            ty0.a(bVar5, j.i(j.w(aVar5, mla.f(i, bVar5)), 20.0f));
            Object objY2 = bVar5.y();
            if (objY2 == c0042a) {
                objY2 = new Function1() { // from class: t1o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        urr urrVar = (urr) obj;
                        urrVar.getClass();
                        function1.invoke(new jxo(urrVar.a()));
                        return Unit.a;
                    }
                };
                bVar5.r(objY2);
            }
            d dVarA = v.a(aVar5, (Function1) objY2);
            d160 d160VarA3 = b160.a(new kw0.i(8.0f, z4, new hw0()), bVar4, bVar5, 6);
            int iHashCode7 = Long.hashCode(bVar5.T);
            ne00 ne00VarS7 = bVar5.S();
            d dVarC7 = c.c(bVar5, dVarA);
            bVar5.D();
            if (bVar5.S) {
                bVar5.F(aVar8);
            } else {
                bVar5.p();
            }
            hlh0.a(bVar5, d160VarA3, bVar);
            hlh0.a(bVar5, ne00VarS7, dVar);
            if (bVar5.S || !Intrinsics.g(bVar5.y(), Integer.valueOf(iHashCode7))) {
                n30.a(iHashCode7, bVar5, iHashCode7, c1350a);
            }
            hlh0.a(bVar5, dVarC7, cVar);
            w1o.a aVar9 = w1oVar.d;
            if (aVar9 instanceof w1o.a.C1233a) {
                bVar5.N(1056879187);
                aiv aivVarC4 = g75.c(n54Var3, false);
                int iHashCode8 = Long.hashCode(bVar5.T);
                ne00 ne00VarS8 = bVar5.S();
                d dVarC8 = c.c(bVar5, aVar5);
                bVar5.D();
                if (bVar5.S) {
                    bVar5.F(aVar8);
                } else {
                    bVar5.p();
                }
                hlh0.a(bVar5, aivVarC4, bVar);
                hlh0.a(bVar5, ne00VarS8, dVar);
                if (bVar5.S || !Intrinsics.g(bVar5.y(), Integer.valueOf(iHashCode8))) {
                    n30.a(iHashCode8, bVar5, iHashCode8, c1350a);
                }
                hlh0.a(bVar5, dVarC8, cVar);
                String str = ((w1o.a.C1233a) aVar9).a;
                i3 = R.color.text_secondary;
                long jA2 = c68.a(R.color.text_secondary, bVar5);
                i4 = R.style.B2_R;
                w1oVar2 = w1oVar;
                n54Var = n54Var3;
                aVar4 = aVar5;
                lkf0.d(str, null, jA2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 0, 0, 131066);
                bVar5 = bVar5;
                bVar5.X(true);
                z3 = false;
                bVar5.X(false);
            } else {
                n54Var = n54Var3;
                w1oVar2 = w1oVar;
                aVar4 = aVar5;
                i3 = R.color.text_secondary;
                i4 = R.style.B2_R;
                if (!(aVar9 instanceof w1o.a.b)) {
                    throw igf0.a(bVar5, -2044119725, false);
                }
                bVar5.N(1057391183);
                Iterator<String> it = ((w1o.a.b) aVar9).a.iterator();
                while (it.hasNext()) {
                    mw90.a(it.next(), "Number image", j.r(aVar4, 18.0f), null, null, null, null, bVar5, 432, 2040);
                }
                z3 = false;
                bVar5.X(false);
            }
            bVar5.X(true);
            bVar5.X(true);
            d dVarW = j.w(h.j(aVar4, 12.0f, 0.0f, 16.0f, 0.0f, 10), f);
            aiv aivVarC5 = g75.c(n54Var, z3);
            int iHashCode9 = Long.hashCode(bVar5.T);
            ne00 ne00VarS9 = bVar5.S();
            d dVarC9 = c.c(bVar5, dVarW);
            yka.k.getClass();
            tsr.a aVar10 = yka.a.b;
            bVar5.D();
            if (bVar5.S) {
                bVar5.F(aVar10);
            } else {
                bVar5.p();
            }
            hlh0.a(bVar5, aivVarC5, yka.a.f);
            hlh0.a(bVar5, ne00VarS9, yka.a.e);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVar5.S || !Intrinsics.g(bVar5.y(), Integer.valueOf(iHashCode9))) {
                n30.a(iHashCode9, bVar5, iHashCode9, c1350a3);
            }
            hlh0.a(bVar5, dVarC9, yka.a.d);
            b bVar6 = bVar5;
            lkf0.d(w1oVar2.e, null, c68.a(i3, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(i4, bVar5), bVar6, 0, 0, 131066);
            bVarI = bVar6;
            bVarI.X(true);
            bVarI.X(true);
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
            bVarI.X(true);
        } else {
            w1oVar2 = w1oVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final w1o w1oVar3 = w1oVar2;
            eVarZ.d = new Function2(function1, i, f, i2) { // from class: u1o
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ float d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(57);
                    v1o.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
