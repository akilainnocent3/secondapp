package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dml extends py1 {
    public boolean a = false;

    public dml() {
        addOnContextAvailableListener(new cml(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((f22) generatedComponent()).p0((e22) this);
    }
}
