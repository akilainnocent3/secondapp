package defpackage;

import com.sportybet.plugin.jackpot.activities.JackpotSuccessfulPageActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ntl extends ty1 {
    public boolean a = false;

    public ntl() {
        addOnContextAvailableListener(new mtl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((n7p) generatedComponent()).y1((JackpotSuccessfulPageActivity) this);
    }
}
