package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class q5f0 extends n5f0 {
    public final Runnable c;

    public q5f0(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(x2d.b(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        return j26.a(sb, this.b ? "Blocking" : "Non-blocking", ']');
    }
}
