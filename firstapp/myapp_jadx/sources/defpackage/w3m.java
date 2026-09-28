package defpackage;

import com.sportybet.android.instantwin.presentation.legends.SportyLegendsActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w3m extends py1 {
    public boolean a = false;

    public w3m() {
        addOnContextAvailableListener(new v3m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((u9c0) generatedComponent()).t2((SportyLegendsActivity) this);
    }
}
