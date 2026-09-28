package defpackage;

import com.sportybet.android.instantwin.presentation.instantwin.view.a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xsl extends py1 {
    public boolean a = false;

    public xsl() {
        addOnContextAvailableListener(new wsl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((a9o) generatedComponent()).h1((a) this);
    }
}
