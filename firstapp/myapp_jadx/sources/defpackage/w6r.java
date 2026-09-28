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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class w6r {
    public static final void a(final c7r c7rVar, twd0 twd0Var, final Function1 function1, a aVar, final int i) {
        int i2;
        final twd0 twd0Var2;
        int i3;
        twd0 twd0VarA;
        boolean z;
        crz crzVarA;
        int i4;
        b bVarI = aVar.i(1448205066);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(c7rVar) : bVarI.A(c7rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                i3 = i2 & (-113);
                twd0VarA = oer.a(c7rVar.h, bVarI);
            } else {
                bVarI.G();
                i3 = i2 & (-113);
                twd0VarA = twd0Var;
            }
            bVarI.Y();
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarB = androidx.compose.foundation.a.b(dVarG, ((lib0) bVarI.O(qyd0Var)).n0, zk40.a);
            int i5 = i3 & 896;
            int i6 = i3 & 14;
            boolean z2 = (i5 == 256) | (i6 == 4 || ((i3 & 8) != 0 && bVarI.A(c7rVar)));
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new Function0() { // from class: r6r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(new jmq.b(c7rVar.b));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarF = h.f(androidx.compose.foundation.d.d(dVarB, false, null, null, mla.d((Function0) objY, bVarI, 0), 15), 8.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            twd0 twd0Var3 = twd0VarA;
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d dVarR = j.r(aVar2, 16.0f);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY2;
            boolean z3 = (i6 == 4 || ((i3 & 8) != 0 && bVarI.A(c7rVar))) | (i5 == 256);
            Object objY3 = bVarI.y();
            if (z3 || objY3 == c0042a) {
                objY3 = new Function0() { // from class: s6r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        c7r c7rVar2 = c7rVar;
                        function1.invoke(new jmq.p(c7rVar2.b, !c7rVar2.d));
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            d dVarB2 = androidx.compose.foundation.d.b(dVarR, pswVar, null, false, null, (Function0) objY3, 28);
            if (c7rVar.d) {
                bVarI.N(-2039620279);
                z = false;
                crzVarA = erz.a(R.drawable.ic_star_on, 0, bVarI);
                bVarI.X(false);
            } else {
                z = false;
                bVarI.N(-2039531898);
                crzVarA = erz.a(R.drawable.ic_star_empty, 0, bVarI);
                bVarI.X(false);
            }
            int i7 = i3;
            h9n.a(crzVarA, "favorite", dVarB2, null, null, 0.0f, null, bVarI, 48, 120);
            dcq.a(h.h(aVar2, 8.0f, 0.0f, 2), c7rVar.e, false, bVarI, 6, 4);
            d dVarA = zqu.a(1.0f, h.j(aVar2, 0.0f, 0.0f, 8.0f, 0.0f, 11), true);
            String str = c7rVar.c;
            String str2 = c7rVar.f;
            l6r l6rVar = c7rVar.g;
            boolean z4 = (i5 == 256) | (i6 == 4 || ((i7 & 8) != 0 && bVarI.A(c7rVar)));
            Object objY4 = bVarI.y();
            if (z4 || objY4 == c0042a) {
                i4 = 0;
                objY4 = new t6r(0, c7rVar, function1);
                bVarI.r(objY4);
            } else {
                i4 = 0;
            }
            c(dVarA, str, str2, l6rVar, (Function0) objY4, bVarI, 0);
            rer.a(h.j(aVar2, 0.0f, 0.0f, 4.0f, 0.0f, 11), (mer) twd0Var3.getValue(), bVarI, 6);
            h9n.a(erz.a(R.drawable.ic_arrow_right, i4, bVarI), "right_icon", j.r(aVar2, 12.0f), null, null, 0.0f, new gf4(((lib0) bVarI.O(qyd0Var)).O, 5), bVarI, 432, 56);
            bVarI.X(true);
            twd0Var2 = twd0Var3;
        } else {
            bVarI.G();
            twd0Var2 = twd0Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: u6r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    w6r.a(c7rVar, twd0Var2, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(c7r c7rVar, Function1 function1, a aVar, int i) {
        b bVarI = aVar.i(54112240);
        int i2 = (bVarI.M(c7rVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            a(c7rVar, null, function1, bVarI, ((i2 << 3) & 896) | (i2 & 14));
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 0.5f), ((lib0) bVarI.O(oib0.a)).A, zk40.a), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new q6r(c7rVar, function1, i);
        }
    }

    public static final void c(d dVar, String str, String str2, l6r l6rVar, Function0<Unit> function0, a aVar, int i) {
        b bVar;
        b bVarI = aVar.i(-556601613);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.M(l6rVar) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            i78 i78VarA = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
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
            lkf0.d(str, j.g(d.a.b, 1.0f), ((lib0) bVarI.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVarI, ((i2 >> 3) & 14) | 48, 24960, 110584);
            bVar = bVarI;
            int i3 = (i2 >> 6) & 14;
            int i4 = i2 >> 9;
            xir.a(i3 | (i4 & 112), bVar, str2, function0);
            p6r.b(l6rVar, null, bVar, i4 & 14);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new v6r(dVar, str, str2, l6rVar, function0, i);
        }
    }
}
