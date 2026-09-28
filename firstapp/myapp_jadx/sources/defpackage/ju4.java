package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ju4 {
    public static final void a(String str, final kv4 kv4Var, Function1<? super String, String> function1, Function0<Unit> function0, a aVar, final int i) {
        int i2;
        Function0<Unit> function2;
        Function1<? super String, String> function3;
        String strInvoke;
        final String str2 = str;
        str2.getClass();
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(-477048939);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(kv4Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zEquals = str2.equals("1");
            int iOrdinal = kv4Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        strInvoke = "";
                    } else if (zEquals) {
                        ks4[] ks4VarArr = ks4.a;
                        strInvoke = function1.invoke("bonus_vault_minute");
                    } else {
                        ks4[] ks4VarArr2 = ks4.a;
                        strInvoke = function1.invoke("bonus_vault_minutes");
                    }
                } else if (zEquals) {
                    ks4[] ks4VarArr3 = ks4.a;
                    strInvoke = function1.invoke("hour");
                } else {
                    ks4[] ks4VarArr4 = ks4.a;
                    strInvoke = function1.invoke("hours");
                }
            } else if (zEquals) {
                ks4[] ks4VarArr5 = ks4.a;
                strInvoke = function1.invoke("day");
            } else {
                ks4[] ks4VarArr6 = ks4.a;
                strInvoke = function1.invoke("days");
            }
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 12.0f, 12.0f, 0.0f, 9);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarJ2 = h.j(j.g(aVar2, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            i78 i78VarA = g78.a(kw0.d, ht.a.n, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            ks4[] ks4VarArr7 = ks4.a;
            String str3 = strInvoke;
            int i3 = i2;
            lkf0.b(function1.invoke("bonus_vault_title"), null, 0L, i7f.b(20.0f, bVarI), null, t9i.y, null, 0L, new gdf0(3), i7f.b(20.0f, bVarI), 0, false, 0, 0, null, new imf0(ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(r58.d(4293968997L)), new j58(r58.d(4294963151L)))), 0L, null, null, null, null, 0L, 33554430), bVarI, 196608, 1572864, 63958);
            d dVarJ3 = h.j(j.g(aVar2, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarJ3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            StringBuilder sb = new StringBuilder("⏳ ");
            str2 = str;
            sb.append(str2);
            sb.append(' ');
            sb.append(str3);
            sb.append(' ');
            String string = sb.toString();
            long j = j58.f;
            lkf0.b(string, null, j, i7f.b(13.0f, bVarI), new n9i(1), t9i.v, null, 0L, null, i7f.b(13.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129986);
            function3 = function1;
            lkf0.b(function3.invoke("bonus_vault_left_to_win"), androidx.compose.foundation.b.a(1, 62, aVar2), j, i7f.b(13.0f, bVarI), new n9i(1), t9i.d, null, 0L, null, i7f.b(13.0f, bVarI), 0, false, 1, 0, null, null, bVarI, 197040, 3072, 121792);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
            rbn rbnVarA = ct7.a();
            d dVarB = androidx.compose.foundation.layout.d.a.b(j.r(aVar2, 24.0f), ht.a.c);
            boolean z = (i3 & 7168) == 2048;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                function2 = function0;
                objY = new hu4(function2, 0);
                bVarI.r(objY);
            } else {
                function2 = function0;
            }
            h6n.a(rbnVarA, "Close", androidx.compose.foundation.d.d(dVarB, false, null, null, (Function0) objY, 15), j, bVarI, 3120, 0);
            bVarI.X(true);
        } else {
            function2 = function0;
            function3 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function1<? super String, String> function4 = function3;
            final Function0<Unit> function5 = function2;
            eVarZ.d = new Function2() { // from class: iu4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ju4.a(str2, kv4Var, function4, function5, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
