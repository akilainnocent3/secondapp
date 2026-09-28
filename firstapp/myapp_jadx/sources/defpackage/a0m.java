package defpackage;

import com.sportybet.android.settings.popovers.PopoverSettingsActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a0m extends py1 {
    public boolean a = false;

    public a0m() {
        addOnContextAvailableListener(new zzl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((n220) generatedComponent()).A0((PopoverSettingsActivity) this);
    }
}
