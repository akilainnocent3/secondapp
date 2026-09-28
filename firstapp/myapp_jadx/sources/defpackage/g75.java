package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g75 {
    public static final rtw<ht, aiv> a = b(true);
    public static final rtw<ht, aiv> b = b(false);
    public static final a c = a.a;

    public static final class a implements aiv {
        public static final a a = new a();

        @Override // defpackage.aiv
        public final biv c(t tVar, List<? extends vhv> list, long j) {
            return t.z1(tVar, kxa.k(j), kxa.j(j), new f75(0));
        }
    }

    public static final void a(final d dVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-211209833);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(bVarI.T);
            d dVarC = c.c(bVarI, dVar);
            ne00 ne00VarS = bVarI.S();
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, c, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            hlh0.a(bVarI, dVarC, yka.a.d);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: e75
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    g75.a(dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final rtw<ht, aiv> b(boolean z) {
        rtw<ht, aiv> rtwVar = new rtw<>(9);
        n54 n54Var = ht.a.a;
        rtwVar.m(n54Var, new k75(n54Var, z));
        n54 n54Var2 = ht.a.b;
        rtwVar.m(n54Var2, new k75(n54Var2, z));
        n54 n54Var3 = ht.a.c;
        rtwVar.m(n54Var3, new k75(n54Var3, z));
        n54 n54Var4 = ht.a.d;
        rtwVar.m(n54Var4, new k75(n54Var4, z));
        n54 n54Var5 = ht.a.e;
        rtwVar.m(n54Var5, new k75(n54Var5, z));
        n54 n54Var6 = ht.a.f;
        rtwVar.m(n54Var6, new k75(n54Var6, z));
        n54 n54Var7 = ht.a.g;
        rtwVar.m(n54Var7, new k75(n54Var7, z));
        n54 n54Var8 = ht.a.h;
        rtwVar.m(n54Var8, new k75(n54Var8, z));
        n54 n54Var9 = ht.a.i;
        rtwVar.m(n54Var9, new k75(n54Var9, z));
        return rtwVar;
    }

    public static final aiv c(ht htVar, boolean z) {
        aiv aivVarD = (z ? a : b).d(htVar);
        return aivVarD == null ? new k75(htVar, z) : aivVarD;
    }

    public static final void d(y.a aVar, y yVar, vhv vhvVar, asr asrVar, int i, int i2, ht htVar) {
        ht htVar2;
        Object objG = vhvVar.g();
        d75 d75Var = objG instanceof d75 ? (d75) objG : null;
        y.a.x(aVar, yVar, ((d75Var == null || (htVar2 = d75Var.D) == null) ? htVar : htVar2).a((((long) yVar.a) << 32) | (((long) yVar.b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), asrVar));
    }
}
