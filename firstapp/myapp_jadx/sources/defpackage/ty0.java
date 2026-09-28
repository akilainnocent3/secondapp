package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ty0 {
    public static final void a(a aVar, d dVar) {
        int iHashCode = Long.hashCode(aVar.m());
        d dVarC = c.c(aVar, dVar);
        ne00 ne00VarO = aVar.o();
        yka.k.getClass();
        tsr.a aVar2 = yka.a.b;
        if (aVar.k() == null) {
            l2a.b();
            throw null;
        }
        aVar.D();
        if (aVar.g()) {
            aVar.F(aVar2);
        } else {
            aVar.p();
        }
        hlh0.a(aVar, lqa0.a, yka.a.f);
        hlh0.a(aVar, ne00VarO, yka.a.e);
        hlh0.a(aVar, dVarC, yka.a.d);
        yka.a.C1350a c1350a = yka.a.g;
        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
            j3c.a(iHashCode, aVar, iHashCode, c1350a);
        }
        aVar.s();
    }

    public static final BigDecimal b(AssetsInfo assetsInfo) {
        assetsInfo.getClass();
        return p54.b(new BigDecimal(assetsInfo.balance));
    }
}
