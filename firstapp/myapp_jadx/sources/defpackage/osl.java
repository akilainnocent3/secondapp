package defpackage;

import com.sportybet.android.instantwin.presentation.instantwin.view.a;
import com.sportybet.android.virtual.presentation.activity.InstantCalendarActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class osl extends a {
    public boolean A = false;

    public osl() {
        addOnContextAvailableListener(new nsl(this));
    }

    @Override // defpackage.xsl, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.A) {
            return;
        }
        this.A = true;
        ((opn) generatedComponent()).O0((InstantCalendarActivity) this);
    }
}
