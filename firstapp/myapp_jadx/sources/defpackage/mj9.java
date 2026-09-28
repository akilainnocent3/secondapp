package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class mj9 implements zpk {
    public static final op8 a = new op8(-787450641, new lj9(), false);

    public static final long f(String str) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = new BigDecimal(str).multiply(BigDecimal.valueOf(10000L));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = BigDecimal.ZERO;
        }
        bVar.getClass();
        return ((BigDecimal) bVar).longValue();
    }

    @Override // defpackage.zpk
    public boolean a() {
        return false;
    }

    @Override // defpackage.zpk
    public boolean b(GiftDetails giftDetails) {
        return true;
    }

    @Override // defpackage.zpk
    public boolean c(GiftDetails giftDetails) {
        return false;
    }

    @Override // defpackage.zpk
    public boolean d(GiftDetails giftDetails) {
        giftDetails.getClass();
        return false;
    }

    @Override // defpackage.zpk
    public boolean e(int i) {
        return false;
    }
}
