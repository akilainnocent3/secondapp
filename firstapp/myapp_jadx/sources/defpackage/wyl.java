package defpackage;

import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class wyl extends py1 {
    public boolean a = false;

    public wyl() {
        addOnContextAvailableListener(new vyl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((jcz) generatedComponent()).x((OutrightsActivity) this);
    }
}
