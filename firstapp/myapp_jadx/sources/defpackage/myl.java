package defpackage;

import com.sportybet.android.activity.oddsformat.OddsFormatPreferenceActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class myl extends py1 {
    public boolean a = false;

    public myl() {
        addOnContextAvailableListener(new lyl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((sjy) generatedComponent()).Q1((OddsFormatPreferenceActivity) this);
    }
}
