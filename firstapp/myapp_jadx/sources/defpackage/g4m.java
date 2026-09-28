package defpackage;

import com.sportybet.android.instantwin.presentation.penalty.SportyPenaltyActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class g4m extends py1 {
    public boolean a = false;

    public g4m() {
        addOnContextAvailableListener(new f4m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((yuc0) generatedComponent()).H((SportyPenaltyActivity) this);
    }
}
