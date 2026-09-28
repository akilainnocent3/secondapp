package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l5i0 implements Runnable {
    public final /* synthetic */ t5i0.a a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    public /* synthetic */ l5i0(t5i0.a aVar, Object obj, long j) {
        this.a = aVar;
        this.b = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t5i0 t5i0Var = this.a.b;
        String str = jrh0.a;
        t5i0Var.k(this.b, this.c);
    }
}
