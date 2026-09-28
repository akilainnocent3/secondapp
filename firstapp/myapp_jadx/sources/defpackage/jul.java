package defpackage;

import com.sportybet.android.activity.LanguagePreferenceActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jul extends py1 {
    public boolean a = false;

    public jul() {
        addOnContextAvailableListener(new iul(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((zlr) generatedComponent()).h2((LanguagePreferenceActivity) this);
    }
}
