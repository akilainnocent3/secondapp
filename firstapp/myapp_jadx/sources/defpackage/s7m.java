package defpackage;

import com.sportybet.feature.winning.WinningDialogActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s7m extends py1 {
    public boolean a = false;

    public s7m() {
        addOnContextAvailableListener(new r7m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((jaj0) generatedComponent()).c0((WinningDialogActivity) this);
    }
}
