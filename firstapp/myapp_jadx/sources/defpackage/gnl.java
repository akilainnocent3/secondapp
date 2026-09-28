package defpackage;

import com.sportybet.android.activity.BirthVerifyActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gnl extends py1 {
    public boolean a = false;

    public gnl() {
        addOnContextAvailableListener(new fnl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((ae4) generatedComponent()).j((BirthVerifyActivity) this);
    }
}
