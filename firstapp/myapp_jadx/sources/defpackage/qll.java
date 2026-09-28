package defpackage;

import com.sporty.android.platform.features.account.addemailprompt.AddEmailPromptBottomSheetActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qll extends py1 {
    public boolean a = false;

    public qll() {
        addOnContextAvailableListener(new pll(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((hg) generatedComponent()).J0((AddEmailPromptBottomSheetActivity) this);
    }
}
