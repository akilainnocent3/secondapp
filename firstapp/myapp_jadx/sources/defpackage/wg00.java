package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class wg00<E> extends ug00<E> {
    public final sg00<E> d;
    public E e;
    public boolean f;
    public int i;

    /* JADX WARN: Illegal instructions before constructor call */
    public wg00(sg00<E> sg00Var) {
        Object obj = sg00Var.b;
        se00<E, jgs> se00Var = sg00Var.d;
        super(obj, se00Var);
        this.d = sg00Var;
        this.i = se00Var.e;
    }

    @Override // defpackage.ug00, java.util.Iterator
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

    @Override // defpackage.ug00, java.util.Iterator
    public final void remove() {
        if (!this.f) {
            fm20.a();
            return;
        }
        E e = this.e;
        sg00<E> sg00Var = this.d;
        y8h0.a(sg00Var).remove(e);
        this.e = null;
        this.f = false;
        this.i = sg00Var.d.e;
        this.c--;
    }
}
