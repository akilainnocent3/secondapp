package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f89 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((j78) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(new kw0.i(((cjb0) aVar.O(ejb0.a)).f, true, new hw0()), ht.a.n, aVar, 48);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar3);
            } else {
                aVar.p();
            }
            hlh0.a(aVar, i78VarA, yka.a.f);
            hlh0.a(aVar, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            hlh0.a(aVar, dVarC, yka.a.d);
            mw90.a("https://s.sporty.net/cms/image_upload_file_d41625c1d6.png", null, j.r(aVar2, 90.0f), null, null, null, null, aVar, 438, 2040);
            lkf0.d(cb40.a(R.string.wap_home__kyc_banner_verifying1, new Object[0], aVar), null, ((lib0) aVar.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, new gdf0(5), d2l.f(21), 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).k, aVar, 0, 48, 127994);
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
