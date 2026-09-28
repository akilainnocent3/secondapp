package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wv7 {
    public static final void a(final String str, zv7 zv7Var, a aVar, final int i) {
        final zv7 zv7Var2;
        zv7 zv7Var3;
        int i2;
        str.getClass();
        b bVarI = aVar.i(491521729);
        int i3 = (bVarI.M(str) ? 4 : 2) | i | 16;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    zv7Var3 = (zv7) p8i0.a(jq40.a(zv7.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                    i2 = i3 & (-113);
                }
            } else {
                bVarI.G();
                i2 = i3 & (-113);
                zv7Var3 = zv7Var;
            }
            bVarI.Y();
            boolean zA = bVarI.A(zv7Var3) | ((i2 & 14) == 4);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new uv7(zv7Var3, str, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, str, (Function2) objY);
            final ytw ytwVarC = wyh.c(zv7Var3.c, bVarI, 0, 7);
            final long jA = c68.a(R.color.border_primary, bVarI);
            zv7Var2 = zv7Var3;
            ihe0.a(h.g(j.g(d.a.b, 1.0f), 16.0f, 10.0f), null, c68.a(R.color.bg_secondary_d_base, bVarI), 0L, 0.0f, 0.0f, m35.a(1.0f, jA), pp8.b(684554204, new Function2() { // from class: rv7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarG = j.g(aVar3, 1.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarG);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
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
                        twd0 twd0Var = ytwVarC;
                        int i4 = ((xv7) twd0Var.getValue()).d;
                        int i5 = ((xv7) twd0Var.getValue()).e;
                        Object objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY2 == c0042a) {
                            objY2 = new tv7();
                            aVar2.r(objY2);
                        }
                        Function0 function0 = (Function0) objY2;
                        zv7 zv7Var4 = zv7Var2;
                        boolean zA2 = aVar2.A(zv7Var4);
                        Object objY3 = aVar2.y();
                        if (zA2 || objY3 == c0042a) {
                            objY3 = new vv7(0, zv7Var4, zv7.class, "onPinClicked", "onPinClicked()Lkotlin/jvm/functions/Function0;", 8);
                            aVar2.r(objY3);
                        }
                        h15.a(str, true, i4, i5, function0, (Function0) objY3, false, aVar2, 12779952, 0);
                        ute.b(null, 0.0f, jA, aVar2, 0, 3);
                        d dVarJ = h.j(j.g(aVar3, 1.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarJ);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        if (((xv7) twd0Var.getValue()).b) {
                            aVar2.N(-1135514234);
                            q330.a(dw.a(androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.e), 0.5f), c68.a(R.color.text_type1_secondary, aVar2), 0.0f, 0L, 0, 0.0f, aVar2, 0, 60);
                            aVar2.H();
                        } else if (((xv7) twd0Var.getValue()).f.isEmpty()) {
                            aVar2.N(-1134915934);
                            aVar2.H();
                        } else {
                            aVar2.N(-1135155223);
                            f980.b(((xv7) twd0Var.getValue()).f, 3, true, aVar2, 432, 0);
                            aVar2.H();
                        }
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 12582918, 58);
            bVarI = bVarI;
        } else {
            bVarI.G();
            zv7Var2 = zv7Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, zv7Var2, i) { // from class: sv7
                public final /* synthetic */ String a;
                public final /* synthetic */ zv7 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wv7.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
