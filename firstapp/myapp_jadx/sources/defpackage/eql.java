package defpackage;

import com.sportybet.feature.gift.giftreceived.presentation.dobreceived.DobGiftReceivedActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eql extends py1 {
    public boolean a = false;

    public eql() {
        addOnContextAvailableListener(new dql(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((dve) generatedComponent()).c2((DobGiftReceivedActivity) this);
    }
}
