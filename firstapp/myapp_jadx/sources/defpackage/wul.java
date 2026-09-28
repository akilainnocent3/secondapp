package defpackage;

import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class wul extends l22 {
    public boolean e = false;

    public wul() {
        addOnContextAvailableListener(new vul(this));
    }

    @Override // defpackage.fml, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((oqs) generatedComponent()).v0((LivePageActivity) this);
    }
}
