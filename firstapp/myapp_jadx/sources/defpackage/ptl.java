package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ptl extends py1 {
    public boolean a = false;

    public ptl() {
        addOnContextAvailableListener(new otl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((q7p) generatedComponent()).o2((p7p) this);
    }
}
