package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xg00<E> extends vg00<E> {
    public final tg00<E> d;
    public E e;
    public boolean f;
    public int i;

    /* JADX WARN: Illegal instructions before constructor call */
    public xg00(tg00<E> tg00Var) {
        Object obj = tg00Var.b;
        te00<E, kgs> te00Var = tg00Var.d;
        super(obj, te00Var);
        this.d = tg00Var;
        this.i = te00Var.e;
    }

    @Override // defpackage.vg00, java.util.Iterator
    public final E next() {
        if (this.d.d.e != this.i) {
            sx0.a();
            return null;
        }
        E e = (E) super.next();
        this.e = e;
        this.f = true;
        return e;
    }

    @Override // defpackage.vg00, java.util.Iterator
    public final void remove() {
        if (!this.f) {
            fm20.a();
            return;
        }
        E e = this.e;
        tg00<E> tg00Var = this.d;
        y8h0.a(tg00Var).remove(e);
        this.e = null;
        this.f = false;
        this.i = tg00Var.d.e;
        this.c--;
    }
}
