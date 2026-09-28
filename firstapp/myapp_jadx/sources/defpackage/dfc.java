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

/* JADX INFO: loaded from: classes8.dex */
public final class dfc {
    public static final void a(String str, String str2, a aVar, int i) {
        String str3;
        b bVar;
        str.getClass();
        str2.getClass();
        b bVarI = aVar.i(-603745580);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarJ = h.j(j.g(d.a.b, 1.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
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
            imf0 imf0VarL = mla.l(R.style.C1_R, bVarI);
            long jA = c68.a(R.color.text_primary, bVarI);
            t9i t9iVar = t9i.B;
            lkf0.d(str, null, jA, null, 0L, null, t9iVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, bVarI, (i2 & 14) | 1572864, 0, 131002);
            str3 = str2;
            lkf0.d(str3, null, c68.a(R.color.text_primary, bVarI), null, 0L, null, t9iVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, ((i2 >> 3) & 14) | 1572864, 0, 131002);
            bVar = bVarI;
            bVar.X(true);
        } else {
            str3 = str2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new cfc(str, str3, i);
        }
    }
}
