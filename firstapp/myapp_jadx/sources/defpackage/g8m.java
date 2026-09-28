package defpackage;

import com.sportybet.feature.worldcup.WorldCupActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g8m extends py1 {
    public boolean a = false;

    public g8m() {
        addOnContextAvailableListener(new f8m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((iyj0) generatedComponent()).U2((WorldCupActivity) this);
    }
}
