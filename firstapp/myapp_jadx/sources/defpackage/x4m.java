package defpackage;

import com.sportybet.plugin.swipebet.activities.SwipeBetActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class x4m extends py1 {
    public boolean a = false;

    public x4m() {
        addOnContextAvailableListener(new w4m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((tke0) generatedComponent()).l0((SwipeBetActivity) this);
    }
}
