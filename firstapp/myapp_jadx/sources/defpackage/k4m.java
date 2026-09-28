package defpackage;

import com.sportybet.plugin.sportypicks.ui.SportyPicksActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k4m extends py1 {
    public boolean a = false;

    public k4m() {
        addOnContextAvailableListener(new j4m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((o6d0) generatedComponent()).L2((SportyPicksActivity) this);
    }
}
