package defpackage;

import com.sportybet.android.virtual.presentation.activity.VirtualGameActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i7m extends py1 {
    public boolean a = false;

    public i7m() {
        addOnContextAvailableListener(new h7m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((gfi0) generatedComponent()).m((VirtualGameActivity) this);
    }
}
