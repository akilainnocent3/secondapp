package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class klp {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, String str, final SharedPreferences sharedPreferences, a aVar, final int i) {
        final String str2;
        b bVar;
        boolean z2;
        str.getClass();
        b bVarI = aVar.i(2055722704);
        int i2 = i | (bVarI.b(z) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.A(sharedPreferences) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = nvc.a(sharedPreferences != null ? sharedPreferences.getBoolean("sporty_cars_keep_getting_extra_cashout_strip_shown", false) : false, bVarI);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA = ((i2 & 112) == 32) | bVarI.A(sharedPreferences);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                ilp ilpVar = new ilp(z, sharedPreferences, ytwVar, ytwVar2, null);
                bVarI.r(ilpVar);
                objY3 = ilpVar;
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY3);
            Boolean bool = (Boolean) ytwVar2.getValue();
            bool.getClass();
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new jlp(ytwVar2, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, bool, (Function2) objY4);
            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                bVarI.N(97330551);
                d dVarA = androidx.compose.ui.draw.b.a(j.g(androidx.compose.foundation.layout.d.a.b(d.a.b, ht.a.f), 0.7f), erz.a(2131232543, 0, bVarI), null, d0b.a.g, 0.0f, null, 54);
                aiv aivVarC = g75.c(ht.a.e, false);
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
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                str2 = str;
                lkf0.b(str2, null, r58.d(4280623136L), b2x.a(10, bVarI), null, t9i.E, null, 0L, new gdf0(2), 0L, 0, false, 0, 0, null, null, bVarI, ((i2 >> 6) & 14) | 196992, 0, 130514);
                bVar = bVarI;
                bVar.X(true);
                z2 = false;
            } else {
                str2 = str;
                bVar = bVarI;
                z2 = false;
                bVar.N(95256434);
            }
            bVar.X(z2);
        } else {
            str2 = str;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, str2, sharedPreferences, i) { // from class: hlp
                public final /* synthetic */ boolean a;
                public final /* synthetic */ String b;
                public final /* synthetic */ SharedPreferences c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    klp.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
