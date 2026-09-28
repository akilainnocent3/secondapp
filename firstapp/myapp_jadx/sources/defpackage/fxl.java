package defpackage;

import com.sportybet.android.social.presentation.creation.MySocialCreationActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fxl extends py1 {
    public boolean a = false;

    public fxl() {
        addOnContextAvailableListener(new exl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((g0x) generatedComponent()).V0((MySocialCreationActivity) this);
    }
}
