package defpackage;

import com.sporty.android.sportymedia.ui.SportyMediaActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a4m extends py1 {
    public boolean a = false;

    public a4m() {
        addOnContextAvailableListener(new z3m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((brc0) generatedComponent()).r0((SportyMediaActivity) this);
    }
}
