package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.c;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bx9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e160) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            String upperCase = c.d(v5g0.Z.O, "Join", aVar).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            List listK = b.k(new j58(b6g0.s), new j58(b6g0.t));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            lkf0.b(upperCase, null, 0L, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, new imf0(new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) == 0 ? 2 : 0), pi60.b(R.dimen._13ssp, 6, aVar), t9i.E, null, null, null, 0L, 33554418), aVar, 0, 0, 65022);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
