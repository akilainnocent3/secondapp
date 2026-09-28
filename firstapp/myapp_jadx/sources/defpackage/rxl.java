package defpackage;

import com.sportybet.android.account.confirm.activity.NameBvnActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rxl extends e5 {
    public boolean v = false;

    public rxl() {
        addOnContextAvailableListener(new qxl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.v) {
            return;
        }
        this.v = true;
        ((bcx) generatedComponent()).j1((NameBvnActivity) this);
    }
}
