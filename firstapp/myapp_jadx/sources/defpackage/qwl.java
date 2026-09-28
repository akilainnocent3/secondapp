package defpackage;

import com.sportybet.android.instantwin.presentation.instantwin.view.a;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qwl extends a {
    public boolean A = false;

    public qwl() {
        addOnContextAvailableListener(new pwl(this));
    }

    @Override // defpackage.xsl, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.A) {
            return;
        }
        this.A = true;
        ((n0v) generatedComponent()).I1((MatchEventDetailActivity) this);
    }
}
