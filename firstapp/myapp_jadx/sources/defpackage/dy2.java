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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class dy2 {
    public static final void a(final r8x.a aVar, a aVar2, final int i) {
        aVar.getClass();
        b bVarI = aVar2.i(1952953172);
        int i2 = (bVarI.M(aVar) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar3 = d.a.b;
            d dVarI = j.i(aVar3, 68.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            if (aVar instanceof r8x.a.C1043a) {
                bVarI.N(-333711833);
                d(6, 0, bVarI, h.j(aVar3, 0.0f, 10.5f, 0.0f, 0.0f, 13), com.sportygames.newcms.c.c(((r8x.a.C1043a) aVar).a, new String[0], bVarI));
                bVarI.X(false);
            } else {
                if (!(aVar instanceof r8x.a.b)) {
                    throw igf0.a(bVarI, -333713714, false);
                }
                bVarI.N(-333705819);
                f((r8x.a.b) aVar, bVarI, (i2 & 112) | 6);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: rx2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    dy2.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(yax.a aVar, a aVar2, int i) {
        b bVarI = aVar2.i(1595526088);
        int i2 = (bVarI.M(aVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d160 d160VarA = b160.a(new kw0.i(2.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar3 = d.a.b;
            d dVarC = c.c(bVarI, aVar3);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            c(54, bVarI, h.j(aVar3, 0.0f, 7.0f, 0.0f, 0.0f, 13), "(");
            h9n.a(erz.a(R.drawable.sporty_trophy, 0, bVarI), "trophy", j.t(aVar3, 18.55f, 24.0f), null, null, 0.0f, null, bVarI, 432, 120);
            c(6, bVarI, h.j(aVar3, 0.0f, 7.0f, 0.0f, 0.0f, 13), aVar.a.concat(") - ("));
            h9n.a(erz.a(R.drawable.gift_box, 0, bVarI), "trophy", j.r(h.j(aVar3, 0.0f, 5.0f, 0.0f, 0.0f, 13), 15.0f), null, null, 0.0f, null, bVarI, 432, 120);
            c(6, bVarI, h.j(aVar3, 0.0f, 7.0f, 0.0f, 0.0f, 13), aVar.b.concat(")"));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new xx2(aVar, i);
        }
    }

    public static final void c(final int i, a aVar, final d dVar, final String str) {
        int i2;
        b bVarI = aVar.i(1575691451);
        if ((i & 48) == 0) {
            i2 = (bVarI.M(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            xnj.d(dVar, str, new pnj(imf0.b(((xob0) bVarI.O(vob0.a)).a, j58.f, i7f.b(12.0f, bVarI), t9i.v, null, null, 0L, null, null, null, 0, i7f.b(12.0f, bVarI), null, null, 16646136), rhj.b.a, new fnj.b(5.0f)), bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: by2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dy2.c(qj40.a(i | 1), (a) obj, dVar, str);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final int i, final int i2, a aVar, d dVar, final String str) {
        d dVar2;
        int i3;
        final d dVar3;
        b bVarI = aVar.i(-62525451);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i5 = i3 | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i5 & 1, (i5 & 19) != 18)) {
            dVar3 = i4 != 0 ? d.a.b : dVar2;
            xnj.d(dVar3, str, new pnj(imf0.b(((xob0) bVarI.O(vob0.a)).a, j58.f, i7f.b(20.0f, bVarI), t9i.v, null, null, 0L, null, null, null, 0, i7f.b(20.0f, bVarI), null, null, 16646136), new rhj.a(j58.b), new fnj.b(6.0f)), bVarI, i5 & WebSocketProtocol.PAYLOAD_SHORT, 0);
        } else {
            bVarI.G();
            dVar3 = dVar2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tx2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dy2.d(qj40.a(i | 1), i2, (a) obj, dVar3, str);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final r8x.a.b bVar, a aVar, final int i) {
        b bVar2;
        b bVarI = aVar.i(-390447135);
        int i2 = (bVarI.M(bVar) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
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
            d(0, 1, bVarI, null, com.sportygames.newcms.c.c(shj.v0.j, new String[0], bVarI));
            bVar2 = bVarI;
            h9n.a(erz.a(R.drawable.sporty_trophy, 0, bVarI), "trophy", j.t(aVar2, 34.0f, 44.0f), null, null, 0.0f, null, bVar2, 432, 120);
            xnj.d(aVar2, bVar.a, new pnj(imf0.b(((xob0) bVar2.O(vob0.a)).a, r58.d(4294956800L), i7f.b(20.0f, bVar2), t9i.v, null, null, 0L, null, null, null, 0, i7f.b(20.0f, bVar2), null, null, 16646136), new rhj.a(j58.b), new fnj.b(6.0f)), bVar2, 6, 0);
            bVar2.X(true);
        } else {
            bVar2 = bVarI;
            bVar2.G();
        }
        e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: zx2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    dy2.e(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(r8x.a.b bVar, a aVar, int i) {
        yax yaxVar = bVar.b;
        b bVarI = aVar.i(-1865285048);
        int i2 = (bVarI.M(bVar) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, d.a.b);
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
            e(bVar, bVarI, (i2 & 112) | 6);
            if (yaxVar instanceof yax.a) {
                bVarI.N(-333755119);
                b((yax.a) yaxVar, bVarI, 0);
                bVarI.X(false);
            } else {
                if (!Intrinsics.g(yaxVar, yax.b.a)) {
                    throw igf0.a(bVarI, -333756839, false);
                }
                bVarI.N(-1756421054);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new vx2(bVar, i);
        }
    }
}
