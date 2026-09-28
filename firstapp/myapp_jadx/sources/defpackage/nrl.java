package defpackage;

import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.GiftReceivedActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nrl extends py1 {
    public boolean a = false;

    public nrl() {
        addOnContextAvailableListener(new mrl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((mqk) generatedComponent()).P0((GiftReceivedActivity) this);
    }
}
