package defpackage;

import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bxl extends py1 {
    public boolean a = false;

    public bxl() {
        addOnContextAvailableListener(new axl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((cfw) generatedComponent()).f((MultiMakerActivity) this);
    }
}
