package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class nfo implements zpk {
    public final InstantWinGiftApplicabilityContext a;

    public nfo(InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContext) {
        this.a = instantWinGiftApplicabilityContext;
    }

    @Override // defpackage.zpk
    public final boolean a() {
        return this.a != null;
    }

    @Override // defpackage.zpk
    public final boolean b(GiftDetails giftDetails) {
        InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContext = this.a;
        if (instantWinGiftApplicabilityContext == null) {
            return false;
        }
        return gfo.a(giftDetails, instantWinGiftApplicabilityContext.a);
    }

    @Override // defpackage.zpk
    public final boolean c(GiftDetails giftDetails) {
        InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContext = this.a;
        if (instantWinGiftApplicabilityContext == null) {
            return false;
        }
        if (instantWinGiftApplicabilityContext.a.getA().compareTo(BigDecimal.ZERO) > 0) {
            return true;
        }
        zyf0.b(R.string.component_coupon__please_enter_a_stake_first, 0);
        return false;
    }

    @Override // defpackage.zpk
    public final boolean d(GiftDetails giftDetails) {
        giftDetails.getClass();
        InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContext = this.a;
        if (instantWinGiftApplicabilityContext == null) {
            return false;
        }
        return instantWinGiftApplicabilityContext.a.getA().compareTo(new BigDecimal(Double.parseDouble(bjb0.X(giftDetails.getLeastOrderAmount())))) >= 0;
    }

    @Override // defpackage.zpk
    public final boolean e(int i) {
        BigDecimal bigDecimal = sqo.a;
        return i == 1 || i == 2 || i == 3;
    }
}
