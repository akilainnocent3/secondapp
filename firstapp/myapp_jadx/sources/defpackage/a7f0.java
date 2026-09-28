package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.google.android.gms.common.annotation.LjLk.llGRV;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class a7f0 {
    public static final void a(d dVar, final String str, final String str2, final boolean z, final String str3, final e9f0 e9f0Var, final ofb0 ofb0Var, final Function2 function2, a aVar, final int i) {
        final d dVar2;
        d.a aVar2;
        boolean z2;
        str.getClass();
        b bVarI = aVar.i(344986326);
        int i2 = i | 6 | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.M(str3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.d(ofb0Var == null ? -1 : ofb0Var.ordinal()) ? 1048576 : 524288) | (bVarI.A(function2) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z3 = function2 != null;
            boolean z4 = ((29360128 & i2) == 8388608) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z4 || objY == a.C0041a.a) {
                objY = new Function0() { // from class: y6f0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Function2 function3 = function2;
                        if (function3 != null) {
                            function3.invoke(str2, str);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d.a aVar3 = d.a.b;
            d dVarH = h.h(j.r(androidx.compose.foundation.d.d(aVar3, z3, null, null, (Function0) objY, 14), 114.0f), 6.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            if (z) {
                bVarI.N(576018325);
                if (str3 != null) {
                    bVarI.N(576060175);
                    z2 = false;
                    mw90.b(str3, "logo image of ".concat(str), j.r(aVar3, 36.0f), null, erz.a(pfb0.a(ofb0Var, e9f0Var), 0, bVarI), null, null, null, d0b.a.b, 0.0f, null, bVarI, ((i2 >> 12) & 14) | 384, 6, 31720);
                    bVarI.X(false);
                    aVar2 = aVar3;
                } else {
                    z2 = false;
                    bVarI.N(576402415);
                    aVar2 = aVar3;
                    h9n.a(erz.a(pfb0.a(ofb0Var, e9f0Var), 0, bVarI), llGRV.oXlod, j.r(aVar2, 36.0f), null, null, 0.0f, null, bVarI, 432, 120);
                    bVarI = bVarI;
                    bVarI.X(false);
                }
                bVarI.X(z2);
            } else {
                i2 = i2;
                aVar2 = aVar3;
                bVarI.N(576665078);
                bVarI.X(false);
            }
            b bVar = bVarI;
            lkf0.d(str, h.j(j.A(j.i(aVar2, 36.0f), ht.a.k, 2), 0.0f, 4.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 2, false, 2, 0, null, mla.l(R.style.B2_B, bVarI), bVar, (i2 >> 3) & 14, 24960, 109560);
            bVarI = bVar;
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, z, str3, e9f0Var, ofb0Var, function2, i) { // from class: z6f0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ String e;
                public final /* synthetic */ e9f0 f;
                public final /* synthetic */ ofb0 i;
                public final /* synthetic */ Function2 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(196609);
                    a7f0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
