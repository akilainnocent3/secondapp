package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class q2z<T> implements n730<T>, njd<T> {
    public static final n2z c = new n2z();
    public static final o2z d = new o2z();
    public njd.a<T> a;
    public volatile n730<T> b;

    public q2z(n2z n2zVar, n730 n730Var) {
        this.a = n2zVar;
        this.b = n730Var;
    }

    public final void a(final njd.a<T> aVar) {
        n730<T> n730Var;
        n730<T> n730Var2;
        n730<T> n730Var3 = this.b;
        o2z o2zVar = d;
        if (n730Var3 != o2zVar) {
            aVar.a(n730Var3);
            return;
        }
        synchronized (this) {
            n730Var = this.b;
            if (n730Var != o2zVar) {
                n730Var2 = n730Var;
            } else {
                final njd.a<T> aVar2 = this.a;
                this.a = new njd.a() { // from class: p2z
                    @Override // njd.a
                    public final void a(n730 n730Var4) {
                        aVar2.a(n730Var4);
                        aVar.a(n730Var4);
                    }
                };
                n730Var2 = null;
            }
        }
        if (n730Var2 != null) {
            aVar.a(n730Var);
        }
    }

    @Override // defpackage.n730
    public final T get() {
        return this.b.get();
    }
}
