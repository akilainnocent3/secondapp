package defpackage;

import com.sportybet.android.user.selfexclusion.SelfExclusionActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m2m extends py1 {
    public boolean a = false;

    public m2m() {
        addOnContextAvailableListener(new l2m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((t980) generatedComponent()).P((SelfExclusionActivity) this);
    }
}
