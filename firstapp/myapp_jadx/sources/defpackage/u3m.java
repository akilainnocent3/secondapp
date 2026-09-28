package defpackage;

import com.sportybet.android.game.activity.SportyGameRouterActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u3m extends w52 {
    public boolean f = false;

    public u3m() {
        addOnContextAvailableListener(new t3m(this));
    }

    @Override // defpackage.iml
    public final void inject() {
        if (this.f) {
            return;
        }
        this.f = true;
        ((qob0) generatedComponent()).D((SportyGameRouterActivity) this);
    }
}
