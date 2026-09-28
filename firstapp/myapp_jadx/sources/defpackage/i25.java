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
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i25 {
    public static final void a(final j25 j25Var, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(-2067259095);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(j25Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            long jA = c68.a(j25Var.l, bVarI);
            d dVarE = g3w.e(j.g(d.a.b, 1.0f), j25Var.i, null, 2);
            qyd0 qyd0Var = ejb0.a;
            d dVarJ = h.j(h.h(dVarE, ((cjb0) bVarI.O(qyd0Var)).e, 0.0f, 2), 0.0f, ((cjb0) bVarI.O(qyd0Var)).h, 0.0f, ((cjb0) bVarI.O(qyd0Var)).d, 5);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
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
            lkf0.d(j25Var.f.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, jA, null, 0L, null, t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVarI, 1572864, 0, 131002);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: f25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    i25.a(j25Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final yik yikVar, final Function0 function0, d dVar, a aVar, final int i) {
        int i2;
        final d dVar2;
        b bVarI = aVar.i(1077343278);
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
            UiText uiText = yikVar.a;
            uiText.getClass();
            String strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            alb0 alb0Var = sya.e;
            ak5 ak5VarA = sya.a(jA, jA2, jA, jA2, bVarI, 24576, 0);
            boolean z = yikVar.d;
            int i4 = ((i3 >> 6) & 14) | ((i3 << 24) & 1879048192);
            dVar2 = d.a.b;
            xya.a(dVar2, z, strG, null, alb0Var, ak5VarA, null, null, null, function0, bVarI, i4, 456);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: h25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    i25.b(yikVar, function0, dVar2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final j25 j25Var, final Function1 function1, final d dVar, a aVar, final int i) {
        function1.getClass();
        b bVarI = aVar.i(-1075160164);
        int i2 = (bVarI.M(j25Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | 384;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(j.g(aVar2, 1.0f), 0.0f, 8.0f, 1);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                objY = new Function0() { // from class: d25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(j25Var.n);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d(j25Var, (Function0) objY, bVarI, i3);
            a(j25Var, bVarI, i3);
            bVarI.X(true);
            dVar = aVar2;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, dVar, i) { // from class: e25
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ d c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    i25.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(j25 j25Var, Function0<Unit> function0, a aVar, int i) {
        int i2;
        b bVar;
        j58 j58Var;
        Object obj = function0;
        obj.getClass();
        b bVarI = aVar.i(-787685091);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(j25Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(obj) ? 32 : 16;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Integer num = j25Var.h;
            if (num == null) {
                bVarI.N(1774896043);
                bVarI.X(false);
                j58Var = null;
            } else {
                bVarI.N(1774896044);
                long jA = c68.a(num.intValue(), bVarI);
                bVarI.X(false);
                j58Var = new j58(jA);
            }
            long jA2 = c68.a(j25Var.j, bVarI);
            d.a aVar2 = d.a.b;
            d dVarE = g3w.e(j.g(aVar2, 1.0f), j25Var.g, j58Var, 0);
            qyd0 qyd0Var = ejb0.a;
            d dVarJ = h.j(h.h(dVarE, ((cjb0) bVarI.O(qyd0Var)).e, 0.0f, 2), 0.0f, ((cjb0) bVarI.O(qyd0Var)).f, 0.0f, 30.0f, 5);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC2, cVar, 1.0f, true);
            n54.a aVar4 = ht.a.m;
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, layoutWeightElementA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            ResourceUiText resourceUiText = j25Var.b;
            qyd0 qyd0Var2 = AndroidCompositionLocals_androidKt.b;
            String strG = resourceUiText.g((Context) bVarI.O(qyd0Var2));
            qyd0 qyd0Var3 = kjb0.a;
            lkf0.d(strG, null, jA2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var3)).o, bVarI, 0, 0, 131066);
            ty0.a(bVarI, j.i(aVar2, 4.0f));
            lkf0.d(j25Var.c.g((Context) bVarI.O(qyd0Var2)), null, jA2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0(0L, mla.m(24.0f, bVarI), t9i.E, null, f8i.b, 0L, null, null, 0, 0L, null, null, 16777177), bVarI, 0, 0, 131066);
            bVarI.X(true);
            i78 i78VarA2 = g78.a(kVar, ht.a.o, bVarI, 48);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            b(j25Var.e, function0, null, bVarI, i3 & 112);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            obj = function0;
            lkf0.d(j25Var.d.g((Context) bVarI.O(qyd0Var2)), null, jA2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var3)).o, bVarI, 0, 0, 131066);
            bVar = bVarI;
            f30.a(bVar, true, true, true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new g25(j25Var, i, 0, obj);
        }
    }
}
