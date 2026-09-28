package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class rml extends ez1 {
    public boolean a = false;

    public rml() {
        addOnContextAvailableListener(new qml(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((gk3) generatedComponent()).n2((BetslipActivity) this);
    }
}
