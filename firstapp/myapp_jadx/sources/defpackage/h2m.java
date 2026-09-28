package defpackage;

import com.sportybet.plugin.realsports.searchv2.SearchActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h2m extends py1 {
    public boolean a = false;

    public h2m() {
        addOnContextAvailableListener(new g2m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((qt70) generatedComponent()).C1((SearchActivity) this);
    }
}
