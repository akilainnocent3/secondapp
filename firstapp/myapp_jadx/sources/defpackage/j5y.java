package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class j5y<T> extends ybp<T> {
    public final ybp<T> a;

    public j5y(ybp<T> ybpVar) {
        this.a = ybpVar;
    }

    @Override // defpackage.ybp
    public final T a(jep jepVar) {
        if (jepVar.J() != jep.b.w) {
            return this.a.a(jepVar);
        }
        jepVar.G();
        return null;
    }

    @Override // defpackage.ybp
    public final void c(rfp rfpVar, T t) {
        if (t == null) {
            rfpVar.u();
        } else {
            this.a.c(rfpVar, t);
        }
    }

    public final String toString() {
        return this.a + ".nullSafe()";
    }
}
