package defpackage;

import com.sportybet.plugin.common.gift.GiftsActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class qrl extends py1 {
    public boolean a = false;

    public qrl() {
        addOnContextAvailableListener(new prl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((ozk) generatedComponent()).s1((GiftsActivity) this);
    }
}
