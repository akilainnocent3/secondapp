package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ko50<T> implements gv5<T> {
    public final int a;
    public final su5<T> b;
    public int c;

    public ko50(su5<T> su5Var, int i) {
        this.b = su5Var;
        this.a = i;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<T> su5Var, Throwable th) {
        int i = this.c + 1;
        this.c = i;
        if (i <= this.a) {
            this.b.clone().G(this);
        } else {
            ((i0.a) this).d.onFailure(su5Var, th);
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<T> su5Var, bi50<T> bi50Var) {
        ((i0.a) this).d.onResponse(su5Var, bi50Var);
    }
}
