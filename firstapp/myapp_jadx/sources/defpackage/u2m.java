package defpackage;

import com.sportybet.feature.settings.SettingsActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u2m extends py1 {
    public boolean a = false;

    public u2m() {
        addOnContextAvailableListener(new t2m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((ej80) generatedComponent()).I2((SettingsActivity) this);
    }
}
