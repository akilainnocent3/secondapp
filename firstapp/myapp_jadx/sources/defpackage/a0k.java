package defpackage;

import android.app.Activity;
import com.sporty.android.core.model.gift.GiftUsablePushData;
import com.sportybet.feature.gift.giftreceived.domain.model.ReceivedGift;
import com.sportybet.feature.gift.giftreceived.domain.model.ReceivedGiftData;

/* JADX INFO: loaded from: classes6.dex */
public final class a0k {
    public final vqk a;
    public final xpk b;

    public a0k(vqk vqkVar, xpk xpkVar) {
        this.a = vqkVar;
        this.b = xpkVar;
    }

    public final void a(Activity activity, GiftUsablePushData giftUsablePushData) {
        try {
            ReceivedGift receivedGiftA = this.a.a(giftUsablePushData);
            this.b.a(activity, new ReceivedGiftData.General(receivedGiftA.a, receivedGiftA.b, receivedGiftA.c, receivedGiftA.d));
        } catch (Exception e) {
            itf0.a.f(e, "Error processing general socket gift", new Object[0]);
        }
    }
}
