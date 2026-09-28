package defpackage;

import com.sportybet.android.instantwin.presentation.instantwin.view.a;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nwl extends a {
    public boolean A = false;

    public nwl() {
        addOnContextAvailableListener(new mwl(this));
    }

    @Override // defpackage.xsl, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.A) {
            return;
        }
        this.A = true;
        ((cyu) generatedComponent()).W1((MatchEventActivity) this);
    }
}
