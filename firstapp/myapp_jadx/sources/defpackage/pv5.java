package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pv5 implements Runnable {
    public final /* synthetic */ v9i.c a;
    public final /* synthetic */ int b;

    public pv5(v9i.c cVar, int i) {
        this.a = cVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
