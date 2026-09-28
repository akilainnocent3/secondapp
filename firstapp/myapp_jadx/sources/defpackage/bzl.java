package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class bzl extends py1 {
    public boolean a = false;

    public bzl() {
        addOnContextAvailableListener(new azl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((tzz) generatedComponent()).i((szz) this);
    }
}
