package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class p0r {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final boolean z, a aVar, final int i) {
        b bVar;
        bxg0 bxg0Var;
        b bVarI = aVar.i(24446075);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            i060 i060VarC = j060.c(4.0f);
            if (z) {
                bVarI.N(-1871273797);
                bxg0Var = new bxg0(new j58(r58.b(1726224423)), new j58(fjb0.b(bVarI).I0), null);
                bVarI.X(false);
            } else {
                bVarI.N(-1871189942);
                bxg0Var = new bxg0(new j58(fjb0.b(bVarI).e1), new j58(fjb0.b(bVarI).d1), new j58(fjb0.b(bVarI).G));
                bVarI.X(false);
            }
            long j = ((j58) bxg0Var.a).a;
            long j2 = ((j58) bxg0Var.b).a;
            j58 j58Var = (j58) bxg0Var.c;
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.t(aVar2, 25.0f, 24.0f), j, i060VarC);
            if (j58Var != null) {
                dVarB = d35.a(dVarB, 0.5f, j58Var.a, i060VarC);
            }
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            g75.a(androidx.compose.foundation.a.b(j.g(j.i(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.h), 12.0f), 1.0f), j2, j060.e(0.0f, 0.0f, 4.0f, 4.0f, 3)), bVarI, 0);
            lkf0.d(str, null, fjb0.b(bVarI).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).i, bVarI, i2 & 14, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, z) { // from class: o0r
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;

                {
                    this.a = str;
                    this.b = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    p0r.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(-2124235206);
        if (bVarI.q(i & 1, i != 0)) {
            bVar = bVarI;
            lkf0.d(":", null, ((lib0) bVarI.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVar, 6, 0, 131066);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new n0r();
        }
    }

    public static final void c(final o4q.a aVar, a aVar2, final int i) {
        b bVarI = aVar2.i(906320661);
        int i2 = (bVarI.M(aVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            String str = aVar.b;
            boolean z = aVar.a;
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null);
            d160 d160VarA = b160.a(new kw0.i(3.41f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, d.a.b);
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
            String str2 = (String) CollectionsKt.V(0, listSplit$default);
            if (str2 == null) {
                str2 = "";
            }
            a(str2, z, bVarI, 0);
            b(0, bVarI);
            String str3 = (String) CollectionsKt.V(1, listSplit$default);
            if (str3 == null) {
                str3 = "";
            }
            a(str3, z, bVarI, 0);
            b(0, bVarI);
            String str4 = (String) CollectionsKt.V(2, listSplit$default);
            a(str4 != null ? str4 : "", z, bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: m0r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    p0r.c(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(o4q o4qVar, a aVar, int i) {
        o4qVar.getClass();
        b bVarI = aVar.i(1760340560);
        int i2 = (bVarI.M(o4qVar) ? 4 : 2) | i;
        if (!bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.G();
        } else if (o4qVar instanceof o4q.a) {
            bVarI.N(-529832820);
            c((o4q.a) o4qVar, bVarI, i2 & 14);
            bVarI.X(false);
        } else {
            if (!o4qVar.equals(o4q.b.a)) {
                throw igf0.a(bVarI, -529834502, false);
            }
            bVarI.N(-529830726);
            e(0, bVarI);
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new l0r(o4qVar, i);
        }
    }

    public static final void e(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(-2046243128);
        if (bVarI.q(i & 1, i != 0)) {
            qyd0 qyd0Var = oib0.a;
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.page_lucky_numbers__upcoming, new Object[0], bVarI), h.g(d35.a(androidx.compose.foundation.a.b(d.a.b, ((lib0) bVarI.O(qyd0Var)).d1, j060.c(4.0f)), 0.5f, ((lib0) bVarI.O(qyd0Var)).G, j060.c(4.0f)), 8.0f, 4.0f), ((lib0) bVarI.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVar, 0, 0, 131064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new zp8(i);
        }
    }
}
