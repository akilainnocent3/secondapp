package defpackage;

import com.sportybet.android.instantwin.presentation.instantwin.view.a;
import com.sportybet.android.instantwin.presentation.kickoff.KickoffActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xtl extends a {
    public boolean A = false;

    public xtl() {
        addOnContextAvailableListener(new wtl(this));
    }

    @Override // defpackage.xsl, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.A) {
            return;
        }
        this.A = true;
        ((jqp) generatedComponent()).e((KickoffActivity) this);
    }
}
