package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ru4 {
    public static final void a(final d dVar, Function1<? super String, String> function1, a aVar, final int i) {
        int i2;
        final Function1<? super String, String> function2;
        yka.a.C1350a c1350a;
        dVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(980360477);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarA = j.A(dVar, null, 3);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            ks4[] ks4VarArr = ks4.a;
            String strInvoke = function1.invoke("bonus_vault_more_bonus_games_chest_icon_new");
            d.a aVar3 = d.a.b;
            d dVarI = j.i(j.w(aVar3, 236.0f), 177.0f);
            n54 n54Var = ht.a.b;
            androidx.compose.foundation.layout.d dVar3 = androidx.compose.foundation.layout.d.a;
            mw90.a(strInvoke, null, dw.a(dVar3.b(dVarI, n54Var), 0.6f), null, null, null, null, bVarI, 48, 2040);
            d dVarB = dVar3.b(j.C(aVar3, null, 3), ht.a.h);
            n54.a aVar4 = ht.a.n;
            kw0.c cVar2 = kw0.e;
            i78 i78VarA = g78.a(cVar2, aVar4, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                c1350a = c1350a2;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarC3 = j.C(aVar3, null, 3);
            d160 d160VarA = b160.a(cVar2, ht.a.k, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarC3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            function2 = function1;
            mw90.a(function2.invoke("bonus_vault_coming_soon_star_with_line"), null, h.j(j.i(aVar3, 10.0f), 0.0f, 0.0f, 10.0f, 0.0f, 11), null, null, null, null, bVarI, 432, 2040);
            lkf0.b(function2.invoke("bonus_vault_more_bonus_games_are"), null, j58.f, i7f.b(15.0f, bVarI), null, null, null, 0L, null, i7f.b(15.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 130034);
            mw90.a(function2.invoke("bonus_vault_coming_soon_star_with_line"), null, p1a.a(h.j(j.i(aVar3, 10.0f), 10.0f, 0.0f, 0.0f, 0.0f, 14), 180.0f), null, null, null, null, bVarI, 432, 2040);
            bVarI.X(true);
            String upperCase = function2.invoke("bonus_vault_coming_soon").toUpperCase(Locale.ROOT);
            upperCase.getClass();
            lkf0.b(StringsKt.c0(upperCase, "!"), null, r58.d(4294699949L), i7f.b(20.0f, bVarI), null, t9i.i, null, 0L, null, i7f.b(20.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 130002);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qu4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    ru4.a(dVar, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
