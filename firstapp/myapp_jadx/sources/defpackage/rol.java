package defpackage;

import com.sportybet.android.codehub.ui.CodeHubActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rol extends py1 {
    public boolean a = false;

    public rol() {
        addOnContextAvailableListener(new qol(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((qw7) generatedComponent()).I((CodeHubActivity) this);
    }
}
