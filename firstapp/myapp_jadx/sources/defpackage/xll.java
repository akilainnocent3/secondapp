package defpackage;

import com.sportybet.plugin.realsports.autobet.widget.AutoBetActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xll extends py1 {
    public boolean a = false;

    public xll() {
        addOnContextAvailableListener(new wll(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((p51) generatedComponent()).E1((AutoBetActivity) this);
    }
}
