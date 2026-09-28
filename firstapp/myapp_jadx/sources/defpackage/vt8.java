package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vt8 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e160) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            d dVarA = ls7.a(d.a.b, j060.c(fw20.a(R.dimen._8sdp, aVar)));
            qyd0 qyd0Var = sh60.a;
            List listK = b.k(new j58(((qh60) aVar.O(qyd0Var)).Y), new j58(((qh60) aVar.O(qyd0Var)).Z));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            d dVarG = h.g(androidx.compose.foundation.a.a(dVarA, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, 0.0f, 6), fw20.a(R.dimen._16sdp, aVar), fw20.a(R.dimen._8sdp, aVar));
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarG);
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
            hlh0.a(aVar, aivVarC, yka.a.f);
            hlh0.a(aVar, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            hlh0.a(aVar, dVarC, yka.a.d);
            lkf0.b(pm5.RETRY.a(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar, 0, 0, 131070);
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
