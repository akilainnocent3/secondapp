package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class e430 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public static final void a(int i, a aVar, d dVar, String str) {
        ?? r2;
        d dVar2;
        d.a aVar2;
        boolean z;
        str.getClass();
        b bVarI = aVar.i(524006817);
        int i2 = i | 6 | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean zU = StringsKt.U(str);
            d.a aVar3 = d.a.b;
            if (zU) {
                aVar2 = aVar3;
                z = false;
                bVarI.N(-1519966207);
            } else {
                bVarI.N(-1518894103);
                d dVarB = androidx.compose.foundation.a.b(ls7.a(j.i(j.g(aVar3, 1.0f), 24.0f), j060.c(14.0f)), r58.d(4294962688L), zk40.a);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarB);
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
                aVar2 = aVar3;
                wf1.a(str, h.h(aVar3, 16.0f, 0.0f, 2), imf0.b(ni60.g(((sfd0) bVarI.O(ni60.b)).d, R.dimen._9ssp, bVarI), 0L, 0L, null, new n9i(1), null, 0L, null, null, null, 0, 0L, null, null, 16777207), 2, d2l.f(9), null, 3, null, r58.d(2988580639L), bVarI, ((i2 >> 3) & 14) | 100690992, 160);
                bVarI.X(true);
                z = false;
            }
            bVarI.X(z);
            dVar2 = aVar2;
            r2 = z;
        } else {
            r2 = 0;
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new d430(dVar2, i, r2, str);
        }
    }
}
