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
public final class bhq {
    public static final void a(final int i, a aVar, final Function0 function0, boolean z) {
        final boolean z2;
        b bVar;
        long j;
        b bVarI = aVar.i(146580329);
        int i2 = (bVarI.b(z) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarG = h.g(androidx.compose.foundation.d.d(ls7.a(d.a.b, j060.c(4.0f)), z, null, null, mla.d(function0, bVarI, i2 & 112), 14), 12.0f, 10.0f);
            String strA = cb40.a(R.string.common_functions__cancel, new Object[0], bVarI);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).j;
            if (z) {
                bVarI.N(-1206745747);
                j = ((lib0) bVarI.O(oib0.a)).b;
                bVarI.X(false);
            } else {
                bVarI.N(-1206696054);
                j = ((lib0) bVarI.O(oib0.a)).e;
                bVarI.X(false);
            }
            bVar = bVarI;
            z2 = z;
            lkf0.d(strA, dVarG, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVar, 0, 0, 131064);
        } else {
            z2 = z;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0, z2) { // from class: zgq
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = z2;
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bhq.a(qj40.a(1), (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final c5q c5qVar, final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        boolean z;
        b bVarI = aVar.i(2097962219);
        if ((i & 48) == 0) {
            i2 = (bVarI.M(c5qVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            aiv aivVarC = g75.c(ht.a.e, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (c5qVar.equals(c5q.a.a)) {
                z = true;
            } else {
                if (!c5qVar.equals(c5q.b.a)) {
                    uhc.a();
                    return;
                }
                z = false;
            }
            d dVarG = h.g(androidx.compose.foundation.d.d(ls7.a(dw.a(dVar, z ? 0.0f : 1.0f), j060.c(4.0f)), !z, null, null, mla.d(function0, bVarI, (i3 >> 3) & 112), 14), 12.0f, 10.0f);
            String strA = cb40.a(R.string.common_functions__delete, new Object[0], bVarI);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).j;
            qyd0 qyd0Var = oib0.a;
            lkf0.d(strA, dVarG, ((lib0) bVarI.O(qyd0Var)).j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131064);
            bVarI = bVarI;
            if (z) {
                bVarI.N(1803097423);
                q330.a(j.r(d.a.b, 14.625f), ((lib0) bVarI.O(qyd0Var)).Q, 1.5f, 0L, 0, 0.0f, bVarI, 390, 56);
                bVarI.X(false);
            } else {
                bVarI.N(1803274557);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ahq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    bhq.b(dVar, c5qVar, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(c5q c5qVar, Function0<Unit> function0, Function0<Unit> function1, a aVar, int i) {
        Function0<Unit> function2;
        b bVar;
        Function0<Unit> function3;
        c5q c5qVar2 = c5qVar;
        b bVarA = v2g.a(function0, function1, aVar, 222570919);
        int i2 = i | (bVarA.M(c5qVar2) ? 4 : 2) | (bVarA.A(function0) ? 32 : 16) | (bVarA.A(function1) ? 256 : 128);
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarW = j.w(aVar2, 320.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarF = h.f(androidx.compose.foundation.a.b(dVarW, ((lib0) bVarA.O(qyd0Var)).i0, j060.c(8.0f)), 24.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarA, 0);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d dVarC = c.c(bVarA, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarA, i78VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarA, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarA, dVarC, cVar);
            String strA = cb40.a(R.string.page_lucky_numbers__delete_ticket, new Object[0], bVarA);
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(strA, null, ((lib0) bVarA.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarA.O(qyd0Var2)).a, bVarA, 0, 0, 131066);
            lkf0.d(cb40.a(R.string.bet_history__are_you_sure_ticket_delete, new Object[0], bVarA), h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), ((lib0) bVarA.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarA.O(qyd0Var2)).l, bVarA, 48, 0, 131064);
            bVar = bVarA;
            d dVarG = j.g(h.j(aVar2, 0.0f, 24.0f, 0.0f, 0.0f, 13), 1.0f);
            d160 d160VarA = b160.a(kw0.b, ht.a.j, bVar, 6);
            int iHashCode2 = Long.hashCode(bVar.T);
            ne00 ne00VarS2 = bVar.S();
            d dVarC2 = c.c(bVar, dVarG);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, d160VarA, bVar2);
            hlh0.a(bVar, ne00VarS2, dVar);
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVar, iHashCode2, c1350a);
            }
            hlh0.a(bVar, dVarC2, cVar);
            c5qVar2 = c5qVar;
            function2 = function0;
            a(i2 & 112, bVar, function2, c5qVar2 instanceof c5q.b);
            function3 = function1;
            b(h.j(aVar2, 8.0f, 0.0f, 0.0f, 0.0f, 14), c5qVar2, function3, bVar, ((i2 << 3) & 112) | 6 | (i2 & 896));
            bVar.X(true);
            bVar.X(true);
        } else {
            function2 = function0;
            bVar = bVarA;
            function3 = function1;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new b18(c5qVar2, function2, function3, i);
        }
    }
}
