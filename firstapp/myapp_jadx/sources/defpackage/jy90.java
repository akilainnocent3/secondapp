package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jy90 {
    public static final void a(final int i, a aVar, final d dVar, final List list) {
        int i2;
        dVar.getClass();
        list.getClass();
        b bVarI = aVar.i(1464695153);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (bVarI.M(list) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            g75.a(androidx.compose.foundation.a.a(ls7.a(dVar, j060.c(8.0f)), m590.a(list, bVarI, 2), null, 0.0f, 6), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: iy90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jy90.a(qj40.a(i | 1), (a) obj, dVar, list);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, a aVar, final d dVar, final List list) {
        dVar.getClass();
        b bVarI = aVar.i(64237954);
        int i2 = (bVarI.M(list) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarG = j.g(dVar, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 & 112;
            a(i3, bVarI, j.i(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 96.0f), list);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            a(i3, bVarI, j.i(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 96.0f), list);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, list) { // from class: hy90
                public final /* synthetic */ d a;
                public final /* synthetic */ List b;

                {
                    this.a = dVar;
                    this.b = list;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jy90.b(qj40.a(7), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(int i, a aVar) {
        b bVarI = aVar.i(-1239581442);
        if (bVarI.q(i & 1, i != 0)) {
            List listK = kotlin.collections.b.k(new j58(c68.a(R.color.virtual_lobby_skeleton_load_start, bVarI)), new j58(c68.a(R.color.virtual_lobby_skeleton_load_end, bVarI)), new j58(c68.a(R.color.virtual_lobby_skeleton_load_start, bVarI)));
            i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.n, bVarI, 54);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar2, 1.0f), 32.0f), m590.a(listK, bVarI, 2), null, 0.0f, 6), bVarI, 0);
            a(6, bVarI, j.i(h.h(j.g(aVar2, 1.0f), 12.0f, 0.0f, 2), 172.0f), listK);
            b(6, bVarI, h.h(aVar2, 12.0f, 0.0f, 2), listK);
            a(6, bVarI, j.i(h.h(j.g(aVar2, 1.0f), 12.0f, 0.0f, 2), 96.0f), listK);
            b(6, bVarI, h.j(aVar2, 12.0f, 0.0f, 12.0f, 12.0f, 2), listK);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new lp9(i);
        }
    }
}
