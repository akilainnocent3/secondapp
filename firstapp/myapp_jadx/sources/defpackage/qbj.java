package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qbj implements Runnable {
    public final /* synthetic */ qis a;

    public qbj(qis qisVar) {
        this.a = qisVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.cancel(true);
    }
}
