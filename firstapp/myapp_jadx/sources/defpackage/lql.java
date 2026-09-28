package defpackage;

import com.sportybet.android.editbet.presentation.view.EditHistoryDetailActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lql extends py1 {
    public boolean a = false;

    public lql() {
        addOnContextAvailableListener(new kql(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((rof) generatedComponent()).F1((EditHistoryDetailActivity) this);
    }
}
