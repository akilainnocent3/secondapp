package defpackage;

import com.sportybet.feature.debugscreen.impl.DebugScreenActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mpl extends py1 {
    public boolean a = false;

    public mpl() {
        addOnContextAvailableListener(new lpl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((k0d) generatedComponent()).K0((DebugScreenActivity) this);
    }
}
