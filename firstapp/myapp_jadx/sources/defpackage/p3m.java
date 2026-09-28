package defpackage;

import com.sportybet.plugin.sportydesk.activities.SportyDeskActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p3m extends i12 {
    public boolean i = false;

    public p3m() {
        addOnContextAvailableListener(new o3m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.i) {
            return;
        }
        this.i = true;
        ((qnb0) generatedComponent()).A((SportyDeskActivity) this);
    }
}
