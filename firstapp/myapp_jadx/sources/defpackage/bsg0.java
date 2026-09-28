package defpackage;

import com.sporty.android.core.model.MyLog;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class bsg0 {
    public static final BigDecimal a(long j, String str) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = BigDecimal.valueOf(j);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_WITHDRAW);
            aVar3.d("Parsing " + str + " with failure.", new Object[0]);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        BigDecimal bigDecimal = (BigDecimal) bVar;
        if (bigDecimal != null) {
            return p54.b(bigDecimal);
        }
        return null;
    }
}
