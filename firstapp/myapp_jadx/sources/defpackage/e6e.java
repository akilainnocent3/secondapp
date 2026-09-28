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
public final class e6e {
    public static final void a(final d dVar, final Ctry.a aVar, final boolean z, final Function0 function0, a aVar2, final int i) {
        d.a aVar3;
        boolean z2;
        String str = aVar.b;
        function0.getClass();
        b bVarI = aVar2.i(-468843322);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(aVar) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarA = ls7.a(j.g(dVar, 1.0f), j060.c(((zib0) bVarI.O(ajb0.a)).d));
            qyd0 qyd0Var = oib0.a;
            d dVarB = androidx.compose.foundation.a.b(dVarA, ((lib0) bVarI.O(qyd0Var)).m0, zk40.a);
            qyd0 qyd0Var2 = ejb0.a;
            d dVarA2 = androidx.compose.ui.platform.d.a(h.f(dVarB, ((cjb0) bVarI.O(qyd0Var2)).e), "deposit_bank_boost_your_balance_title");
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA2);
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
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d160 d160VarA = b160.a(new kw0.i(((cjb0) bVarI.O(qyd0Var2)).d, true, new hw0()), ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d.a aVar5 = d.a.b;
            d dVarC2 = c.c(bVarI, aVar5);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            c(aVar.a, bVarI, 0);
            if (str.length() > 0) {
                bVarI.N(2111818478);
                aVar3 = aVar5;
                z2 = true;
                lkf0.d(str, null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ijb0) bVarI.O(kjb0.a)).f, bVarI, 0, 24960, 110586);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                aVar3 = aVar5;
                z2 = true;
                bVarI.N(2112066850);
                bVarI.X(false);
            }
            bVarI.X(z2);
            b(androidx.compose.ui.platform.d.a(aVar3, "deposit_bank_boost_your_balance_description"), aVar, z, function0, bVarI, (i2 & 112) | 6 | (i2 & 896) | (i2 & 7168));
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(aVar, z, function0, i) { // from class: a6e
                public final /* synthetic */ Ctry.a b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    e6e.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final Ctry.a aVar, final boolean z, final Function0 function0, a aVar2, final int i) {
        final d dVar2;
        int i2;
        b bVar;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        b bVarI = aVar2.i(-2099104226);
        if ((i & 6) == 0) {
            dVar2 = dVar;
            i2 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(aVar) : bVarI.A(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            String str = aVar.c;
            if (str.length() != 0 || z) {
                String str2 = aVar.d;
                bVarI.N(1395477693);
                nk0.b bVar2 = new nk0.b((Object) null);
                qyd0 qyd0Var = oib0.a;
                int iL = bVar2.l(new ora0(((lib0) bVarI.O(qyd0Var)).a, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                try {
                    bVar2.g(str);
                    Unit unit = Unit.a;
                    bVar2.i(iL);
                    if (!z || str2.length() <= 0) {
                        bVarI.N(575864847);
                        bVarI.X(false);
                    } else {
                        bVarI.N(575652466);
                        if (str.length() > 0) {
                            bVar2.g(" ");
                        }
                        int iL2 = bVar2.l(new ora0(((lib0) bVarI.O(qyd0Var)).b, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                        try {
                            bVar2.g(str2);
                            bVar2.i(iL2);
                            bVarI.X(false);
                        } catch (Throwable th) {
                            bVar2.i(iL2);
                            throw th;
                        }
                    }
                    nk0 nk0VarM = bVar2.m();
                    bVarI.X(false);
                    imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).p;
                    d dVarG = j.g(h.j(dVar, ((cjb0) bVarI.O(ejb0.a)).i, 0.0f, 0.0f, 0.0f, 14), 1.0f);
                    d dVarA = d.a.b;
                    if (z) {
                        dVarA = androidx.compose.ui.platform.d.a(androidx.compose.foundation.d.d(dVarA, false, null, null, function0, 15), "deposit_bank_you_have_saved_learn_more_button");
                    }
                    bVar = bVarI;
                    lkf0.e(nk0VarM, dVarG.n(dVarA), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, null, imf0Var, bVar, 0, 24576, 245756);
                } catch (Throwable th2) {
                    bVar2.i(iL);
                    throw th2;
                }
            } else {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: c6e
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            e6e.b(dVar2, aVar, z, function0, (a) obj, qj40.a(i | 1));
                            return Unit.a;
                        }
                    };
                }
            }
            eVarZ.d = function2;
        }
        bVar = bVarI;
        bVar.G();
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            function2 = new Function2() { // from class: d6e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e6e.b(dVar, aVar, z, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    public static final void c(String str, a aVar, int i) {
        b bVarI = aVar.i(1481515867);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            mw90.b(str, null, j.r(d.a.b, 20.0f), erz.a(R.drawable.ic_deposit_promotion_gift, 0, bVarI), erz.a(R.drawable.ic_deposit_promotion_gift, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, (i2 & 14) | 432, 0, 32736);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new b6e(str, i);
        }
    }
}
