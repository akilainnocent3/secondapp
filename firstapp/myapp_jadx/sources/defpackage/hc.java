package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hc implements Runnable {
    public final /* synthetic */ ic a;

    public hc(ic icVar) {
        this.a = icVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ic icVar = this.a;
        while (true) {
            try {
                icVar.b((ic.a) icVar.c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
