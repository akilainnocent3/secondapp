package defpackage;

import com.sportybet.android.instantwin.presentation.instantwin.view.a;
import com.sportybet.android.virtual.presentation.activity.InstantBetslipActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class msl extends a {
    public boolean A = false;

    public msl() {
        addOnContextAvailableListener(new lsl(this));
    }

    @Override // defpackage.xsl, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.A) {
            return;
        }
        this.A = true;
        ((gpn) generatedComponent()).E0((InstantBetslipActivity) this);
    }
}
