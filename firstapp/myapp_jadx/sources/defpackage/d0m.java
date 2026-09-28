package defpackage;

import com.sportybet.feature.debugscreen.impl.popupqueue.PopupQueueDebugActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d0m extends py1 {
    public boolean a = false;

    public d0m() {
        addOnContextAvailableListener(new c0m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((b520) generatedComponent()).d1((PopupQueueDebugActivity) this);
    }
}
