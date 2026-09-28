package defpackage;

import com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k7m extends py1 {
    public boolean a = false;

    public k7m() {
        addOnContextAvailableListener(new j7m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((egi0) generatedComponent()).s2((VirtualLobbyActivity) this);
    }
}
