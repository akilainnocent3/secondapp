package defpackage;

import com.sportybet.android.livegame.LiveGameActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class rul extends py1 {
    public boolean a = false;

    public rul() {
        addOnContextAvailableListener(new qul(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((rns) generatedComponent()).g0((LiveGameActivity) this);
    }
}
