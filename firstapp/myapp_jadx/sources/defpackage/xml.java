package defpackage;

import com.sportybet.feature.loyalty.impl.bettingstreak.BettingStreakActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xml extends py1 {
    public boolean a = false;

    public xml() {
        addOnContextAvailableListener(new wml(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((n04) generatedComponent()).d2((BettingStreakActivity) this);
    }
}
