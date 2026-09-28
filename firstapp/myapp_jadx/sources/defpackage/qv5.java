package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qv5 {
    public final v9i.c a;
    public final pa50 b;

    public qv5(v9i.c cVar, pa50 pa50Var) {
        this.a = cVar;
        this.b = pa50Var;
    }

    public final void a(a9i.a aVar) {
        int i = aVar.b;
        pa50 pa50Var = this.b;
        v9i.c cVar = this.a;
        if (i == 0) {
            pa50Var.execute(new ov5(cVar, aVar.a));
        } else {
            pa50Var.execute(new pv5(cVar, i));
        }
    }
}
