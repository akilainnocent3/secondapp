package defpackage;

import com.sportybet.feature.playtimecontrol.PlayTimeControlActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wzl extends py1 {
    public boolean a = false;

    public wzl() {
        addOnContextAvailableListener(new vzl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((sl10) generatedComponent()).o1((PlayTimeControlActivity) this);
    }
}
