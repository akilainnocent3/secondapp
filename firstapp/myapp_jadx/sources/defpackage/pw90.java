package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pw90 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ow90.c.a b;

    public pw90(ow90.c.a aVar, boolean z) {
        this.b = aVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        erh0.a();
        ow90.c cVar = ow90.c.this;
        boolean z = cVar.a;
        boolean z2 = this.a;
        cVar.a = z2;
        if (z != z2) {
            cVar.b.a(z2);
        }
    }
}
