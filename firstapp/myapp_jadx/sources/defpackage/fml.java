package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public abstract class fml extends py1 {
    public boolean a = false;

    public fml() {
        addOnContextAvailableListener(new eml(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((m22) generatedComponent()).B((l22) this);
    }
}
