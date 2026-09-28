package defpackage;

import com.sportybet.android.instantwin.presentation.instantwin.view.a;
import com.sportybet.android.instantwin.presentation.openbet.OpenBetsActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class uyl extends a {
    public boolean A = false;

    public uyl() {
        addOnContextAvailableListener(new tyl(this));
    }

    @Override // defpackage.xsl, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.A) {
            return;
        }
        this.A = true;
        ((y0z) generatedComponent()).L1((OpenBetsActivity) this);
    }
}
