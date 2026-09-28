package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ji50 extends ii50 implements qaj<Object> {
    private final int a;

    public ji50(int i, v1b<Object> v1bVar) {
        super(v1bVar);
        this.a = i;
    }

    @Override // defpackage.qaj
    public final int getArity() {
        return this.a;
    }

    @Override // defpackage.pz1
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        jq40.a.getClass();
        return mq40.a(this);
    }
}
