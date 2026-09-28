package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class js4 {
    public static final void a(final d dVar, final Double d, final Double d2, String str, Function1<? super String, String> function1, a aVar, final int i) {
        int i2;
        String str2;
        Function1<? super String, String> function2;
        n54.b bVar;
        kw0.j jVar;
        long j;
        d.a aVar2;
        boolean z;
        float f;
        boolean z2;
        boolean z3;
        float f2;
        dVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(265958987);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(d) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(d2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            StringBuilder sb = new StringBuilder();
            ks4[] ks4VarArr = ks4.a;
            String strA = j26.a(sb, function1.invoke("bonus_vault_bet_requirements"), ':');
            long j2 = j58.f;
            long jC = j58.c(0.7f, j2);
            long jB = i7f.b(12.0f, bVarI);
            long jB2 = i7f.b(12.0f, bVarI);
            d.a aVar4 = d.a.b;
            lkf0.b(strA, h.j(aVar4, 0.0f, 0.0f, 0.0f, 8.0f, 7), jC, jB, null, null, null, 0L, null, jB2, 0, false, 0, 0, null, null, bVarI, 432, 0, 130032);
            bVarI = bVarI;
            d dVarA = d35.a(j.A(j.g(aVar4, 1.0f), null, 3), 1.0f, r58.d(4282203453L), j060.c(8.0f));
            i78 i78VarA2 = g78.a(kVar, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            kw0.j jVar2 = kw0.a;
            n54.b bVar3 = ht.a.k;
            if (d == null) {
                bVarI.N(-1808646814);
                bVarI.X(false);
                z2 = false;
                function2 = function1;
                aVar2 = aVar4;
                jVar = jVar2;
                bVar = bVar3;
                f = 8.0f;
                j = j2;
                z = true;
                str2 = str;
            } else {
                bVarI.N(-1808646813);
                double dDoubleValue = d.doubleValue();
                d dVarG = h.g(j.A(j.g(aVar4, 1.0f), null, 3), 8.0f, 6.0f);
                d160 d160VarA = b160.a(jVar2, bVar3, bVarI, 48);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarG);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar2);
                hlh0.a(bVarI, ne00VarS3, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                function2 = function1;
                bVar = bVar3;
                jVar = jVar2;
                mw90.a(function1.invoke("bonus_vault_min_stake_icon"), null, h.j(j.i(aVar4, 24.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), null, null, null, null, bVarI, 432, 2040);
                String strInvoke = function2.invoke("bonus_vault_minimum_stake");
                t9i t9iVar = t9i.i;
                lkf0.b(strInvoke, null, j2, i7f.b(12.0f, bVarI), null, t9iVar, null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 130002);
                d040.a(1.0f, true, bVarI);
                d dVarH = h.h(aVar4, 8.0f, 0.0f, 2);
                nk0.b bVar4 = new nk0.b((Object) null);
                int iL = bVar4.l(new ora0(r58.d(4292263772L), 0L, t9iVar, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65530));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    str2 = str;
                    sb2.append(str2);
                    sb2.append(' ');
                    sb2.append(dDoubleValue);
                    sb2.append(' ');
                    bVar4.g(sb2.toString());
                    Unit unit = Unit.a;
                    bVar4.i(iL);
                    int iL2 = bVar4.l(new ora0(j2, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                    try {
                        bVar4.g(function2.invoke("bonus_vault_per_bet"));
                        bVar4.i(iL2);
                        j = j2;
                        aVar2 = aVar4;
                        z = true;
                        f = 8.0f;
                        lkf0.c(bVar4.m(), dVarH, 0L, i7f.b(12.0f, bVarI), null, null, null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, null, bVarI, 48, 0, 261108);
                        bVarI = bVarI;
                        bVarI.X(true);
                        z2 = false;
                        bVarI.X(false);
                    } catch (Throwable th) {
                        bVar4.i(iL2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    bVar4.i(iL);
                    throw th2;
                }
            }
            if (d2 == null) {
                bVarI.N(-1806662101);
                bVarI.X(z2);
            } else {
                bVarI.N(-1806662100);
                double dDoubleValue2 = d2.doubleValue();
                if (d != null) {
                    bVarI.N(1216548154);
                    f2 = 1.0f;
                    ty0.a(bVarI, androidx.compose.foundation.a.b(j.g(j.i(aVar2, 1.0f), 1.0f), r58.d(4282203453L), zk40.a));
                    z3 = false;
                } else {
                    z3 = false;
                    f2 = 1.0f;
                    bVarI.N(1212508668);
                }
                bVarI.X(z3);
                d dVarG2 = h.g(j.A(j.g(aVar2, f2), null, 3), f, 6.0f);
                d160 d160VarA2 = b160.a(jVar, bVar, bVarI, 48);
                int iHashCode4 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarG2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar2);
                hlh0.a(bVarI, ne00VarS4, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                mw90.a(function2.invoke("bonus_vault_min_coefficient_icon"), null, h.j(j.i(aVar2, 24.0f), 0.0f, 0.0f, f, 0.0f, 11), null, null, null, null, bVarI, 432, 2040);
                String strInvoke2 = function2.invoke("bonus_vault_min_coefficient");
                t9i t9iVar2 = t9i.i;
                b bVar5 = bVarI;
                long j3 = j;
                lkf0.b(strInvoke2, null, j3, i7f.b(12.0f, bVarI), null, t9iVar2, null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVar5, 196992, 0, 130002);
                d040.a(1.0f, z, bVar5);
                d dVarH2 = h.h(aVar2, f, 0.0f, 2);
                nk0.b bVar6 = new nk0.b((Object) null);
                int iL3 = bVar6.l(new ora0(j3, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                try {
                    bVar6.g(function2.invoke("bonus_vault_crash_or_cash_out_over"));
                    Unit unit2 = Unit.a;
                    bVar6.i(iL3);
                    int iL4 = bVar6.l(new ora0(r58.d(4292263772L), 0L, t9iVar2, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65530));
                    try {
                        bVar6.g(" " + dDoubleValue2 + 'x');
                        bVar6.i(iL4);
                        lkf0.c(bVar6.m(), dVarH2, 0L, i7f.b(12.0f, bVar5), null, null, null, 0L, new gdf0(6), i7f.b(12.0f, bVar5), 0, false, 0, 0, null, null, null, bVar5, 48, 0, 260596);
                        bVarI = bVar5;
                        bVarI.X(z);
                        bVarI.X(false);
                    } catch (Throwable th3) {
                        bVar6.i(iL4);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    bVar6.i(iL3);
                    throw th4;
                }
            }
            bVarI.X(z);
            bVarI.X(z);
        } else {
            str2 = str;
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final String str3 = str2;
            final Function1<? super String, String> function3 = function2;
            eVarZ.d = new Function2() { // from class: is4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    js4.a(dVar, d, d2, str3, function3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
