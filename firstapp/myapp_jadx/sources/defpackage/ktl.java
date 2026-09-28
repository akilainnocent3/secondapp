package defpackage;

import com.sportybet.plugin.jackpot.activities.JackpotMainActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ktl extends ty1 {
    public boolean a = false;

    public ktl() {
        addOnContextAvailableListener(new jtl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((j6p) generatedComponent()).u0((JackpotMainActivity) this);
    }
}
