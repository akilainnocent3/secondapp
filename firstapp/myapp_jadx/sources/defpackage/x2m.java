package defpackage;

import com.sportybet.android.share.presentation.activity.ShareCodeActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x2m extends py1 {
    public boolean a = false;

    public x2m() {
        addOnContextAvailableListener(new w2m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((uz80) generatedComponent()).q1((ShareCodeActivity) this);
    }
}
