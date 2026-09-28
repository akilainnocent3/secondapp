package defpackage;

import com.sportybet.feature.country.ChangeRegionActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fol extends py1 {
    public boolean a = false;

    public fol() {
        addOnContextAvailableListener(new eol(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((p57) generatedComponent()).L0((ChangeRegionActivity) this);
    }
}
