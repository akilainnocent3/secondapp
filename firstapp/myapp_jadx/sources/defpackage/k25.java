package defpackage;

import android.app.Activity;
import com.sportybet.feature.gift.gift.data.remote.dto.BoostGiftUsablePushData;
import com.sportybet.feature.gift.giftreceived.domain.model.ReceivedGiftData;

/* JADX INFO: loaded from: classes6.dex */
public final class k25 {
    public final xpk a;

    public k25(vqk vqkVar, xpk xpkVar) {
        this.a = xpkVar;
    }

    public final void a(Activity activity, BoostGiftUsablePushData boostGiftUsablePushData) {
        try {
            String text = boostGiftUsablePushData.getText();
            l25.a aVar = l25.b;
            int boostKind = boostGiftUsablePushData.getBoostKind();
            aVar.getClass();
            l25 l25VarA = l25.a.a(boostKind);
            text.getClass();
            this.a.a(activity, new ReceivedGiftData.Boost(text, l25VarA));
        } catch (Exception e) {
            itf0.a aVar2 = itf0.a;
            aVar2.q("BoostGift");
            aVar2.f(e, "Error processing boost socket gift", new Object[0]);
        }
    }
}
