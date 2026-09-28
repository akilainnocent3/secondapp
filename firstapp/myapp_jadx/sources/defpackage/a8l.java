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
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a8l {
    public static final uf00<k9f0> a = a4h.a(new k9f0("sr:competitor:4781", "1", "Mexico", "3", "2", "1", "0", "7", "2", "+5", "7", (String) null, 6144), new k9f0("sr:competitor:4801", "2", "South Africa", "3", "1", "1", "1", "4", "4", "0", "4", (String) null, 6144), new k9f0("sr:competitor:4811", "3", "Korea Republic", "3", "1", "0", "2", "3", "5", "-2", "3", (String) null, 6144), new k9f0("sr:competitor:4831", "4", "Czechia", "3", "0", "2", "1", "2", "5", "-3", "2", (String) null, 6144));

    public static final void a(d dVar, final i8l i8lVar, final Function0 function0, a aVar, final int i) {
        final d dVar2;
        ya5 soa0Var;
        i8lVar.getClass();
        boolean z = i8lVar.d;
        b bVarI = aVar.i(1990222781);
        int i2 = i | 6 | (bVarI.M(i8lVar) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            uf00<k9f0> uf00Var = i8lVar.c;
            if (z) {
                bVarI.N(-1296479186);
                soa0Var = new hfs(kotlin.collections.b.k(new j58(fjb0.b(bVarI).k), new j58(j58.c(0.15f, fjb0.b(bVarI).k))), null, 0L, 9187343241974906880L, 0);
                bVarI.X(false);
            } else {
                bVarI.N(-1296295604);
                soa0Var = new soa0(fjb0.b(bVarI).G);
                bVarI.X(false);
            }
            d.a aVar2 = d.a.b;
            d dVarG = h.g(d35.b(androidx.compose.foundation.a.a(ls7.a(j.g(aVar2, 1.0f), j060.c(12.0f)), new hfs(kotlin.collections.b.k(new j58(fjb0.b(bVarI).d1), new j58(fjb0.b(bVarI).c1)), null, 0L, 9187343241974906880L, 0), null, 0.0f, 6), z ? 1.5f : 1.0f, soa0Var, j060.c(12.0f)), 12.0f, 12.0f);
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
            b((i2 >> 3) & 112, bVarI, i8lVar.b, function0, i8lVar.e);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            svd0.a(null, bVarI, 0);
            dVar2 = aVar2;
            ute.b(null, 1.0f, fjb0.b(bVarI).G, bVarI, 48, 1);
            bVarI.N(-1981961041);
            int i3 = 0;
            for (k9f0 k9f0Var : uf00Var) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                j9f0.b(null, k9f0Var, bVarI, 0);
                if (i3 < uf00Var.size() - 1) {
                    bVarI.N(1455129321);
                    ute.b(null, 1.0f, ((lib0) bVarI.O(oib0.a)).G, bVarI, 48, 1);
                    bVarI.X(false);
                } else {
                    bVarI.N(1455271022);
                    bVarI.X(false);
                }
                i3 = i4;
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i8lVar, function0, i) { // from class: y7l
                public final /* synthetic */ i8l b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    a8l.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, a aVar, final UiText uiText, final Function0 function0, final boolean z) {
        int i2;
        boolean z2;
        b bVarI = aVar.i(696661978);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(uiText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            kw0.j jVar = kw0.a;
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar, bVarI, 48);
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
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            uiText.getClass();
            String strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).o;
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(strG, new LayoutWeightElement(1.0f, true), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).i, bVarI, 0, 0, 131064);
            bVarI = bVarI;
            if (z) {
                bVarI.N(-1003388612);
                d dVarD = androidx.compose.foundation.d.d(aVar2, false, null, null, function0, 15);
                d160 d160VarA2 = b160.a(new kw0.i(2.0f, true, new hw0()), bVar, bVarI, 54);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarD);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                z2 = true;
                lkf0.d(cb40.a(R.string.world_cup_tournament__bet_now, new Object[0], bVarI), null, ((lib0) bVarI.O(qyd0Var)).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).m, bVarI, 0, 0, 131066);
                bVarI = bVarI;
                h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVarI), null, j.r(aVar2, 14.0f), ((lib0) bVarI.O(qyd0Var)).t, bVarI, 432, 0);
                bVarI.X(true);
                bVarI.X(false);
            } else {
                z2 = true;
                bVarI.N(-1002663708);
                bVarI.X(false);
            }
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z7l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    a8l.b(qj40.a(i | 1), (a) obj, uiText, function0, z);
                    return Unit.a;
                }
            };
        }
    }
}
