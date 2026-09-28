package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class yrp implements Runnable {
    public final /* synthetic */ xrp a;
    public final /* synthetic */ Throwable b;

    public yrp(xrp xrpVar, Throwable th) {
        this.a = xrpVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v1b v1bVarB = yzo.b(this.a);
        zi50.a aVar = zi50.b;
        v1bVarB.resumeWith(uj50.a(this.b));
    }
}
