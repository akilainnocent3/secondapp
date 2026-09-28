package defpackage;

import com.sportybet.android.choosebet.presentation.ChooseBetActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jol extends py1 {
    public boolean a = false;

    public jol() {
        addOnContextAvailableListener(new iol(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((om7) generatedComponent()).g2((ChooseBetActivity) this);
    }
}
