package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class xj60 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [l58] */
    public static final void a(final d dVar, final yj60 yj60Var, boolean z, String str, a aVar, final int i) {
        final boolean z2;
        final String str2;
        dVar.getClass();
        yj60Var.getClass();
        b bVarI = aVar.i(211368875);
        int i2 = i | (bVarI.M(yj60Var) ? 32 : 16) | 28032;
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = yj60Var instanceof yj60.b;
            Object objC = null;
            str2 = AnalyticsParam.HOME_NAV_ICON;
            if (z3) {
                bVarI.N(468328529);
                yj60.b bVar = (yj60.b) yj60Var;
                if (bVar instanceof yj60.b.a) {
                    bVarI.N(1262035850);
                    objC = c.c(((yj60.b.a) yj60Var).a, new String[0], bVarI);
                    bVarI.X(false);
                } else {
                    if (!(bVar instanceof yj60.b.C1348b)) {
                        throw igf0.a(bVarI, 1262033881, false);
                    }
                    bVarI.N(1262038517);
                    bVarI.X(false);
                }
                mw90.a(objC, AnalyticsParam.HOME_NAV_ICON, dVar, null, null, bVar.a(), null, bVarI, 432, 1976);
                bVarI.X(false);
            } else {
                if (!(yj60Var instanceof yj60.a)) {
                    throw igf0.a(bVarI, 1262032512, false);
                }
                bVarI.N(468798551);
                yj60.a aVar2 = (yj60.a) yj60Var;
                cl60 cl60Var = aVar2.a;
                crz crzVarA = erz.a(2131233729, 0, bVarI);
                d0b d0bVar = aVar2.b;
                long j = cl60Var.a;
                h9n.a(crzVarA, AnalyticsParam.HOME_NAV_ICON, dVar, null, d0bVar, 0.0f, nbh0.a(j, j58.m) ? null : new gf4(j, 5), bVarI, 432, 40);
                bVarI.X(false);
            }
            z2 = true;
        } else {
            bVarI.G();
            z2 = z;
            str2 = str;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(yj60Var, z2, str2, i) { // from class: wj60
                public final /* synthetic */ yj60 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    xj60.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
