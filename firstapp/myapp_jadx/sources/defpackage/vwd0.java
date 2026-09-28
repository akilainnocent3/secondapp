package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class vwd0<T> implements n340 {
    public final wwd0 a;
    public final v340 b;

    public vwd0(T t) {
        wwd0 wwd0VarA = xwd0.a(t);
        this.a = wwd0VarA;
        this.b = e1i.b(wwd0VarA);
    }

    @Override // defpackage.n340
    public final T a(Object obj, ohp<?> ohpVar) {
        obj.getClass();
        ohpVar.getClass();
        return (T) this.a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj, ohp<?> ohpVar, T t) {
        wwd0 wwd0Var;
        ohpVar.getClass();
        do {
            wwd0Var = this.a;
        } while (!wwd0Var.g(wwd0Var.getValue(), t));
    }
}
