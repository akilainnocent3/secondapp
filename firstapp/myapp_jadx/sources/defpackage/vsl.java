package defpackage;

import com.sportybet.android.instantwin.presentation.instantwin.view.InstantWinActivity;
import com.sportybet.android.instantwin.presentation.instantwin.view.a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vsl extends a {
    public boolean A = false;

    public vsl() {
        addOnContextAvailableListener(new usl(this));
    }

    @Override // defpackage.xsl, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.A) {
            return;
        }
        this.A = true;
        ((r8o) generatedComponent()).j2((InstantWinActivity) this);
    }
}
